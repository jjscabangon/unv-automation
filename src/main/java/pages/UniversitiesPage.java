package pages;

public class UniversitiesPage extends BasePage {
    //PENDING FOR BUSINESS CONFIRMATION
    //Add New University
    public static void addNewUniversity() {
        System.out.println("START: addNewUniversity()");
        //Click Universities main menu
        clickMainMenu(btnHomeUniversities);
        waitForPageToLoadCompletely(30);
        System.out.println("END: addNewUniversity()");
    }

    //PENDING FOR BUSINESS CONFIRMATION
    //Edit University
    public static void editUniversity() {
        System.out.println("START: editUniversity()");
        //Click Universities main menu
        clickMainMenu(btnHomeUniversities);
        waitForPageToLoadCompletely(30);
        //Click row to edit
        clickTableRowByText("Test");
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input ID
        driver.findElement(txtAddUniversityID).clear();
        driver.findElement(txtAddUniversityID).sendKeys(currentDateAndTime);
//        //Input Name
//        driver.findElement(txtAddUniversityName).clear();
//        driver.findElement(txtAddUniversityName).sendKeys("EDIT AUTO University " + currentDateAndTime);
        //Input Address 2
        driver.findElement(txtAddUniversityAddress1).clear();
        driver.findElement(txtAddUniversityAddress1).sendKeys("EDIT AUTO Address 1 " + currentDateAndTime);
        //Input Address 2
        driver.findElement(txtAddUniversityAddress2).clear();
        driver.findElement(txtAddUniversityAddress2).sendKeys("EDIT AUTO Address 2" + currentDateAndTime);
        //Input City
        driver.findElement(txtAddUniversityCity).clear();
        driver.findElement(txtAddUniversityCity).sendKeys("EDIT City");
        //Select State
        selectDropdown(ddAddUniversityState,"Colorado");
        //Input Zip
        driver.findElement(txtAddUniversityZip).clear();
        driver.findElement(txtAddUniversityZip).sendKeys("EDIT ZIP");
        //Select Country
        selectDropdown(ddAddUniversityCountry,"Jefferson");
//        [UNV-59] [Bug] [Universities] Change University - Region and Type dropdowns do not have selections
//        //Select Region
//        selectDropdown(ddAddUniversityRegion, "MISSING");
//        //Select Type
//        selectDropdown(ddAddUniversityType,"MISSING");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editUniversity()");
    }

    //PENDING FOR BUSINESS CONFIRMATION
    //Delete University
    public static void deleteUniversity() {
        System.out.println("START: deleteUniversity()");
        //Click Universities main menu
        clickMainMenu(btnHomeUniversities);
        waitForPageToLoadCompletely(30);
        System.out.println("END: deleteUniversity()");
    }

    //Search for University
    public static void searchUniversity() {
        System.out.println("START: searchUniversity()");
        //Click Universities main menu
        clickMainMenu(btnHomeUniversities);
        waitForPageToLoadCompletely(30);
        //Click Search button
        driver.findElement(btnUniversitiesSearch).click();
        waitForPageToLoadCompletely(30);
        //Search for Name
        driver.findElement(txtUniversitiesSearchName).sendKeys("TEST");
            //Click Perform Search button
            driver.findElement(btnUniversitiesSearch).click();
            waitForPageToLoadCompletely(30);
            //Click Search button
            driver.findElement(btnUniversitiesSearch).click();
            waitForPageToLoadCompletely(30);
        //Search for Country
        driver.findElement(txtUniversitiesSearchName).clear();
        selectDropdown(ddUniversitiesSearchCountry, "Jefferson");
            //Click Perform Search button
            driver.findElement(btnUniversitiesSearch).click();
            waitForPageToLoadCompletely(30);
            //Click Search button
            driver.findElement(btnUniversitiesSearch).click();
            waitForPageToLoadCompletely(30);
        //Search for Region
        selectDropdown(ddUniversitiesSearchCountry, "All");
        selectDropdown(ddUniversitiesSearchRegion,"All");
            //Click Perform Search button
            driver.findElement(btnUniversitiesSearch).click();
            waitForPageToLoadCompletely(30);
            //Click Search button
            driver.findElement(btnUniversitiesSearch).click();
            waitForPageToLoadCompletely(30);
        System.out.println("END: searchUniversity()");
    }
}
