package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1 {
    /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser/*

         */
    public static String url="https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("customer.firstName")).sendKeys("Gigi");
        driver.findElement(By.id("customer.lastName")).sendKeys("Logo");
        driver.findElement(By.name("customer.address.street")).sendKeys("1234");

        driver.findElement(By.className("button")).click();
        driver.quit();



    }
}
