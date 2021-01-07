package pages;

import org.openqa.selenium.WebElement;

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
        closeFormAndSave();
        System.out.println("END: addStudent()");
    }

    //Edit Student
    public static void editStudent() {
        System.out.println("START: editStudent()");
        //Click the Student to edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTime();
        //Input Fist Name
        driver.findElement(txtStudentFirstName).clear();
        driver.findElement(txtStudentFirstName).sendKeys("EDIT AUTO LNAME: TEST " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtStudentLastName).clear();
        driver.findElement(txtStudentLastName).sendKeys("EDIT AUTO LNAME: TEST " + currentDateAndTime);
        closeFormAndSave();
        System.out.println("END: editStudent()");
    }

    public static void deleteStudent() throws InterruptedException {
        System.out.println("START: deleteStudent()");
        //Click the Student to edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTime();
        waitForPageToLoadCompletely(30);
        //Delete and Confirm
        deleteAndConfirm();
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

    public static void addNewStudentAttribute() {
        System.out.println("START: addNewStudentAttribute()");
        //Click the Student to edit
        clickTableRowByText("AUTO");
        //Click the Attribute button
        driver.findElement(btnStudentAttribute).click();
        waitForPageToLoadCompletely(30);
        //Click the Add New Attribute button
        driver.findElement(btnStudentAddNewAttribute).click();
        waitForPageToLoadCompletely(30);
        //Select Attribute
        selectDropdown(ddStudentAttribute, "Languages");
        //Select Attribute Value
        selectDropdown(ddStudentAttributeValue, "Russian");
        //Input Effective Date
        driver.findElement(txtStudentAttributeEffectiveDate).sendKeys("01/01/2021");
        //Input Expiration Date
        driver.findElement(txtStudentAttributeExpirationDate).sendKeys("12/01/2025");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNewStudentAttribute()");
    }

    public static void editStudentAttribute() {
        System.out.println("START: editStudentAttribute()");
        //Click the Attribute to edit
        clickTableRowByText("Languages");
        //Select Attribute
        selectDropdown(ddStudentAttribute, "Status");
        //Select Attribute Value
        selectDropdown(ddStudentAttributeValue, "Inactive");
        //Input Effective Date
        driver.findElement(txtStudentAttributeEffectiveDate).clear();
        driver.findElement(txtStudentAttributeEffectiveDate).sendKeys("02/02/2021");
        //Input Expiration Date
        driver.findElement(txtStudentAttributeExpirationDate).clear();
        driver.findElement(txtStudentAttributeExpirationDate).sendKeys("12/30/2025");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editStudentAttribute()");
    }

    public static void deleteStudentAttribute() {
        System.out.println("START: deleteStudentAttribute()");
        //Click the Attribute to edit
        clickTableRowByText("Languages");
        //Delete and Confirm
        delete();
        System.out.println("END: deleteStudentAttribute()");
    }

    public static boolean isStudentAdded() {
        return false;
    }
}
