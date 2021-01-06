package pages;

import framework.BaseClass;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class BasePage extends BaseClass {
    //Login Page
    public static By loginUsername = By.cssSelector("input#txtLoginID");
    public static By loginPassword = By.cssSelector("input#txtPassword");
    public static By btnLoginSignIn = By.cssSelector("input#cmdLogin");

    //Homepage
    public static By homeHeaderTable = By.xpath("//*[contains(text(),'Logged in as:')]");
    public static By homeAnnouncementHeader = By.cssSelector("div.NewsHeaderText");
        //View Announcement
        public static By homeAnnouncementTitle = By.cssSelector("a[id*='ctlUCNewsItem_lblTitle']");
        public static By homeAnnouncementSubtitle = By.cssSelector("span[id*='ctlUCNewsItem_lblSubtitle']");
        public static By homeAnnouncementTextMessage = By.cssSelector("textarea[id*='txtMessage']");
        public static By homeAnnouncementDate = By.cssSelector("span[id*='ctlUCNewsItem_lblPosted']");
        public static By homeAnnouncementStatus = By.cssSelector("span[id*='ctlUCNewsItem_lblStatus']");
        public static By btnHomeAnnouncementEdit = By.cssSelector("span[id*='spnEditSave']");
        public static By btnHomeAnnouncementDelete = By.cssSelector("a[id*='lnkDelete']");
        public static By btnHomeAnnouncementNew= By.cssSelector("span.fas.fa-edit");
        //Insert New Announcement

    public static By btnHomeStudent = By.cssSelector("input[id*='cmdBrowseUsers']");
    public static By btnHomeApproveStudents = By.cssSelector("input[id*='cmdApproveUsers']");
    public static By btnHomeAgencies = By.cssSelector("input[id*='cmdBrowseEmployers']");
    public static By btnHomeUniversities = By.cssSelector("input[id*='cmdBrowseAcademies']");
    public static By btnHomeUniversityClasses = By.cssSelector("input[id*='cmdBrowseGroups']");
    public static By btnHomeCurriculum = By.cssSelector("input[id*='cmdBrowseCurriculum']");
    public static By btnHomeItemHeadings = By.cssSelector("input[id*='cmdBrowseItemHeadings']");
    public static By btnHomeMedia = By.cssSelector("input[id*='cmdBrowseMedia']");
    public static By btnHomeTests = By.cssSelector("input[id*='cmdBrowseTests']");
    public static By btnHomeTestSessions = By.cssSelector("input[id*='cmdBrowseTestSessions']");
    public static By btnHomeReports = By.cssSelector("input[id*='cmdBrowseReports']");
    public static By btnHomeAdministrationMenu = By.cssSelector("input[id*='cmdBrowseAdminMenu']");
    public static By btnHomeTakeTest = By.cssSelector("input[id*='cmdBrowseGroupSessions']");
    public static By btnHomeDashboard = By.cssSelector("input[id*='cmdDashboard']");
    public static By btnHomeLogout = By.cssSelector("input[id*='cmdLogout']");

    //Wait Functions
    public static void waitForPageToLoadCompletely(int seconds){
        try {
            ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
                @NullableDecl
                @Override
                public Boolean apply(@NullableDecl WebDriver webDriver) {
                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                }
            };
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(pageLoadCondition);
        } catch (Exception errorTimeout){
            System.out.println("ERROR: Page did not load completely after " + seconds + "seconds of wait");
        }
    }
}
