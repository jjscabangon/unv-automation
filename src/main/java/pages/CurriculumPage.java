package pages;

public class CurriculumPage extends BasePage{
    //Add New Curriculum
    public static void addNewCurriculum() {
        System.out.println("START: addNewCurriculum()");
        //Click Curriculum menu
        clickMainMenu(btnHomeCurriculum);
        //Click Add New Curriculum button
        driver.findElement(btnCurriculumAddNewCurriculum).click();
        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input ID
        driver.findElement(txtAddCurriculumID).sendKeys(currentDateAndTime);
        //Input Description
        driver.findElement(txtAddCurriculumDescription).sendKeys("AUTO Description " + currentDateAndTime);
        //Input Hours
            driver.findElement(txtAddCurriculumHours).sendKeys("1");
            driver.findElement(spnAddCurriculumHoursUp).click();
            driver.findElement(spnAddCurriculumHoursUp).click();
            driver.findElement(spnAddCurriculumHoursDown).click();
        //Input Cutoff Percentage
            driver.findElement(txtAddCurriculumCutoff).sendKeys("50%");
            driver.findElement(spnAddCurriculumCutoffUp).click();
            driver.findElement(spnAddCurriculumCutoffUp).click();
            driver.findElement(spnAddCurriculumCutoffDown).click();
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: addNewCurriculum()");
    }

    //Edit Curriculum
    public static void editCurriculum() {
        System.out.println("START: editCurriculum()");
        //Click Curriculum to Edit

        String currentDateAndTime = getDateAndTimeNoFormat();
        //Input ID
        driver.findElement(txtAddCurriculumID).sendKeys(currentDateAndTime);
        //Input Description
        driver.findElement(txtAddCurriculumDescription).sendKeys("AUTO Description " + currentDateAndTime);
        //Input Hours
            driver.findElement(txtAddCurriculumHours).sendKeys("1");
            driver.findElement(spnAddCurriculumHoursUp).click();
            driver.findElement(spnAddCurriculumHoursUp).click();
            driver.findElement(spnAddCurriculumHoursDown).click();
        //Input Cutoff Percentage
            driver.findElement(txtAddCurriculumCutoff).sendKeys("50%");
            driver.findElement(spnAddCurriculumCutoffUp).click();
            driver.findElement(spnAddCurriculumCutoffUp).click();
            driver.findElement(spnAddCurriculumCutoffDown).click();
        //Close Form and Save
        closeFormAndSave();
        System.out.println("END: editCurriculum()");
    }

    //Search for Curriculum
    public static void searchCurriculum() {
        System.out.println("START: searchCurriculum()");
        clickMainMenu(btnHomeCurriculum);
        driver.findElement(btnCurriculumSearch).click();
        System.out.println("END: searchCurriculum()");
    }
}
