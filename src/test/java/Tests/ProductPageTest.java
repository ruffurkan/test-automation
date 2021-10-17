package Tests;

import Model.HomePageModel;
import Model.ProductsPageModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductPageTest {
    ProductsPageModel productsPageModel;

    public ProductPageTest() {
        this.productsPageModel = new ProductsPageModel();
    }

    @Step("Urunler sayfasinin acildigi gorulur")
    public void IsProductsPageDisplayed() {
      productsPageModel.isProductsDisplayed();
    }

    @Step("Sayfanin sonuna scroll edilir")
    public void ScrollToEndOfThePage() throws InterruptedException {
        productsPageModel.scrollToElement();
    }

    @Step("Daha fazla butonuna tiklanir")
    public void ClicksOnSeeMoreButton(){
        productsPageModel.clicksOnSeeMoreButton();
    }

    @Step("Rastgele bir urun secilir")
    public void SelectRandomProduct(){
        productsPageModel.selectProduct();
    }

}
