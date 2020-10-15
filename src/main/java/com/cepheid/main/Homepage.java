package com.cepheid.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	

	private WebDriver driver;

	@FindBy(css = "a[href*='premium']")
	private WebElement premium;
	
	//@FindBy( = "a[href*='Hjälp']")
	//private WebElement hjalp;
	@FindAll(@FindBy(how = How.LINK_TEXT, using ="Hjälp"))
      private WebElement hjalp;
	
	//@FindBy(css = "a[href*='Ladda ned']")
	//private WebElement laddaned;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//a[contains(text(),'Ladda ned')]"))
    private WebElement  laddaned;

	@FindAll(@FindBy(how = How.XPATH, using = "//a[contains(text(),'Registrera dig')]"))
    private WebElement register;
	
	@FindAll(@FindBy(how = How.XPATH, using ="//a[contains(text(),'Logga in')]"))
	private WebElement loggain;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public Homepage clickpremium() {
		this.premium.click();
			return PageFactory.initElements(driver, Homepage.class);
			}
	public Homepage clickhjalp() {
	this.hjalp.click();
		return PageFactory.initElements(driver, Homepage.class);
	}
	
	public Homepage clickladdaned() {
		this.laddaned.click();
			return PageFactory.initElements(driver, Homepage.class);
		}
	
public Homepage clickregister() {
		this.register.click();
			return PageFactory.initElements(driver, Homepage.class);
		}
	
	
public Homepage clickloggain() {
	this.loggain.click();
		return PageFactory.initElements(driver, Homepage.class);
	}	
	
	



}

