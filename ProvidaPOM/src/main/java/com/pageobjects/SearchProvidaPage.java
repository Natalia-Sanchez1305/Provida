package com.pageobjects;

import java.io.IOException;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.components.Base;
import com.components.ExcelDataProvider;

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
		}
			}



