package practica.sophos.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class PageHome extends PageObject {

    @FindBy(xpath = "//a[@class='unauthenticated-nav-bar__sign-up']")
    WebElement btnJoinToday;

    public void clickJoinToday(){
        btnJoinToday.click();
    }

}
