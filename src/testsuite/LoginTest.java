package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter valid username in valid username field
        driver.findElement(By.name("username")).sendKeys("xyz123@gmail.com");
        //Enter valid password in valid password field
        driver.findElement(By.name("password")).sendKeys("babusona123");
        //Click on LOGIN button
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        //Verify the "Account Overview" text is display
    }

    @Test
    public void verifyTheErrorMessage() {
        //Enter invalid username in username field
        driver.findElement(By.name("username")).sendKeys("zyx123@gmail.com");
        //Enter invalid password in password field
        driver.findElement(By.name("password")).sendKeys("sonababu123");
        //Click on Login button
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        //Verify the error message "The username and password could noe be verified"

    }

    @Test
    public void userShouldLogOutSuccessfully() {
        //Enter valid username in username field
        driver.findElement(By.name("username")).sendKeys("zyx123@gmail.com");
        //Enter valid password in password field
        driver.findElement(By.name("")).sendKeys("sonababu123");
        //Click on LOGIN button
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        //Click on Log Out link
        driver.findElement(By.xpath("")).click();
        //Verify the test "Customer Login"
    }

    public void tearDown() {
        closeBrowser();
    }
}



