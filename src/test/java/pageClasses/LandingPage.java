package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    WebDriver driver;

    //constructor
public LandingPage(WebDriver driver){
   super(driver);
}


    //locators
    @FindBy (xpath="//h2[text()='My Account']")
    private WebElement myAccountText;

    @FindBy (xpath="//a[text()='Logout' and @class='list-group-item']")
    private WebElement logoutLink;





//    @FindBy (xpath="//input[@name='password']")
//   private WebElement passwordInputBox;
//
//    @FindBy (xpath="//input[@type='submit']")
//    private WebElement loginButton;




    // methods
public boolean isLandingPageIsDisplayed() {

    try {
        return (myAccountText.isDisplayed());
    } catch (Exception e) {
        return false;
    }
}

    public void performLogout() {

        logoutLink.click();

    }


}




