package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

    // Create instance of Chrome Browser

        WebDriver driver = new ChromeDriver();

        // this line will maximize the currently opened browser
        driver.manage().window().maximize();


        // Go to tesla.com

        driver.get("https://www.apple.com/");

        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // Use navigate back() to go back

        driver.navigate().back();


        //Stop execution for 3 seconds
        Thread.sleep(3000);


        // Use navigate forward() to go forward

        driver.navigate().forward();

        //Stop execution for 3 seconds
        Thread.sleep(3000);

        // Use refreshes the page using navigate.refresh();

        driver.navigate().refresh();


        // navigate to google.com using navigate(). to go

        driver.navigate().to("https://www.google.com");

        // use .getCurrentUrl method to print out current url
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());


        // get title of the page

        //System.out.println("driver.getTitle = " + driver.getTitle());

        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // closes only the currently focused window/tab
        driver.close();


        
        //closing all-of the opened browsers
        driver.quit();





    }
}
