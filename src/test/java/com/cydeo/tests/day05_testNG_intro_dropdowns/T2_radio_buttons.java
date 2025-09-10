package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_radio_buttons {
    public static void main(String[] args) throws InterruptedException {
//TC #2: Radiobutton handling
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        Thread.sleep(3000);
        hockeyRadioButton.click();
//4. Verify “Hockey” radio button is selected after clicking.
        //System.out.println("hockeyRadioButton.isSelected(), expecting true = " + hockeyRadioButton.isSelected());

        if (hockeyRadioButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        }else {
            System.out.println("Button is NOT selected. Verification FAILED!!!");
        }
//USE XPATH LOCATOR FOR ALL WE BELEMENT LOCATORS
    }
}
