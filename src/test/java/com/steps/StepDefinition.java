package com.steps;

import com.driverFactory.DriverManager;
import com.pages.*;
import com.runner.TestNGRunCucumberTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.utils.UtilConstants.getBaseUrl;


public class StepDefinition extends TestNGRunCucumberTest {

    @Given("^I have navigated to the Covid Game Website$")
    public void iHaveNavigatedToTheCovidGameWebsite() {
        DriverManager.getDriver().get(getBaseUrl());
    }


    @When("I create a user to join the CURE team")
    public void iCreateAUserToJoinTheCURETeam() {
        page.getInstance(HomePage.class).createNewUserAndStartJourney();
        page.getInstance(ChallengesPage.class).userSelectsNewsChallengeAndClicksOnStartChallenge();
    }


    @And("I successfully complete one of the Covid Challenges")
    public void iSuccessfullyCompleteOneOfTheCovidChallenges() throws InterruptedException {
        page.getInstance(ChallengePage.class).userSelectsAllTheCorrectAnswersAndClickOnSubmitButton();
    }


    @Then("I should be able to see the new user added to the leaderboard")
    public void iShouldBeAbleToSeeTheNewUserAddedToTheLeaderboard() {
        page.getInstance(LeaderBoardPage.class).userValidatesThatTheNewUserCreatedHasBeenAddedToTheLeaderBoard();
    }

}
