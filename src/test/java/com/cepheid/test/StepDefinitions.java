package com.cepheid.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cepheid.main.HjalpPage;
import com.cepheid.main.Homepage;
import com.cepheid.main.Registerpage;
import com.cepheid.util.WebDriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions extends WebDriverManager {

	public WebDriverManager driverManager;

	public WebDriver driver;
	Homepage homepage;
	HjalpPage hjalpPage;
	Registerpage registerpage;
	
	public void launchTheBrowser(String chrome, String string) {
		
		driverManager = new WebDriverManager();
		driver = driverManager.setUp(System.getProperty("browser", "chrome"));
		driver.get("https://www.spotify.com/se/");
		driver.manage().window().maximize();
		
	}
	
//user in home page click on premium ,help .
 @Given("^user is in spotify Homepage$")
    public void user_is_in_spotify_homepage() throws Throwable {

    launchTheBrowser(BrowserType.CHROME,"https://www.spotify.com/se/");
        homepage=new Homepage(driver);
        System.out.println("user is in driver home page");
       
	}
     
    
    @When("user click on premium")
    public void user_click_on_premium() {
        homepage.clickpremium();
    }

    @Then("user navigate to the premium checkout page")
    public void user_navigate_to_the_premium_checkout_page() {
  driver.navigate().back();
    }

    @Then("user navigate to spotify Homepage")
    public void user_navigate_to_spotify_Homepage() {
       homepage.clickhjalp();
    }

    @Then("when user clicks on Help button")
    public void when_user_clicks_on_Help_button() {
        System.out.println("user is support spotify page");
    }

    @Then("user navigate to support.spotify page")
    public void user_navigate_to_support_spotify_page() {
        System.out.println("user find in search button");
    }

    @Then("user give the search keyword in search space")
    public void user_give_the_search_keyword_in_search_space() {
   hjalpPage=new HjalpPage(driver);
    	hjalpPage.search().sendKeys("kan inte loggin"); 
    
    }

    @Then("navigate back to spotify Homepage")
    public void navigate_back_to_spotify_Homepage() {
        driver.navigate().back();
    }
    //navigating to lading page

    @Then("user click on ladda ned")
    public void user_click_on_ladda_ned() {
        homepage.clickladdaned();
    }

    @Then("user navigate to download windows page")
    public void user_navigate_to_download_windows_page() {
        System.out.println("user is in loading page");
    }

    @Then("user navigate back to spotify Homepage")
    public void user_navigate_back_to_spotify_Homepage() {
        driver.navigate().back();
    }
//naviagte to registerpage to register in spoyify//
    @Then("user click on Register dig")
    public void user_click_on_Register_dig() {
    	homepage.clickregister();
       System.out.println("user fill the register page");
    }

    @Then("user navigate registerpage")
    public void user_navigate_registerpage() {
        System.out.println("user is in register page");
    }

    @When("user fills the e postaddress")
    public void user_fills_the_e_postaddress() {
       registerpage=new Registerpage(driver);
       registerpage.Email("sair123@gmail.com");
    }

    @When("user re fills the e postaddress")
    public void user_re_fills_the_e_postaddress() {
       registerpage.fillConfirm("sair123@gmail.com");
    }

    @When("user fills the password")
    public void user_fills_the_password() {
    	registerpage.fillPassword("keerthi123");
        
    }

    @When("user fills the name")
    public void user_fills_the_name() {
        registerpage.dispname("sailu");
    }

    @When("user fills day")
    public void user_fills_day() {
       registerpage.fillyear("1986"); 
    }

    @When("user fills month")
    public void user_fills_month() {
       registerpage.selectmonth("November");
    }

    @When("user fills year")
    public void user_fills_year() {
        registerpage.fillday("01");
    }

    @When("user click the radio button kvinna")
    public void user_click_the_radio_button_kvinna() {
        registerpage.clickkvinna();
    }

    @When("user click on option")
    public void user_click_on_option() {
        registerpage.clickoption();
    }

    @Then("user click on registeradig")
    public void user_click_on_registeradig() {
        registerpage.clickregister();
    }

    @Then("user navigate to the spotify homepage")
    public void user_navigate_to_the_spotify_homepage() {
        driver.navigate().back();
    }




        }
	
	