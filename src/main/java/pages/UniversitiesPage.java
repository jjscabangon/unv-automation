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
