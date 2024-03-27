package orgtk.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import orgtk.BaseClass;
import org.junit.Assert;

import java.util.Properties;

public class BrowserUtils extends BaseClass {
    static Properties properties = PropertiesUtil.loadframeworkProperties();

    public static void clickElement(String element){
         find(element).click();

    }

    public static void hoverElement(String element, String element2){
        WebElement e = find(element);
        WebElement e2 = find(element2);
        Actions actions = new Actions(driver);
        actions.moveToElement(e).click(e2).build().perform();
    }

    public static void enterText(String element, String text){
        driver.findElement(By.xpath(element)).clear();
        driver.findElement(By.xpath(element)).sendKeys(text);

    }

    public static WebElement find(String xpath){
        String timeout = properties.getProperty("timeout.minimum");
        WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeout));
        WebElement element = wait.until(ExpectedConditions.
                    elementToBeClickable(driver.findElement(By.xpath(xpath))));


        return element;
    }

    public static void validateText(String element, String expText) {


        String actualText = driver.findElement(By.xpath(element)).getText();
        Assert.assertTrue("Expected Text : " + expText + "is not matching with Actual text"


                + actualText, expText.equals(actualText));

    }

    public static void validateValue(String element, String expectedValue, String attributeType){
        String actualValue = driver.findElement(By.xpath(element)).getAttribute(attributeType);
        Assert.assertTrue("Expected value: "+ expectedValue + "is not matching with actual value" + actualValue
        , expectedValue.equals(actualValue));
    }
}
