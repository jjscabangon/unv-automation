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

#  Blocked by UNV-122
#  @regression
  Scenario: End User search for a Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User searches for Students via First Name
    And End User searches for Students via Last Name
    And End User searches for Students via ID

  @regression
  Scenario: End User filters Student list
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    Then End User filters all Inactive Student list
    And End User filters all Closed Student list
    And End User filters all Active Student list

  @sanity
  Scenario: End User adds Student Attribute
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then End User adds a new Student Attribute

  @regression
  Scenario: End User edits Student Attribute
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    And End User adds a new Student Attribute
    Then End User edits Student Attribute

  @regression
  Scenario: End User deletes Student Attribute
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    And End User adds a new Student Attribute
    Then End User deletes Student Attribute

  @regression
  Scenario: End User adds a Note to Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then End User adds a new Note to Student

  @regression
  Scenario: End User edits a Note of Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then End User adds a new Note to Student
    Then End User edits Note of Student

#  (PENDING FOR BUSINESS DECISION)
#  @regression
  Scenario: End User deletes a Note of Student
    Given End User logs in
      | Username | Super    |
      | Password | Test1234 |
    When End User adds a new Student
    Then End User adds a new Note to Student
    Then End User deletes Note of Student

