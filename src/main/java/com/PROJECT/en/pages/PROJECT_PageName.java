package com.PROJECT.en.pages;

import com.PROJECT.en.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by egugliemella on 3/3/16.
 */
public class PROJECT_PageName extends BasePage {

  //Variables
  @FindBy(css="")
  WebElement variable_name;
  @FindAll(@FindBy(css=""))
  List<WebElement> list_name;

  public PROJECT_PageName (WebDriver driver) {
    super(driver);
    this.PAGE_TITLE = "";
  }

  public void functionName() {

  }

}
