package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HWTask1 {
    /*  Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 days options
year dd has 115 years options
Select your date of birth
Quit browser
     */

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAcc.click();

        //Verify Month
        WebElement monthDD = driver.findElement(By.id("month"));
        Select selectMonth= new Select(monthDD);
        List<WebElement> options = selectMonth.getOptions();
        System.out.println("Verify Month dd has 12 month options");
        for(WebElement option:options) {
            String optionText = option.getAttribute("value");
            System.out.println(optionText);
        }
        //Verify Day
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDay= new Select(dayDD);
        List<WebElement> option = selectDay.getOptions();
        System.out.println("Verify Day dd has 31 days options");
        for(WebElement opt:option) {
            String optionText = opt.getText();
            System.out.println(optionText);
        }
        //Verify Year
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear= new Select(yearDD);
        List<WebElement> opt = selectYear.getOptions();
        System.out.println("Verify Year dd has 118 years options");
        System.out.println(opt.size());

        }
    }
