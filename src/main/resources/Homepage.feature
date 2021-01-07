Feature: Homepage

  @regression
  Scenario: End User views Announcement
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully
    When End User views Announcement
    Then View the Announcement Text Message

  @sanity
  Scenario: End User inserts new Announcement
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully
    And Successfully inserts a new Announcement
    When End User views Announcement
    Then View the Announcement Text Message

  @regression
  Scenario: End User edits Announcement
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully
    And Successfully inserts a new Announcement
    When End User views Announcement
    Then View the Announcement Text Message
    When Successfully edits an Announcement
    Then End User views Announcement
    Then View the Announcement Text Message

  @regression
  Scenario: End User deletes Announcement
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully
    And Successfully inserts a new Announcement
    When End User views Announcement
    Then View the Announcement Text Message
    And Successfully deletes an Announcement


