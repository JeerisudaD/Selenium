package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask3 {
    /* HRMS Application Negative Login:
Open Chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
     */

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admmin");

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        WebElement errorText = driver.findElement(By.id("spanMessage"));
        String verifyText = "Password cannot be empty";

        if(verifyText.equalsIgnoreCase(errorText.getText())){
            System.out.println(" \"Password cannot be empty\" is displayed.");
        }else{
            System.out.println("error message is invalid");
            }
        }

    }
