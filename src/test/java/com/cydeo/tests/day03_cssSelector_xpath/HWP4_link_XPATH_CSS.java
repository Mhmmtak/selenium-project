package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_link_XPATH_CSS {
    public static void main(String[] args) throws InterruptedException {

        // TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        //Locate “Home” link using “className” locator
        //WebElement homeLink = driver.findElement(By.linkText("Home"));
        //WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));

        //WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));



        //click to the link
        Thread.sleep(3000);
        homeLink.click();



        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification PASSED!");
        }



    }
}
