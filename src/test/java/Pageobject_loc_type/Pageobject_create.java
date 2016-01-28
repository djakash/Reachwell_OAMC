package Pageobject_loc_type;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    
    /////////// Control panel and location //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(linkText="Location")
	 WebElement location;
	////////////////////////////////////////////////
	
	//loc_type click
    @FindBy(linkText="Location Type")
    WebElement clk_loc_type;
	////////////////////////////////////////////////
    
    //create loc_type click
    @FindBy(xpath="//*[@id='LocationTypeTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_loc_type;
  
    //enter loc_type name
    @FindBy(xpath="//*[@id='LocationType']")
     WebElement enter_loc_type;
   
    //enter loc_type descrip //*[@id='Description']
    @FindBy(xpath="//*[@id='LocationType']")
    WebElement enter_desp;
    
    //click save loc_type
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_grade;
    
    //blank loc_type message
	@FindBy(xpath="//label[@class='error']")
	WebElement Invalid_test_blnk;
	
	//same loc_type name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different grade name edit succesfull 
	@FindBy(xpath="//*[@id='LocationTypeTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click location
		public void Click_Location()
		{
			location.click();
			
		}
		
		// method to click loc_type
		public void click_loc_type()
		{
			clk_loc_type.click();
			
		}
	
	//click on create loc_type
	public void create_loc_type()
	{
		create_loc_type.click();
	}
	
	//enter loc_type name from Excel sheet
	public void enterloc_typename(String loc_type)
	{
		enter_loc_type.click();
		enter_loc_type.sendKeys(loc_type);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_grade.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank loc_type name
	public String Invalid_loctype_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}

	//method for error text with same loc_type name
		public String Invalid_loctypename_test()
		{
			return msg_Invalid_result.getText();
		}
	
			
	//method new loc_type name entered
	public String Valid_loctype_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_loc_type(String UN,String PW,String loc_type,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Location();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_loc_type();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_loc_type();
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*enterloc_typename(loc_type);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		WebDriverWait wait = new WebDriverWait(browser, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LocationType']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='LocationType']")));
		enterdescrip(desp);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click_save();
	}
}
