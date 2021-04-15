package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.components.Base;



public class SearchProvidaPage extends Base {
	
	// Se agrego el constructor
		public SearchProvidaPage(WebDriver driver) {
			super(driver);
			

		}

		// Localizadores
		By configAvanzada = By.id("details-button");
		By procedLink = By.id("proceed-link");
		By userName = By.id("UserIdInput");
		By password = By.id("pwdtxt");
		By passwordTwo = By.id("PASSWORD");
		By domain = By.id("DOMAIN");
		By login = By.id("SignInButtonText");
		
		By btnGenerales = By.cssSelector("#root > div.container > div > div > div:nth-child(3) > div > div.card-footer.border-0.pb-4 > a");
		
		By btnConsultador = By.cssSelector("#root > div.container > div > div > div:nth-child(1) > div > div.card-footer.border-0.pb-4 > a");
		
		By txtPoliza = By.name("Poliza");
		By btnBuscar = By.cssSelector("#root > div.container > div > div > form > div:nth-child(5) > div:nth-child(1) > button");
		
		By lnkNumPoliza = By.cssSelector("#root > div.container > div > div.ml-table-container > div.table-responsive-sm > table > tbody > tr > td:nth-child(1) > a");
		
		By InfoGenral = By.cssSelector("#root > div.container > div.fixed-bottom.ml-table-container > div > table > tbody > tr > td:nth-child(1) > a");
		
		By DatosContacto = By.cssSelector("#root > div.container > div.fixed-bottom.ml-table-container > div > table > tbody > tr > td:nth-child(2) > a");
		
		By Coberturas = By.cssSelector("#root > div.container > div.fixed-bottom.ml-table-container > div > table > tbody > tr > td:nth-child(3) > a");
		
		By Beneficiarios = By.cssSelector("#root > div.container > div.fixed-bottom.ml-table-container > div > table > tbody > tr > td:nth-child(4) > a");
		
		By Servicios = By.cssSelector("#root > div.container > div.fixed-bottom.ml-table-container > div > table > tbody > tr > td:nth-child(5) > a");	
		
		By Agente = By.cssSelector("#root > div.container > div.fixed-bottom.ml-table-container > div > table > tbody > tr > td:nth-child(5) > a");
		
		
		//public void SearchProvida throws InterruptedException {
				//ExcelDataProvider datos = new ExcelDataProvider("./data/PROVIDA.xls");
				//for(int i = 0;i < datos.getNumRows();i++) {
					//datos.setRow(i);
				//}
				
		

			public void loginUsserPass() {
				// TODO Auto-generated method stub
				click(configAvanzada);
				click(procedLink);
				//type(datos.getParameter("USUARIO"), userName);
				type("AguilarHernandezG", userName);
				click(password);
				type("arb7ebpAng", passwordTwo);
				type("ALICOCORP", domain);
				click(login);
				
				//Screenshot.takeScreenshot(driver, "login");
			}
			
			public void MenuGenerales() {
				click(btnGenerales);
			}
			
			public void SubmenuConsultador() {
				click(btnConsultador);
			}
			
			public void typePoliza() {
				type("PVN456",txtPoliza);
			}
			
			public void BuscarPoliza() {
				click(btnBuscar);
			}
			
			public void lnkPoliza() {
				click(lnkNumPoliza);
			}
			
			public void InfoGeneral() {
				click(InfoGenral);
			}
			
			public void DatosContacto() {
				click(DatosContacto);
			}
			
			public void Coberturas() {
				click(Coberturas);
			}
			public void Beneficiarios() {
				click(Beneficiarios);
			}
			public void Servicios() {
				click(Servicios);
			}
			public void Agente() {
				click(Agente);
			}


}
