Feature: Complete Covid Challenge for an user

  Scenario: Create a user and verify that the user is successfully added to the Leader board and after completing a Covid Challenge
    Given I have navigated to the Covid Game Website
    When I create a user to join the CURE team
    And I successfully complete one of the Covid Challenges
    Then I should be able to see the new user added to the leaderboard
