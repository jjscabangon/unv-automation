package pages;

public class CurriculumPage extends BasePage{
    //Add New Curriculum
    public static void addNewCurriculum() {
        System.out.println("START: addNewCurriculum()");

        System.out.println("END: addNewCurriculum()");
    }

    //Search for Curriculum
    public static void searchCurriculum() {
        System.out.println("START: searchCurriculum()");
        clickMainMenu(btnHomeCurriculum);
        driver.findElement(btnCurriculumSearch).click();
        System.out.println("END: searchCurriculum()");
    }
}
