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
//    private WebDriver driver;
////    LoginPage loginPageObj = new LoginPage(driver);
//
//    @BeforeClass
//    public void setUp() {
//        driver = new ChromeDriver();
//        // Navigate to the URL
//        driver.get("https://www.demoblaze.com/");
//
//    }

    @Test
    public void testLogin() throws InterruptedException {
      //  loginPageObj.login ("A B C D");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.login("Nayra" , "Nayra123");
        // Add assertions or further test steps here
        Thread.sleep(10000);
        String actualWelcomeText = loginPage.welcomeText.getText();

        String expectedSubstring = "Welcome";
        Assert.assertTrue(actualWelcomeText.contains(expectedSubstring));
        //String expectedWelcomeText = "Welcome" +""; // Replace with the expected welcome text

        // Use an expected condition to wait for a specific element to be clickable


        // Assert that the welcome text matches the expected text

        // Close the browser
//        driver.quit();
    }
}
