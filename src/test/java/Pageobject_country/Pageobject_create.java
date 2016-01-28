package Pageobject_country;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pageobject_create {

	public WebDriver browser;
	
	//*************************************************
	//Strorage for Elements
	///////////////for login///////////////////////
	@FindBy(xpath="//input[@id='username']")
	 WebElement UNtext;
    
    @FindBy(xpath="//input[@id='password']")
    WebElement PassTf;
	////////////////////////////////////////////////
    
    /////////// Control panel and Masters //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(xpath="//li[@id='Masters']")
	 WebElement MastButt;
	////////////////////////////////////////////////
	
	//Country click
    @FindBy(linkText="Country")
    WebElement clk_Country;
	////////////////////////////////////////////////
    
    //create Country click
    @FindBy(xpath="//*[@id='CountryTableContainer']/div/div[3]/div[2]/span[3]/span[2]")
    WebElement create_Country;
  
    //enter Country name
    @FindBy(xpath="//*[@id='CountryName']")
     WebElement enter_Country;
    
    //enter Country descrip
    @FindBy(xpath="//*[@id='Description']")
    WebElement enter_desp;
    
    //click save Country
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_Country;
    
    
    
    //blank Country message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same Country name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different Country name edit succesfull 
	@FindBy(xpath="//*[@id='CountryTableContainer']/div/table/tbody/tr[1]/td[2]")
	WebElement msg_Valid_result;
	//html body div#wrap div#header.topborder.relative div.floatR.extra_gap div.floatL div span#username.bold a.proper
	
	//***************************************
	
	//Action on those Elements through different methods
	
	//constructor to initialize browser
	
	public Pageobject_create(WebDriver Dbrowser)
	{
		this.browser=Dbrowser;
		PageFactory.initElements(browser, this);
				
	}
	
	//methods for different actions
	/// method to click CP
	public void Click_CP()
	{
		controlbutt.click();
		
	}
	
	// method to click Masters
	public void Click_Masters()
	{
		MastButt.click();
		
	}
	
	// method to click Country
	public void click_Country()
	{
		clk_Country.click();
		
	}
	
	//click on create Country
	public void create_Country()
	{
		create_Country.click();
	}
	
	//enter Country name from Excel sheet
	public void enterCountryname(String value)
	{
		enter_Country.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_Country.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank Country name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same Country name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new Country name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void CommonprocessCountry(String UN,String PW,String country_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_Country();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_Country();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterCountryname(country_name);
		enterdescrip(desp);
		click_save();
	}
}
