package pages;

import cucumber.api.DataTable;
import java.util.*;

public class LoginPage extends BasePage {
    //Execute login
    public static void login(DataTable loginCredentials) {
        System.out.println("START: login()");
        waitForPageToLoadCompletely(3);
        //Convert DataTable into Array
        List<List<String>> loginRawData = loginCredentials.raw();
        ArrayList<String> loginDataList = new ArrayList<>();
            loginDataList.add(loginRawData.get(0).get(1));
            loginDataList.add(loginRawData.get(1).get(1));
        //Input credentials and Login
        driver.findElement(loginUsername).sendKeys(loginDataList.get(0));
        driver.findElement(loginPassword).sendKeys(loginDataList.get(1));
        driver.findElement(btnLoginSignIn).click();
        System.out.println("END: login()");
    }
    //Verify successful login
    public static boolean isLoginSuccessful() throws InterruptedException{
        System.out.println("START: isLoginSuccessful()");
        waitForPageToLoadCompletely(10);
        try {
            if(driver.findElement(homeHeaderTable).isDisplayed()) {
                System.out.println("ASSERT: isLoginSuccessful() | PASSED");
                System.out.println("END: isLoginSuccessful()");
                return true;
            }
        } catch (org.openqa.selenium.NoSuchElementException noSuchElementException) {
            System.out.println("END: isLoginSuccessful()");
        }
        return false;
    }
}
