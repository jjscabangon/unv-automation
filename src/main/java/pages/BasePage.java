package pages;

import framework.BaseClass;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class BasePage extends BaseClass {
    //Global
        //Close Form and Save
        public static By btnCloseForm = By.cssSelector("input#cmdClose");
        public static By btnSaveFormYes = By.cssSelector("button#confirmationRevertYes");
        //Delete and Confirm
        public static By btnDelete = By.cssSelector("input#cmdDelete");
        public static By txtConfirmDelete = By.cssSelector("input#confirmationRevertYesText");
        public static By btnConfirmDelete = By.cssSelector("button#confirmationRevertYes");
        //Click Table Row
        public static By tblTable = By.cssSelector("table.ListTable");

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
        //Add, Edit, or Delete Student
        public static By btnStudentAddNew = By.cssSelector("input#cmdInsert");
        public static By txtStudentFirstName = By.cssSelector("input#txtFName");
        public static By txtStudentLastName = By.cssSelector("input#txtLName");
        //Search Students
        public static By btnStudentSearch = By.cssSelector("input#cmdSearch");
        public static By btnStudentSearchIntercept = By.cssSelector("span.fa-search");
        public static By txtStudentSearchFirstName = By.cssSelector("input#txtFName");
        public static By txtStudentSearchLastName = By.cssSelector("input#txtLName");
        public static By txtStudentSearchID = By.cssSelector("input#txtEmployeeID");
        public static By btnStudentPerformSearch = By.cssSelector("input#cmdSearch");
        //Filter Student List
        public static By ddStudentFilter = By.cssSelector("select#ddStatus");
        //Student Attributes
        public static By btnStudentAttribute = By.cssSelector("input#cmdAttributes");
        public static By btnStudentAddNewAttribute = By.cssSelector("input#cmdInsert");
        public static By ddStudentAttribute = By.cssSelector("select#cboAttributeID");
        public static By ddStudentAttributeValue = By.cssSelector("select#cboAttributeValueID");
        public static By txtStudentAttributeEffectiveDate = By.cssSelector("input#txtEffectiveDate");
        public static By txtStudentAttributeExpirationDate = By.cssSelector("input#txtExpirationDate");

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
    public static By btnCurriculumSearch = By.cssSelector("span.fa-search");

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
