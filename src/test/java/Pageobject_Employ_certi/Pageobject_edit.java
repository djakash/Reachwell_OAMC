package Pageobject_Employ_certi;

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
	////////////////////////////////////////////////
	
	//certification click
  @FindBy(linkText="Certification")
  WebElement clk_certi;
	////////////////////////////////////////////////
    
//click on edit certi
@FindBy(xpath="//*[@id='CertificationTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_certi;

//enter certi name
@FindBy(xpath="//*[@id='Name']")
 WebElement enter_certi;

//enter certi descrip
@FindBy(xpath="//*[@id='Description']")
WebElement enter_desp;

//click save certi
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_certi;



//blank certi message
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result_blank;

//same certi name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;

//first text box text
@FindBy(xpath="//*[@id='CertificationTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	// method to click certi
	public void click_certi()
	{
		clk_certi.click();
		
	}

//////////////////////////////////////////////////////////////////

public void clk_edit_certi()
{
clk_edit_certi.click();
}
//////////////////////////////////////////////////////////////////

//enter certi name from Excel sheet
	public void entercertiname(String value)
	{
		enter_certi.clear();
		enter_certi.sendKeys(value);
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
	click_save_certi.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank certi name
	public String getInvalidcertiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same certi name
		public String getInvalidcertiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new certi name entered
	public String getvalidcertiResult()
	{
		//browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocesscerti(String UN,String PW,String TC_ID, String certi_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_certi();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_certi();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entercertiname(certi_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	
	

}
