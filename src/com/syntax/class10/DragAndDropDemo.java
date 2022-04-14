package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        //actions.dragAndDrop(draggable,droppable).perform();

        //whenever you have too many action in the  same time you have to build before you perform
        // ex. in the following line
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        Thread.sleep(2000);

        //if we want to go back just refresh page
        driver.navigate().refresh();


    }
}

