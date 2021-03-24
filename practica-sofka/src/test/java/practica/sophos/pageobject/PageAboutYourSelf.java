package practica.sophos.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class PageAboutYourSelf extends PageObject {

    Random rand;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement inputFirstName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement inputLastName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//select[@id='birthMonth']")
    WebElement btnBithMonth;
    @FindBy(xpath = "//select[@id='birthMonth']/option[@label]")
    List<WebElement> listBithMonth;
    @FindBy(xpath = "//select[@id='birthDay']")
    WebElement btnBithDay;
    @FindBy(xpath = "//select[@id='birthDay']/option[@label]")
    List<WebElement> listBithDay;
    @FindBy(xpath = "//select[@id='birthYear']")
    WebElement btnBithYear;
    @FindBy(xpath = "//select[@id='birthYear']/option[@label]")
    List<WebElement> listBithYear;
    @FindBy(xpath = "//input[@type='search']")
    WebElement inputSearch;
    @FindBy(xpath = "//li[@id='ui-select-choices-0']/div[@role='option']")
    List<WebElement> listSearch;
    @FindBy(xpath = "//a[@class='btn btn-blue']")
    WebElement btnNextLocation;

    public void sendFirstName(String name) throws InterruptedException {
        Thread.sleep(1000);
        inputFirstName.clear();
        inputFirstName.sendKeys(name);
    }

    public void sendLastName(String lastName) throws InterruptedException {
        Thread.sleep(1000);
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
    }

    public void sendEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void clickBirthMonth() throws InterruptedException {
        Thread.sleep(1000);
        btnBithMonth.click();
    }

    public void selectBirthMonth() throws InterruptedException {
        Thread.sleep(1000);
        rand = new Random();
        listBithMonth.get(rand.nextInt(listBithMonth.size())).click();
    }

    public void clickBirthDay() throws InterruptedException {
        Thread.sleep(1000);
        btnBithDay.click();
    }

    public void selectBirthDay() throws InterruptedException {
        Thread.sleep(1000);
        rand = new Random();
        listBithDay.get(rand.nextInt(listBithDay.size())).click();
    }

    public void clickBirthYear() throws InterruptedException {
        Thread.sleep(1000);
        btnBithYear.click();
    }

    public void selectBirthYear() throws InterruptedException {
        Thread.sleep(1000);
        rand = new Random();
        listBithYear.get(rand.nextInt(listBithYear.size())).click();
    }

    public void clickSearch() throws InterruptedException {
        Thread.sleep(1000);
        inputSearch.click();
    }

    public void selectSearch() throws InterruptedException {
        Thread.sleep(1000);
        rand = new Random();
        listSearch.get(rand.nextInt(listSearch.size())).click();
    }

    public void clickNextLocation() throws InterruptedException {
        Thread.sleep(1000);
        btnNextLocation.click();
    }




}
