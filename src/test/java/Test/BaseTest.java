package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        // Navigate to the URL
        driver.get("https://www.demoblaze.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
