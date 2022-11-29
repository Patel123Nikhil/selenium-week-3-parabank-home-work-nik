package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        System.setProperty("webdriver.chrome.driver0", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        //Launch URL
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Give the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
    public void closeBrowser(){
        driver.quit();
    }
}

