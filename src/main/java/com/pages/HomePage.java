package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.utils.UserNameUtil.generateUserName;

public class HomePage extends BasePage {

    private final By warriorNameTextBox = By.id("worrior_username");
    private final By createWarriorButton = By.id("warrior");
    private final By startYourJourneyButton = By.id("start");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWarriorNameTextBox() {
        return getElement(warriorNameTextBox);
    }

    public WebElement getCreateWarriorButton() {
        return getElement(createWarriorButton);
    }

    public WebElement getStartYourJourneyButton() {
        return getElement(startYourJourneyButton);
    }

    public ChallengesPage createNewUserAndStartJourney(){
        getWarriorNameTextBox().sendKeys(generateUserName());
        getCreateWarriorButton().click();
        getStartYourJourneyButton().click();
        return getInstance(ChallengesPage.class);
    }

}
