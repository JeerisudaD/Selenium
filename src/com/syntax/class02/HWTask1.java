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

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("customer.firstName")).sendKeys("Gigi");
        driver.findElement(By.id("customer.lastName")).sendKeys("Narak");
        driver.findElement(By.name("customer.address.street")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Miami");
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("FL");
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("33190");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("876543210");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("kobkob");
        driver.findElement(By.id("customer.password")).sendKeys("kobbobb");
        driver.findElement(By.id("repeatedPassword")).sendKeys("kobbobb");

        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
