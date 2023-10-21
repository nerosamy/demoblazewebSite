package Test;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class RegisterTests extends BaseTest{
    @Test

    public void testRegister() throws InterruptedException {
        LocalTime currentTime = LocalTime.now();

String Username= "Nayra"+ currentTime;
String Password= "Pass" + currentTime;
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.navigateToSignUpPage();
        registerPage.registerNewUser(Username, Password);
        Thread.sleep(10000);
        // Add assertions or further test steps here
    }


}
