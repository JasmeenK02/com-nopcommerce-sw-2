package browserfactory;
/**
 * 1. Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup
 * code inside the class ‘Base Test’.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        //String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        driver = new ChromeDriver();
        // open the url into browser
        driver.get(baseUrl);
       // Maximise Browser
        driver.manage().window().maximize();
        //we give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser(){
        driver.quit();
    }



}
