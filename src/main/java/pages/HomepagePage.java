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
}
