package airLineBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AirBooking {
    public static WebDriver driver;

    public static void SelectSourceAndDestination(String city, String sourceOrDestination) {
        List<WebElement> listOfCities = null;
        if (sourceOrDestination.equals("source")) {
            driver.findElement(By.id("source")).sendKeys(city);
            List<WebElement> listOfCities1 = driver.findElements(By.xpath("//[@id=\"source\"]"));
            List<WebElement> listOfCities2 = driver.findElements(By.xpath("//u1[@id='ui-id-1']//child::li"));
        } else if (sourceOrDestination.equals("destination")) {
            driver.findElement(By.id("destination")).sendKeys(city);
            listOfCities = driver.findElements(By.xpath("//u1[@id='ui-id-2']//child::li\""));
        } else {
            System.out.println("Please select the proper source and destination");

        }
        for (WebElement element : listOfCities) {
            if (element.equals(city)) {
                element.click();
                break;
            }
        }
    }

    public static void selectMonthAndYear(String monthOrYear, String mmyy) {
        List<WebElement> listOfMonth = null;
        List<WebElement> listOfYear = null;

      //  List<WebElement> listOfMonth = driver.findElements(By.xpath("//span[@class'ui.datepicker-month']"));
        for (WebElement element : listOfMonth) {
            if (monthOrYear.equals("month")) {
                element.click();
            }
        }
    }
    //    } else if (monthOrYear.equals("Year")) {
    public static void selectYear(String year){

           List<WebElement> listOfYear = driver.findElements(By.xpath("//span[@class'ui.datepicker-year']"));
        for (WebElement element : listOfYear) {
            if (element.getText().equals(year)) {
                element.click();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("source")).sendKeys("Pune");
        driver.findElement(By.id("destination")).sendKeys("Mumbai");

        List<WebElement> listOfCities = driver.findElements(By.xpath("//u1[@id='ui-id-1']//child::li"));
        List<WebElement> listOfCities1 = driver.findElements(By.xpath("//u1[@id='ui-id-2']//child::li"));


        String selDate ="31";
        String  setMonth = "July";
        String selYear =" 2022";

        driver.findElement(By.id("datepicker")).click();

        selectMonthAndYear("month", setMonth);
        selectMonthAndYear( "year",selYear);

        driver.quit();

    }
}





