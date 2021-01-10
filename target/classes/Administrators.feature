Feature: Administrators

#  [UNV-125] [Bug] [Change Agency] Browse Administrator - Problem ID: 26 error page was displayed
#  @regression
  Scenario: End User adds a new University Admin
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    And End User edits a University
    Then End User adds a new University Admin

  @regression
  Scenario: End User searches for University Admin
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User searches for University Admin