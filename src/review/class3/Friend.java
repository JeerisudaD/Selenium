package review.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Friend {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        // click on the check box that resides inside another frame

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");

        WebElement innerFrameCheckBox = driver.findElement(By.xpath("//input[@id=\"a\"]"));
        innerFrameCheckBox.click();
        Thread.sleep(2000);
        driver.quit();


    }
}
