package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class CookiesHandling {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        Cookie addCookies = new Cookie("bharati", "Mali");             //Add Cookies
        driver.manage().addCookie(addCookies);

        System.out.println("Fatch all cookie" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Set<Cookie> cookies1 = driver.manage().getCookies();
        for (Cookie c : cookies1) {
            System.out.println(c);
        }
        System.out.println("Delete cookie"+"###########################################################");
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies2 = driver.manage().getCookies();
        for (Cookie c :cookies2 ){
            System.out.println(c);
        }
        System.out.println(" Delete all Cookie"+ "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies3 = driver.manage().getCookies();
        for (Cookie c : cookies3){
            System.out.println(c);
        }
        driver.quit();
    }

}
