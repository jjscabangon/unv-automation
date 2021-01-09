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

    //Add, edit, delete an Agency Administrator
        @Then("^End User adds a new Agency Administrator$")
        public void stepAddNewAgencyAdmin() throws Exception {
            addNewAgencyAdmin();
        }
        @Then("^End User edits an Agency Administrator$")
        public void stepEditAgencyAdmin() throws Exception {
            editAgencyAdmin();
        }
        @Then("^End User deletes an Agency Administrator$")
        public void stepDeleteAgencyAdmin() throws Exception {
            deleteAgencyAdmin();
        }

    //Add, edit, delete Notes of Agency Administrator
        @Then("^End User adds Note to Agency Administrator$")
        public void stepAddNoteAgencyAdmin() throws Exception {
            addNoteAgencyAdmin();
        }
        @Then("^End User edits Note of Agency Administrator$")
        public void stepEditNoteAgencyAdmin() throws Exception {
            editNoteAgencyAdmin();
        }
        @Then("^End User deletes Note of Agency Administrator$")
        public void stepDeleteNoteAgencyAdmin() throws Exception {
            deleteNoteAgencyAdmin();
        }

    //Search for Agency Administrator
        @Then("^End User searches for Agency Administrator$")
        public void stepSearchAgencyAdmin() throws Exception {
            searchAgencyAdmin();
        }
}
