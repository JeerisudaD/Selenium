package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask2 {
    /*  navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser

     */
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mr.Test");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Testing");
        driver.findElement(By.name("reg_email__")).sendKeys("123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("123@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123Haha");

        driver.findElement(By.name("websubmit")).click();

       // driver.quit();


    }
}
