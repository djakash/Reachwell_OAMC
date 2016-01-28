package Pageobject_region;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    
    /////////// Control panel and Masters //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(xpath="//li[@id='Masters']")
	 WebElement MastButt;
	////////////////////////////////////////////////
	
	//region click
    @FindBy(linkText="Region")
    WebElement clk_region;
	////////////////////////////////////////////////
    
    //create region click
    @FindBy(xpath="//*[@id='RegionTableContainer']/div/div[3]/div[2]/span[3]/span[2]")
    WebElement create_region;
  
    //enter region name
    @FindBy(xpath="//*[@id='RegionName']")
     WebElement enter_region;
    
  //enter region_head name
    @FindBy(xpath="//*[@id='RegionHead']")
     WebElement enter_region_head;
    
    
    //enter region descrip
    @FindBy(xpath="//*[@id='Description']")
    WebElement enter_desp;
    
    //click save Country
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_region;
    
    
    
    //blank region message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same region name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different region name edit succesfull //*[@id='RegionTableContainer']/div/table/tbody/tr[1]/td[2]
	@FindBy(xpath="//*[@id='RegionTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click region
	public void click_region()
	{
		clk_region.click();
		
	}
	
	//click on create region
	public void create_region()
	{
		create_region.click();
	}
	
	//enter region name from Excel sheet
	public void enterregionname(String value)
	{
		enter_region.sendKeys(value);
	}
	
	//click on enter region-head
		public void create_region_head(String region_head)
		{
			enter_region_head.click();
			//enter_region_head.sendKeys(region_head);
			//browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			browser.findElement(By.xpath("//*[@id='RegionHead']")).sendKeys(region_head);
	        
	        WebDriverWait wait3 = new WebDriverWait(browser,50);
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/ul/li[3]/a")));
	     
	        WebElement parent=browser.findElement(By.xpath("html/body/ul/li[3]/a"));
	        
	        Actions actions=new Actions(browser);
	        actions.moveToElement(parent).build().perform();
	        parent.click();
		}
	

	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_region.click();
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
	
	public void Commonprocessregion(String UN,String PW,String region_name,String region_head,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_region();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_region();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterregionname(region_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_region_head(region_head);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
}
