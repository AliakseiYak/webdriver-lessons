package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 25.04.2016.
 */
public class HomePage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://www.toptal.com";

    //Locators

    //Apply as Developer Button
    @FindBy(xpath = ".//*[@id='top']/div[1]/header/div[2]/div/div/nav/ul/li[2]/a")
    private WebElement developerApplyButton;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnDeveloperApplyButton(){

        developerApplyButton.click();

    }
}
