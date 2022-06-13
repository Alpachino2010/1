package pages;

import baseClass.BaseClass;
import helper.actionHandler;
import helper.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class homepage extends BaseClass {

    @FindBy(xpath = "//span[text()=\"Sign in\"]")
    private WebElement signinbtn;

    WebDriver driver;
    public  homepage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Go to Sign-in Page
    public void homepages() throws InterruptedException
    {
        Reporter.log("onFinish method finished homepages");
//        try {
//            driver.findElement(By.xpath("//span[text()=\"Sign i1n\"]"));
//            log.info("login button has found");
//        }catch (Exception e){
//            log.error("Button not found");
//        }
//
//        log.startTestCase("homepahes");
//        if(signinbtn != null) {
//            Thread.sleep(2000);
//            actionHandler.click(signinbtn);
//        }else {
//            log.error("dfsdfsdfsdfsdf");
//        }
//        log.endTestCase("homepahes");

        //signinbtn.click();
    }
   //
}
