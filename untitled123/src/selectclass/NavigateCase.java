package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class NavigateCase {
    public static void main(String[] args)  throws  InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.xpath("//u[text()='Forgot Password')]")).click();

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();
        Thread.sleep( 4000);
        driver.close();

    }
}
