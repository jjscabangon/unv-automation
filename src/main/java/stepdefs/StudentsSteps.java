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

    //Students
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

    //Search
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

    //Filter
        @Then("^End User filters all Active Student list$")
        public void stepFilterActiveStudents() {
            filterActiveStudents();
        }
        @Then("^End User filters all Inactive Student list$")
        public void stepFilterInactiveStudents() {
            filterInactiveStudents();
        }
        @Then("^End User filters all Closed Student list$")
        public void stepFilterClosedStudents() {
            filterClosedStudents();
        }

    //Student Attribute
        @Then("^End User adds a new Student Attribute$")
        public void stepAddNewStudentAttribute() {
            addNewStudentAttribute();
        }
        @Then("^End User edits Student Attribute$")
        public void stepEditStudentAttribute() {
            editStudentAttribute();
        }
        @Then("^End User deletes Student Attribute$")
        public void stepDeleteStudentAttribute() {
            deleteStudentAttribute();
        }

    //Notes
        @Then("^End User adds a new Note to Student$")
        public void stepAddNewStudentNote() {
            addNewStudentNote();
        }
        @Then("^End User edits Note of Student$")
        public void stepEditStudentNote() {
            editNewStudentNote();
        }
        @Then("^End User deletes Note of Student$")
        public void stepDeleteStudentNote() {
            deleteNewStudentNote();
        }
}
