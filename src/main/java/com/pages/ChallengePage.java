package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallengePage extends BasePage{

    private final By correctAnswerButton = By.id("answer_1");
    private final By continueButton = By.id("continue");

    public ChallengePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCorrectAnswerButton() throws InterruptedException {
        Thread.sleep(2000);
        return getElement(correctAnswerButton);
    }

    public WebElement getContinueButton() throws InterruptedException {
        Thread.sleep(2000);
        return getElement(continueButton);
    }


    public LeaderBoardPage userSelectsAllTheCorrectAnswersAndClickOnSubmitButton() throws InterruptedException {
        getCorrectAnswerButton().click();
        getContinueButton().click();
        getCorrectAnswerButton().click();
        getContinueButton().click();
        getCorrectAnswerButton().click();
        getContinueButton().click();
        return getInstance(LeaderBoardPage.class);
    }

}
