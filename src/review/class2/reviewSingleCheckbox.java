package review.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewSingleCheckbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        // check the checkbox
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected"+checkbox1.isSelected());

        //select the checkbox
        checkbox1.click();
        Thread.sleep(3000);

       // deselect the checkbox
        checkbox1.click();

        // get the message after checking the checkbox and display it on console

        checkbox1.click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//div[text()=\"Success - Check box is checked\"]"));

        WebElement getMessage = driver.findElement(By.id("txtAge"));
        System.out.println(getMessage.getText());

        //deselect the checkbox
        checkbox1.click();


    }
}