package Pageobject_Employ_grade;

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
	@FindBy(linkText="Employee")
	 WebElement employbutt;
	////////////////////////////////////////////////
	
	//Grade click
    @FindBy(linkText="Grade")
    WebElement clk_grade;
	////////////////////////////////////////////////
    
    //create Grade click
    @FindBy(xpath="//*[@id='GradeTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_grade;
  
    //enter grade name
    @FindBy(xpath="//*[@id='GradeName']")
     WebElement enter_grade;
    
  //enter grade code
    @FindBy(xpath="//*[@id='GradeCode']")
     WebElement enter_grade_code;
    
    
    //enter grade descrip
    @FindBy(xpath="//*[@id='GradeDescription']")
    WebElement enter_desp;
    
    //click save grade
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_grade;
    
    //blank grade message
	@FindBy(xpath="//label[@class='error']")
	WebElement Invalid_test_blnk;
	
	//same grade name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	
	
	//with different grade name edit succesfull 
	@FindBy(xpath="//*[@id='GradeTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click employee
		public void Click_Employee()
		{ 
			employbutt.click();
			
		}
	
	// method to click grade
	public void click_grade()
	{
		clk_grade.click();
		
	}
	
	//click on create grade
	public void create_grade()
	{
		create_grade.click();
	}
	
	//enter desig name from Excel sheet
	public void entergradename(String grade_name)
	{
		enter_grade.sendKeys(grade_name);
	}
	
	//click on enter desig_code
		public void enter_desig_code(String grade_code)
		{
			enter_grade_code.sendKeys(grade_code);
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
	
	//method for blank grade name
	public String Invalid_gradename_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}

	//method for blank grade code
	public String Invalid_gradecode_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}
	
	//method for error text with same grade name
		public String Invalid_gradename_test()
		{
			return msg_Invalid_result.getText();
		}
	
		//method for error text with same grade code
				public String Invalid_gradecode_test()
				{
					return msg_Invalid_result.getText();
				}	
	//method new Country name entered
	public String Valid_grade_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_employ_grade(String UN,String PW,String grade_name,String grade_code,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_grade();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_grade();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entergradename(grade_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_desig_code(grade_code);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
}
