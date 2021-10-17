package Model;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPageModel extends Driver {
    public static By btnMyAccountButton = By.xpath("//span[text()='Hesabım']");
    public static By txtEmailAddress = By.id("EmailAddress");

    WebDriverWait wait = new WebDriverWait(webDriver,15);

    public void clickOnMyAccountButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnMyAccountButton));
        wait.until(ExpectedConditions.elementToBeClickable(btnMyAccountButton));
        webDriver.findElement(btnMyAccountButton).click();
    }

    public String getEmailAddressText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtEmailAddress));
        return webDriver.findElement(txtEmailAddress).getAttribute("value").toString();
    }

    public boolean isEmailEmpty(){
        if(getEmailAddressText().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public void isEmailAreaNotEmpty(){
        Assert.assertTrue("Email alani bos",isEmailEmpty());
    }
}
