package Test;

import Pages.CategoriesPage;
import Pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class CategoriesTests extends BaseTest {

    /*Valid login */
    @Test(priority = 0)
public void login() throws InterruptedException {

    LoginPage loginPage = new LoginPage(driver);
    loginPage.navigateToLoginPage();
    loginPage.login("Nayra" , "Nayra123");
    Thread.sleep(10000);
}

/*
* Calculate categories size
* Then compare it more than Zero
* */
    @Test(priority = 1)
    public void testCategoriesHaveItems() throws InterruptedException {

        // Get the categories and items
        CategoriesPage categoriesPage = new CategoriesPage(driver);
        System.out.println("Categories Size" + categoriesPage.getCategories().size());
        List<WebElement> categories = categoriesPage.getCategories();

        // Check if there are categories and items
        Assert.assertTrue(categories.size() > 0, "No categories found.");

    }
/*
* after check there is a category
* Add Random item to the cart
* */
    @Test(priority = 2)
    public void testAddItemToTheCart() throws InterruptedException {

        // Get the categories and items
        CategoriesPage categoriesPage = new CategoriesPage(driver);
       categoriesPage.addRandomItemToCart();
       Thread.sleep(1000);


    }
/*
*remove The last added item
 */

    @Test(priority = 3)
    public void testRemoveItemFromCart() throws InterruptedException, AWTException {

        // Get the categories and items
        CategoriesPage categoriesPage = new CategoriesPage(driver);
        categoriesPage.removeItemFromCart();
        Thread.sleep(10000);


    }

}