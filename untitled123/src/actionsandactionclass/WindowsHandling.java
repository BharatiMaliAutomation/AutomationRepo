package actionsandactionclass;

import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.io.IOException;
import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='    click   ']")).click();


        String parentwindow = driver.getWindowHandle();
        Set<String>allwindow = driver.getWindowHandles();
        System.out.println(allwindow.size());

        for (String s : allwindow) {
            if (s.contentEquals(parentwindow)) {
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());

            }
            driver.switchTo().window(parentwindow);
            Thread.sleep(3000);

        }

        driver.close();

    }

}