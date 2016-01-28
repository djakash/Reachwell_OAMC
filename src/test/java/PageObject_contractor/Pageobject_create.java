package PageObject_contractor;
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
	@FindBy(xpath="//li[@id='Masters']")
	 WebElement MastButt;
	////////////////////////////////////////////////
	
	//click contractor
    @FindBy(linkText="Contractor")
    WebElement clk_contractor;
	////////////////////////////////////////////////
    
    //create contractor click
    @FindBy(xpath="//*[@id='ContractorTableContainer']/div/div[3]/div[2]/span[4]/span[2]")
    WebElement create_contractor;
  
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
    @FindBy(xpath="//*[@id='CurrencyList']")
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
	
	// method to click Masters
	public void Click_Masters()
	{
		MastButt.click();
		
	}
	
	// method to click contractor
	public void click_contractor()
	{
		clk_contractor.click();
		
	}
	
	//click on create contractor
	public void create_contractor()
	{
		create_contractor.click();
	}
	
	//enter shift name from Excel sheet
	public void enter_con_name(String value)
	{
		enter_con_name.sendKeys(value);
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
	
	//method for blank shift name
	public String getInvalidcritiResult_blnk()
	{
		return msg_Invalid_result_blank.getText();
	}

	
	//method for error text with same shift name
		public String getInvalidcritiResult()
		{
			return msg_Invalid_result.getText();
		}
		

	//method new shift name entered
	public String getvalidcritiResult(String Address,String city,String state,String country)
	{
		/*browser.navigate().refresh();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);*/
		enter_add.sendKeys(Address);
		enter_city.sendKeys(city);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_state.sendKeys(state);
		enter_country.sendKeys(country);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_email.sendKeys("reach@gmail.com");
		enter_phone.sendKeys("123456789");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		enter_bankname.sendKeys("ICICI");
		enter_bank_acc_no.sendKeys("987654321000");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_save();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_save();
		enter_cost.sendKeys("10000");
		sel_convertion("USD");
		enter_exg_rate.sendKeys("1");
		
		
		click_finish.click();
		
		return msg_Valid_result.getText();
	   
	}
	 
	

	
	
	//**********************************************************************************
	
	//Common process component
	
	public void Commonprocess_shift(String UN,String PW,String con_name,String con_code)
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
		create_contractor();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_con_name(con_name);
		enter_con_code.sendKeys(con_code);
		click_save();

		
		
		
	}
}
