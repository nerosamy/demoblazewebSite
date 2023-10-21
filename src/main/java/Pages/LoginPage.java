package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    @FindBy(id="login2")
    WebElement navigateToLoginBtn;

    @FindBy(id="loginpassword")
    WebElement passTextInput;

    @FindBy(id="loginusername")
    WebElement usernameTextInput;

    @FindBy(xpath = "//button[text()='Log in']")
            WebElement loginBtn;
    @FindBy(id="nameofuser")
   public WebElement welcomeText;

//    LoginPage loginPageObj = new LoginPage(driver);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void navigateToLoginPage() {
       navigateToLoginBtn.click();
    }

    public void login(String username , String pass) {
        usernameTextInput.sendKeys(username);
        passTextInput.sendKeys(pass);

        loginBtn.click();
    }

//    public String getWelcomeText() {
//        return welcomeText.getText();
//    }

}
