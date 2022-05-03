package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
/*
go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
 */
public class HWTask1_working {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//click on checkbox and click on remove
//verify the text
        WebElement removeAddBt = driver.findElement(By.xpath("//button[text()=\"Enable\"]"));
        removeAddBt.click();
        WebElement text = driver.findElement(By.id("message"));
        System.out.println(text.getText());
//enter text and click disable
//verify the textbox is disabled


    }
}