package pages;

public class AdministratorsPage extends BasePage{
    //Add a new University Admin
    public static void addNewUniversityAdmin() {
        System.out.println("START: addNewUniversityAdmin()");
        //Click Administrators button
        driver.findElement(btnUniversityAdministrator).click();

        System.out.println("END: addNewUniversityAdmin()");
    }
}
