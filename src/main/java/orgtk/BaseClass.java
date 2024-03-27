package orgtk;

import org.openqa.selenium.WebDriver;
import orgtk.Utils.PropertiesUtil;
import java.util.Properties;
import static orgtk.Utils.browserDriver.getBrowserDriver;

public class BaseClass {

    public static WebDriver driver;
    static Properties properties = PropertiesUtil.loadappProperties();
    static Properties props = PropertiesUtil.loadframeworkProperties();


    public static void initializeDriver(){

        String url = properties.getProperty("application.url");
        String browser = props.getProperty("browser.driver");
        driver = getBrowserDriver(browser);

        driver.get(url);
        driver.manage().window().maximize();


    }

    public static void closeDriver(){
        //driver.quit();
    }

}
