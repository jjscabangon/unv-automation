package stepdefs;

import cucumber.api.java.en.*;
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

    @Then("^View the Announcement Text Message$")
    public void viewAnnouncementTextMessage() {
        isTextMessageDisplayed();
    }

    @When("^Successfully inserts a new Announcement$")
    public void insertNewAnnouncement() {
        softAssert.assertTrue(isNewAnnouncementInserted(),"ASSERT: FAILED | New Announcemnet was NOT inserted.");
    }
}
