package Pages;

//import jdk.internal.org.jline.utils.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage{

    private WebDriver driver;
    WebDriverWait wait;

//Locate login page elements
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


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        Duration timeout = Duration.ofSeconds(30);

        // Initialize WebDriverWait with the Duration
        wait = new WebDriverWait(driver, timeout);

    }


    public void navigateToLoginPage() throws InterruptedException {

        Thread.sleep(10000);
        navigateToLoginBtn.click();
    }

    public void login(String username , String pass) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginusername")));

        usernameTextInput.sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginpassword")));

        passTextInput.sendKeys(pass);

        loginBtn.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("nameofuser")));

    }


}
