package com.PROJECT.en.tests;

import com.PROJECT.en.pages.PROJECT_PageName;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by egugliemella on 3/3/16.
 */

public class Example_Test extends TestBasePage {

  //Variables
  PROJECT_PageName projectPageName;


  @BeforeClass(alwaysRun = true)
  public void pageFactories() {
    projectPageName = PageFactory.initElements(driver, PROJECT_PageName.class);
  }

  @Test()
  public void testName() {

  }
}
