package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {


    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        // 1 interact with frame by index
        //we don't need to fine web element bc we want to work on frame
        driver.switchTo().frame(0); // switch focus to the first frame by using index

        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 Forever!!!");
        // need to switch back before interact with the main page
        driver.switchTo().defaultContent();

        //handling alert
        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(2000); // รอแปปนึงแล้วก่อ switch to alert เพื่อที่จะจัดการมันก่อนค่อยไปต่อ
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // 2 interact with frame by  name or ID
        driver.switchTo().frame("iframe_a");
        // we need to clear text before send the second text
        // we don't neeก to find element again bc we already have it
        textbox.clear();
        textbox.sendKeys("we are back to frame");
        driver.switchTo().defaultContent();

        // 3 interact with frame by  webElement
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Hold your horses");
    }
}
