package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
This class will store the method releated to CRM
 */
public class CRM_Utilities {

    /*
    This method will log in using below credentials.
    @Username:helpdesk1@cydeo.com
    @Password:UserUser
     */

    public static void login_crm(WebDriver driver) throws InterruptedException {

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cydeo.com");
        Thread.sleep(1000);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        Thread.sleep(1000);
        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }

    public static void login_crm(WebDriver driver, String username, String password) throws InterruptedException {

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);
        Thread.sleep(1000);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        Thread.sleep(1000);
        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();


    }
}
