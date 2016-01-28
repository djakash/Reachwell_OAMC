package PageObject_branch;

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
	    
	    /////////// Control panel and Branch //////////
	    @FindBy(xpath="//span[text()='Control Panel']")
	    WebElement controlbutt;
		@FindBy(linkText="Branch")
		 WebElement Branchbutt;
		////////////////////////////////////////////////
		
		//click Branch list
	    @FindBy(linkText="Branch List")
	    WebElement clk_brnch_list;
		////////////////////////////////////////////////
	
//click on edit contractor
@FindBy(xpath="//*[@id='BranchTableContainer']/div/table/tbody/tr[1]/td[7]/a/div")
WebElement clk_edit_branch;

//enter branch name
@FindBy(xpath="//*[@id='OrganizationName']")
WebElement branch_name;

//enter location code
@FindBy(xpath="//*[@id='LocationCode']")
 WebElement location_code;

//enter branch code
@FindBy(xpath="//*[@id='BranchCode']")
WebElement branch_code;

//enter first name
@FindBy(xpath="//*[@id='FirstName']")
WebElement enter_first_name;

//enter user name
@FindBy(xpath="//*[@id='LoginID']")
WebElement enter_username;

//enter password
@FindBy(xpath="//*[@id='Password']")
WebElement enter_password;

//enter parent
@FindBy(xpath="//*[@id='ParentOU']")
WebElement enter_parent;

//enter branch manager
@FindBy(xpath="//*[@id='BranchManagers']")
WebElement enter_branch_manager;

//enter postal code
@FindBy(xpath="//*[@id='PostalCode']")
WebElement enter_postal_code;

//enter branch incharge
@FindBy(xpath="//*[@id='BranchIncharges']")
WebElement enter_branch_incharge;

//enter city
@FindBy(xpath="//*[@id='City1']")
WebElement enter_city;

//currency state
@FindBy(xpath="//*[@id='State1']")
WebElement enter_state;

//enter zone
@FindBy(xpath="//*[@id='Zone1']")
WebElement enter_zone;

//enter region
@FindBy(xpath="//*[@id='Region1']")
WebElement enter_region;

//enter country
@FindBy(xpath="//*[@id='Country1']")
WebElement enter_country;

//click on date icon
@FindBy(xpath="//*[@id='EffectiveDateSpan']")
WebElement date_click;

//select random date
@FindBy(xpath="html/body/div[5]/div[1]/table/tbody/tr[5]/td[6]")
WebElement date_select;

//click save 
@FindBy(xpath="//*[@id='LoadRecordsButton']")
WebElement click_save;

//1
//blank branch name error message
@FindBy(xpath="//*[@id='CM_OU_Edit_Form']/fieldset[1]/fieldset[1]/div[2]/div/label") 	
WebElement Invalid_brnchname_test_blnk;

//2
//blank location code error message
@FindBy(xpath="//*[@id='CM_OU_Edit_Form']/fieldset[1]/fieldset[1]/div[3]/div/label")
WebElement Invalid_locatncode_test_blnk;

//3
//blank branch code error message
@FindBy(xpath="//*[@id='CM_OU_Edit_Form']/fieldset[1]/fieldset[1]/div[4]/div/label")
 WebElement Invalid_brnchcode_test_blnk;

//4
//blank first name error message
@FindBy(xpath="//*[@id='CM_OU_Edit_Form']/div[2]/div[1]/div[1]/div/label")
WebElement Invalid_frstname_test_blnk;

//5
//blank user name error message
@FindBy(xpath="//*[@id='CM_OU_Edit_Form']/div[2]/div[2]/div[1]/div/label")
WebElement Invalid_username_test_blnk;
	
//6
//blank password error message
@FindBy(xpath="//*[@id='CM_OU_Edit_Form']/div[2]/div[2]/div[2]/div/label")
WebElement Invalid_password_test_blnk;		

//with different shift name edit succesfull 
@FindBy(xpath="//*[@id='BranchTableContainer']/div/table/tbody/tr[1]/td[2]")
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

