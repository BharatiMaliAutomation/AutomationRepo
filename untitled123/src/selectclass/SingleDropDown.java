package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SingleDropDown {
    public static WebDriver driver;

    public static void main(String[] args)  throws  InterruptedException , IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement singleDrpDown = driver.findElement(By.name("Country"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",singleDrpDown);

         driver.findElement(By.id("benzradio")).click();
         Thread.sleep(4000);

         driver.findElement(By.id("bmwcheck")).click();
         Thread.sleep(4000);

        driver.close();

    }
}
