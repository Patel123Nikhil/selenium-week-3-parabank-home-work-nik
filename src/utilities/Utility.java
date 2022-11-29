package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    /**
     * * This method will click on element
     */


    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    //*******************************************Alert Methods*******************************************

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }
    //Homework 4 method acceptAlert, dismissAlert, getTextFromAlert, sendTextToAlert(String text)


    //****************************Select Class Methods*****************************************


    //This method will select option by visible text
    public void selectByVisibleTextFromDropdown(By by, String text) {
        WebElement dropDown = driver.findElement(By.name("by"));
        Select select = new Select(dropDown);
        //Select By Value
        select.selectByVisibleText("Australia");

        /**
         * This method will select the option by value
         */

        /**
         * This method will select the option by index
         */

        /**
         * This method will select the option by contains text
         */

      //***********************************Window Handle *****************
        // ************************************Action Class***************
        //mouseHoverToElement(By by), mouseHoverToElementAndClick(By by)
    }
}

