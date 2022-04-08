package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyDemo {
    //click on get new user
    //get the first name text print out in the console

    public static String url ="http://syntaxprojects.com/dynamic-data-loading-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        //we need to create an object of webDriver wait:
        WebDriverWait wait = new WebDriverWait(driver,20);// create obj เพื่อจะได้เซ็ตหลายๆๆ รอบ

        // need to add wait condition based on visibility of the element by locator
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name')]")));

        // get the firstname text
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());


    }
}
