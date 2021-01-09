Feature: Agencies

  @regression
  Scenario: End User adds as new Agency
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User adds a new Agency

  @regression
  Scenario: End User edits an Agency
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    Then End User edits an Agency

  @regression
  Scenario: End User deletes an Agency
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    Then End User deletes an Agency

  @regression
  Scenario: End User adds a new Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    Then End User adds a new Agency Administrator

  @regression
  Scenario: End User edits an Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    And End User adds a new Agency Administrator
    Then End User edits an Agency Administrator

  @regression
  Scenario: End User deletes an Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    And End User adds a new Agency Administrator
    Then End User deletes an Agency Administrator

  @regression
  Scenario: End User adds Note to Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    And End User adds a new Agency Administrator
    Then End User adds Note to Agency Administrator

  @regression
  Scenario: End User edits Note of Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    And End User adds a new Agency Administrator
    And End User adds Note to Agency Administrator
    Then End User edits Note of Agency Administrator

#  PENDING FOR BUSINESS CONFIRMATION
#  @regression
  Scenario: End User deletes Note of Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    And End User adds a new Agency Administrator
    And End User adds Note to Agency Administrator
    Then End User deletes Note of Agency Administrator

#  Scripting done but blocked by UNV-125
  @regression
  Scenario: End User searches for Agency Administrator
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Agency
    And End User adds a new Agency Administrator
    Then End User searches for Agency Administrator

