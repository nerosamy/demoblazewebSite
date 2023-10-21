package Test;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{


    @Test
    public void testLogin() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.login("Nayra" , "Nayra123");

        // Add assertions that user logged in successfully
        // Assert that the welcome text matches the expected text

        String actualWelcomeText = loginPage.welcomeText.getText();

        String expectedSubstring = "Welcome";
        Assert.assertTrue(actualWelcomeText.contains(expectedSubstring));


    }
}
