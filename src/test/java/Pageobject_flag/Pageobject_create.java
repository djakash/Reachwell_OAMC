package Pageobject_flag;

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
	
	//flag click
    @FindBy(linkText="Flag")
    WebElement clk_flag;
	////////////////////////////////////////////////
    
    //create flag click
    @FindBy(xpath="//*[@id='FlagTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_flag;
  
    //enter flag_for name
    @FindBy(xpath="//*[@id='FlagFor']")
     WebElement sel_flag_for;
    
  
    //enter flag name
    @FindBy(xpath="//*[@id='FlagName']")
     WebElement enter_flag;
    

    
    
    //enter flag descrip
    @FindBy(xpath="//*[@id='Description']")
    WebElement enter_desp;
    
    //click save flag
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_flag;
    
    
    
    //blank flag message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same flag name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different region name edit succesfull 
	@FindBy(xpath="//*[@id='FlagTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click flag
	public void click_flag()
	{
		clk_flag.click();	
	}
	
	//click on create flag
	public void create_flag()
	{
		create_flag.click();
	}
	
	//enter flag name from Excel sheet
	public void enterflagname(String value)
	{
		enter_flag.sendKeys(value);
	}
	
	//click on enter region-head
		public void sel_flag_for(String flag_for)
		{
			sel_flag_for.click();
			//enter_region_head.sendKeys(region_head);
			//browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			browser.findElement(By.xpath("//*[@id='FlagFor']")).sendKeys(flag_for);
	        
	        WebDriverWait wait3 = new WebDriverWait(browser,50);
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div/form/fieldset/div[1]/div/select/option[3]")));
	     
	        WebElement parent=browser.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div/form/fieldset/div[1]/div/select/option[3]"));
	        
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
		click_save_flag.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank flag name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same flag name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new flag name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocessflag(String UN,String PW,String flag_name,String flag_for,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_flag();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_flag();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sel_flag_for(flag_for);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterflagname(flag_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
}
