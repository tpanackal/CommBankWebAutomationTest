package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

import static com.utils.UserNameUtil.*;


public class LeaderBoardPage extends BasePage{

    private final By continueFightingButton = By.id("leaderboard_link");
    private final By leaderBoardTable = By.id("showData");

    public LeaderBoardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getContinueFightingButton() {
        return getElement(continueFightingButton);
    }

    public WebElement getLeaderBoardTable() {
        return getElementOnVisibility(leaderBoardTable);
    }

    public void userValidatesThatTheNewUserCreatedHasBeenAddedToTheLeaderBoard(){
        Assert.assertEquals(getPageTitle(),"COVID-19 THE GAME");
        Assert.assertEquals(getContinueFightingButton().getText(),"Continue fighting");
        Assert.assertTrue(getLeaderBoardTable().isDisplayed());
        Assert.assertTrue(searchUsernameOnLeaderBoard(driver,userName));
    }



    public Boolean searchUsernameOnLeaderBoard(WebDriver driver, String name){
        Boolean isFound = false;
        List<WebElement> rows = driver.findElements(By.cssSelector("tbody > tr"));
        for(WebElement row : rows){
            System.out.println("Row Text is" + row.getText());
            if(row.getText().contains(name)){
                isFound = true;
                break;
            }
        }
        return isFound;
    }


}
