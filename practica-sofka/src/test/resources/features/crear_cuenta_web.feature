@Cucumber
Feature: Crear una cuenta diligenciando formulario
  
  Esta feature se trata de crear una nueva cuenta en el sitio web de Utest

  @RegistraUsuarioUtest
  Scenario: Registrar usuario en Utest
    Given Que Osmar entra al sitio web de Utest
    When Osmar ingresa a la opción join in y diligencia formulario
    Then Osmar deberia poder validar mensaje de registro