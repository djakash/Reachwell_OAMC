package Pageobject_shift;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	

	//shift click
    @FindBy(linkText="Shift")
    WebElement clk_shift;
	////////////////////////////////////////////////
    
//click on edit shift
@FindBy(xpath="//*[@id='ShiftTableContainer']/div/table/tbody/tr[1]/td[7]/a/div")
WebElement clk_edit_shift;

//enter shift name
@FindBy(xpath="//*[@id='ShiftName']")
 WebElement enter_shift;

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
	public void click_shift()
	{
		clk_shift.click();
		
	}
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
			//browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//browser.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div")).click();
			
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
//////////////////////////////////////////////////////////////////

public void clk_edit_shift()
{
	clk_edit_shift.click();
}
//////////////////////////////////////////////////////////////////

//enter zone name from Excel sheet
public void entershiftname(String value)
{
	enter_shift.clear();
	enter_shift.sendKeys(value);
}
	
	//enter descpription
	

//click save button
public void click_save()
{
	click_save_shift.click();
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

	public void Commonprocessshift(String UN,String PW, String shift_name)
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
		clk_edit_shift();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		entershiftname(shift_name);
		enter_to_hr();
		enter_to_min();
		browser.findElement(By.xpath("//*[@id='ShiftName']")).click();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		enter_from_hr();
		enter_from_min();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_save();
	}
	
	

}
