package Test;

import Pages.CategoriesPage;
import Pages.LoginPage;
import Pages.CheckOutPage;
import org.testng.annotations.Test;

import java.awt.*;

public class checkoutTests  extends BaseTest {

    @Test(priority = 0)
    public void login() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.login("Nayra" , "Nayra123");

    }


    @Test(priority = 1)
    public void testCheckout() throws InterruptedException, AWTException {

        Thread.sleep(1000);
        CheckOutPage checkOutPage = new CheckOutPage(driver);

       checkOutPage.checkOutItem();
       checkOutPage.placeOrderData();

    }}

