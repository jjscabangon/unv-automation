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
    public void stepViewAnnouncement() {
        isAnnouncementDisplayed();
    }

    @Then("^View the Announcement Text Message$")
    public void stepViewAnnouncementTextMessage() {
        isTextMessageDisplayed();
    }

    @When("^Successfully inserts a new Announcement$")
    public void stepInsertNewAnnouncement() {
        insertNewAnnouncement();
    }

    @When("^Successfully edits an Announcement$")
    public void stepEditAnnouncement() {
        editAnnouncement();
    }
}
