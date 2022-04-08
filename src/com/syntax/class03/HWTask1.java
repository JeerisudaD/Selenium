package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HWTask1 {
    /* Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
     */

    public static String url ="http://syntaxprojects.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Start Practising")).click();

        WebElement simpleDemo =driver.findElement(By.xpath("//a[@class ='list-group-item' and text()='Simple Form Demo']"));
        simpleDemo.click();

        WebElement enterText = driver.findElement(By.id("user-message"));
        enterText.sendKeys("Hello world");
        Thread.sleep(2000);

        WebElement clickShowMessage = driver.findElement(By.xpath("//button[text()='Show Message' and @class ='btn btn-default']"));
        clickShowMessage.click();

        driver.quit();











    }
}
