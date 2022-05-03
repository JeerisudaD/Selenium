package review.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReviewTables {
    public static String url = "https://www.techlistic.com/p/demo-selenium-practice.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*
//accessing the whole webtable
       WebElement whole_table =driver.findElement(By.xpath("//table[@id='customers']"));
// print the table
        System.out.println(whole_table.getText());

         */
//accessing the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row:rows){
            String text = row.getText();
            if (text.contains("Germany")) {
                System.out.println(text);
            }

 //only print the rows which have Company "Microsoft"
        }
    }
}
