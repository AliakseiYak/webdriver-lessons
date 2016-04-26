package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_objects.DeveloperApplyPage;
import page_objects.HomePage;

/**
 * Created by admin on 25.04.2016.
 */
public class ApplyAsDeveloper {
    WebDriver driver;

    @BeforeTest

    public void setup(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void applyAsDeveloper() {
        //Create object of HomePage Class
        HomePage home = new HomePage(driver);

        //Create page object of DeveloperApplyPage after clicking Developer Apply button on the Home page
        DeveloperApplyPage applyPage = home.clickOnDeveloperApplyButton();

        //Check if page is opened
        Assert.assertTrue(applyPage.isPageOpened());

        //Fill up data
        applyPage.setDeveloperOption();
        applyPage.setDeveloper_email("ayakimovich@gmail.com");
        applyPage.setDeveloper_full_name("Alex Automated Test");
        applyPage.setDeveloper_password("password123");
        applyPage.setDeveloper_password_confirmation("password123");
        applyPage.setDeveloper_skype("automated_test_skype");

        //Click on join
        //applyPage.clickOnJoin();
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
