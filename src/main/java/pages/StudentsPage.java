package pages;

import org.openqa.selenium.WebElement;

public class StudentsPage extends BasePage {
    //Add Student
    public static void addStudent() {
        System.out.println("START: addStudent()");
        //Click the Students menu
        driver.findElement(btnHomeStudent).click();
        waitForPageToLoadCompletely(30);
        //Click the Add New Student button
        driver.findElement(btnStudentAddNew).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTime();
        //Input Fist Name
        driver.findElement(txtStudentFirstName).sendKeys("AUTO LNAME: TEST " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtStudentLastName).sendKeys("AUTO LNAME: TEST " + currentDateAndTime);
        //Click Close Form button
        driver.findElement(btnStudentCloseForm).click();
        //Click Yes from Save Confirmation
        driver.findElement(btnStudentSaveFormYes).click();
        System.out.println("END: addStudent()");
    }

    //Edit Student
    public static void editStudent() {
        System.out.println("START: addStudent()");
        //Click the Student to edit
        WebElement table = driver.findElement(tblStudentTable);
        WebElement student = table.findElement(tblStudentTableList);
        student.click();
        String currentDateAndTime = getDateAndTime();
        //Input Fist Name
        driver.findElement(txtStudentFirstName).clear();
        driver.findElement(txtStudentFirstName).sendKeys("EDIT AUTO LNAME: TEST " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtStudentLastName).clear();
        driver.findElement(txtStudentLastName).sendKeys("EDIT AUTO LNAME: TEST " + currentDateAndTime);
        //Click Close Form button
        driver.findElement(btnStudentCloseForm).click();
        //Click Yes from Save Confirmation
        driver.findElement(btnStudentSaveFormYes).click();
        System.out.println("END: addStudent()");
    }

    public static void deleteStudent() {

    }

    public static boolean isStudentAdded() {
        return false;
    }
}
