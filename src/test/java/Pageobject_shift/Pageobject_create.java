package Pageobject_shift;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	//shift click
    @FindBy(linkText="Shift")
    WebElement clk_shift;
	////////////////////////////////////////////////
    
    //create shift click
    @FindBy(xpath="//*[@id='ShiftTableContainer']/div/div[3]/div[2]/span[3]/span[2]")
    WebElement create_shift;
  
    //enter shift name
    @FindBy(xpath="//*[@id='ShiftName']")
     WebElement enter_shift;
    
    ///////////////// from minutes enter////////////////////////////
    //enter shift from_hour
    @FindBy(xpath="html/body/div[5]/table/tbody/tr[1]/td[1]/a")
    WebElement enter_from_hr;
    
    //enter shift from_minutes
    @FindBy(xpath="html/body/div[5]/table/tbody/tr[1]/td[3]/a")
    WebElement enter_from_min;
    
    ///////////////// to minutes enter////////////////////////////
    //enter shift to_hour
    @FindBy(xpath="html/body/div[5]/table/tbody/tr[1]/td[1]/a")
    WebElement enter_to_hr;
    
    //enter shift to_minutes
    @FindBy(xpath="html/body/div[5]/table/tbody/tr[1]/td[3]/a")
    WebElement enter_to_min;
    
    //click save shift
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_shift;
    
    //blank shift message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same shift name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	//with different shift name edit succesfull 
	@FindBy(xpath="//*[@id='ShiftTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click shift
	public void click_shift()
	{
		clk_shift.click();
		
	}
	
	//click on create shift
	public void create_shift()
	{
		create_shift.click();
	}
	
	//enter shift name from Excel sheet
	public void entershiftname(String value)
	{
		enter_shift.sendKeys(value);
	}
	
	//enter enter_from_hr
	public void enter_from_hr()
	{
		browser.findElement(By.xpath("//*[@id='FromTime']")).click();
		for(int i=0;i<=2;i++)
		{
		browser.findElement(By.xpath("html/body/div[5]/table/tbody/tr[3]/td[1]/a")).click();
		}
		//enter_from_hr.sendKeys();
	}
	
	//enter enter_from_min
		public void enter_from_min()
		{
			//browser.findElement(By.xpath("//*[@id='FromTime']")).click();
			for(int i=0;i<1;i++)
			{
				browser.findElement(By.xpath("html/body/div[5]/table/tbody/tr[1]/td[3]/a")).click();
			}
			//enter_from_min.sendKeys(min);
		}
	
		public void enter_to_hr()
		{
			
			browser.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div")).click();
			browser.findElement(By.xpath("//*[@id='ToTime']")).click();
			
			for(int i=0;i<=5;i++)
			{
			browser.findElement(By.xpath("html/body/div[5]/table/tbody/tr[1]/td[1]/a")).click();
			}
		}
		
		//enter enter_to_min
			public void enter_to_min()
			{
				//browser.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div/form/fieldset/div[3]/div/input")).click();
				for(int i=0;i<1;i++)
				{
					browser.findElement(By.xpath("html/body/div[5]/table/tbody/tr[1]/td[3]/a")).click();
				}
			}
	
	//click save button
	public void click_save()
	{
		click_save_shift.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank shift name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same shift name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new shift name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_shift(String UN,String PW,String shift_name)//,CharSequence[] hr,CharSequence[] min)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_shift();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_shift();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entershiftname(shift_name);
		enter_from_hr();
		enter_from_min();
		enter_to_hr();
		enter_to_min();
		
		
		
		click_save();
	}
}
