package pages;

public class StudentsPage extends BasePage {
    //Add Student
    public static void addStudent() {
        System.out.println("START: addStudent()");
        clickMainMenu(btnHomeStudent);
        //Click the Add New Student button
        driver.findElement(btnStudentAddNew).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Fist Name
        driver.findElement(txtStudentFirstName).sendKeys("AUTO LNAME: TEST " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtStudentLastName).sendKeys("AUTO LNAME: TEST " + currentDateAndTime);
        closeFormAndSave();
        System.out.println("END: addStudent()");
    }

    public static boolean isStudentAdded() {
        return false;
    }

    //Edit Student
    public static void editStudent() {
        System.out.println("START: editStudent()");
        //Click the Student to edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Fist Name
        driver.findElement(txtStudentFirstName).clear();
        driver.findElement(txtStudentFirstName).sendKeys("EDIT AUTO LNAME: TEST " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtStudentLastName).clear();
        driver.findElement(txtStudentLastName).sendKeys("EDIT AUTO LNAME: TEST " + currentDateAndTime);
        closeFormAndSave();
        System.out.println("END: editStudent()");
    }

    //Edit Student Status
    public static void editStudentStatus(String statusFrom, String statusTo) {
        System.out.println("START: editStudentStatus()");
        System.out.println("editStudentStatus() | FROM: " + statusFrom + " TO: " + statusTo);
        selectDropdown(ddStudentFilter, statusFrom);
        //Click the Student to edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Select Status
        selectDropdown(ddStudentStatus, statusTo);
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editStudentStatus()");
    }

    //Delete Student
    public static void deleteStudent() throws InterruptedException {
        System.out.println("START: deleteStudent()");
        //Click the Student to edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTimeNoFormat();
        waitForPageToLoadCompletely(30);
        //Delete and Confirm
        deleteAndConfirm();
        System.out.println("END: deleteStudent()");
    }

    //Search via First Name
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

    //Search via Last Name
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

    //Search via Student ID
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

    //Filter all Inactive Students
    public static void filterInactiveStudents() {
        System.out.println("START: filterInactiveStudents()");
        clickMainMenu(btnHomeStudent);
        //Select Inactive Status
        selectDropdown(ddStudentFilter, "Inactive");
        System.out.println("END: filterInactiveStudents()");
    }

    //Filter all Closed Students
    public static void filterClosedStudents() {
        System.out.println("START: filterClosedStudents()");
        //Select Closed Status
        selectDropdown(ddStudentFilter, "Closed");
        System.out.println("END: filterClosedStudents()");
    }

    //Filter all Active Students
    public static void filterActiveStudents() {
        System.out.println("START: filterActiveStudents()");
        //Select Active Status
        selectDropdown(ddStudentFilter, "Active");
        System.out.println("END: filterActiveStudents()");
    }

    //Add New Attribute
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

    //Edit Attribute
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

    //Delete Attribute
    public static void deleteStudentAttribute() {
        System.out.println("START: deleteStudentAttribute()");
        //Click the Attribute to edit
        clickTableRowByText("Languages");
        //Delete and Confirm
        delete();
        System.out.println("END: deleteStudentAttribute()");
    }

    //Add New Note
    public static void addNewStudentNote() {
        System.out.println("START: addNewStudentNote()");
        //Click the Student to edit
        clickTableRowByText("AUTO");
        //Click the Notes button
        driver.findElement(btnStudentNotes).click();
        waitForPageToLoadCompletely(30);
        //Click the Add New Notes button
        driver.findElement(btnStudentAddNewNotes).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Title
        driver.findElement(txtStudentNotesTitle).sendKeys("AUTO Notes Title " + currentDateAndTime);
        //Input Comments
        driver.findElement(txtStudentNotesComment).sendKeys("AUTO Notes Comment " + currentDateAndTime);
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNewStudentNote()");
    }

    //Edit Notes
    public static void editNewStudentNote() {
        System.out.println("START: editNewStudentNote()");
        //Click the Notes to edit
        clickTableRowByText("AUTO");
        //Input Title
        String currentDateAndTime = getDateAndTimeNoFormat();
        driver.findElement(txtStudentNotesTitle).clear();
        driver.findElement(txtStudentNotesTitle).sendKeys("EDIT AUTO Notes Title " + currentDateAndTime);
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editNewStudentNote()");
    }

    //Delete Notes (PENDING FOR BUSINESS DECISION)
    public static void deleteNewStudentNote() {
        System.out.println("START: deleteNewStudentNote()");
        //Click the Notes to delete
        clickTableRowByText("AUTO");
        //Delete and Confirm
        deleteAndConfirm();
        System.out.println("END: deleteNewStudentNote()");
    }
}
