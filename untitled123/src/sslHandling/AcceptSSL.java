package sslHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.security.Security;

import java.io.IOException;

import static org.openqa.selenium.devtools.v101.security.Security.*;

public class AcceptSSL {

    WebDriver driver;
   DevTools devTools;
  // static WebDriver.Options options;
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver= new ChromeDriver();
      //  devTools = ((ChromeDriver)driver).getDevTools();

    driver.get("https://expired.badssl.com");
    Thread.sleep( 2000);
        //    devTools.send(Security.enable());
       // devTools.send(setIgnoreCertificateErrors(true));

    driver.get("https://expired.badssl.com/");
    Thread.sleep( 2000);
    driver.quit();


    }
}
