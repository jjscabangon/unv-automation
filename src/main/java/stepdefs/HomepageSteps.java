package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import framework.BaseClass;
import org.junit.After;

import static pages.HomepagePage.*;

public class HomepageSteps extends BaseClass {
    //Always put this on each of stepdefs to clear chromedriver every test script
    @After
    public void after() {
        driver.quit();
    }

    //Note that the step text from Feature file should exactly match the annotation text
    @Given("^End User views Announcement$")
    public void viewAnnouncement() {
        isAnnouncementDisplayed();
    }

    @And("^Clicks the Announcement Title$")
    public void clickAnnouncementTitle() {
        isTextMessageDisplayed();
    }
}
