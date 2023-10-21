package Test;

import Pages.CategoriesPage;
import Pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CategoriesTests extends BaseTest {
@Test(priority = 0)
public void login() throws InterruptedException {

    LoginPage loginPage = new LoginPage(driver);
    loginPage.navigateToLoginPage();
    loginPage.login("Nayra" , "Nayra123");
    Thread.sleep(10000);
}
    @Test(priority = 1)
    public void testCategoriesHaveItems() throws InterruptedException {

        // Get the categories and items
        CategoriesPage categoriesPage = new CategoriesPage(driver);
        System.out.println("sss" + categoriesPage.getCategories().size());
        List<WebElement> categories = categoriesPage.getCategories();

        // Check if there are categories and items
        Assert.assertTrue(categories.size() > 0, "No categories found.");

    }
}