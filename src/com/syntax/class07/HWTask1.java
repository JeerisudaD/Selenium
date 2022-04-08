package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HWTask1 {
    /* Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages
     */
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String mainPage = driver.getWindowHandle();
        WebElement newTapButton = driver.findElement(By.id("tabButton"));
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        WebElement newWinMessageButton = driver.findElement(By.id("messageWindowButton"));

        newTapButton.click();
        newWindowButton.click();
        newWinMessageButton.click();
        System.out.println("Click all the button and print text its ");

        Set<String> allWindow = driver.getWindowHandles();
        System.out.println("All window handle is " + allWindow.size());
        Iterator<String> it = allWindow.iterator();

        while (it.hasNext()) {
            String handle = it.next();
            if (!mainPage.equals(handle)) {
                driver.switchTo().window(handle);
                WebElement text = driver.findElement(By.xpath("//body"));
                System.out.println("Text : " +text.getText());

            }
            String title = driver.getTitle();
            System.out.println("Title : "+title);
        }
        driver.close();
    }
}

