package Tests;

import Model.MyAccountPageModel;
import Model.ProductDetailPageModel;
import com.thoughtworks.gauge.Step;

public class ProductDetailTest {

    ProductDetailTest productDetailTest;
    ProductDetailPageModel productDetailPageModel;

    public ProductDetailTest() {
        this.productDetailTest = new ProductDetailTest();
    }

    @Step("Urunun bedeni secilir")
    public void SelectProductSize(){
        productDetailPageModel.selectProductSize();
    }

    @Step("Secilen urun sepete eklenir")
    public void AddToCartSelectedProduct(){
        productDetailPageModel.clikcsOnAddToCartButton();
    }
}
