package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class HomePage extends CommonMethods {

    @FindBy(xpath ="//ul[@aria-label='Primary Navigation']/li/button")
    public List<WebElement> navigationalButtons;

    @FindBy(xpath = "//button[@type='submit' and @id='elc-accept-link']")
    public WebElement acceptCookies;




    public HomePage(){
        PageFactory.initElements(driver,this);
    }
}
