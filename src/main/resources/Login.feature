Feature: Login

  @regression
  Scenario: Login as Super Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully

  @regression
  Scenario: Login as Administrator
    Given End User logs in
      | Username | Admin    |
      | Password | Test1234 |
    Then End User logged in successfully

  @regression
  Scenario: Login as Student
    Given End User logs in
      | Username | Student001 |
      | Password | Test1234   |
    Then End User logged in successfully
