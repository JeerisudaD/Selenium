package review.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumReviewBasic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement userName =driver.findElement(By.id("userName"));
        userName.sendKeys("Angle");
        userName.clear();
        userName.sendKeys("GGGG");

    }
}
