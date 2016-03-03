package com.PROJECT.en.data;


import org.testng.annotations.DataProvider;

/**
 * Created by egugliemella on 3/3/16.
 */
public class Data {

  @DataProvider(name = "dataName")
  public static Object[][] exampleData() {
    return new Object[][] {
            {""}
    };
  }

}
