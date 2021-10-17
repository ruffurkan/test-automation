package Tests;

import Model.HomePageModel;
import Model.MyAccountPageModel;
import com.thoughtworks.gauge.Step;

public class MyAccountTest {

    MyAccountPageModel myAccountPageModel;

    public MyAccountTest() {
        this.myAccountPageModel = new MyAccountPageModel();
    }

    @Step("Hesabim butonuna tiklanir")
    public void ClickOnMyAccountButton() {
        myAccountPageModel.clickOnMyAccountButton();
    }

    @Step("Email Alaninin dolu oldugu gorulur")
    public void ChekEmailAreaIsNotEmpty() {
        myAccountPageModel.isEmailAreaNotEmpty();
    }
}
