Feature: I want to test the login page

  Scenario: I want to login with correct credentials
    Given I go to the login page
    When I check that the page is correct
    And I login as "tomsmith" with password "SuperSecretPassword!"
    Then I should see the message You logged into a secure area
