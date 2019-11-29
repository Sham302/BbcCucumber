Feature: Login
  As a BBC user I want to utilise the login feature
  So that I can use the customisation features

  Scenario: I receive a valid error when using an incorrect password
    Given I am on the sign in page
    When I input a valid email
    And an invalid password
    Then I receive a valid error

#    Scenario: I receive a valid error when using an incorrect email
#      Given I am on the signin page
#      When I put in a valid password
#      And an invalid email
#      Then I receive a valid error


