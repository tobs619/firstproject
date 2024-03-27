package orgtk.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import orgtk.Utils.BrowserUtils;

import java.util.List;

import static orgtk.BaseClass.driver;

public class ShoppingCartPage {

    private static String chkoutbtn = "//a[text()='Checkout']";
    private static String continueShoppingbtn = "//a[text()='Continue Shopping']";
    private static String linkproduct = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[2]/a";
    private static String qtytextbox = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[4]//input";
    private static String totalprice = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[6]";
    private static String clrbtn = "//button[@title='Remove']";
    private static String itembtn = "//div[@id='cart']";


    public static void clickCheckout() {
        BrowserUtils.clickElement(chkoutbtn);

    }

    public static void clickCtnShopping() {
        BrowserUtils.clickElement(continueShoppingbtn);

    }

    public static void validateProduct(String expectedproductName) {
        BrowserUtils.validateText(linkproduct, expectedproductName);

    }

    public static void productQuantity(String expectedQuantity) {
        BrowserUtils.validateValue(qtytextbox, expectedQuantity, "value");
    }

    public static void validateTotalPrice(String total){

        BrowserUtils.validateText(totalprice, total);
    }
    public static void clearShoppingCart(){
        List<WebElement> removeElements = driver.findElements(By.xpath(clrbtn));
        if (removeElements.size()>0){
            for (WebElement element: removeElements){
                BrowserUtils.clickElement(itembtn);
                element.click();

            }
        }
    }
}