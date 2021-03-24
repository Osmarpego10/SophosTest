package practica.sophos.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLastStep extends PageObject {

    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement inputConfirmPassword;
    @FindBy(xpath = "//input[@id='termOfUse']/following::span[1]")
    WebElement checkTermOfUse;
    @FindBy(xpath = "//input[@id='privacySetting']/following::span[1]")
    WebElement checkPrivacySetting;
    @FindBy(xpath = "//a[@aria-label='Complete Setup']")
    WebElement btnComplete;

    public void sendPassword(String pass) throws InterruptedException {
        Thread.sleep(1000);
        inputPassword.clear();
        inputPassword.sendKeys(pass);
    }

    public void sendConfirmPassword(String confirmPass) throws InterruptedException {
        Thread.sleep(1000);
        inputConfirmPassword.clear();
        inputConfirmPassword.sendKeys(confirmPass);
    }

    public void clickTermOfUse() throws InterruptedException {
        Thread.sleep(1000);
        checkTermOfUse.click();
    }

    public void clickPrivacySetting() throws InterruptedException {
        Thread.sleep(1000);
        checkPrivacySetting.click();
    }

    public void clickComplete() throws InterruptedException {
        Thread.sleep(1000);
        btnComplete.click();
    }

}
