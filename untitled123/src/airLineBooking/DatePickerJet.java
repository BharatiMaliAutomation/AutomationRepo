package airLineBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class DatePickerJet {
    public static WebDriver driver;
    public static void selecSourceAndDestination(String city, String sourceOrDestination) {
        List<WebElement> listOfCities = null;
        if (sourceOrDestination.equals("source")) {
            driver.findElement(By.id("source")).sendKeys("pune");
            listOfCities = driver.findElements(By.xpath("//u1[@id='ui-id-1']//child::li"));
        } else if (sourceOrDestination.equals("destination")) {
            driver.findElement(By.id("destination")).sendKeys("Mumbai");
            listOfCities = driver.findElements(By.xpath("//u1[@id='ui-id-1']//child::li"));
        } else {
            System.out.println("Please select the proper source & destination");
        }
        for (WebElement element : listOfCities) {
            if (element.equals("city")) {
                element.click();
                break;
            }
        }
    }
        public static void selectMonthAndYear (String monthOrYear, String mmyy){
            List<WebElement> listOfMonthAndYear = null;
            if (monthOrYear.equals("month")) {
                listOfMonthAndYear = driver.findElements(By.xpath("//span[@class'ui-datepicker-month']"));
            } else if (monthOrYear.equals("year")) {
                listOfMonthAndYear = driver.findElements(By.xpath("//span[@class='ui-datepicker-year']"));
            } else {
                System.out.println("select correct month or year");
            }
            for (WebElement element : listOfMonthAndYear) {
                if (element.getText().equals(mmyy)) {
                    element.click();
                }
            }
        }


        public static void main (String[]args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.abhibus.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            selecSourceAndDestination("Pune", "source");
            selecSourceAndDestination("Mumbai", "destination");

            String selDate = "9";
            String selMonth = "August";
            String selYear = "2022";

            driver.findElement(By.id("datepicker1")).click();

            selectMonthAndYear("month", selMonth);
            selectMonthAndYear("month", selMonth);
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
            for (WebElement element :dates) {
                if (element.getText().equals(selDate)) {
                    element.click();
                    break;
                }
            }
            Thread.sleep(3000);
            driver.quit();

        }
    }
