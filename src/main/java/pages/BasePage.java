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

    //Announcement
    public static By homeAnnouncementHeader = By.cssSelector("div.NewsHeaderText");
        //View Announcement
        public static By homeAnnouncementTitle = By.cssSelector("a[id*='ctlUCNewsItem_lblTitle']");
        public static By homeAnnouncementSubtitle = By.cssSelector("span[id*='ctlUCNewsItem_lblSubtitle']");
        public static By homeAnnouncementTextMessage = By.cssSelector("textarea[id*='txtMessage']");
        public static By homeAnnouncementDate = By.cssSelector("span[id*='ctlUCNewsItem_lblPosted']");
        public static By homeAnnouncementStatus = By.cssSelector("span[id*='ctlUCNewsItem_lblStatus']");
        public static By btnHomeAnnouncementEdit = By.cssSelector("span.fa-pencil-alt");
        public static By btnHomeAnnouncementDelete = By.cssSelector("a[id*='lnkDelete']");
        public static By btnHomeAnnouncementNew= By.cssSelector("span.fas.fa-edit");
        //Insert OR Edit New Announcement
        public static By txtAnnouncementTitle = By.cssSelector("input[id*='txtTitle']");
        public static By txtAnnouncementSubTitle = By.cssSelector("input[id*='txtSubtitle']");
        public static By txtAnnouncementMessage = By.cssSelector("textarea[id*='txtMessage']");
        public static By txtAnnouncementPublishDate = By.cssSelector("input[id*='PublishDate_dateInput']");
        public static By txtAnnouncementExpireDate = By.cssSelector("input[id*='ExpireDate_dateInput']");
        public static By btnAnnouncementSave = By.cssSelector("span[id*='spnEditSave']");
        public static By btnAnnouncementDelete = By.cssSelector("span.fa-trash");

    //Student
    public static By btnHomeStudent = By.cssSelector("input[id*='cmdBrowseUsers']");
    public static By btnStudentAddNew = By.cssSelector("input#cmdInsert");
    public static By txtStudentFirstName = By.cssSelector("input#txtFName");
    public static By txtStudentLastName = By.cssSelector("input#txtLName");
    public static By btnStudentCloseForm = By.cssSelector("input#cmdClose");
    public static By btnStudentSaveFormYes = By.cssSelector("button#confirmationRevertYes");

    //Approve Student
    public static By btnHomeApproveStudents = By.cssSelector("input[id*='cmdApproveUsers']");

    //Agencies
    public static By btnHomeAgencies = By.cssSelector("input[id*='cmdBrowseEmployers']");

    //Universities
    public static By btnHomeUniversities = By.cssSelector("input[id*='cmdBrowseAcademies']");

    //University Classes
    public static By btnHomeUniversityClasses = By.cssSelector("input[id*='cmdBrowseGroups']");

    //Curriculum
    public static By btnHomeCurriculum = By.cssSelector("input[id*='cmdBrowseCurriculum']");

    //Item Headings
    public static By btnHomeItemHeadings = By.cssSelector("input[id*='cmdBrowseItemHeadings']");

    //Media
    public static By btnHomeMedia = By.cssSelector("input[id*='cmdBrowseMedia']");

    //Tests
    public static By btnHomeTests = By.cssSelector("input[id*='cmdBrowseTests']");
    public static By btnHomeTestSessions = By.cssSelector("input[id*='cmdBrowseTestSessions']");
    public static By btnHomeReports = By.cssSelector("input[id*='cmdBrowseReports']");
    public static By btnHomeAdministrationMenu = By.cssSelector("input[id*='cmdBrowseAdminMenu']");
    public static By btnHomeTakeTest = By.cssSelector("input[id*='cmdBrowseGroupSessions']");
    public static By btnHomeDashboard = By.cssSelector("input[id*='cmdDashboard']");
    public static By btnHomeLogout = By.cssSelector("input[id*='cmdLogout']");
}
