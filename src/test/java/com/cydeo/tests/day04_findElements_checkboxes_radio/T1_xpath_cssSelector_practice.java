package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
        //TC #1: XPATH and cssSelector Practices
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        // a. “Home” link
        // Locate homeLink using cssSelector,class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        // Locate homeLink using cssSelector,  (.) syntax
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a.nav-link"));

        // Locate homeLink using cssSelector,href value
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a[href='/']"));



        // b. “Forgot password” header
        // Locate header using cssSelector,locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));

        // Locate header using xpath,and using web elements text "Forgot Password"
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // c. “E-mail” text
        WebElement email_ex1=driver.findElement(By.xpath("//label[@for='email']"));

        // d. E-mail input box
        WebElement emailInputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //Locate inputBox using xpath contains method
        // tagName[contains(@attribute,'value')]
        WebElement emailInputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        // e. “Retrieve password” button
        WebElement retrievePasswordButton= driver.findElement(By.xpath("//button[@id='form_submit']"));


        // f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("email_ex1.isDisplayed() = " + email_ex1.isDisplayed());
        System.out.println("emailInputBox_ex1.isDisplayed() = " + emailInputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());



        // First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
    }
}
