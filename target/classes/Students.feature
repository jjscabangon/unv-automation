Feature: Students

  @sanity
  Scenario: End User adds a new Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then New Student is added successfully

  @regression
  Scenario: End User edits a Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then End User edits a Student

  @regression
  Scenario: End User deletes a Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then End User deletes a Student

  @regression
  Scenario: End User search for a Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User searches for Students via First Name
    And End User searches for Students via Last Name
    And End User searches for Students via ID

  @regression
  Scenario: End User filters Student list
    Given
    When
    Then
