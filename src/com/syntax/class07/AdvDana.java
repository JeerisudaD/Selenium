package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvDana {
    //click on buttons and open new windows(tabs)
    //open different pages, tabs, windows and switch to tabs and perform different actions
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //locate/inspect the buttons and click on them
        String mainPageHandle = driver.getWindowHandle();
        //identify 3 different elements, 3 buttons
        WebElement igButton=driver.findElement(By.linkText("Follow On Instagram")); //make sure there is no space before and after linkText
        WebElement fbButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        igAndFbButton.click();//after clicking we get 3 new windows

        //get everything together and store in a set:
        Set<String> allWindowHandles = driver.getWindowHandles(); //this set has all the windows
        System.out.println(allWindowHandles.size());

        //iterate through each and every window and get their title and print it out in console:
        Iterator<String> it = allWindowHandles.iterator();

        //once u have an iterator, to iterate through it use while loop:
        while(it.hasNext()){
            String handle=it.next(); //move one step forward to get a new tab id/new string value

            //get the 3 child tabs not the parent(main) using if condition, in order to do so we compare the ID's
            if(!mainPageHandle.equals(handle))

                //switch focus in order to get the title:
                driver.switchTo().window(handle); //swithTo in order to get the next title

            // driver.manage().window().maximize(); //maximize the window, if u maximize before switching the handle it will
            //maximize all of them except first. so first switch  focus then maximize

            //get the title of each window:
            String title=driver.getTitle();
            System.out.println(title); //print all titles


        }
    }
}
