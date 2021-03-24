package practica.sophos.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import practica.sophos.steps.UsuarioWeb;

public class DefinicionesDePasos {

	@Steps(shared = true)

	UsuarioWeb usuario;

	@Given("^Que Osmar entra al sitio web de Utest$")
	public void ingresa_a_sitio_web_Utest() {
		usuario.ingresarUtest();
	}

	@When("^Osmar ingresa a la opción join in y diligencia formulario$")
	public void diligencioFormularioUtest() throws InterruptedException
	{
		usuario.seleccionarJoinToday();
		usuario.diligenciarAboutYourSelf();
		usuario.diligenciarAddress();
		usuario.diligenciarDevices();
		usuario.diligenciarLastStep();
	}

	@Then("Osmar deberia poder validar mensaje de registro$")
	public void deberia_ver_mensaje_registro() throws InterruptedException {
		usuario.validarMensajeRegistro();
	}


}
