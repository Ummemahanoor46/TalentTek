Feature: Login Feature
  @regression @login @pass
  Scenario: User should be able to login with valid email and valid password
    Given user in TalentTEK Homepage
    And user enter valid email address
    And user enter valid password
    When user clicks on Log In button
    Then the user should be able to login successfully
  @regression @login @pass
  Scenario: User should not be able to login with invalid email and invalid password
    Given user in TalentTEK Homepage
    And user enter invalid email address
    And user enter invalid password
    When user clicks on Log In button
    Then user should see Invalid email address error message.
  @regression @login @pass
  Scenario: User should not be able to login with valid email and invalid password
    Given user in TalentTEK Homepage
    And user enter valid email address
    And user enter invalid password
    When user clicks on Log In button
    Then user should find Incorrect email or password error message.
  @regression @login @pass
  Scenario: User should not be able to login with invalid email and valid password
    Given user in TalentTEK Homepage
    And user enter invalid email address
    And user enter valid password
    When user clicks on Log In button
    Then user should see Invalid email address error message.

  @regression  @login @error
  Scenario: User should not be able to login with empty fields
    Given user in TalentTEK Homepage
    And user submit email address and password field empty
    When user clicks on Log In button
    Then User should see please fill out field message.

  @regression  @login
  Scenario:User should be able to login with Case Insensitivity email and valid password
    Given user in TalentTEK Homepage
    And User enter the email with a mix of uppercase and lowercase characters
    And user enter correct password
    When user clicks on Log In button
    Then the user should be able to login successfully

  @regression  @login
  Scenario:User should not be able to login with Case Insensitivity password and valid email address
    Given user in TalentTEK Homepage
    And user enter valid email address
    And User enter the password with a mix of uppercase and lowercase characters
    When user clicks on Log In button
    Then user should find Incorrect email or password error message.
