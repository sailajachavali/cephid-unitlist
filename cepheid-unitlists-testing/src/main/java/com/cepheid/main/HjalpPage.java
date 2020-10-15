package com.cepheid.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HjalpPage {
	

private WebDriver driver;
	
	public WebElement search() {
		WebElement search= driver.findElement(By.xpath("//input[@placeholder='Sök']"));
		 return search;
		
	}
	public HjalpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void send(String search) {
		this.search().sendKeys("search");
		
	}
}

