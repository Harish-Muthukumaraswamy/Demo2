package com.example.tests;

import static org.testng.Assert.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?q=hotmail&oq=hotmail&aqs=chrome.0.69i59j0l5.2078j0j9&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web results'])[1]/following::div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buy Office 365'])[1]/following::h1[1]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buy Office 365'])[1]/following::h1[1]")).getText(), "Connect. Organize. Get things done.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Connect. Organize. Get things done.'])[1]/following::p[1]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Connect. Organize. Get things done.'])[1]/following::p[1]")).getText(), "Free Outlook email and calendar. Everything you need to be your most productive and connected self – at home, on the go, and everywhere in between.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Get the Outlook that’s right for you'])[1]/following::div[4]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact us'])[1]/following::div[1]")).getText(), "© 2018 Microsoft");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create free account'])[2]/following::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign in'])[1]/following::div[7]")).click();
    try {
      assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign in'])[1]/following::div[7]")).getText().matches("^No account[\\s\\S] Create one! Sign-in options$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("i0116")).click();
    driver.findElement(By.id("i0116")).clear();
    driver.findElement(By.id("i0116")).sendKeys("test");
    driver.findElement(By.id("idSIButton9")).click();
    driver.findElement(By.id("idTd_PWD_KMSI_Cb")).click();
    try {
      assertEquals(driver.findElement(By.id("idLbl_PWD_KMSI_Cb")).getText(), "Keep me signed in");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("loginHeader")).click();
    try {
      assertEquals(driver.findElement(By.id("loginHeader")).getText(), "Enter password");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("i0118")).click();
    driver.findElement(By.id("i0118")).clear();
    driver.findElement(By.id("i0118")).sendKeys("test");
    driver.findElement(By.id("idSIButton9")).click();
    driver.findElement(By.id("MainContent")).click();
    try {
      assertEquals(driver.findElement(By.id("username")).getText(), "Sign-in with test is blocked for one of these reasons:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("i1051")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='__PRESENT'])[1]/following::div[9]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='__PRESENT'])[1]/following::div[18]")).getText(), "Sign in");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

@Test
public void GitTEst() {
	System.out.println("git Update");
}
}
