package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import framework.BaseClass;
import org.junit.After;
import static pages.LoginPage.*;

public class LoginSteps extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    //Note that the step text from Feature file should exactly match the annotation text
    @Given("^End User logs in$")
    public void stepEndUserLogsInAs(DataTable loginCredentials) throws Exception {
        initializeBrowser();
        login(loginCredentials);
    }
    @Then("^End User logged in successfully$")
    public void stepEndUserLoggedInSuccessffully() throws Exception {
        softAssert.assertTrue(isLoginSuccessful(),"ASSERT: FAILED | isLoginSuccessful()");
    }
}
