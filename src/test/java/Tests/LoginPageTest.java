package Tests;

import Model.HomePageModel;
import Model.LoginPageModel;
import com.thoughtworks.gauge.Step;

public class LoginPageTest {
    LoginPageModel loginPageModel;

    public LoginPageTest() {
        this.loginPageModel = new LoginPageModel();
    }

    @Step("Login sayfasinin acildigi gorulur")
    public void IsLoginPageDisplayed() {
        loginPageModel.isLoginPageOpened();
    }

    @Step("Email alaninda <key> yazilir")
    public void SetEmailAddress(String emailAddress){
        loginPageModel.setEmailAddress(emailAddress);
    }

    @Step("Password alaninda <key> yazilir")
    public void SetPassword(String password){
        loginPageModel.setPassword(password);
    }

    @Step("Login butonuna tiklanir")
    public void ClickOnLoginButton() {
        loginPageModel.clickOnLoginButton();
    }
}
