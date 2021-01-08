package stepdefs;

import cucumber.api.java.en.Then;
import framework.BaseClass;
import org.junit.After;

import static pages.AgenciesPage.*;

public class AgenciesStep extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    //Add, edit, delete an Agency
        @Then("^End User adds a new Agency$")
        public void stepAddNewAgency() throws Exception {
            addNewAgency();
        }
        @Then("^End User edits an Agency$")
        public void stepEditAgency() throws Exception {
            editAgency();
        }
        @Then("^End User deletes an Agency$")
        public void stepDeleteAgency() throws Exception {
            deleteAgency();
        }

}
