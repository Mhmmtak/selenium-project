package com.cydeo.tests.day02_locators_getText_getAttibute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zerobank_Header {
    public static void main(String[] args) throws InterruptedException {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: "Log in to ZeroBank"

        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText(); // --> this will return me the text of the header

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED! ");
        }else {
            System.out.println("Header text verification FAILED!!! ");
        }

        WebElement rememberMeButton = driver.findElement(By.id("user_remember_me"));

        rememberMeButton.click();

        WebElement brandButton = driver.findElement(By.linkText("Zero Bank"));

        brandButton.click();

      Thread.sleep(5000);
      driver.close();

    }
}
