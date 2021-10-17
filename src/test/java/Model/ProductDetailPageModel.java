package Model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.invoke.empty.Empty;

public class ProductDetailPageModel extends Driver {

    public static By btnAddToCart = By.xpath("//a[@id='pd_add_to_cart']");
    public static By txtSelectedProductPrice = By.xpath("//span[@class='price']");
    public static By btnProductSize = By.xpath("//*[@id='option-size']/a");

    WebDriverWait wait = new WebDriverWait(webDriver,15);
    String productPrice ="";

    public void selectProductSize(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnProductSize));
        wait.until(ExpectedConditions.elementToBeClickable(btnProductSize));
        webDriver.findElement(btnProductSize).click();
    }

    public void clikcsOnAddToCartButton(){
        getProductsPrice();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnAddToCart));
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
        webDriver.findElement(btnAddToCart).click();
    }

    public String getProductsPrice(){
       return webDriver.findElement(txtSelectedProductPrice).getText();
    }

}
