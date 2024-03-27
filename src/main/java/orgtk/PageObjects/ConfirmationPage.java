package orgtk.PageObjects;

import orgtk.Utils.BrowserUtils;

public class ConfirmationPage {

    private static String orderplaced = "//div[@id='content']/h1";

    public static void validateconfirmation (String expmessage){
        BrowserUtils.validateText(orderplaced, expmessage);
    }
}
