package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.components.Base;

public class SearchProvidaPage extends Base {

	//Se agrego el constructor
	public SearchProvidaPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Localizadores
	By configAvanzada = By.id("details-button");
	By procedLink = By.id("proceed-link");
	By userName = By.id("UserIdInput");
	By password = By.id("pwdtxt");
	By passwordTwo = By.id("PASSWORD");
	By domain = By.id("DOMAIN");
	By login = By.id("SignInButtonText");
	
	
	
	
	public void loginUsserPass() {
		click(configAvanzada);
		click(procedLink);
		type("AguilarHernandezG", userName);
		click(password);
		type("arb7ebpAng", passwordTwo);
		type("ALICOCORP", domain);
		click(login);
	}
	

}
