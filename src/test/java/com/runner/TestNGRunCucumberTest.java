package com.runner;

import com.driverFactory.DriverFactory;
import com.driverFactory.DriverManager;
import com.pages.BasePage;
import com.pages.Page;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


@CucumberOptions(
        features = "src/test/java/com/features",
        glue = {"com.steps"},
        plugin = { "pretty", "html:test-output/cucumber-reports/cucumber-pretty","json:test-output/cucumber-reports/CucumberTestReport.json"},
        monochrome = true)

public class TestNGRunCucumberTest {

    private TestNGCucumberRunner testNGCucumberRunner;
    public static WebDriver driver;
    public static Page page;

    @BeforeClass
    @Parameters(value = { "browser"})
    public void beforeClass(String browser) {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        if(browser.equalsIgnoreCase("chrome")){
            driver = DriverFactory.createChromeDriverInstance();
            DriverManager.setDriver(driver);
            page = new BasePage(DriverManager.getDriver());
        }

        else if (browser.equalsIgnoreCase("firefox")){
            driver = DriverFactory.createFirefoxDriverInstance();
            DriverManager.setDriver(driver);
            page = new BasePage(DriverManager.getDriver());
        }
        else{
            System.out.println("No browser provided in testng.xml file");
        }

    }


    @Test(groups = "cucumber", description = "Run Covid Challenge Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass
    public void tearDownClass() throws Exception {
        driver.quit();
        testNGCucumberRunner.finish();
    }

}

