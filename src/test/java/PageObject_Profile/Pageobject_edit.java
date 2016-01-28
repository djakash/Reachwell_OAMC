package PageObject_Profile;

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
    @FindBy(linkText="Profiles")
	 WebElement clk_profiles;
	////////////////////////////////////////////////
	
	//profile click
   @FindBy(linkText="Profile")
   WebElement clk_profile;
	////////////////////////////////////////////////
    
//click on privileges
@FindBy(xpath="//*[@id='ProfileTableContainer']/div/table/tbody/tr[1]/td[4]/a/div")
WebElement clk_edit_prev;

//click asset management
@FindBy(xpath="//*[@id='8da9d7a8-8262-4952-a9f2-1722c93b86c8']")
 WebElement clk_ass_mngmnt;

//click IT asset
@FindBy(xpath="//*[@id='aab30897-7073-4547-b429-763db127d564']")
WebElement clk_IT_asset;

//click services
@FindBy(xpath="//*[@id='99ded2e3-7dae-4fda-b431-79e1ae45d8fb']")
WebElement clk_services;

//click procurement
@FindBy(xpath="//*[@id='8717ed10-e91f-4247-a185-809141c29eb3']")
WebElement clk_procument;

//click maintenance
@FindBy(xpath="//*[@id='82d31fc4-9959-4a7a-ab37-96c398207bdf']")
WebElement clk_maintenance;

//click alert_manager
@FindBy(xpath="//*[@id='b6eb304b-7988-4894-ab95-c78944955c47']")
WebElement clk_alert_manager;

//click cntrl_panel
@FindBy(xpath="//*[@id='e991a880-c325-481c-845c-fc4a0a1ba0e1']")
WebElement clk_cntrl_panel;

//click workspace
@FindBy(xpath="//*[@id='0da7c86f-1674-4d4c-a33a-fde691ab96ff']")
WebElement clk_workspace;

//recipient role name 
@FindBy(xpath="//*[@id='RoleName']")
WebElement enter_recip_role;

//click all page
@FindBy(xpath="//*[@id='checkAllPage']/th[1]/input")
WebElement clk_all_pages;

//click next 
@FindBy(xpath="//*[@id='CM_Privilege_Create_Form']/div[3]/ul/li[2]/a")
WebElement clk_next;

@FindBy(xpath="//*[@id='CM_Privilege_Create_Form']/div[3]/ul/li[3]/a")
WebElement clk_finish;

//same Recipient role name error msg
@FindBy(xpath="//label[@class='error']")
WebElement msg_Invalid_result;
	
//with different edit privi setting edit succesfull 
@FindBy(xpath="//*[@id='ProfileTableContainer']/div/table/tbody/tr[1]/td[2]")
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
//method to click profiles
	public void Click_Profiles()
	{
		clk_profiles.click();
	}
	
	// method to click profile
	public void Click_profile()
	{
		clk_profile.click();	
	}

//////////////////////////////////////////////////////////////////

public void clk_edit_privi()
{
	clk_edit_prev.click();
}
//////////////////////////////////////////////////////////////////

//enter zone name from Excel sheet
	public void enter_recip_role_name(String value)
	{
		enter_recip_role.clear();
		enter_recip_role.sendKeys(value);
	}
	

//click save button
public void click_finish()
{
	clk_finish.click();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	//method for error text with same zone name
		public String Invalid_privi_test_blnk(String value)
		{
			clk_edit_privi();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_ass_mngmnt.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_IT_asset.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_services.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_procument.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_next.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_next.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_all_pages.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			clk_next.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			enter_recip_role_name(value);
			click_finish();
			return msg_Invalid_result.getText();
		}
	

		//method for succesfull add privileges
			public String Valid_privi_test(String value)
			{
				String result="";
				String init_text = msg_Valid_result.getText();
				clk_edit_privi();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_ass_mngmnt.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_services.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_procument.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_workspace.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_next.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_next.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_all_pages.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				clk_next.click();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				enter_recip_role_name(value);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				click_finish();
				String final_val = msg_Valid_result.getText();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				if(init_text.equalsIgnoreCase(final_val))
					result = "same";
				return result;
			}
				
		
		
		
		
	//method new zone name entered
	public String getvalidcritiResult()
	{
		browser.navigate().refresh();
		return msg_Valid_result.getText();
	}

	public void Commonprocesspro_priv(String UN,String PW,String TC_ID)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Profiles();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_profile();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	

}
