package Model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class ProductsPageModel extends Driver {
    public static By btnProducts = By.xpath("//a[@class='option-mix-and-match']");
    public static By btnSeeMore = By.xpath("//p[text()='Daha Fazla Ürün Gör']");
    public static By allProducts = By.xpath("//div[@data-category='//']");


    WebDriverWait wait = new WebDriverWait(webDriver,15);

    public void isProductsDisplayed(){
        Assert.assertTrue("Urunler sayfasi açilmadıi",webDriver.findElement(btnProducts).isDisplayed());
    }

    public void scrollToElement() throws InterruptedException {
        WebElement element = webDriver.findElement(By.id("pageIndex"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element);
        actions.perform();
        Thread.sleep(500);
    }

    public void clicksOnSeeMoreButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSeeMore));
        wait.until(ExpectedConditions.elementToBeClickable(btnSeeMore));
        webDriver.findElement(btnSeeMore).click();
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void selectProduct(){
        List<WebElement> products = webDriver.findElements(allProducts);
        Random rnd = new Random();
        int productNumber= rnd.nextInt(products.size());
        clickElement(products.get(productNumber));
    }
}
