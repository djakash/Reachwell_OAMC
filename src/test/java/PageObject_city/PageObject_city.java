package PageObject_city;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_city{
	
	
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
	
	//city click
    @FindBy(linkText="City")
    WebElement clk_city;
	////////////////////////////////////////////////
    
    //create city click
    @FindBy(xpath="//*[@id='CityTableContainer']/div/div[3]/div[2]/span[3]/span[2]")
    WebElement create_city;
  
    //enter city name
    @FindBy(xpath="//input[@id='CityName']")
     WebElement enter_city;
    
    //click save city
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_city;
    
    //blank city message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same city name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	
	@FindBy(xpath="//*[@id='CityTableContainer']/div/table/tbody/tr[1]/td[2]")
	WebElement msg_Valid_result;
	//html body div#wrap div#header.topborder.relative div.floatR.extra_gap div.floatL div span#username.bold a.proper
	
	//***************************************
	
	//Action on those Elements through different methods
	
	//constructor to initialize browser
	
	public PageObject_city(WebDriver Dbrowser)
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
	
	// method to click city
	public void click_city()
	{
		
		//browser.findElement(By.linkText("City")).click();
		clk_city.click();
		
	}
	
	//click on create city
	public void create_city()
	{
		create_city.click();
	}
	//enter curr name from Excel sheet
	public void entercityname(String value1)
	{
		enter_city.sendKeys(value1);
	}
	
	//click save button
	public void click_save()
	{
		click_save_city.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank city name
	public String getInvalidcurrResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same city name
		public String getInvalidcurrResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new curr name entered
	public String getvalidcurrResult()
	{
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocesscity(String UN,String PW, String city_name)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_city();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_city();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entercityname(city_name);
		click_save();
	}
}
