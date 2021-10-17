package Model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageModel extends Driver {
    public static By txtGetLogin = By.xpath("//p[text()='ÜYE GİRİŞİ']");
    public static By tbxEmail = By.id("LoginEmail");
    public static By tbxPassword = By.id("Password");
    public static By btnLogin = By.id("loginLink");

    WebDriverWait wait = new WebDriverWait(webDriver,15);

    public void isLoginPageOpened(){
        Assert.assertTrue("Login sayfasi açılmadı.",webDriver.findElement(txtGetLogin).isDisplayed());
    }

    public void setEmailAddress(String emailAddress){
        wait.until(ExpectedConditions.visibilityOfElementLocated(tbxEmail));
        wait.until(ExpectedConditions.elementToBeClickable(tbxEmail));
        webDriver.findElement(tbxEmail).sendKeys(emailAddress);
    }

    public void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(tbxPassword));
        wait.until(ExpectedConditions.elementToBeClickable(tbxPassword));
        webDriver.findElement(tbxPassword).sendKeys(password);
    }

    public void clickOnLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        webDriver.findElement(btnLogin).click();
    }


}
