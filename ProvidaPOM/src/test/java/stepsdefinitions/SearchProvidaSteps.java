package stepsdefinitions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pageobjects.SearchProvidaPage;

public class SearchProvidaSteps {
	
	private WebDriver driver;
	
	//Se crea un objeto para utilizar los metodos de la clase SearchProvidaPage
	SearchProvidaPage searchProvidaPage;

	@Before
	public void setUp() throws Exception {
		//Ingresar al explorador de chrome
		searchProvidaPage = new SearchProvidaPage(driver);
		driver = searchProvidaPage.chromeDriverConnection();
		
		//Ingresar a la página
		searchProvidaPage.url("https://ssologin-qa.metlife.com/siteminderagent/forms/ADms19/login.fcc?TYPE=167772161&REALMOID=06-000af0e3-14a2-1ca6-8d18-676bac18f041&GUID=0&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=$SM$wXppiWyb83Qc33OagUJ69JumV2uy0q327G43wN3zU14JEbOT6t%2fPdBCCJjXOoodw&TARGET=$SM$https%3a%2f%2fqa%2eprovidamx%2emetlife%2ecom%2fProvidaWeb%2f");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
	}

	@Test
	public void test() {
		searchProvidaPage.loginUsserPass();
	}

}
