package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public void inputAngkaSatu(int satu){
    type(MobileBy.id("et_1"), String.valueOf(satu));
  }

  public void inputAngkaDua(int dua){
    type(MobileBy.id("et_2"), String.valueOf(dua));
  }

  public void clickChooseOpr(){
    click(MobileBy.id("spinner_1"));
  }

  public void chooseOpr(String operator){
    click(MobileBy.xpath("//*[@text=\""+operator+"\"]"));
  }

  public void clickEquals(){
    click(MobileBy.id("acb_calculate"));
  }

  public String getResult(){
    return getText(MobileBy.id("tv_result"));
  }

  public boolean checkEqualsButton(){
    return isEnabled(MobileBy.id("acb_calculate"));
  }

  public void inputNegativeAngkaSatu(String one){
    type(MobileBy.id("et_1"), one);
  }

  public void inputNegativeAngkaDua(String two){
    type(MobileBy.id("et_2"), two);
  }

  public String getValueFieldAngkaSatu(){
    return getText(MobileBy.id("et_1"));
  }

  public String getValueFieldAngkaDua(){
    return getText(MobileBy.id("et_2"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

}
