package PageObject_contractor;

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
	

	//click contractor
    @FindBy(linkText="Contractor")
    WebElement clk_contractor;
	////////////////////////////////////////////////
    
//click on edit contractor
@FindBy(xpath="//*[@id='ContractorTableContainer']/div/table/tbody/tr[1]/td[8]/a/div")
WebElement clk_edit_con;
//enter contractor code
@FindBy(xpath="//*[@id='ContractorCode']")
WebElement enter_con_code;

//enter contractor name
@FindBy(xpath="//*[@id='ContractorName']")
 WebElement enter_con_name;

//enter address
@FindBy(xpath="//*[@id='Address']")
WebElement enter_add;

//enter city
@FindBy(xpath="//*[@id='ContractorCity']")
WebElement enter_city;

//enter state
@FindBy(xpath="//*[@id='ContractorState']")
WebElement enter_state;

//enter country
@FindBy(xpath="//*[@id='ContractorCountry']")
WebElement enter_country;

//enter email
@FindBy(xpath="//*[@id='EmailID']")
WebElement enter_email;

//enter phone
@FindBy(xpath="//*[@id='PhoneNumber']")
WebElement enter_phone;

//enter bank name
@FindBy(xpath="//*[@id='BankName']")
WebElement enter_bankname;

//enter bank_acc_no
@FindBy(xpath="//*[@id='BankAccountNo']")
WebElement enter_bank_acc_no;

//enter cost
@FindBy(xpath="//*[@id='Cost']")
WebElement enter_cost;

//currency list
@FindBy(xpath="//select[@id='Currencylist']")
WebElement currency_list;

//enter Exchange_rate
@FindBy(xpath="//*[@id='ExchangeRate']")
WebElement enter_exg_rate;

//click save con
@FindBy(linkText="Next")
WebElement click_save_con;

//click save form/finish
@FindBy(linkText="Finish")
WebElement click_finish;

//blank shift message
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result_blank;

//same shift name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;

//with different shift name edit succesfull 
	@FindBy(xpath="//*[@id='ContractorTableContainer']/div/table/tbody/tr[1]/td[2]")
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

//method to click contractor
	public void click_contractor()
	{
		clk_contractor.click();
		
	}
	 
	public void edit_con()
	{
		clk_edit_con.click();
	}
	
	//enter contractor name from Excel sheet
		public void enter_con_name(String value)
		{
			enter_con_name.clear();
			enter_con_name.sendKeys(value);
		}
		
		//enter shift name from Excel sheet
				public void enter_con_code(String value)
				{
					enter_con_code.clear();
					enter_con_code.sendKeys(value);
				}
	
	//method to enter address	
	    public void address(String value)
	    {
		    enter_add.clear();
		    enter_add.sendKeys(value);	
	    }
				
	//method to enter city	
		public void city(String value)
		{
			enter_city.clear();
			enter_city.sendKeys(value);	
		}
		
		//method to enter state	
		public void state(String value)
		{
			enter_state.clear();
			enter_state.sendKeys(value);	
		}
		
		//method to enter country	
		public void country(String value)
		{
			enter_country.clear();
			enter_country.sendKeys(value);	
		}	
	
		//method to enter email	
		public void email(String value)
		{
			enter_email.clear();
			enter_email.sendKeys(value);	
		}
		
		//method to enter phone	
				public void phone(String value)
				{
					enter_phone.clear();
					enter_phone.sendKeys(value);	
				}	
				
				//method to enter bank_name	
				public void bank_name(String value)
				{
					enter_bankname.clear();
					enter_bankname.sendKeys(value);	
				}	
				
				//method to enter bank_acc	
				public void bank_acc(String value)
				{
					enter_bank_acc_no.clear();
					enter_bank_acc_no.sendKeys(value);	
				}	
	
				//method to enter cost	
				public void cost(String value)
				{
					enter_cost.clear();
					enter_cost.sendKeys(value);	
				}	
				
				//method to enter exch_rate	
				public void exch_rate(String value)
				{
					enter_exg_rate.clear();
					enter_exg_rate.sendKeys(value);	
				}	
	
	
				
		//click save button
		public void click_save()
		{
			click_save_con.click();
			//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void sel_convertion(String text)
		{
			currency_list.click();
			currency_list.sendKeys(text);
		
			enter_cost.click();
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
	public String getvalidcritiResult(String Address,String city,String state,String country) throws InterruptedException
	{
		address(Address);
		city(city);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		state(state);
		country(country);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		email("reach@gmail.com");
		phone("123456789");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		bank_name("ICICI");
		bank_acc("987654321000");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_save();
		cost("50000");
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		exch_rate("10");
		//Thread.sleep(3000);
		//browser.findElement(By.xpath("//*[@id='NetCost']")).click();
		sel_convertion("USD");
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//browser.findElement(By.xpath("//*[@id='CM_Contractor_Edit_Form']")).click();
		click_finish.click();
		//browser.findElement(By.xpath("//*[@id='CM_Contractor_Edit_Form']/div[3]/ul/li[1]/a")).click();
		return msg_Valid_result.getText(); 
	}

	public void Commonprocessshift(String UN,String PW,String con_name,String con_code)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_contractor();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		edit_con();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_con_name(con_name);
		enter_con_code(con_code);
		click_save();
	}
	
	

}
