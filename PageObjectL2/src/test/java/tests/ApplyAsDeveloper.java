package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_objects.DeveloperApplyPage;
import page_objects.DeveloperPortalPage;
import page_objects.HomePage;

/**
 * Created by admin on 25.04.2016.
 */
public class ApplyAsDeveloper {
    WebDriver driver;

    @BeforeTest

    public void setup(){
        //use FF Driver
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void applyAsDeveloper() {
        //Create object of HomePage Class
        HomePage home = new HomePage(driver);
        home.clickOnDeveloperApplyButton();

        //Create object of DeveloperPortalPage
        DeveloperPortalPage devportal= new DeveloperPortalPage(driver);

        //Check if page is opened
        Assert.assertTrue(devportal.isPageOpened());

        //Click on Join Toptal
        devportal.clikOnJoin();

        //Create object of DeveloperApplyPage
        DeveloperApplyPage applyPage =new DeveloperApplyPage(driver);

        //Check if page is opened
        Assert.assertTrue(applyPage.isPageOpened());

        //Fill up data
        applyPage.setDeveloper_email("dejan@toptal.com");
        applyPage.setDeveloper_full_name("Dejan Zivanovic Automated Test");
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