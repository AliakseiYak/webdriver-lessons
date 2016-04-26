package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 26.04.2016.
 */
public class DeveloperPortalPage {
    private WebDriver driver;

    @FindBy(css = ".modal-content-header.is-centered.is-medium")
    private WebElement heading;

    @FindBy(id = "save_new_talent")
    private WebElement joinToptalButton;

    //Constructor
    public DeveloperPortalPage (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    //We will use this boolean for assertion. To check if page is opened
    public boolean isPageOpened(){
        return heading.getText().toString().contains("Top Freelancers");
    }

    public void clikOnJoin(){
        joinToptalButton.click();
    }
}
