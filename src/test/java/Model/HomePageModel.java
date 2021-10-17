package Model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class HomePageModel extends Driver {

    public static By imgLogo = By.xpath(".//*[@class='main-header-logo']");
    public static By btnLogin = By.xpath("//a[@href='https://www.lcwaikiki.com/tr-TR/TR/giris']");
    public static By tbxSearchArea = By.id("search");
    public static By btnSearch = By.xpath("//a[@class='search-button active']");
    public static By btnMyCart = By.id("spanCart");

    WebDriverWait wait = new WebDriverWait(webDriver,15);
    public void isHomePageOpened(){
        Assert.assertTrue("Anasayfa açılmadı.",webDriver.findElement(imgLogo).isDisplayed());
    }

    public void clickToLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        webDriver.findElement(btnLogin).click();
    }

    public void setProductName(String productName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(tbxSearchArea));
        wait.until(ExpectedConditions.elementToBeClickable(tbxSearchArea));
        webDriver.findElement(tbxSearchArea).click();
        webDriver.findElement(tbxSearchArea).sendKeys(productName);
    }

    public void clickToSearchButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnSearch));
        wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
        webDriver.findElement(btnSearch).click();
    }

    public void clickToMyCartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMyCart));
        wait.until(ExpectedConditions.elementToBeClickable(btnMyCart));
        webDriver.findElement(btnMyCart).click();
    }


}
