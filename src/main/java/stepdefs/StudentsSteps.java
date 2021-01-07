package stepdefs;

import cucumber.api.java.en.*;
import framework.BaseClass;
import org.junit.After;

import static pages.HomepagePage.isAnnouncementDisplayed;
import static pages.StudentsPage.*;

public class StudentsSteps extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    @When("^End User adds a new Student$")
    public void stepAddNewStudent() {
        addStudent();
    }

    @Then("^End User edits a Student$")
    public void stepEditStudent() {
        editStudent();
    }

    @Then("^New Student is added successfully$")
    public void stepVerifyNewStudent() {
        softAssert.assertTrue(isStudentAdded(),"ASSERT: FAILED | isStudentAdded()");
    }
}
