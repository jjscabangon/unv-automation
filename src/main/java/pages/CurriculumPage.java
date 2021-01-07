package pages;

public class CurriculumPage extends BasePage{
    public static void searchCurriculum() {
        System.out.println("START: searchCurriculum()");
        clickMainMenu(btnHomeCurriculum);
        driver.findElement(btnCurriculumSearch).click();
        System.out.println("END: searchCurriculum()");
    }
}
