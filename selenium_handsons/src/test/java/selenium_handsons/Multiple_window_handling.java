package selenium_handsons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Multiple_window_handling {
    public static void main(String[] args) {
        // Setup EdgeDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Initialize the EdgeDriver
        WebDriver driver = new EdgeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();
            takeScreenshot(driver, "01_Maximized_Window");

            // Open Amazon's website
            driver.get("https://www.amazon.in");
            takeScreenshot(driver, "02_Amazon_Homepage");

            // Find the search box and enter a query
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("laptop");
            takeScreenshot(driver, "03_Entered_Search_Query");

            // Submit the search form
            searchBox.submit();
            takeScreenshot(driver, "04_Submitted_Search_Query");

            // Wait for the results to load and display the titles of the first few results
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2 .a-link-normal.a-text-normal")));
            takeScreenshot(driver, "05_Search_Results_Loaded");

            // Find the result elements
            List<WebElement> results = driver.findElements(By.cssSelector("h2 .a-link-normal.a-text-normal"));

            // Print the titles of the first few results
            for (int i = 0; i < Math.min(results.size(), 5); i++) {
                System.out.println(results.get(i).getText());
            }
            takeScreenshot(driver, "06_Printed_First_Few_Results");

            // Click on the first product link to open a new window
            if (!results.isEmpty()) {
                results.get(0).click();
            }
            takeScreenshot(driver, "07_Clicked_First_Product");

            // Get the handle of the parent window
            String parentWindowHandle = driver.getWindowHandle();

            // Get all window handles
            Set<String> allWindowHandles = driver.getWindowHandles();

            // Iterate through all window handles
            for (String handle : allWindowHandles) {
                if (!handle.equals(parentWindowHandle)) {
                    // Switch to the new window
                    driver.switchTo().window(handle);
                    // Maximize the new window
                    driver.manage().window().maximize();
                    takeScreenshot(driver, "08_Switched_To_New_Window");

                    // Perform actions in the new window
                    System.out.println("Title of the new window: " + driver.getTitle());

                    // Wait for the add to cart button to be clickable and click it
                    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);
                    takeScreenshot(driver, "09_Added_To_Cart");

                    // Close the new window
                    driver.close();
                    break;
                }
            }

            // Switch back to the parent window
            driver.switchTo().window(parentWindowHandle);
            takeScreenshot(driver, "10_Switched_Back_To_Parent_Window");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to take a screenshot
    public static void takeScreenshot(WebDriver driver, String fileName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:/MyScreenshots/" + fileName + ".png"); // Custom path
        destFile.getParentFile().mkdirs(); // Ensure the directory exists
        try {
            FileHandler.copy(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}