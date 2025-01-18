package selenium_handsons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;



public class Webdeiver_installation {


	    public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	//System.setProperty("webdriver.edge.driver","C:\\Drivers\\edgedriver_win64");
	    	 WebDriver driver = new EdgeDriver();
	    	// launch Edge and direct it to the Base URL
	    	 String baseUrl = "https://www.amazon.in/";
	         String expectedTitle = "Welcome: Mercury Tours";
	         String actualTitle = "";
	    	driver.get(baseUrl);
	    	
	    	 // get the actual value of the title
	    	actualTitle = driver.getTitle();
	        
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
			
	       
	        //driver.manage().window().maximize();
	        //close Fire fox
	        driver.close();
	    }

	}


