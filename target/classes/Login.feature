Feature: Login

  @regression
  Scenario: Login as Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User logged in successfully

