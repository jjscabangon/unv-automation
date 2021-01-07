package pages;

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

    public static boolean isStudentAdded() {
        return false;
    }
}
