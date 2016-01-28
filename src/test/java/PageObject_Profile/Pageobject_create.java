package PageObject_Profile;
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
    
    /////////// Control panel and profile //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(linkText="Profiles")
	 WebElement clk_profiles;
	////////////////////////////////////////////////
	
	//profile click
    @FindBy(linkText="Profile")
    WebElement clk_profile;
	////////////////////////////////////////////////
    
    //create profile click
    @FindBy(xpath="//*[@id='ProfileTableContainer']/div/div[3]/div[2]/span[3]/span[2]")
    WebElement create_profile;
  
    //enter profile name
    @FindBy(xpath="//*[@id='ProfileName']")
     WebElement enter_profile;
    
    //enter profile descrip
    @FindBy(xpath="//*[@id='ProfileDescription']")
    WebElement enter_desp;
    
  //click save profile
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_profile;
    
    //blank profile message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same profile name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different zone name edit succesfull 
	@FindBy(xpath="//*[@id='ProfileTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click profiles
	public void Click_Profiles()
	{
		clk_profiles.click();
		
	}
	
	// method to click profile
	public void click_profile()
	{
		clk_profile.click();
		
	}
	
	//click create profile
	public void create_profile()
	{
		create_profile.click();
	}

	//enter profile name from Excel sheet
	public void enterprofilename(String value)
	{
		enter_profile.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_profile.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank profile name
	public String getInvalidprofileResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same profile name
		public String getInvalidprofileResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new profile name entered
	public String getvalidprofileResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocessprofile(String UN,String PW,String pro_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Profiles();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_profile();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_profile();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterprofilename(pro_name);
		enterdescrip(desp);
		click_save();
	}
}
