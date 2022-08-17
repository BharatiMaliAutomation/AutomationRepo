package particSundaySelf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  java.io.IOException;
import java.util.Collections;

public class NewDatePickaerExample {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Utility\\BrowserDrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.spicejet.com/");
        WebElement element = driver.findElement(By.cssSelector("input[name$= 'txt_Fromdate']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", element);
        WebElement newElement = driver.findElement(By.cssSelector("input[name$= 'txt_Fromdate']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','31/07')",newElement);

      //  System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
       // WebDriver driver1 = new ChromeDriver();
       // WebDriver wait = new WebDriverWait();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
      //js.executeScript("arguments[0].scrollIntoView();",element);
       // driver.manage().window().maximize();

        driver.get("https://www.spicejet.com");

      //  Wait for Search button to be clickable, the state in which we assume that the site has loaded
        //WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("ct100_mainContent_btn_FindFlights")));

      //Select Fron And to Cities

     // js.executeScript("arguments[0].Value= arguments[1]");
        //driver.findElement(By.id("ct100_mainContent_txt_Fromdate")),"31-07-2022");

       // js.executeScript("arguments[0].Value= arguments[1]");
       // driver.findElement(By.id("ct100_mainContent_txt_Todate")),"01-08-2022");

        }


    }
