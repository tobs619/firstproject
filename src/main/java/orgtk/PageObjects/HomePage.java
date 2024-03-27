package orgtk.PageObjects;

import orgtk.BaseClass;
import orgtk.Utils.BrowserUtils;

public class HomePage extends BaseClass {

    private static String myAccountText = "//div[@id='content']/h2[1]";
    private static String laptopsAndNotebooks = "//*[@id='menu']/div[2]/ul/li[2]/a";
    private static String allLaptops = "//a[text()='Show AllLaptops & Notebooks']";
    private static String linkShoppingCart = "//a[@title='Shopping Cart']";

    public static void validateLogin(String expText) {

        BrowserUtils.validateText(myAccountText, expText);
    }

    public static void clickAllLaptopsandNotebooks(){

        BrowserUtils.clickElement(laptopsAndNotebooks);
        BrowserUtils.clickElement(allLaptops);
    }

    public static void clickShoppinCart(){
        BrowserUtils.clickElement(linkShoppingCart);
    }

}
