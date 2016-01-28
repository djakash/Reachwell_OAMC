package Pageobject_loc_type;

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
    
//click on edit loc_type
@FindBy(xpath="//*[@id='LocationTypeTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_loc_type;

//enter loc_type name
@FindBy(xpath="//*[@id='LocationType']")
 WebElement enter_loc_type;

//enter loc_type descrip 
@FindBy(xpath="//*[@id='Description']")
WebElement enter_desp;

//click save loc_type
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_loc_type;

//blank loc_type message
@FindBy(xpath="//label[@class='error']")
WebElement Invalid_test_blnk;

//same loc_type name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;



//with different grade name edit succesfull 
@FindBy(xpath="//*[@id='LocationTypeTableContainer']/div/table/tbody/tr[1]/td[2]")
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

//method to click location
		public void Click_Location()
		{
			location.click();
			
		}
		
		// method to click loc_type
		public void click_loc_type()
		{
			clk_loc_type.click();
			
		}
	

//////////////////////////////////////////////////////////////////

public void clk_edit_loc_type()
{
	clk_edit_loc_type.click();
}
//////////////////////////////////////////////////////////////////

//enter loc_type name from Excel sheet
	public void enterloc_typename(String loc_type)
	{
		//enter_loc_type.click();
		//enter_loc_type.clear();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_loc_type.sendKeys(loc_type);
	}
	
	//enter descpription
	public void enterdescrip(String value1)
	{
		enter_desp.clear();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_desp.sendKeys(value1);
	}

	
	//click save button
		public void click_save()
		{
			click_save_loc_type.click();
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
		
		public void Commonprocess_loc_type_edit(String UN,String PW,String loc_type,String desp)
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
			clk_edit_loc_type();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			enterloc_typename(loc_type);
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			/*WebDriverWait wait = new WebDriverWait(browser, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='LocationType']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='LocationType']")));*/
			enterdescrip(desp);
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click_save();
		}

}
