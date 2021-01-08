package framework;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static pages.BasePage.*;

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

    public static void waitForPageToLoadCompletely(int seconds){
        try {
            ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
                @NullableDecl
                @Override
                public Boolean apply(@NullableDecl WebDriver webDriver) {
                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                }
            };
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(pageLoadCondition);
        } catch (Exception errorTimeout){
            System.out.println("ERROR: Page did not load completely after " + seconds + "seconds of wait");
        }
    }

    public static String getDateAndTimeNoFormat() {
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
        Date date = new Date();
        String dateAndTime= dateFormat.format(date);
        return dateAndTime;
    }

    public static void clickMainMenu(By menu) {
        driver.findElement(menu).click();
        waitForPageToLoadCompletely(30);
    }

    public static void selectDropdown(By dropdown, String value) {
        Select ddStatus = new Select(driver.findElement(dropdown));
        ddStatus.selectByVisibleText(value);
    }

    public static void closeFormAndSave() {
        //Click Close Form button
        driver.findElement(btnCloseForm).click();
        //Click Yes from Save Confirmation
        driver.findElement(btnSaveFormYes).click();
    }

    public static void closeForm() {
        //Click Close Form button
        driver.findElement(btnCloseForm).click();
    }

    public static void deleteAndConfirm() {
        //Click Delete button
        driver.findElement(btnDelete).click();
        //Confirm Deletion
        driver.findElement(txtConfirmDelete).sendKeys("YES");
        driver.findElement(btnConfirmDelete).click();
    }

    public static void delete() {
        //Click Delete button
        driver.findElement(btnDelete).click();
        driver.findElement(btnConfirmDelete).click();
    }

    public static void clickTableRowByText(String text) {
        //Click the row to edit
        WebElement table = driver.findElement(tblTable);
        WebElement row = table.findElement(By.xpath("//tr/td[contains(text(), '" + text + "')]"));
        row.click();
        waitForPageToLoadCompletely(30);
    }
}
