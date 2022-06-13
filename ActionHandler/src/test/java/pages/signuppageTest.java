package pages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class signuppageTest extends BaseClass
{
    signuppageTest obj;
    public signuppageTest(WebDriver driver)
    {
        super();
    }


    @BeforeClass
    void  init()
    {
        obj = new signuppageTest(driver);
        System.out.println("login page Test");
    }

    @Test
    void signup() throws InterruptedException
    {
        obj.signupPerform();
    }

    private void signupPerform() {
    }

}
