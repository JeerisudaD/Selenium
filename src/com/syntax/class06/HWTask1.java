package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1 {
    /* 1) Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    2) verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
    3) verify the  text Sorry, We Couldn't Find Anything For “Asksn” is displayed
    4) verify enroll today button is enabled
     */

    public static String url ="https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1) Navigate
        driver.get(url);

        //2) verify the header text
        WebElement headerSyntaxDisplay= driver.findElement(By.id("hide"));
        System.out.println("The header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed : "
                +headerSyntaxDisplay.isDisplayed());

        //3) verify the text Sorry, We Couldn't Find Anything For “Asksn” is displayed
        driver.switchTo().frame("Frameone");


    }
}
