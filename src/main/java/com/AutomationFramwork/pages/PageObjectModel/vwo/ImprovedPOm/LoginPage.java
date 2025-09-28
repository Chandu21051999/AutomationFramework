package com.AutomationFramwork.pages.PageObjectModel.vwo.ImprovedPOm;

import com.AutomationFramwork.base.CommonToAll;
import com.AutomationFramwork.utilis.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAll {

    WebDriver driver;

    public  LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By USername= By.id("login-username");
    private By Password= By.id("login-password");
    private By SignInbutton= By.id("js-login-btn");
    private By errormessage= By.id("js-notification-box-msg");

    public String LoginInvCre( String user ,String pwd){
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);
        WaitHelpers.checkVisibility(getDriver(),error_message);
        return getText(error_message);
    }

    public void loginToVWOLoginValidCreds(String user, String pwd) {

        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        // Wait - Thread sleep
         WaitHelpers.waitJVM(5000);

    }


}
