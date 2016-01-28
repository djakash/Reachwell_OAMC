package PageObject_city;

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
	
	//city click
    @FindBy(linkText="City")
    WebElement clk_city1;
	////////////////////////////////////////////////
    
//click on edit city
@FindBy(xpath="html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[5]/a/div")
WebElement clk_edit_city;

//enter city name
@FindBy(xpath="//input[@id='CityName']")
WebElement enter_city;

//enter city descrip
@FindBy(xpath="//input[@id='Description']")
WebElement enter_desp;

//click save city
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_city;

//blank city message
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result_blank;

//same city name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;

//with different city name edit succesfull 
@FindBy(xpath="//*[@id='CityTableContainer']/div/table/tbody/tr[1]/td[2]")
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

// method to click criticality
public void click_city()
{
	//browser.findElement(By.linkText("City")).click();	
    clk_city1.click();

}

//////////////////////////////////////////////////////////////////

public void clk_edit_city()
{
clk_edit_city.click();
}
//////////////////////////////////////////////////////////////////

//enter criti name from Excel sheet
	public void entercityname(String value)
	{
		enter_city.clear();
		enter_city.sendKeys(value);
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
	click_save_city.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank criticality name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same criticality name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
	
	//method new criticality name entered
	public String getvalidcritiResult()
	{
		//browser.navigate().refresh();
		return msg_Valid_result.getText();
	   
	}

	public void Commonprocesscity(String UN,String PW, String city_name,String desp)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_city();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clk_edit_city();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entercityname(city_name);
		enterdescrip(desp);
		click_save();
	}
	
	

}
