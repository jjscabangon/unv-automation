package stepdefs;

import cucumber.api.java.en.Then;
import framework.BaseClass;
import org.junit.After;

import static pages.UniversitiesPage.*;

public class UniversitiesStep extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    //Add, edit, delete an University
        @Then("^End User adds a new University$")
        public void stepAddNewUniversity() throws Exception {
            addNewUniversity();
        }
        @Then("^End User edits a University$")
        public void stepEditUniversity() throws Exception {
            editUniversity();
        }
        @Then("^End User deletes a University$")
        public void stepDeleteUniversity() throws Exception {
            deleteUniversity();
        }

    //Search for University
        @Then("^End User searches for University$")
        public void stepSearchUniversity() throws Exception {
            searchUniversity();
        }
}
