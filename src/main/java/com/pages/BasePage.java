package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }


    @Override
    public WebElement getElement(By locator) {
        try{
            waitForElement(locator);
            return driver.findElement(locator);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public WebElement getElementOnVisibility(By locator) {
        try{
            waitForElementToBeVisible(locator);
            return driver.findElement(locator);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    @Override
    public void waitForElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    @Override
    public void actionByScriptExecutor(String locator, String action) {
        ((JavascriptExecutor) driver).executeScript(String.format("document.querySelector('%s').%s()", locator, action));
    }

}
