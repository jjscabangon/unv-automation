Feature: Universities

#  PENDING FOR BUSINESS CONFIRMATION
#  @regression
  Scenario: End User adds a new University
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User adds a new University

#  [UNV-59] [Bug] [Universities] Change University - Region and Type dropdowns do not have selections
#  @regression
  Scenario: End User edits a University
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User edits a University

#  PENDING FOR BUSINESS CONFIRMATION
#  @regression
  Scenario: End User deletes a University
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User deletes a University

  @regression
  Scenario: End User searches for University
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User searches for University