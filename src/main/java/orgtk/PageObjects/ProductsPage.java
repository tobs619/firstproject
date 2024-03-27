package orgtk.PageObjects;

import orgtk.Utils.BrowserUtils;

public class ProductsPage {
    private static String macbooklink = "//*[@id='content']/div[4]/div[2]/div/div[2]/div[1]/h4/a";
    private static String hplink = "//*[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a";
    private static String linkProducts = "//h4/a[contains(@href,'product_id')]";
    private static String addtoCart = "//button[@id='button-cart']";
    private static String headprice = "//*[@id='content']/div/div[2]/ul[2]/li[1]/h2";
    private static String producttext = "//*[@id='content']/div/div[2]/h1";
    private static String qtytext = "//input[@id='input-quantity']";

    public static void clickhpproduct(){
        BrowserUtils.clickElement(hplink);
    }



    public static void clickmacbookProduct(){
        BrowserUtils.clickElement(macbooklink);
    }

    public static void validatePrice(String Price){
        BrowserUtils.validateText(headprice, Price);

    }

    public static void validateProduct(String Name){
        BrowserUtils.validateText(producttext, Name);
    }

    public static void AddtoCart(){
        BrowserUtils.clickElement(addtoCart);
    }

    public static void quantityProduct(String Quantity){
        BrowserUtils.enterText(qtytext, Quantity);

    }
    public static void clickProducts(){
            BrowserUtils.clickElement(linkProducts);

        }
}
