package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    /* clicck onHelp Link
    switch between tabs
     */

    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //get window handle for the main page
        String mainPageHandle = driver.getWindowHandle();// turn the current tap ID
        System.out.println(mainPageHandle);

        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//turn all the current tap ID
        System.out.println(allWindowHandles.size());

        //have an iterator in order to iterate through handles
        Iterator<String> it =allWindowHandles.iterator(); // รู้แล้ววว่าทีท้ังหมด 2 แทบ และทำการ iterate manual
        //take the first step and assign the main handle
        mainPageHandle=it.next(); //telling it where to start //แจ้งให้จาว่ารู้ว่า เริ่มต้นที่แทบไหน
        //take the second step and have a child handle
        String childHandle=it.next(); // consider as a child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);

        driver.close();
        //focus back to main page again
        driver.switchTo().window(mainPageHandle);
        helpLink.click();

        driver.quit();


    }
}
