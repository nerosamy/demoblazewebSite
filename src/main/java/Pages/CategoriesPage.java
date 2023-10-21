package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoriesPage {

    private WebDriver driver;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Define locators for categories and items
    private By categoryLocator = By.xpath("//*[@id='tbodyid']/div");

    // Method to get the categories
    public List<WebElement> getCategories() {
        return driver.findElements(categoryLocator);
    }

    // Method to get the ite
}
