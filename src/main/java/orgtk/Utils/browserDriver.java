package orgtk.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class browserDriver {
    public static WebDriver driver;

    public static WebDriver getBrowserDriver(String browser){
        if (browser!=null){
            if (browser.equalsIgnoreCase("chrome")){
                driver = setChromeDriver();
            } else if (browser.equalsIgnoreCase("safari")) {
                driver = setSafariDriver();

            }
        }
        return driver;
    }

    private static WebDriver setSafariDriver() {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        return driver;
    }

    private static WebDriver setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*").addArguments("headless browser");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
        driver = new ChromeDriver(options);
        return driver;
    }
}
