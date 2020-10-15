package com.cepheid.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Registerpage {
private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement Email;

	@FindBy(id = "confirm")
	private WebElement Confirm;
	
	@FindBy(id = "password")
	private WebElement Password;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "displayname")
	private WebElement Displayname;

	@FindBy(id = "year")
	private WebElement Year;

	@FindBy(id = "month")
	private WebElement Month;

	@FindBy(id = "day")
	private WebElement Day;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//span[contains(text(),'Kvinna')]"))
    private WebElement Kvinna;

	@FindAll(@FindBy(how = How.XPATH, using = "//span[@class='Indicator-sc-11vkltc-0 hrjscC']"))
    private WebElement Option;

	@FindAll(@FindBy(how = How.XPATH, using = "//button[@class='Button-oyfj48-0 eEPJyH SignupButton___StyledButtonPrimary-cjcq5h-1 deUbNh']"))
    private WebElement Registeraradig;
	
	public Registerpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Email(String Email) {
		
		this.Email.sendKeys(Email);
	}
	
	
	public void fillConfirm(String confirm) {
	
		this.Confirm.sendKeys(confirm);
	}
	
	
	public void fillPassword(String password) {
		
		this.Password.sendKeys(password);
	}
	
	public void fillpassword(String password) {
		
		this.password.sendKeys(password);
	}
	
	public void dispname(String name) {
		
		this.Displayname.sendKeys(name);
	}
	
	public void fillyear(String year) {
		
		this.Year.sendKeys(year);
	}
	public void selectmonth(String month) {
		new Select(this.Month).selectByVisibleText(month);
	}
	
	public void fillday(String day) {
		
		this.Day.sendKeys(day);
}
	public Registerpage clickkvinna() {
		this.Kvinna.click();
			return PageFactory.initElements(driver, Registerpage.class);
		}
	public Registerpage clickoption() {
		this.Option.click();
			return PageFactory.initElements(driver, Registerpage.class);
		}
	public Registerpage clickregister() {
		this.Registeraradig.click();
			return PageFactory.initElements(driver, Registerpage.class);
		}
	
	
	
	
	




}
