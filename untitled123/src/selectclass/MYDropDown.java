package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class MYDropDown {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app");
        WebElement dropdown = driver.findElement(By.id("option"));
        Select selectObject = new Select(dropdown);
        selectObject.selectByIndex(1);
        Thread.sleep(4000);

        selectObject.selectByValue("option 2");
        Thread.sleep(4000);

        selectObject.selectByVisibleText("Option 3");
        Thread.sleep(4000);
        driver.close();
        System.out.println("Done");

    }

}

