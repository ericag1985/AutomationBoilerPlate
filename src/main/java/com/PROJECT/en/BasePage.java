package com.PROJECT.en;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by egugliemella on 2/16/16.
 */

public class BasePage {

  //Variables
  public WebDriver driver;
  public WebDriverWait wait;
  public String PAGE_TITLE;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 5); //default wait
  }

  //If you need a longer time from default wait
  public WebDriverWait waitFor(WebDriver driver, int seconds){
    WebDriverWait wait = new WebDriverWait(driver, seconds);
    return wait;
  }

  //Page load
  public void loadPage(String url) {
    //Opens url passed to function
    driver.get(url);
    //Maximizes window size
    driver.manage().window().maximize();
  }

  //Verify element is on the page and ready to be interacted
  public boolean verifyElementExists(WebElement element) {
    try {
      element.getTagName();
    } catch (NoSuchElementException e) {
      return false;
    }
    return true;
  }

  //Interaction with elements functions
  public void clickElement(WebElement element) {
    element.click();
  }

  public void hoverElement(WebElement element) {
    //Enables actions in browser
    Actions action = new Actions(driver);
    //Hover action
    action.moveToElement(element).build().perform();
  }

  public void setElementText(WebElement element, String text) {
    //Clears field if text is already present
    element.clear();
    //Send text
    element.sendKeys(text);
  }

  public void selectDropdownValue(WebElement element, String value) {
    //Finds select box
    Select select = new Select(element);
    //Sets value
    select.selectByVisibleText(value);
  }

  public void jsClick(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", element);
  }

}
