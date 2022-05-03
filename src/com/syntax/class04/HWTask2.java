package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWTask2 {
    /* Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text

     */
    public static String url ="https://www.amazon.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + allLinks.size());

        for(WebElement links:allLinks){
            String  linkWText = links.getText();
            String fullLink = links.getAttribute("href");
            if (!linkWText.isEmpty()) {
                System.out.println(linkWText+" "+fullLink);}
            }
        }
    }
