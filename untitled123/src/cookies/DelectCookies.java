package cookies;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class DelectCookies {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        Cookie addCookies = new Cookie("bharati", "Mali");             //Add Cookies
        driver.manage().addCookie(addCookies);

        driver.manage().deleteCookieNamed("bharati");        //delete cookies name
        Set<Cookie> cookies = driver.manage().getCookies();           //Get Cookies
        for (Cookie c : cookies) {
            System.out.println(c);
        }
        driver.quit();
    }
}


