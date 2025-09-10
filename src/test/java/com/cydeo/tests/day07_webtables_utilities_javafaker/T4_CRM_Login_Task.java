package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_CRM_Login_Task {
    WebDriver driver;

    //TC #4: Login scenario

    @BeforeMethod
    public void setupMethod(){
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to :http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(5000);
        //driver.close();
    }

    @Test
    public void test1_crm_login() throws InterruptedException {
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

        //6. Verify title is as expected:
        //Expected: Portal
        //We are waiting 3 secs for title to be loaded to "Portal"
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    public void test2_crm_login() throws InterruptedException {
        //Logginn in using the utility method we created in CRM_Utilities class
        CRM_Utilities.login_crm(driver);



        //6. Verify title is as expected:
        //Expected: Portal
        //We are waiting 3 secs for title to be loaded to "Portal"
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    public void test3_crm_login() throws InterruptedException {
        //Logginn in using the utility method we created in CRM_Utilities class
        //CRM_Utilities.login_crm(driver,"helpdesk1@cydeo.com","UserUser");
        CRM_Utilities.login_crm(driver,"helpdesk2@cydeo.com","UserUser");



        //6. Verify title is as expected:
        //Expected: Portal
        //We are waiting 3 secs for title to be loaded to "Portal"
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");
    }

}
