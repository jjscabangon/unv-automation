Feature: Homepage

  @regression
  Scenario: End User views Announcement
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully
    When End User views Announcement
    And Clicks the Announcement Title