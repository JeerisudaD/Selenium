package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask2 {
    /* Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    click on each button and handle the alert accordingly
    */
    public static String url ="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


        // The first alert box : Simple Alert Box
        WebElement alertClickMe1 = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alertClickMe1.click();
        Alert firstAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        firstAlert.accept();

        // The second alert box : Confirm Alert Box
        WebElement alertClickMe2 = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        alertClickMe2.click();
        Alert secondAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        secondAlert.accept();
        //secondAlert.dismiss();


        // The third alert box : Prompt Alert Box
        WebElement alertClickPrompt = driver.findElement(By.xpath("//button[text() ='Click for Prompt Box']"));
        alertClickPrompt.click();
        Alert thirdAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        thirdAlert.sendKeys("Gigi");
        Thread.sleep(2000);
        thirdAlert.accept();


    }
}
