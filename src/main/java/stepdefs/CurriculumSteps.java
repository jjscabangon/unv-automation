package stepdefs;

import cucumber.api.java.en.*;
import framework.BaseClass;
import org.junit.After;
import static pages.CurriculumPage.*;

public class CurriculumSteps extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    //Search for Curriculum
        @Then("^End user adds a new Curriculum$")
        public void stepAddNewCurriculum() {
            addNewCurriculum();
        }
        @Then("^End user edits a Curriculum$")
        public void stepEditCurriculum() {
            editCurriculum();
        }

    //Search for Curriculum
        @Then("^End user searches for Curriculum$")
        public void stepSearchCurriculum() {
            searchCurriculum();
        }
}
