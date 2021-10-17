package Tests;

import Model.HomePageModel;
import com.thoughtworks.gauge.Step;


public class HomePageTest {
    HomePageModel homePageModel;

    public HomePageTest() {
        this.homePageModel = new HomePageModel();
    }

    @Step("Anasayfanin acildigi gorulur")
    public void IsHomePageDisplayed() {
        homePageModel.isHomePageOpened();
    }

    @Step("Giris yap butonuna tiklanir")
    public void ClickToLoginButton(){
        homePageModel.clickToLoginButton();
    }

    @Step("Arama alaninda <key> yazilir")
    public void SetProductName(String productName){
        homePageModel.setProductName(productName);
    }

    @Step("Ara butonuna tiklanir")
    public void ClickToSearcButton(){
        homePageModel.clickToSearchButton();
    }

    @Step("Sepetim butonuna tiklanir")
    public void ClickToMyCartButton(){
        homePageModel.clickToMyCartButton();
    }


}
