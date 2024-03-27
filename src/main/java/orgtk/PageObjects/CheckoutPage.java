package orgtk.PageObjects;

import orgtk.BaseClass;
import orgtk.Utils.BrowserUtils;

public class CheckoutPage extends BaseClass {

    private static String ctnbillbtn = "//*[@id='button-payment-address']";
    private static String ctndeliveryaddressbtn = "//input[@id='button-shipping-address']";
    private static String ctndeliverymethodbtn = "//input[@id='button-shipping-method']";
    private static String checkboxbtn = "//input[@name='agree']";
    private static String ctnpaymentmethodbtn = "//input[@id='button-payment-method']";
    private static String confirmorderbtn = "//input[@id='button-confirm']";

    private static String subtotalprice = "//div[@id='content']//table//tfoot//tr[1]//td[2]";
    private static String shippingrate = "//div[@id='content']//table//tfoot//tr[2]//td[2]";
    private static String totalprice = "//div[@id='content']//table//tfoot//tr[3]//td[2]";
    private static String linkPaymentAddress = "//a[contains(@href,'payment-address')]";

    public static void clickcontinuebilling(){
        BrowserUtils.clickElement(ctnbillbtn);
    }
    public static void clickcontinuedeliveryaddress(){
        BrowserUtils.clickElement(ctndeliveryaddressbtn);
    }
    public static void clickcontinuedeliverymethod(){
        BrowserUtils.clickElement(ctndeliverymethodbtn);
    }
    public static void clickcheckbox(){
        BrowserUtils.clickElement(checkboxbtn);
    }
    public static void clickcontinuepaymentmethod(){
        BrowserUtils.clickElement(ctnpaymentmethodbtn);
    }
    public static void clickconfirmedorder(){
        BrowserUtils.clickElement(confirmorderbtn);
    }
    public static void validatetotalprice(String total){
        BrowserUtils.validateText(totalprice, total);
    }


    public static void clickBillingAddress() {
        BrowserUtils.clickElement(linkPaymentAddress);

    }
}
