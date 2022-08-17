package particSundaySelf;

import com.sun.source.tree.CatchTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Instagram {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("shree1914@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"] ")).sendKeys("Xyz@1234");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
driver.close();

    }


}
