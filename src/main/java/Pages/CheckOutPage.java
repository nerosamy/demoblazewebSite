package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class CheckOutPage extends MainPage{
    private WebDriver driver;


    //Define Checkout page Element
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    WebElement randomCategory;

    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[text()='Cart']")
    WebElement navigateToCart;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOrderBtn;


    //Checkout popUp data
    @FindBy(id="name")
    WebElement nameInputText;

    @FindBy(id="country")
    WebElement countryInputText;

    @FindBy(id="city")
    WebElement cityInputText;

    @FindBy(id="card")
    WebElement cardInputText;

    @FindBy(id="month")
    WebElement monthInputText;

    @FindBy(id="year")
    WebElement YearInputText;

    @FindBy(xpath = "//button[text()='Purchase']")
    WebElement purchaseBtn;


    public CheckOutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    public void checkOutItem() throws InterruptedException, AWTException {
        Duration timeout = Duration.ofSeconds(30);

        // Initialize WebDriverWait with the Duration
        WebDriverWait wait = new WebDriverWait(driver, timeout);


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));

        randomCategory.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Add to cart']")));

        //Thread.sleep(10000);

        addToCartBtn.click();
        Thread.sleep(1000);
        handleAlert();
        navigateToCart.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Place Order']")));
        placeOrderBtn.click();
    }

        public void placeOrderData() throws InterruptedException, AWTException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("name")));
        nameInputText.sendKeys("Nayra");
        countryInputText.sendKeys("Egypt");
        cityInputText.sendKeys("Cairo");
        YearInputText.sendKeys("2023");
        cardInputText.sendKeys("1223333");
        monthInputText.sendKeys("12");

        purchaseBtn.click();

    }


}
