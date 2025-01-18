package selenium_handsons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class Test_cases_class {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new EdgeDriver();
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("clicked");
    }

    @Test
    public void openAmazon() {
        driver.get("https://www.amazon.in");
        System.out.println("clicked");
    }

    @Test
    public void searchPensOnAmazon() {
        driver.get("https://www.amazon.in");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pens");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        System.out.println("clicked");
    }

    @AfterMethod
    public void tearDown(Method method) {
    	screenshot.takeScreenshot(driver, method.getName());
        driver.quit();
    }
}