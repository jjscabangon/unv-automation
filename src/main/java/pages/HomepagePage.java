package pages;

public class HomepagePage extends BasePage {
    public static void isAnnouncementDisplayed() {
        System.out.println("START: viewAnnouncement()");
        //Verify that all Announcement Components are displayed
            //Header
            if (driver.findElement(homeAnnouncementHeader).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + homeAnnouncementHeader.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + homeAnnouncementHeader.toString());
            }
            //Title
            if (driver.findElement(homeAnnouncementTitle).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + homeAnnouncementTitle.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + homeAnnouncementTitle.toString());
            }
            //Subtitle
            if (driver.findElement(homeAnnouncementSubtitle).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + homeAnnouncementSubtitle.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + homeAnnouncementSubtitle.toString());
            }
            //Date
            if (driver.findElement(homeAnnouncementDate).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + homeAnnouncementDate.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + homeAnnouncementDate.toString());
            }
            //Status
            if (driver.findElement(homeAnnouncementStatus).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + homeAnnouncementStatus.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + homeAnnouncementStatus.toString());
            }
            //Edit Button
            if (driver.findElement(btnHomeAnnouncementEdit).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + btnHomeAnnouncementEdit.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + btnHomeAnnouncementEdit.toString());
            }
            //Delete Button
            if (driver.findElement(btnHomeAnnouncementDelete).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + btnHomeAnnouncementDelete.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + btnHomeAnnouncementDelete.toString());
            }
            //Insert New Button
            if (driver.findElement(btnHomeAnnouncementNew).isDisplayed()) {
                System.out.println("ASSERT: PASSED | " + btnHomeAnnouncementNew.toString());
            } else {
                System.out.println("ASSERT: FAILED | " + btnHomeAnnouncementNew.toString());
            }
        System.out.println("END: viewAnnouncement()");
    }

    public static void isTextMessageDisplayed() {
        System.out.println("START: isTextMessageDisplayed()");
        waitForPageToLoadCompletely(30);
        driver.findElement(homeAnnouncementTitle).click();
        if (driver.findElement(homeAnnouncementTextMessage).isDisplayed()) {
            System.out.println("ASSERT: PASSED | " + homeAnnouncementTextMessage.toString()
            + "\n " + driver.findElement(homeAnnouncementTextMessage).getText());
        } else {
            System.out.println("ASSERT: FAILED | " + homeAnnouncementTextMessage.toString());
        }
        System.out.println("END: isTextMessageDisplayed()");
    }

    public static void insertNewAnnouncement() {
        System.out.println("START: insertNewAnnouncement()");
        driver.findElement(btnHomeAnnouncementNew).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTime();
        //Input Announcement Data
            //Title
            driver.findElement(txtAnnouncementTitle).clear();
            driver.findElement(txtAnnouncementTitle).sendKeys("Title Regression Test " + currentDateAndTime);
            //Subtitle
            driver.findElement(txtAnnouncementSubTitle).clear();
            driver.findElement(txtAnnouncementSubTitle).sendKeys("Subtitle Regression Test " + currentDateAndTime);
            //Message
            driver.findElement(txtAnnouncementMessage).clear();
            driver.findElement(txtAnnouncementMessage).sendKeys("Message Regression Test " + currentDateAndTime);
            //Click the Save button
            driver.findElement(btnAnnouncementSave).click();
        System.out.println("ASSERT: PASSED | insertNewAnnouncement()");
        System.out.println("END: insertNewAnnouncement()");
    }

    public static void editAnnouncement() {
        System.out.println("START: editAnnouncement()");
        driver.findElement(btnHomeAnnouncementEdit).click();
        waitForPageToLoadCompletely(30);
        String currentDateAndTime = getDateAndTime();
        //Input Announcement Data
            //Title
            driver.findElement(txtAnnouncementTitle).clear();
            driver.findElement(txtAnnouncementTitle).sendKeys("EDIT Title Regression Test " + currentDateAndTime);
            //Subtitle
            driver.findElement(txtAnnouncementSubTitle).clear();
            driver.findElement(txtAnnouncementSubTitle).sendKeys("EDIT Subtitle Regression Test " + currentDateAndTime);
            //Message
            driver.findElement(txtAnnouncementMessage).clear();
            driver.findElement(txtAnnouncementMessage).sendKeys("EDIT Message Regression Test " + currentDateAndTime);
            //Click the Save button
            driver.findElement(btnAnnouncementSave).click();
        System.out.println("ASSERT: PASSED | editAnnouncement()");
        System.out.println("END: editAnnouncement()");
    }

    public static void deleteAnnouncement() {
        System.out.println("START: deleteAnnouncement()");
        driver.findElement(btnHomeAnnouncementDelete).click();
        System.out.println("ASSERT: PASSED | deleteAnnouncement()");
        System.out.println("END: deleteAnnouncement()");
    }
}
