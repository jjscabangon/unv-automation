package stepdefs;

import cucumber.api.java.en.*;
import framework.BaseClass;
import org.junit.After;

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

    @Then("^End User deletes a Student$")
    public void stepDeleteStudent() throws InterruptedException {
        deleteStudent();
    }

    @Then("^New Student is added successfully$")
    public void stepVerifyNewStudent() {
        softAssert.assertTrue(isStudentAdded(),"ASSERT: FAILED | isStudentAdded()");
    }

    @Then("^End User searches for Students via First Name$")
    public void stepSearchStudentsFName() {
        searchStudentsFirstName();
    }

    @Then("^End User searches for Students via Last Name$")
    public void stepSearchStudentsLName() {
        searchStudentsLastName();
    }

    @Then("^End User searches for Students via ID$")
    public void stepSearchStudentsID() {
        searchStudentsID();
    }
}
