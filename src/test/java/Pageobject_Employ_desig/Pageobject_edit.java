package Pageobject_Employ_desig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject_edit {
	
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
	

  //Designation click
    @FindBy(linkText="Designation")
    WebElement clk_desig;
	////////////////////////////////////////////////
    
//click on edit desig
@FindBy(xpath="//*[@id='DesignationTableContainer']/div/table/tbody/tr[1]/td[7]/a/div")
WebElement clk_edit_desig;

//enter desig name
@FindBy(xpath="//*[@id='DesignationName']")
 WebElement enter_desig;

//enter desig code
@FindBy(xpath="//*[@id='DesignationCode']")
 WebElement enter_desig_code;


//enter desig descrip
@FindBy(xpath="//*[@id='DesignationDescription']")
WebElement enter_desp;

//click save desig
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_desig;

//blank desig message
@FindBy(xpath="//label[@class='error']")
WebElement Invalid_test_blnk;

//same desig name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;

//with different desig name edit succesfull 
@FindBy(xpath="//*[@id='DesignationTableContainer']/div/table/tbody/tr[1]/td[2]")
WebElement msg_Valid_result;

public Pageobject_edit(WebDriver Dbrowser)
{
this.browser=Dbrowser;
PageFactory.initElements(browser, this);
}

public void Click_CP()
{
controlbutt.click();

}

//method to click employee
		public void Click_Employee()
		{ 
			employbutt.click();
			
		}
	
	// method to click desig
	public void click_desig()
	{
		clk_desig.click();
		
	}

//////////////////////////////////////////////////////////////////

public void clk_edit_desig()
{
	clk_edit_desig.click();
}
//////////////////////////////////////////////////////////////////

//enter desig name from Excel sheet
	public void enterdesigname(String desig_name)
	{
		enter_desig.clear();
		enter_desig.sendKeys(desig_name);
	}
	
	//click on enter desig_code
		public void enter_desig_code(String desig_code)
		{	
			enter_desig_code.clear();
			enter_desig_code.sendKeys(desig_code);
	  
		}
	

	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.clear();
		enter_desp.sendKeys(value1);
	}
	
	
	//click save button
	public void click_save()
	{
		click_save_desig.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//method for blank desig name
	public String Invalid_designame_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}

	//method for blank desig code
	public String Invalid_desigcode_test_blnk()
	{
		return Invalid_test_blnk.getText();
	}
	
	//method for error text with same desig name
		public String Invalid_designame_test()
		{
			return msg_Invalid_result.getText();
		}
	
		//method for error text with same desig code
				public String Invalid_desigcode_test()
				{
					return msg_Invalid_result.getText();
				}	
	//method new Country name entered
	public String Valid_region_test()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}
	 
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_employ_desig_edit(String UN,String PW,String desig_name,String desig_code,String desp)
	{
		UNtext.clear();
      UNtext.sendKeys(UN);
      PassTf.clear();
      PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_desig();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_desig();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdesigname(desig_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_desig_code(desig_code);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	

}
