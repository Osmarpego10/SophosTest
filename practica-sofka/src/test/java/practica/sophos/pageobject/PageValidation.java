package practica.sophos.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageValidation extends PageObject {

    @FindBy(xpath = "//p[@class='welcome-lead']/b")
    WebElement textWelcome;

    public String getTextWelcome() throws InterruptedException {
        Thread.sleep(1000);
        return textWelcome.getText();
    }

}
