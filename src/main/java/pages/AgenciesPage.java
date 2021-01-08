package pages;

public class AgenciesPage extends BasePage {
    public static void addNewAgency() {
        System.out.println("START: addNewAgency()");
        //Click the Agency menu
        clickMainMenu(btnHomeAgencies);
        //Click the Add New Agency button
        driver.findElement(btnAgencyAddNewAgency).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTime();
        //Input Name
        driver.findElement(btnAgencyName).sendKeys("AUTO Agency Name " + currentDateAndTime);
        //Input Address1
        driver.findElement(btnAgencyAddress1).sendKeys("AUTO Agency Address 1");
        //Input Address2
        driver.findElement(btnAgencyAddress2).sendKeys("AUTO Agency Address 2");
        //Input City
        driver.findElement(btnAgencyCity).sendKeys("AUTO City");
        //Select State
        selectDropdown(btnAgencyState, "Kansas");
        //Input Zip
        driver.findElement(btnAgencyZip).sendKeys("96001");
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNewAgency()");
    }


}
