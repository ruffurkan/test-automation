package Tests;

import Model.HomePageModel;
import Model.MyCartPageModel;
import com.thoughtworks.gauge.Step;

public class MyCartPageTest {
    MyCartPageModel myCartPageModel;

    public MyCartPageTest() {
        this.myCartPageModel = new MyCartPageModel();
    }

    @Step("Sepetteki fiyat ile urun sayfasindaki fiyatin ayni oldugu gorulur")
    public void CheckProductPrices() {
       myCartPageModel.checkPrices();
    }
}
