Feature: Agencies

  @regression
  Scenario: End User adds as new Agency
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency