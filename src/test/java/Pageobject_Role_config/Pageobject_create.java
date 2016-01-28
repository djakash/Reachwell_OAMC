package Pageobject_Role_config;
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
    @FindBy(linkText="Roles")
	 WebElement Rolesbutt;
	////////////////////////////////////////////////
	
  //configure Role click
    @FindBy(linkText="Configure Role")
    WebElement clk_config_Role;
	////////////////////////////////////////////////
    
    //create configure Role  click
    @FindBy(xpath="//*[@id='WFRoleConfigTableContainer']/div/div[3]/div[2]/span[3]/span[2]")
    WebElement create_config_Role;
  
    //enter role name
    @FindBy(xpath="//*[@id='ParentWFRole']")
     WebElement enter_role;
    
    //enter role descrip
    @FindBy(xpath="//*[@id='mWF_ConfigPROP_0__Description']")
    WebElement enter_desp;
  
    //enter stakeholder
    @FindBy(xpath="//*[@id='StakeHolderSearchValue']")
    WebElement enter_stakeholder;
    
    //stakeholder search
    @FindBy(xpath="//*[@id='btnSearchStakeHolder']")
    WebElement stake_search;
    
    //enter branch
    @FindBy(xpath="//*[@id='BranchSearchValue']")
    WebElement enter_branch;
    
    //branch search
    @FindBy(xpath="//*[@id='btnSearchBranch']")
    WebElement branch_search;
  
  //enter department
    @FindBy(xpath="//*[@id='DepartmentSearchValue']")
    WebElement enter_depart;
    
    //depart search
    @FindBy(xpath="//*[@id='btnSearchDepartment']")
    WebElement depart_search;
    
    //click save confi_role
    @FindBy(xpath="//button[@id='LoadRecordsButton']")
    WebElement click_save_config_role;
    
    //blank error message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//first text box text
	@FindBy(xpath="//*[@id='WFRoleConfigTableContainer']/div/table/tbody/tr[1]/td[1]")
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
	
	// method to click Roles
	public void Click_Roles()
	{ 
		Rolesbutt.click();		
	}
	
	// method to click config_role
	public void click_config_role()
	{
		clk_config_Role.click();
		
	}
	
	//click on create config_Role
	public void create_config_Role()
	{
		create_config_Role.click();
	}
	
	//enter role name from Excel sheet
	public void enterrolename(String value)
	{
		enter_role.sendKeys(value);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.sendKeys(value1);
	}
	
	//enter stakeholder
	public void enterstakeholder(String value1)
	{
		enter_stakeholder.sendKeys(value1);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		stake_search.click();
		browser.findElement(By.xpath("//*[@id='StakeHolderSearchResultsms2side__sx']/option")).click();
		browser.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/form/fieldset/div[3]/div/table/tbody/tr[2]/td/div/div[2]/p[2]")).click();
	}
		
	//enter branch
	public void enterbranch(String value1)
	{
		enter_branch.sendKeys(value1);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		branch_search.click();
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(int i=1;i<=2;i++)
		{
			browser.findElement(By.xpath("//*[@id='BranchSearchResultsms2side__sx']/option[1]")).click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			browser.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/form/fieldset/div[4]/div/table/tbody/tr[2]/td/div/div[2]/p[1]")).click();
		}
	}		

   //enter department
	public void enterdepartment(String value1)
	{
		enter_depart.sendKeys(value1);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		depart_search.click();
		for(int i=1;i<=3;i++)
		{
			browser.findElement(By.xpath("//*[@id='DepartmentSearchResultsms2side__sx']/option[1]")).click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			browser.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/form/fieldset/div[5]/div/table/tbody/tr[2]/td/div/div[2]/p[1]")).click();
		}         
	}		
///////////////////////////////////////////////////////////////////////////	
	//leave blank space for role and enter the rest
		public String enter_blnk_role(String stakeholder,String department,String branch)
		{
			enterstakeholder(stakeholder);
			enterbranch(branch);
			enterdepartment(department);
			click_save();
			return msg_Invalid_result_blank.getText();
		}
	
	
	
	//leave blank space for branch and enter the rest
	public String enter_blnk_brnch(String stakeholder,String department)
	{
		enterstakeholder(stakeholder);
		enterdepartment(department);
		click_save();
		return msg_Invalid_result_blank.getText();
	}

	//leave blank space for stakeholder and enter the rest
	public String enter_blnk_stakeholder(String branch,String department)
	{
		enterbranch(branch);
		enterdepartment(department);
		click_save();
		return msg_Invalid_result_blank.getText();
	}
	
	//leave blank space for depart and enter the rest
	public String enter_blnk_depart(String stakeholder,String branch)
	{
		enterbranch(branch);
		enterstakeholder(stakeholder);
		click_save();
		return msg_Invalid_result_blank.getText();
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	//click save button
	public void click_save()
	{
		click_save_config_role.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank certi name
	public String get_error_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method new certi name entered
	public String getvalid_config_role_Result(String stakeholder,String department,String branch)
	{
		enterstakeholder(stakeholder);
		enterbranch(branch);
		enterdepartment(department);
		click_save();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//browser.navigate().refresh();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return msg_Valid_result.getText();
		
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_config_role(String UN,String PW,String role_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Roles();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_config_role();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_config_Role();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterrolename(role_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
