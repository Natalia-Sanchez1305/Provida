package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.pageobjects.SearchProvidaPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinitionsLogin {
	
	private WebDriver driver;
	
	//Se crea un objeto para utilizar los metodos de la clase SearchProvidaPage
	SearchProvidaPage searchProvidaPage;

	@Given("^I enter the chrome browser$")
	public void i_enter_the_chrome_browser() throws Throwable {
		searchProvidaPage = new SearchProvidaPage(driver);
		driver = searchProvidaPage.chromeDriverConnection();
		searchProvidaPage.url("https://ssologin-qa.metlife.com/siteminderagent/forms/ADms19/login.fcc?TYPE=167772161&REALMOID=06-000af0e3-14a2-1ca6-8d18-676bac18f041&GUID=0&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=$SM$wXppiWyb83Qc33OagUJ69JumV2uy0q327G43wN3zU14JEbOT6t%2fPdBCCJjXOoodw&TARGET=$SM$https%3a%2f%2fqa%2eprovidamx%2emetlife%2ecom%2fProvidaWeb%2f");
	    
	}

	@When("^Enter the page Provida with valid credentials$")
	public void enter_the_page_Provida_with_valid_credentials() throws Throwable {
		searchProvidaPage.loginUsserPass();
		driver.manage().window().maximize();
	}

	@Then("^Logout$")
	public void logout() throws Throwable {
	  
		driver.quit();
	}

	
	
}
