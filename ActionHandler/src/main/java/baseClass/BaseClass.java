package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public Properties pros;

    public BaseClass()
    {
        try
        {
            pros = new Properties();
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            pros.load(fs);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @BeforeSuite
    /*public void clearConsoleErrors(){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        String script = "console.clear();";
        js.executeScript(script);
        getDriver().manage().logs().get(LogType.BROWSER).filter(Level.ALL)
    }*/
    /*public static void clearFile(String fileLocation){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileLocation));
            bw.write("");
            bw.flush();
            bw.close();
        }catch(IOException ioe){
            // You should really do something more appropriate here
            ioe.printStackTrace();
        }
    }*/
    public void setup()
    {
        DOMConfigurator.configure("log4j.xml");
        if(pros.getProperty("browser").equals("chrome"))
        {
            driver = WebDriverManager.chromedriver().create();
            driver.get(pros.getProperty("url"));
            driver.manage().window().maximize();
        }
    }

    @AfterSuite
    public void exit()
    {
        driver.close();
    }
}