//method to click Branch
	public void Click_Branch()
	{
		Branchbutt.click();
		
	}
	

	
	//click on click branch list
	public void click_brnch_list()
	{
		clk_brnch_list.click();
	}
	
	//method to click on edit branch
	public void Edit_branch()
	{
		clk_edit_branch.click();	
	}
	
	//enter shift name from Excel sheet
	public void enter_branch_name(String value)
	{
		branch_name.clear();
		branch_name.sendKeys(value);
	}
	
	//method for entering locationcode
	public void enter_location_code(String value)
	{
		location_code.clear();
		location_code.sendKeys(value);
		
	}
	
	public void enter_branch_code(String value)
	{
		branch_code.clear();
		branch_code.sendKeys(value);
	}
	
	//method to enter first name 
	public void First_name(String value)
	{
		enter_first_name.clear();
		enter_first_name.sendKeys(value);
	}
	
	//method to enter username
	public void enter_username(String value)
	{
		enter_username.clear();
		enter_username.sendKeys(value);
	}
	
	//method to enter password
	public void enter_password(String value)
	{
		enter_password.clear();
		enter_password.sendKeys(value);
	}
	
	//click save button
	public void click_save()
	{
		click_save.click();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public String Invalid_brnchname_test_blnk(String parent,String branch_manager)
	{
		/*browser.navigate().refresh();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);*/
		enter_parent.clear();
		enter_parent.sendKeys(parent);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_branch_manager.clear();
		enter_branch_manager.sendKeys(branch_manager);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_postal_code.clear();
		enter_postal_code.sendKeys("560001");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_branch_incharge.clear();
		enter_branch_incharge.sendKeys("vinay");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_city.clear();
		enter_city.sendKeys("Bangalore");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_state.clear();
		enter_state.sendKeys("Karnataka");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_zone.clear();
		enter_zone.sendKeys("Bangalore south zone");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_region.clear();
		enter_region.sendKeys("North Bangalore");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_country.clear();
		enter_country.sendKeys("India");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		date_click.click();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		date_select.click();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	    click_save();
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return Invalid_brnchname_test_blnk.getText();
	   
	}	
//2	
	//method for error text with blank location code
	public String Invalid_locatncode_test_blnk(String parent,String branch_manager)
		{
		enter_parent.clear();
		enter_parent.sendKeys(parent);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_branch_manager.clear();
		enter_branch_manager.sendKeys(branch_manager);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_postal_code.clear();
		enter_postal_code.sendKeys("560001");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_branch_incharge.clear();
		enter_branch_incharge.sendKeys("vinay");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_city.clear();
		enter_city.sendKeys("Bangalore");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_state.clear();
		enter_state.sendKeys("Karnataka");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_zone.clear();
		enter_zone.sendKeys("Bangalore south zone");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_region.clear();
		enter_region.sendKeys("North Bangalore");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_country.clear();
		enter_country.sendKeys("India");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		date_click.click();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		date_select.click();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	    click_save();
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			return Invalid_locatncode_test_blnk.getText();
		}
		
//3	
	//method for error text with blank branch code
	public String Invalid_brnchcode_test_blnk(String parent,String branch_manager)
		{
	
		enter_parent.clear();
		enter_parent.sendKeys(parent);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_branch_manager.clear();
		enter_branch_manager.sendKeys(branch_manager);
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_postal_code.clear();
		enter_postal_code.sendKeys("560001");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_branch_incharge.clear();
		enter_branch_incharge.sendKeys("vinay");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_city.clear();
		enter_city.sendKeys("Bangalore");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_state.clear();
		enter_state.sendKeys("Karnataka");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_zone.clear();
		enter_zone.sendKeys("Bangalore south zone");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_region.clear();
		enter_region.sendKeys("North Bangalore");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		enter_country.clear();
		enter_country.sendKeys("India");
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		date_click.click();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		date_select.click();
		
	    click_save();
	    return Invalid_brnchcode_test_blnk.getText();

		
		}		
//4	
	//method for error text with blank first name
		public String Invalid_frstname_test_blnk(String parent,String branch_manager)
			{
			enter_parent.clear();
			enter_parent.sendKeys(parent);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_branch_manager.clear();
			enter_branch_manager.sendKeys(branch_manager);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_postal_code.clear();
			enter_postal_code.sendKeys("560001");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_branch_incharge.clear();
			enter_branch_incharge.sendKeys("vinay");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_city.clear();
			enter_city.sendKeys("Bangalore");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_state.clear();
			enter_state.sendKeys("Karnataka");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_zone.clear();
			enter_zone.sendKeys("Bangalore south zone");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_region.clear();
			enter_region.sendKeys("North Bangalore");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_country.clear();
			enter_country.sendKeys("India");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			date_click.click();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			date_select.click();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		    click_save();
			browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
				return Invalid_frstname_test_blnk.getText();
			}
		//5
		//method for error text with blank user name
			public String Invalid_username_test_blnk(String parent,String branch_manager)
				{
				enter_parent.clear();
				enter_parent.sendKeys(parent);
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_branch_manager.clear();
				enter_branch_manager.sendKeys(branch_manager);
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_postal_code.clear();
				enter_postal_code.sendKeys("560001");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_branch_incharge.clear();
				enter_branch_incharge.sendKeys("vinay");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_city.clear();
				enter_city.sendKeys("Bangalore");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_state.clear();
				enter_state.sendKeys("Karnataka");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_zone.clear();
				enter_zone.sendKeys("Bangalore south zone");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_region.clear();
				enter_region.sendKeys("North Bangalore");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_country.clear();
				enter_country.sendKeys("India");
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				date_click.click();
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				date_select.click();
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			    click_save();
				browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
					return Invalid_username_test_blnk.getText();
				}
			//6	
			//method for error text with blank password
				public String Invalid_password_test_blnk(String parent,String branch_manager)
					{
					enter_parent.clear();
					enter_parent.sendKeys(parent);
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_branch_manager.clear();
					enter_branch_manager.sendKeys(branch_manager);
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_postal_code.clear();
					enter_postal_code.sendKeys("560001");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_branch_incharge.clear();
					enter_branch_incharge.sendKeys("vinay");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_city.clear();
					enter_city.sendKeys("Bangalore");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_state.clear();
					enter_state.sendKeys("Karnataka");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_zone.clear();
					enter_zone.sendKeys("Bangalore south zone");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_region.clear();
					enter_region.sendKeys("North Bangalore");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_country.clear();
					enter_country.sendKeys("India");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					date_click.click();
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					date_select.click();
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				    click_save();
					browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
						return Invalid_password_test_blnk.getText();
					}	
	
				//method for valid branch name(new name)
				public String Valid_brnch_test(String parent,String branch_manager)
					{
					enter_parent.clear();
					enter_parent.sendKeys(parent);
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_branch_manager.clear();
					enter_branch_manager.sendKeys(branch_manager);
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_postal_code.clear();
					enter_postal_code.sendKeys("560001");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_branch_incharge.clear();
					enter_branch_incharge.sendKeys("vinay");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_city.clear();
					enter_city.sendKeys("Bangalore");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_state.clear();
					enter_state.sendKeys("Karnataka");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_zone.clear();
					enter_zone.sendKeys("Bangalore south zone");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_region.clear();
					enter_region.sendKeys("North Bangalore");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					enter_country.clear();
					enter_country.sendKeys("India");
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					date_click.click();
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
					date_select.click();
					browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				    click_save();
					browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
						return msg_Valid_result.getText();
					}		
	public void Commonprocess_branch_edit(String UN,String PW,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password)
	{
		UNtext.clear();
        UNtext.sendKeys(UN);
        PassTf.clear();
        PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Branch();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_brnch_list();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Edit_branch();
		enter_branch_name(branch_name);
		enter_location_code(location_code);
		enter_branch_code(Branch_code);
		
		/*First_name(First_name);
		enter_username(u_name);
		enter_password(password);*/
	}
	
	

}
