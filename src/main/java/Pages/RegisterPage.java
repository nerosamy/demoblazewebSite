package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;

    //Locate registration page elements
    @FindBy(id="signin2")
    WebElement navigateToSignupBtn;

    @FindBy(id="sign-password")
    WebElement passTextInput;

    @FindBy(id="sign-username")
    WebElement usernameTextInput;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signupBtn;
    @FindBy(id="nameofuser")
    public WebElement welcomeText;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void navigateToSignUpPage() {

        navigateToSignupBtn.click();
    }

    public void registerNewUser(String username , String pass) throws InterruptedException {
        Thread.sleep(10000);
        usernameTextInput.sendKeys(username);
        passTextInput.sendKeys(pass);

        signupBtn.click();
    }
}
