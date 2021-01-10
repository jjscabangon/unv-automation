Feature: Curriculum

  @regression
  Scenario: End User adds a new Curriculum
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End user adds a new Curriculum

  @regression
  Scenario: End User searches for a Curriculum
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End user searches for Curriculum