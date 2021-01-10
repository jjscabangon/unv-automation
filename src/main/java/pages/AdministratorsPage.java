package pages;

public class AdministratorsPage extends BasePage{
    //Add University Admin
    public static void addNewUniversityAdmin() {
        System.out.println("START: addNewUniversityAdmin()");
        //Click Administrators button
        driver.findElement(btnUniversityAdministrator).click();
        System.out.println("END: addNewUniversityAdmin()");
    }

    //Search for University Admin
    public static void searchUniversityAdmin() {
        System.out.println("START: searchUniversityAdmin()");
        //Click Universities main menu
        clickMainMenu(btnHomeUniversities);
        //Click row to edit
        clickTableRowByText("Test");
        //Click Administrators button
        driver.findElement(btnUniversityAdministrator).click();
        //Search for First Name
            //Click Search button
            driver.findElement(btnUniversityAdminSearch).click();
            driver.findElement(txtUniversityAdminSearchFirstname).clear();
            driver.findElement(txtUniversityAdminSearchFirstname).sendKeys("Academy");
            //Click Search button
            driver.findElement(btnUniversityAdminSearch).click();
        //Search for Last Name
            //Click Search button
            driver.findElement(btnUniversityAdminSearch).click();
            driver.findElement(txtUniversityAdminSearchFirstname).clear();
            driver.findElement(txtUniversityAdminSearchLastname).clear();
            driver.findElement(txtUniversityAdminSearchLastname).sendKeys("Super");
            //Click Search button
            driver.findElement(btnUniversityAdminSearch).click();
        //Search for Type
            //Click Search button
            driver.findElement(btnUniversityAdminSearch).click();
            driver.findElement(txtUniversityAdminSearchFirstname).clear();
            driver.findElement(txtUniversityAdminSearchLastname).clear();
            selectDropdown(ddUniversityAdminSearchType,"Author");
            //Click Search button
            driver.findElement(btnUniversityAdminSearch).click();
        System.out.println("END: searchUniversityAdmin()");
    }
}
