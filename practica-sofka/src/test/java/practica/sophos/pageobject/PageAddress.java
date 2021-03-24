package practica.sophos.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAddress extends PageObject {

    @FindBy(xpath = "//a[@aria-label='Next step - select your devices']")
    WebElement btnNextDevices;

    public void clickNextDevices() throws InterruptedException {
        Thread.sleep(1000);
        btnNextDevices.click();
    }

}
