package gmail_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	public static String driverPath="C:\\Users\\rajdb\\Documents\\Seleium_Soft\\BDriver\\";
    WebDriver driver;
 
    @BeforeMethod
    public void setup() {
        String baseUrl = "http://www.google.com";
        // Initialize driver object
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
        driver = new ChromeDriver();
        // Launch Application on browser
        driver.get(baseUrl);
    }
 
    @Test
    public void test01() {
        String expectedPageTitle = "Google";
        String actualPageTitle = "";
 
        // Fetch page title and store it in a variable
        actualPageTitle = driver.getTitle();
        // Print title
        System.out.println(actualPageTitle);
 
        if (actualPageTitle.equals(expectedPageTitle)) {
            System.out.println("Test case passed Opened Google Page...!");
        } else {
            System.out.println("Test case Failed");
        }
 
    }
 
    @AfterMethod
    public void tearDonw() {
    driver.close();
    }
}
