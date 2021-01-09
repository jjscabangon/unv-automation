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
}
