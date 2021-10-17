package Model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCartPageModel extends Driver {

    public static By txtPrice = By.xpath("//span[@class='pull-right']");

    WebDriverWait wait = new WebDriverWait(webDriver,15);
    ProductDetailPageModel productDetailPageModel;
    public String getProductPriceFromCart(){
       return webDriver.findElement(txtPrice).getText();
    }

    public boolean checkPrices(){
      String price1= productDetailPageModel.getProductsPrice();
      String price2= getProductPriceFromCart();

      if(price1 == price2){
          return true;
      }
      else {
          return false;
      }
    }
}
