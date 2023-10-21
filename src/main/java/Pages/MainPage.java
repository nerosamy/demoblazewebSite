package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;




import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class MainPage {

    WebDriver driver;
    JavascriptExecutor jsDriver;
    WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.jsDriver = (JavascriptExecutor) driver;
        //Set a delay of 30 secs to wait for elements' visibility
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(factory, this);
        Duration timeout = Duration.ofSeconds(30);

        // Initialize WebDriverWait with the Duration
        wait = new WebDriverWait(driver, timeout);
    }


/**
 * Method to handel Alarm appear after add product and place order
 */

        public void handleAlert() {
            Alert alert = driver.switchTo().alert(); // Switch to the alert
            String alertText = alert.getText(); // Get the text of the alert
            System.out.println("Alert Text: " + alertText);

            // Accept the alert (Click OK)
            alert.accept();

        }
    }

