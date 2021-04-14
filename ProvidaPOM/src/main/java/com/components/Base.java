package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	//Se crea el objeto Webdriver y se importa la librería
	private WebDriver driver;
	
	//Se crea el constructor de la clase como objeto Webdriver
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	//Se crea el metodo para la conexcion con crhome
	public WebDriver chromeDriverConnection() {
		
		System.setProperty("webdriver.chrome.driver", "./dependencies/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	//Metodo para ingresar a la URL
	public void url (String URL) {
		driver.get(URL);
	}
	
	//Metodo para escribir texto
	public void type (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//Metodo para dar clic a un boton
	public void click (By locator) {
		driver.findElement(locator).click();
	}
	
    public void keyEnter(By locator){
        driver.findElement(locator).sendKeys(Keys.chord(Keys.ENTER));
    }

    public void keyTab(By locator){
        driver.findElement(locator).sendKeys(Keys.chord(Keys.TAB));
    }
       
			

}
