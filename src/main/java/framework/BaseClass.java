package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static String url;
    public static SoftAssert softAssert;
    public static String environment;

    public static void initializeBrowser() throws InterruptedException, IOException {
        setupTestBrowser();
        url = "http://52.238.165.25/CPTA_TESTING/Login.aspx";
        try {
            driver.get(url);
        } catch (Exception remoteTimeOut){
            System.out.println("FAILED: Cannot access the website");
        }
    }

    public static void setupTestBrowser() throws IOException {
//        FileInputStream objFis = new FileInputStream("src/test/config.properties");
//        Properties objProp = new Properties();
//        objProp.load(objFis);
//        environment = objProp.getProperty("env");

        // Initialize browser
        if (driver != null) driver.quit();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Starting softAssert Method
        softAssert= new SoftAssert();
    }

    public static void waitForElement(By element, int retries) {
        System.out.println("START: waitForElement() | " + element);
        for (int i=0; i<retries; i++) {
            try {
                driver.findElement(element).isDisplayed();
                retries++;
            } catch (Exception elementNotFound) {
                if (i==retries-1) {
                    System.out.println("ASSERT: Element Not Found | " + element);
                }
            }
        }
        System.out.println("END: waitForElement() | " + element);
    }
}
