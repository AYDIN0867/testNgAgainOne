package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class FacebookPages {

    public FacebookPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement loginPagefacebookEmailBox;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement loginPagefacebookPassWordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement facebookLogin;


}
