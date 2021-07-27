package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    public WebDriver driver;
    public Wait wait;


    public Page(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver,60);
    }

    public abstract String getPageTitle();

    public abstract WebElement getElement(By locator);

    public abstract WebElement getElementOnVisibility(By locator);

    public abstract void waitForElement(By locator);

    public abstract void waitForElementToBeVisible(By locator);

    public abstract void actionByScriptExecutor(String locator, String action);

    public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
        try {
            return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
