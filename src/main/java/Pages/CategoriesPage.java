package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class CategoriesPage extends MainPage{

    private WebDriver driver;
/*
* Locate category page Element
 */

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    WebElement randomCategory;

    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[text()='Cart']")
    WebElement navigateToCart;

    @FindBy(xpath = "//*[@id='tbodyid']/tr[1]/td[4]/a")
    WebElement deleteItemFromCart;



    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Define locators for categories and items
    private By categoryLocator = By.xpath("//*[@id='tbodyid']/div");


    // Method to get the categories
    public List<WebElement> getCategories() {
        return driver.findElements(categoryLocator);
    }


    public void addRandomItemToCart() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));
         randomCategory.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Add to cart']")));

        addToCartBtn.click();
    }
    public void removeItemFromCart() throws InterruptedException, AWTException {
//Call handel alert method to accept the alert
// Alert Text: Product added.

        handleAlert();
        navigateToCart.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='tbodyid']/tr[1]/td[4]/a")));
        deleteItemFromCart.click();
    }



}
