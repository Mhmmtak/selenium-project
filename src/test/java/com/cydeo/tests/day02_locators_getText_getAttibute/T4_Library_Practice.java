package com.cydeo.tests.day02_locators_getText_getAttibute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_Practice {
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cydeo.com/login.html
        driver.navigate().to("http://library2.cydeo.com/login.html");

        //3. Enter username: “incorrect@email.com”
        //Locate username input box using “className” locator
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");


        //4. Enter password: “incorrect password”
        //Locate password input box using “id” locator
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("sajhsdbkjabd");


        //5.Locate Sign in button using “tagName” locator

        WebElement signButton = driver.findElement(By.tagName("button"));

        signButton.click();


        //6. Verify: visually “Sorry, Wrong Email or Password”


        //displayed

        //close the browser
        Thread.sleep(5000);
        driver.close();




    }
}
