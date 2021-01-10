package stepdefs;

import cucumber.api.java.en.Then;
import framework.BaseClass;
import org.junit.After;

import static pages.AdministratorsPage.*;

public class AdministratorsSteps extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    //Add, edit, delete an University Admin
    @Then("^End User adds a new University Admin$")
    public void stepAddNewUniversityAdmin() throws Exception {
        addNewUniversityAdmin();
    }
}
