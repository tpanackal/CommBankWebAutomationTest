$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CovidChallengeTest.feature");
formatter.feature({
  "line": 1,
  "name": "Complete Covid Challenge for an user",
  "description": "",
  "id": "complete-covid-challenge-for-an-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a user and verify that the user is successfully added to the Leader board and after completing a Covid Challenge",
  "description": "",
  "id": "complete-covid-challenge-for-an-user;create-a-user-and-verify-that-the-user-is-successfully-added-to-the-leader-board-and-after-completing-a-covid-challenge",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have navigated to the Covid Game Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a user to join the CURE team",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I successfully complete one of the Covid Challenges",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see the new user added to the leaderboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iHaveNavigatedToTheCovidGameWebsite()"
});
formatter.result({
  "duration": 3973552837,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iCreateAUserToJoinTheCURETeam()"
});
formatter.result({
  "duration": 8430747929,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iSuccessfullyCompleteOneOfTheCovidChallenges()"
});
formatter.result({
  "duration": 13845506507,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iShouldBeAbleToSeeTheNewUserAddedToTheLeaderboard()"
});
formatter.result({
  "duration": 1087372745,
  "status": "passed"
});
});