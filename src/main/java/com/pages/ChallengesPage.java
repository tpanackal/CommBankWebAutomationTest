package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallengesPage extends BasePage{

    private final By newsChallengeButton = By.id("news");
    private final By startChallengeButton = By.id("start");

    public ChallengesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNewsChallengeButton() {
        return getElement(newsChallengeButton);
    }

    public WebElement getStartChallengeButton() {
        return getElement(startChallengeButton);
    }


    public ChallengePage userSelectsNewsChallengeAndClicksOnStartChallenge(){
        getNewsChallengeButton().click();
        getStartChallengeButton().click();
        return getInstance(ChallengePage.class);
    }


}
