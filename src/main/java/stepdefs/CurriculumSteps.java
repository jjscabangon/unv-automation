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

    @Then("^End user searches for Curriculum$")
    public void stepSearchCurriculum() {
        searchCurriculum();
    }
}
