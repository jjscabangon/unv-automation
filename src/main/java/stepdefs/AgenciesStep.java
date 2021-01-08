package stepdefs;

import cucumber.api.java.en.Then;
import framework.BaseClass;
import org.junit.After;

import static pages.AgenciesPage.addNewAgency;

public class AgenciesStep extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    @Then("^End User adds a new Agency$")
    public void stepAddNewAgency() throws Exception {
        addNewAgency();
    }

}
