package orgtk.PageObjects;

import org.openqa.selenium.By;
import orgtk.BaseClass;
import orgtk.Utils.BrowserUtils;
import orgtk.Utils.ExcelUtils;

import java.util.List;

public class LoginPage extends BaseClass {
    private static String Email = "//input[@id='input-email']";
    private static String pass = "//input[@id='input-password']";
    private static String login = "//input[@value='Login']";
    private static String forgotPassword = "(//a[text()='Forgotten Password'])[1]";
    private static String LoginError = "//div[contains(@class,'alert-danger')]";

    static ExcelUtils excelUtils = new ExcelUtils("src/test/resources/testData/Sample.xlsx");

    public static void enterUsername(String username){

        List<String> usernames = excelUtils.readExcelData("Login", "Username");
        String email = usernames.get(0);
        System.out.println(usernames.get(0));

        BrowserUtils.enterText(Email, username);
    }

    public static void enterPassword(String password){
        BrowserUtils.enterText(pass, password);
    }

    public static void clickLogin(){

        BrowserUtils.clickElement(login);
    }
    public static void clickForgottenPassword(){
        driver.findElement(By.xpath(forgotPassword))
                .click();
    }

    public static void validateInvalidLogin(String expMessage) {
        BrowserUtils.validateText(LoginError, expMessage);

    }
    public static void getUsername(){
        List<String> usernames = excelUtils.readExcelData("Login", "Username");
    }
    public static void getPassword(){
        List<String> passwords = excelUtils.readExcelData("Login", "Password");
    }
}


