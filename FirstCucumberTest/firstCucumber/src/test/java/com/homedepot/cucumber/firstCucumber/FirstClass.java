package com.homedepot.cucumber.firstCucumber;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {

    public static void main(String[] args) {

         WebDriver driver = new ChromeDriver(); 
         driver.get("http://www.google.com"); 
         WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Cheese!");
         element.submit();

         //driver.close();
    }



}
