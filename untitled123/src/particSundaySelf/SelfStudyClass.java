package particSundaySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SelfStudyClass {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("bharati1917@.gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.name("passwd")).sendKeys("12345");
        Thread.sleep(4000);
        driver.findElement(By.className("signinbtn")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Forgot Password?")).click();
        Thread.sleep(4000);
        driver.close();

    }
}
