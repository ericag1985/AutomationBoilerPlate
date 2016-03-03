package com.PROJECT.en.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by egugliemella on 2/16/16.
 */

public class ScreenshotFactory {
  public static void captureScreenshot(WebDriver driver, String screenshotName)
  {

    try
    {
      String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
      TakesScreenshot ts=(TakesScreenshot)driver;
      File source=ts.getScreenshotAs(OutputType.FILE);

      FileUtils.copyFile(source, new File("./Screenshots/" + screenshotName + timeStamp + ".png"));

      System.out.println("Screenshot placed in root /screenshots folder!");
    }
    catch (Exception e)
    {

      System.out.println("Exception while taking screenshot " + e.getMessage());
    }
  }

}
