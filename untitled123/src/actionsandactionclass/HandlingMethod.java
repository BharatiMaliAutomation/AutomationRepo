package actionsandactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class HandlingMethod {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement disableKey = driver.findElement(By.id("disabled-button"));

        WebElement enableKey = driver.findElement(By.id("enabled-button"));
        System.out.println(disableKey.isEnabled());
        System.out.println(enableKey.isEnabled());

        Thread.sleep( 5000);
         driver.close();



    }
}
