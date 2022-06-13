package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage extends BaseClass {
    @FindBy(xpath = "//input[@type=\"radio\"][@value=\"1\"]")
    private WebElement radio;

    @FindBy(xpath = "//input[@class=\"form-control\"][@name=\"firstname\"]")
    private WebElement firstname;

    @FindBy(xpath = "//input[@class=\"form-control\"][@name=\"lastname\"]")
    private WebElement lastname;

    @FindBy(xpath = "//input[@class=\"form-control\"][@name=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@class=\"form-control js-child-focus js-visible-password\"][@name=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//input[@name=\"psgdpr\"]")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@type=\"submit\"][@data-link-action=\"save-customer\"]")
    private WebElement save;

    public signuppage(WebDriver driver) {PageFactory.initElements(driver, this);}

    public void signupPerform() throws InterruptedException
    {
        radio.click();
        firstname.sendKeys(super.pros.getProperty("firstname"));
        lastname.sendKeys(super.pros.getProperty("lastname"));
        email.sendKeys(super.pros.getProperty("email"));
        password.sendKeys(super.pros.getProperty("password"));
        checkbox.click();
        save.click();
        Thread.sleep(10000);
    }

}
