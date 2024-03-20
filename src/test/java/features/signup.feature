Feature: Signup Feature

  Background:
    Given user in TalentTEK Homepage
    And user click on Create New Account button
  @regression @signup
  Scenario: User should be able to sign up with valid credentials
    And user enter valid first name
    And user enter valid last name
    And user enter new valid email address
    And user enter new valid password
    And user enter valid confirm password
    And user enter their month as "May" under dob
    And user enter their day as "20" under dob
    And user enter their year as "1995" under dob
    And user select gender
    And user click the term and condition policy
    When user click on Create my Account button
    Then user should get unique student id with success message
    Then student click on "OK" button from popup modal
    And student enter newly created Student ID
    And student enter newly created password
    When student clicks on Login button
    Then the user should be able to login successfully

  @regression @signup
  Scenario: User should not be able to sign up with alphanumeric credentials in first name field
    And user enter alphanumeric first name
    And user enter valid last name
    And user enter new valid email address
    And user enter new valid password
    And user enter valid confirm password
    And user enter their month as "May" under dob
    And user enter their day as "20" under dob
    And user enter their year as "1995" under dob
    And user select gender
    And user click the term and condition policy
    When user click on Create my Account button
    Then the user should receive First name and last name cannot contain numeric or special characters error.

  @regression @signup
  Scenario: User should not be able to sign up with alphanumeric credentials in last name field
    And user enter valid first name
    And user enter alphanumeric last name
    And user enter new valid email address
    And user enter new valid password
    And user enter valid confirm password
    And user enter their month as "May" under dob
    And user enter their day as "20" under dob
    And user enter their year as "1995" under dob
    And user select gender
    And user click the term and condition policy
    When user click on Create my Account button
    Then the user should receive First name and last name cannot contain numeric or special characters error.

  @regression @signup
  Scenario: User should not be able to sign up with alphanumeric credentials in last name and first name field
    And user enter alphanumeric first name
    And user enter alphanumeric last name
    And user enter new valid email address
    And user enter new valid password
    And user enter valid confirm password
    And user enter their month as "May" under dob
    And user enter their day as "20" under dob
    And user enter their year as "1995" under dob
    And user select gender
    And user click the term and condition policy
    When user click on Create my Account button
    Then the user should receive First name and last name cannot contain numeric or special characters error.