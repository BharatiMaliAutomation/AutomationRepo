package actionsandactionclass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AlertMethod {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

      //  JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript("arguments[0].scrollIntoView();");
        Thread.sleep( 5000);
        WebElement alertBtn = driver.findElement(By.id("confirmbtn"));
        alertBtn.click();

        Thread.sleep( 5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep( 5000);
         driver.close();


    }
}
