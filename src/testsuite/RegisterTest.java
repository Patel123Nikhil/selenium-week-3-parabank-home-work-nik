package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    public void clickOnElement(By by) {
        WebElement registerLink = driver.findElement(by);
        registerLink.click();
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //Find register element and click on register link
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        //Verify the text "Signing up is easy!"
        String expectedMessage = "Signing up is easy!";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //Click on register link
        //Find register element and click on register link
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        //Enter first name in first name field
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Raja");
        //Enter last name in last name field
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Babu");
        //Enter address in address field
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Primary Close");
        //Enter City in city field
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Geneva");
        //Enter State in state field
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Switz");
        //Enter Zipcode in zip code field
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("NR5 2EZ");
        //Enter phone number in phone number field
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("01293565489");
        //Enter SSN number in SSN field
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("345689");
        //Enter username in username field
        driver.findElement(By.id("customer.username")).sendKeys("xyz123@gmail.com");
        //Enter Password in password field
        driver.findElement(By.name("customer.password")).sendKeys("babusona123");
        //Enter confirm password in confirm field
        driver.findElement(By.name("repeatedPassword")).sendKeys("babusona123");
        //Click on REGISTER button
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
        //Verify the text "Your account was created successfully. You are now logged in."
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    public void tearDown() {
        closeBrowser();
    }

}
