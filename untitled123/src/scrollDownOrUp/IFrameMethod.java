package scrollDownOrUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class IFrameMethod {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("http://rediff.com");

     //  driver.switchTo().frame("moneyiframe");                  //using id of Name of Frame
      //  driver.switchTo().frame(0);              //using index of iframe

       //Using WebElement as a argument
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
       String nse = driver.findElement(By.id("nseindex")).getText();
        System.out.println(nse);

        //Focusing on parent HTML Page(Getting out of iframe)
        driver.switchTo().defaultContent();           //focusing on parent page
        driver.findElement(By.linkText("SPORTS")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}
