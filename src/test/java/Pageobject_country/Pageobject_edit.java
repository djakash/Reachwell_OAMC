package Pageobject_country;

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
	@FindBy(xpath="//li[@id='Masters']")
	 WebElement MastButt;
	

	//Country click
    @FindBy(linkText="Country")
    WebElement clk_country;
	////////////////////////////////////////////////
    
//click on edit Country
@FindBy(xpath="//*[@id='CountryTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_country;

//enter Country name
@FindBy(xpath="//*[@id='CountryName']")
 WebElement enter_country;

//enter Country descrip
@FindBy(xpath="//*[@id='Description']")
WebElement enter_desp;


//click save Country
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_country;

//blank Country message
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result_blank;
	
	//same Country name error msg
	@FindBy(xpath="//label[@class='error']")
	WebElement msg_Invalid_result;
	
	//with different Country name edit succesfull 
		@FindBy(xpath="//*[@id='CountryTableContainer']/div/table/tbody/tr[1]/td[2]")
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

// method to click Masters
public void Click_Masters()
{
MastButt.click();

}

//method to click country
	public void click_country()
	{
		clk_country.click();
		
	}

//////////////////////////////////////////////////////////////////

public void clk_edit_country()
{
	clk_edit_country.click();
}
//////////////////////////////////////////////////////////////////

//enter zone name from Excel sheet
	public void entercountryname(String value)
	{
		enter_country.clear();
		enter_country.sendKeys(value);
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
	click_save_country.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank country name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same country name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new country name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocesscountry(String UN,String PW,String TC_ID, String country_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_country();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_country();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entercountryname(country_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterdescrip(desp);
		click_save();
	}
	
	

}
