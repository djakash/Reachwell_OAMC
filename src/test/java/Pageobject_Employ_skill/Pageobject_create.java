package Pageobject_Employ_skill;
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
	
	//SkillSet click
   @FindBy(linkText="SkillSet")
   WebElement clk_skill;
	////////////////////////////////////////////////
    
    //create SkillSet click
    @FindBy(xpath="//span[text()='Create SkillSet']")
    WebElement create_skill;
  
    //enter skill name
    @FindBy(xpath="//*[@id='Name']")
     WebElement enter_skill;
    
    //enter certi descrip
    @FindBy(xpath="//*[@id='Description']")
    WebElement enter_desp;
    
    //click save skill
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_skill;
    
    //blank skill message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same skill name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	//first text box text
	@FindBy(xpath="//*[@id='SkillSetTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	// method to click skill
	public void click_skill()
	{
		clk_skill.click();
		
	}
	
	//click on create skill
	public void create_skill()
	{
		create_skill.click();
	}
	
	//enter skill name from Excel sheet
	public void enterskillname(String value)
	{
		enter_skill.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_skill.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank skill name
	public String getInvalidskillResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same skill name
		public String getInvalidskillResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new skill name entered
	public String getvalidskillResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocessskill(String UN,String PW,String TC_ID, String skill_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_skill();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_skill();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterskillname(skill_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_save();
	}
}
