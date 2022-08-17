package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class ParatialTest {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep( 4000);
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        for (WebElement e : elements)
        {
            System.out.println(e);
        }
        driver.close();

    }
}

