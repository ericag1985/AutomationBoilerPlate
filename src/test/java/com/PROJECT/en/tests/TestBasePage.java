package com.PROJECT.en.tests;


import com.PROJECT.en.utilities.DriverFactory;
import com.PROJECT.en.utilities.ScreenshotFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.lang.reflect.Method;


/**
 * Created by egugliemella on 2/17/16.
 */
public class TestBasePage {

  //Variables
  public WebDriver driver;
  DriverFactory.BrowserType type = DriverFactory.BrowserType.FIREFOX;

  @BeforeTest(alwaysRun = true)
  public void setup() {
    driver = DriverFactory.getDriver(type);
  }

  @AfterTest(alwaysRun = true)
  public void close() {
    driver.close();
  }

  @AfterMethod
  public void takeScreenShotOnFailure(ITestResult testResult, Method m) throws IOException {
    String methodName = m.getName();
    if (testResult.getStatus() == ITestResult.FAILURE) {
      ScreenshotFactory.captureScreenshot(driver, "Failed_Tests_", methodName + "_failed");
    }
  }

}
