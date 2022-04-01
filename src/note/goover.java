package note;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goover {

    /**
     * Task
     * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
     * Login
     * Get title and verify
     * logout
     * close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("title correct");
        }else{
            System.out.println("title incorrect");
        }

        driver.findElement(By.id("ctl00_logout"));
        driver.quit();


    }
}
