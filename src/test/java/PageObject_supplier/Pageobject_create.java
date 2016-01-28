package PageObject_supplier;
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
    
    /////////// Control panel and supplier //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(linkText="Supplier")
	 WebElement supplier_butt;
	////////////////////////////////////////////////
	
	//click supplier list
    @FindBy(linkText="Supplier List")
    WebElement clk_supplier_list;
	////////////////////////////////////////////////
    
    //create supplier click
    @FindBy(xpath="//*[@id='SupplierTableContainer']/div/div[3]/div[2]/span[4]")
    WebElement create_supplier;
  
    //enter supplier code
    @FindBy(xpath="//*[@id='SupplierCode']")
    WebElement supplier_code;
    
    //enter supplier name
    @FindBy(xpath="//*[@id='SupplierName']")
     WebElement supplier_name;
    
    //enter next
    @FindBy(xpath="//*[@id='CM_Supplier_Create_Form']/div[3]/ul/li[2]/a")
    WebElement next_clk;
    
    //finish
    @FindBy(xpath="//*[@id='CM_Supplier_Create_Form']/div[3]/ul/li[3]/a")
    WebElement finish;
    
    //enter address 
    @FindBy(xpath="//*[@id='Address']")
    WebElement enter_address;
    
    //enter city
    @FindBy(xpath="//*[@id='SupplierCity']")
    WebElement enter_city;
    
    //enter state
    @FindBy(xpath="//*[@id='SupplierState']")
    WebElement enter_state;
    
  //enter country
    @FindBy(xpath="//*[@id='SupplierCountry']")
    WebElement enter_country;
    
   //enter e_mail
    @FindBy(xpath="//*[@id='EmailID']")
    WebElement enter_email;
    
    //enter phone
    @FindBy(xpath="//*[@id='PhoneNumber']")
    WebElement enter_phone;
    
    //enter fax
    @FindBy(xpath="//*[@id='Fax']")
    WebElement enter_fax;
    
    //enter website
    @FindBy(xpath="//*[@id='WebSite']")
    WebElement enter_website;
    
   //enter bank name
    @FindBy(xpath="//*[@id='BankName']")
    WebElement enter_bank;
    
    //enter acc_no
    @FindBy(xpath="//*[@id='BankAccountNo']")
    WebElement enter_acc_no;
    
    //IFSC code
    @FindBy(xpath="//*[@id='IFSCCode']")
    WebElement enter_ifsc;
    
    //payment mode
    @FindBy(xpath="//*[@id='PaymentMode']")
    WebElement payment;
    
    //ARMS 
    @FindBy(xpath="//*[@id='SupplierCustomAttributes']/table/tbody/tr/td[2]/input")
    WebElement enter_ARMS;
   
    //1
    //blank supplier name error message
	@FindBy(xpath="//label[@class='error']") 	
	WebElement Invalid_supplier_name_test_blnk;
	
	
	
	//with different supplier name edit succesfull 
	@FindBy(xpath="//*[@id='SupplierTableContainer']/div/table/tbody/tr[1]/td[2]")
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
	
	// method to click supplier
	public void Click_supplier()
	{
		supplier_butt.click();
		
	}
	

	
	//click on click supplier list
	public void click_supplier_list()
	{
		clk_supplier_list.click();
	}
	
	//enter supplier name from Excel sheet
	public void enter_supplier_name(String value)
	{
		supplier_name.sendKeys(value);
	}
	
//1	
	//method for error text with blank supplier name
	public String Invalid_supplier_name_test_blnk(String address,String city,String state,String country,String email,String phone,String website,String fax,String bank,String acc_no,String ifsc,String ARMS)
	{
		return Invalid_supplier_name_test_blnk.getText();
	}	
	
	//2
		//method for error text with same supplier name
		public String Invalid_same_supplier_name_test(String address,String city,String state,String country,String email,String phone,String website,String fax,String bank,String acc_no,String ifsc,String ARMS)
		{
			return Invalid_supplier_name_test_blnk.getText();
		   
		}	
		
public String Valid_supplier_test(String address,String city,String state,String country,String email,String phone,String website,String fax,String bank,String acc_no,String ifsc,String ARMS)
{
	
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_address.sendKeys(address);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_city.sendKeys(city);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_state.sendKeys(state);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_country.sendKeys(country);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_email.sendKeys(email);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_phone.sendKeys(phone);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_fax.sendKeys(fax);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_website.sendKeys(website);
	next_clk.click();
	
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_bank.sendKeys(bank);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_acc_no.sendKeys(acc_no);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_ifsc.sendKeys(ifsc);
	next_clk.click();
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	next_clk.click();
	
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	enter_ARMS.sendKeys(ARMS);
	browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	finish.click();
	browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return msg_Valid_result.getText();
	
}
	//**********************************************************************************
	
	//Common process component
	public void Commonprocess_supplier(String UN,String PW,String supplier_name)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_supplier();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_supplier_list();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		create_supplier.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enter_supplier_name(supplier_name);
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		next_clk.click();
	}
}
