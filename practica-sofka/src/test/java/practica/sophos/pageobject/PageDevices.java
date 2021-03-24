package practica.sophos.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageDevices extends PageObject {

    @FindBy(xpath = "//a[@aria-label='Next - final step']")
    WebElement btnNextLastStep;

    public void clickLastStep() throws InterruptedException {
        Thread.sleep(1000);
        btnNextLastStep.click();
    }
}
