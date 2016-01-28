package Pageobject_acc_class;

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
    
    /////////// Control panel and Asset //////////
    @FindBy(xpath="//span[text()='Control Panel']")
    WebElement controlbutt;
	@FindBy(linkText="Asset")
	 WebElement Asset;
	////////////////////////////////////////////////
	
	//click acc class
    @FindBy(linkText="Account Class")
    WebElement clk_acc_class;
	////////////////////////////////////////////////
    
//click on edit acc_class
@FindBy(xpath="//*[@id='AccountHeadTableContainer']/div/table/tbody/tr[1]/td[6]/a/div")
WebElement clk_edit_acc_class;

//enter parent name
@FindBy(xpath="//*[@id='ParentAccountHead']")
 WebElement enter_parent;

//enter acc_class
@FindBy(xpath="//input[@id='AccountHeadName']")
WebElement enter_acc_class;

//enter acc_class descrip 
@FindBy(xpath="//*[@id='AccountHeadDescription']")
WebElement enter_desp;

//click save acc_class
@FindBy(xpath="//button[@id='LoadRecordsButton']")
WebElement click_save_acc_class;

//blank acc_class message
@FindBy(xpath="//label[@class='error']")
WebElement Invalid_test_blnk;

//same acc_class name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;



//with different acc_class name edit succesfull 
@FindBy(xpath="//*[@id='AccountHeadTableContainer']/div/table/tbody/tr[1]/td[2]")
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

// method to click Asset
	public void Click_Asset()
	{
		Asset.click();
		
	}
	
//click on click acc_class
	public void click_acc_class()
	{
		clk_acc_class.click();
	}

//click on edit acc_class
public void Edit_acc_class()
{
	clk_edit_acc_class.click();
}

//enter acc_class name from Excel sheet
public void enter_acc_class_name(String acc_class)
{
	enter_acc_class.clear();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	enter_acc_class.sendKeys(acc_class);	
}

//enter parent 
public void enter_parent(String parent)
{
	enter_parent.clear();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	enter_parent.sendKeys(parent);
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
	click_save_acc_class.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//method for blank acc_class name
public String Invalid_acc_class_test_blnk()
{
	return Invalid_test_blnk.getText();
}

//method for error text with same loc_type name
	public String Invalid_acc_class_name_test()
	{
		return msg_Invalid_result.getText();
	}

		
//method new acc_class name entered
public String Valid_acc_class_test()
{
	browser.navigate().refresh();
	return msg_Valid_result.getText();
   
}
 

//**********************************************************************************

//Common process component

public void Commonprocess_acc_class_edit(String UN,String PW,String parent,String acc_class,String desp)
{
	UNtext.clear();
    UNtext.sendKeys(UN);
    PassTf.clear();
    PassTf.sendKeys(PW, Keys.ENTER);
	Click_CP();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Click_Asset();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	click_acc_class();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Edit_acc_class();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	enter_parent(parent);
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	enter_acc_class_name(acc_class);
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	enterdescrip(desp);
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	click_save();
	
}
}
