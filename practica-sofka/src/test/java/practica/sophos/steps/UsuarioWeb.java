package practica.sophos.steps;

import org.apache.commons.lang3.RandomStringUtils;

import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import practica.sophos.pageobject.*;

public class UsuarioWeb extends ScenarioActor {

	Actor actor = Actor.named("Osmar");

	@Steps(shared = true)
	PageHome pageHome;

	@Steps(shared = true)
	PageAboutYourSelf pageAboutYourSelf;

	@Steps(shared = true)
	PageAddress pageAddress;

	@Steps(shared = true)
	PageDevices pageDevices;

	@Steps(shared = true)
	PageLastStep pageLastStep;

	@Steps(shared = true)
	PageValidation pageValidation;


	@Step("#actor ingresa a sitio web utest")
	public void ingresarUtest(){

		pageHome.setDefaultBaseUrl("https://www.utest.com/");
		pageHome.open();
	}

	@Step("#actor seleccionar Join Today")
	public void seleccionarJoinToday(){
		pageHome.clickJoinToday();
	}

	@Step("#actor diligencia formulario de about yourself")
	public void diligenciarAboutYourSelf() throws InterruptedException {
		String firstName = RandomStringUtils.randomAlphabetic(8);
		String lastName = RandomStringUtils.randomAlphabetic(8);
		String email = RandomStringUtils.randomAlphabetic(8);
		pageAboutYourSelf.sendFirstName(firstName);
		pageAboutYourSelf.sendLastName(lastName);
		pageAboutYourSelf.sendEmail(email + "@gmail.com");
		pageAboutYourSelf.clickBirthMonth();
		pageAboutYourSelf.selectBirthMonth();
		pageAboutYourSelf.clickBirthDay();
		pageAboutYourSelf.selectBirthDay();
		pageAboutYourSelf.clickBirthYear();
		pageAboutYourSelf.selectBirthYear();
		pageAboutYourSelf.clickSearch();
		pageAboutYourSelf.selectSearch();
		pageAboutYourSelf.clickNextLocation();
	}

	@Step("#diligenciar formulario de address")
	public void diligenciarAddress() throws InterruptedException {
		pageAddress.clickNextDevices();
	}

	@Step("#actor diligencia formulario de device")
	public void diligenciarDevices() throws InterruptedException {
		pageDevices.clickLastStep();
	}

	@Step("#actor diligencia formulario de lastStep")
	public void diligenciarLastStep() throws InterruptedException {
		pageLastStep.sendPassword("PruebaSophos2021*");
		pageLastStep.sendConfirmPassword("PruebaSophos2021*");
		pageLastStep.clickTermOfUse();
		pageLastStep.clickPrivacySetting();
		pageLastStep.clickComplete();
	}

	@Step("#actor valida mensaje de registro")
	public void validarMensajeRegistro() throws InterruptedException {
		String msj = "First, please check your email inbox";
		Assert.assertEquals(msj, pageValidation.getTextWelcome());
	}

}
