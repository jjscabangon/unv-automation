package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentsPage extends BasePage {
    //Add Student
    public static void addStudent() {
        System.out.println("START: addStudent()");
        clickMainMenu(btnHomeStudent);
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
        System.out.println("START: editStudent()");
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
        System.out.println("END: editStudent()");
    }

    public static void deleteStudent() throws InterruptedException {
        System.out.println("START: deleteStudent()");
        //Click the Student to edit
        WebElement table = driver.findElement(tblStudentTable);
        WebElement student = table.findElement(tblStudentTableList);
        student.click();
        String currentDateAndTime = getDateAndTime();
        waitForPageToLoadCompletely(30);
        //Click Delete button
        driver.findElement(btnStudentDelete).click();
        //Confirm Deletion
        driver.findElement(txtStudentConfirmDelete).sendKeys("YES");
        driver.findElement(btnStudentConfirmDelete).click();
        System.out.println("END: deleteStudent()");
    }

    public static void searchStudentsFirstName() {
        System.out.println("START: searchStudentsFirstName()");
        clickMainMenu(btnHomeStudent);
        //Click the Search button
        driver.findElement(btnStudentSearch).click();
        driver.findElement(btnStudentSearchIntercept).click();
        waitForPageToLoadCompletely(30);
        //Search for First Name
        driver.findElement(txtStudentSearchFirstName).sendKeys("AUTO");
        driver.findElement(btnStudentPerformSearch).click();
        System.out.println("END: searchStudentsFirstName()");
    }

    public static void searchStudentsLastName() {
        System.out.println("START: searchStudentsLastName()");
        clickMainMenu(btnHomeStudent);
        //Click the Search button
        driver.findElement(btnStudentSearch).click();
        waitForPageToLoadCompletely(30);
        //Search for Last Name
        driver.findElement(txtStudentSearchLastName).sendKeys("TEST");
        driver.findElement(btnStudentPerformSearch).click();
        System.out.println("END: searchStudentsLastName()");
    }

    public static void searchStudentsID() {
        System.out.println("START: searchStudentsID()");
        clickMainMenu(btnHomeStudent);
        //Click the Search button
        driver.findElement(btnStudentSearch).click();
        waitForPageToLoadCompletely(30);
        //Search for ID
        driver.findElement(txtStudentSearchID).sendKeys("AUTO");
        driver.findElement(btnStudentPerformSearch).click();
        System.out.println("END: searchStudentsID()");
    }

    public static void filterInactiveStudents() {
        System.out.println("START: filterInactiveStudents()");
        clickMainMenu(btnHomeStudent);
        //Select Inactive Status
        selectDropdown(ddStudentFilter,"Inactive");
        System.out.println("END: filterInactiveStudents()");
    }

    public static void filterClosedStudents() {
        System.out.println("START: filterClosedStudents()");
        //Select Closed Status
        selectDropdown(ddStudentFilter,"Closed");
        System.out.println("END: filterClosedStudents()");
    }

    public static void filterActiveStudents() {
        System.out.println("START: filterActiveStudents()");
        //Select Active Status
        selectDropdown(ddStudentFilter,"Active");
        System.out.println("END: filterActiveStudents()");
    }

    public static boolean isStudentAdded() {
        return false;
    }
}
