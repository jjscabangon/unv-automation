package pages;

public class AgenciesPage extends BasePage {
    //Add New Agency
    public static void addNewAgency() {
        System.out.println("START: addNewAgency()");
        //Click the Agency menu
        clickMainMenu(btnHomeAgencies);
        //Click the Add New Agency button
        driver.findElement(btnAgencyAddNewAgency).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Name
        driver.findElement(txtAgencyName).sendKeys("AUTO Agency Name " + currentDateAndTime);
        //Input Address1
        driver.findElement(txtAgencyAddress1).sendKeys("AUTO Agency Address 1");
        //Input Address2
        driver.findElement(txtAgencyAddress2).sendKeys("AUTO Agency Address 2");
        //Input City
        driver.findElement(txtAgencyCity).sendKeys("AUTO City");
        //Select State
        selectDropdown(dddAgencyState, "Kansas");
        //Input Zip
        driver.findElement(txtAgencyZip).sendKeys("96001");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNewAgency()");
    }

    //Edit Agency
    public static void editAgency() {
        System.out.println("START: editAgency()");
        //Click row to edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Name
        driver.findElement(txtAgencyName).clear();
        driver.findElement(txtAgencyName).sendKeys("EDIT AUTO Agency Name " + currentDateAndTime);
        //Input Address1
        driver.findElement(txtAgencyAddress1).clear();
        driver.findElement(txtAgencyAddress1).sendKeys("EDIT AUTO Agency Address 1");
        //Input Address2
        driver.findElement(txtAgencyAddress2).clear();
        driver.findElement(txtAgencyAddress2).sendKeys("EDIT AUTO Agency Address 2");
        //Input City
        driver.findElement(txtAgencyCity).clear();
        driver.findElement(txtAgencyCity).sendKeys("EDIT AUTO City");
        //Select State
        selectDropdown(dddAgencyState, "Delaware");
        //Input Zip
        driver.findElement(txtAgencyZip).clear();
        driver.findElement(txtAgencyZip).sendKeys("10020");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editAgency()");
    }

    //Delete Agency
    public static void deleteAgency() {
        System.out.println("START: deleteAgency()");
        //Click row to edit
        clickTableRowByText("AUTO");
        //Delete
        delete();
        System.out.println("END: deleteAgency()");
    }

    //Search Agency
    public static void searchAgency() {
        System.out.println("START: searchAgency()");
        //Click Search button
        driver.findElement(btnAgencySearch).click();
        waitForPageToLoadCompletely(30);
        //Input Name
        driver.findElement(txtAgencySearchName).sendKeys("AUTO");
        //Click Perform Search button
        driver.findElement(btnAgencySearch).click();
        System.out.println("END: searchAgency()");
    }

    //Add Agency Administrator
    public static void addNewAgencyAdmin() {
        System.out.println("START: addNewAgencyAdmin()");
        //Click row to Add Administrator
        clickTableRowByText("AUTO");
        //Click the Administrator button
        driver.findElement(btnAgencyAdmin).click();
        waitForPageToLoadCompletely(30);
        //Click the Add New Administrator button
        driver.findElement(btnAgencyAdminAddNewAdmin).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input First Name
        driver.findElement(txtAgencyAdminFirstname).sendKeys("AUTO Fname " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtAgencyAdminLastname).sendKeys("AUTO Lname " + currentDateAndTime);
        //Input Login ID
        driver.findElement(txtAgencyAdminLoginID).sendKeys("AAdmin" + currentDateAndTime);
        //Input Password
        driver.findElement(txtAgencyAdminLoginPassword).sendKeys("Test1234");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNewAgencyAdmin()");
    }

    //Edit Agency Administrator
    public static void editAgencyAdmin() {
        System.out.println("START: editAgencyAdmin()");
        //Click row to Add Administrator
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input First Name
        driver.findElement(txtAgencyAdminFirstname).clear();
        driver.findElement(txtAgencyAdminFirstname).sendKeys("EDIT AUTO Fname " + currentDateAndTime);
        //Input Last Name
        driver.findElement(txtAgencyAdminLastname).clear();
        driver.findElement(txtAgencyAdminLastname).sendKeys("EDIT AUTO Lname " + currentDateAndTime);
        //Input Login ID
        driver.findElement(txtAgencyAdminLoginID).clear();
        driver.findElement(txtAgencyAdminLoginID).sendKeys("AAdmin" + currentDateAndTime);
        //Input Password
        driver.findElement(txtAgencyAdminLoginPassword).sendKeys("Test1234");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editAgencyAdmin()");
    }

    //Delete Agency Administrator
    public static void deleteAgencyAdmin() {
        System.out.println("START: deleteAgencyAdmin()");
        //Click row to Add Administrator
        clickTableRowByText("AUTO");
        waitForPageToLoadCompletely(30);
        //Delete
        delete();
        System.out.println("END: deleteAgencyAdmin()");
    }

    //Add Note to Agency Administrator
    public static void addNoteAgencyAdmin() {
        System.out.println("START: addNoteAgencyAdmin()");
        //Click row to Edit
        clickTableRowByText("AUTO");
        //Click the Notes button
        driver.findElement(btnAgencyAdminNotes).click();
        waitForPageToLoadCompletely(30);
        //Click the Add New Notes button
        driver.findElement(btnAgencyAdminAddNewNotes).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Title
        driver.findElement(txtAgencyAdminNotesTitle).sendKeys("AUTO Title " + currentDateAndTime);
        //Input Comment
        driver.findElement(txtAgencyAdminNotesComment).sendKeys("AUTO Comment " + currentDateAndTime);
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNoteAgencyAdmin()");
    }

    //Edit Note of Agency Administrator
    public static void editNoteAgencyAdmin() {
        System.out.println("START: editNoteAgencyAdmin()");
        //Click row to Edit
        clickTableRowByText("AUTO");
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input Title
        driver.findElement(txtAgencyAdminNotesTitle).clear();
        driver.findElement(txtAgencyAdminNotesTitle).sendKeys("EDIT AUTO Title " + currentDateAndTime);
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editNoteAgencyAdmin()");
    }

    //PENDING FOR BUSINESS CONFIRMATION
    //Delete Note of Agency Administrator
    public static void deleteNoteAgencyAdmin() {
        System.out.println("START: deleteNoteAgencyAdmin()");
        //Click row to Edit
        clickTableRowByText("AUTO");
        //Delete
        delete();
        System.out.println("END: deleteNoteAgencyAdmin()");
    }

    //Search for Agency Administrator
    public static void searchAgencyAdmin() {
        System.out.println("START: searchAgencyAdmin()");
        //Click Search button
        driver.findElement(btnAgencyAdminSearch).click();
        waitForPageToLoadCompletely(30);
        //Input Firstname
        driver.findElement(txtAgencyAdminSearchFirstname).sendKeys("AUTO");
        //Click Perform Search button
        driver.findElement(btnAgencyAdminSearch).click();
        waitForPageToLoadCompletely(30);
        //Click Search button
        driver.findElement(btnAgencyAdminSearch).click();
        waitForPageToLoadCompletely(30);
        //Input Lastname
        driver.findElement(txtAgencyAdminSearchLastname).sendKeys("AUTO");
        //Click Perform Search button
        driver.findElement(btnAgencyAdminSearch).click();
        waitForPageToLoadCompletely(30);
        System.out.println("END: searchAgencyAdmin()");
    }
}
