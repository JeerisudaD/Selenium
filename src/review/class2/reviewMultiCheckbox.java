package review.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class reviewMultiCheckbox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //get all the available options
        List<WebElement> checkboxs =driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkbox:checkboxs){
            checkbox.click();
        }
        Thread.sleep(3000);
        for(WebElement checkbox:checkboxs){
            checkbox.click();
        }




    }
}