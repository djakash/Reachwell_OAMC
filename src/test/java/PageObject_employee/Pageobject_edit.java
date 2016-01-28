package PageObject_employee;

import java.awt.AWTException;
import java.io.IOException;
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
	    
	    /////////// Control panel and employ //////////
	    @FindBy(xpath="//span[text()='Control Panel']")
	    WebElement controlbutt;
		@FindBy(linkText="Employee")
		 WebElement employbutt;
		////////////////////////////////////////////////
		
		//click employ list
	    @FindBy(linkText="Employee List")
	    WebElement clk_employ_list;
		////////////////////////////////////////////////
	
//click on edit employee
@FindBy(xpath="//*[@id='EmployeeTableContainer']/div/table/tbody/tr[1]/td[9]/a/div")
WebElement clk_edit_employee;

//enter employ code
@FindBy(xpath="//*[@id='EmployeeCode']")
WebElement employ_code;

//enter frst_name
@FindBy(xpath="//*[@id='FirstName']")
 WebElement frst_name;

//enter login ID
@FindBy(xpath="//*[@id='LoginID']")
WebElement login_id;

//enter password
@FindBy(xpath="//*[@id='Password']")
WebElement enter_pass;

//browse file
@FindBy(xpath="//*[@id='fileupload']")
WebElement browse;

//enter landline no
@FindBy(xpath="//*[@id='LandlineNo']")
WebElement enter_landline;

//enter e_mail
@FindBy(xpath="//*[@id='Email']")
WebElement enter_email;

 //enter report's to
@FindBy(xpath="//*[@id='ReportsTo']")
WebElement enter_report_to;

//enter designation
@FindBy(xpath="//*[@id='CPDesignation']")
WebElement enter_designation;


//enter department
@FindBy(xpath="//*[@id='CPDepartment']")
WebElement enter_department;

//enter grade
@FindBy(xpath="//*[@id='CPGrade']")
WebElement enter_grade;


//enter search
@FindBy(xpath="//*[@id='btnSearchQualification']")
WebElement search_qual;

//enter search
@FindBy(xpath=" //*[@id='btnSearchCertification']")
WebElement search_certi;

//click arrow ">>"
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form-p-3']/div[2]/div/table/tbody/tr[2]/td/div/div[2]/p[2]")
WebElement throw1;

//enter qual
@FindBy(xpath="//*[@id='QualificationSearchValue']")
WebElement enter_qual;

//enetr certification
@FindBy(xpath="//*[@id='CertificationSearchValue']")
WebElement enter_certi;

 //enter cost
@FindBy(xpath="//*[@id='Cost']")
WebElement enter_cost;

//currency list
@FindBy(xpath="//*[@id='CurrencyList']")
WebElement currency_list;

//enter Exchange_rate
@FindBy(xpath="//*[@id='ExchangeRate']")
WebElement enter_exg_rate;


/*//enter region
@FindBy(xpath="//*[@id='Region1']")
WebElement enter_region;

//enter country
@FindBy(xpath="//*[@id='Country1']")
WebElement enter_country;*/

//click on joining date icon
@FindBy(xpath="//*[@id='JoinDate']")
WebElement join_date_click;

//click on relieving date icon
@FindBy(xpath="//*[@id='RelievingDate']")
WebElement relieve_date_click;

//select random date
@FindBy(xpath="html/body/div[3]/div[1]/table/tbody/tr[5]/td[3]")
WebElement date_select_1;

//select random date
@FindBy(xpath="html/body/div[3]/div[1]/table/tbody/tr[3]/td[5]")
WebElement date_select_2;

//click next
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form']/div[3]/ul/li[2]/a")
WebElement click_next;

//click finish 
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form']/div[3]/ul/li[3]/a")
WebElement click_finish;

//1
//blank employ code error message//*[@id='CM_Employee_Edit_Form-p-0']/div[1]/div/label
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form-p-0']/div[1]/div/label") 	
WebElement Invalid_empcode_test_blnk;

//2
//blank first name error message
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form-p-0']/div[2]/div/label")
WebElement Invalid_firstname_test_blnk;

//3
//blank login id error message
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form-p-1']/div[1]/div/label")
WebElement Invalid_login_id_test_blnk;

//4
//blank password error message
@FindBy(xpath="//*[@id='CM_Employee_Edit_Form-p-1']/div[2]/div/label")
WebElement Invalid_pass_test_blnk;


//with different employee name edit succesfull 
@FindBy(xpath="//*[@id='EmployeeTableContainer']/div/table/tbody/tr[1]/td[2]")
WebElement msg_Valid_result;

public Pageobject_edit(WebDriver Dbrowser)
{
this.browser=Dbrowser;
PageFactory.initElements(browser, this);
}

/// method to click CP
	public void Click_CP()
	{
		controlbutt.click();
		
	}
	
	// method to click employee
	public void Click_Employee()
	{ 
		employbutt.click();
		
	}
	

	
	//click on click employ list
	public void click_employ_list()
	{
		clk_employ_list.click();
	}
	
	
	//method to click on edit employee
	public void Edit_employee()
	{
		clk_edit_employee.click();	
	}
	
	//enter employ code from Excel sheet
		public void enter_employ_code(String value)
		{
			employ_code.clear();
			employ_code.sendKeys(value);
		}
		
		//method for entering locationcode
		public void enter_frst_name(String value)
		{
			frst_name.clear();
			frst_name.sendKeys(value);
			
		}
		
		//method to enter login_id
		public void enter_login_id(String value)
		{
			login_id.clear();
			login_id.sendKeys(value);
		}
		
		//method to enter password 
		public void enter_password(String value)
		{
			enter_pass.clear();
			enter_pass.sendKeys(value);
		}
		
		/*//method to enter username
		public void enter_username(String value)
		{
			enter_username.sendKeys(value);
		}*/
		
		
		//click save button
		public void click_next()
		{
			click_next.click();
			//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		//click save button
			public void click_finish()
			{
				click_finish.click();
				//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
			public void sel_convertion(String text)
			{
				currency_list.click();
				currency_list.sendKeys(text);

				enter_cost.click();
			}
			
	
	//1	
		//method for error text with blank branch name
		public String Valid_brnch_test(String landline,String e_mail,String employ_code,String first_name,String login_id,String password) throws IOException, AWTException
		{
			enter_employ_code(employ_code);
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			enter_frst_name(first_name);
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			enter_report_to.clear();
			enter_report_to.sendKeys("vinay");
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			join_date_click.click();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			date_select_1.click();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			relieve_date_click.click();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			date_select_2.click();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			enter_designation.clear();
			enter_designation.sendKeys("General Manager");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_department.clear();
			enter_department.sendKeys("It head");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_grade.clear();
			enter_grade.sendKeys("AB");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			click_next();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_login_id(login_id);
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			enter_password(password);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			click_next();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_landline.clear();
			enter_landline.sendKeys(landline);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_email.clear();
			enter_email.sendKeys(e_mail);
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			//browse.click();
	      //  browse.sendKeys("D:\\desktp walz\\assassins_creed_unity_video_game_2014-wallpaper-1366x768.jpg");
			
		/*	 StringSelection ss=new StringSelection("D:\\desktp walz\\assassins_creed_unity_video_game_2014-wallpaper-1366x768.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);*/
			
			
			//browser.switchTo().activeElement().sendKeys("D:\\desktp walz\\assassins_creed_unity_video_game_2014-wallpaper-1366x768.jpg");
		   // browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			//Runtime.getRuntime().exec("C:\\Users\\DJ\\Desktop\\djauto\\fileupload.exe");
			
			//browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			click_next();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_qual.sendKeys("MCA");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			search_qual.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			throw1.click();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_certi.sendKeys("CCNP");
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			search_certi.click();
			browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			throw1.click();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			click_next();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			enter_cost.clear();
			enter_cost.sendKeys("50000");
			//sel_convertion("INR");
			enter_exg_rate.clear();
			enter_exg_rate.sendKeys("10");
			click_next();
			browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			click_finish.click();
			return msg_Valid_result.getText();
		   
		}	
		//2
			//method for error text with blank first name
			public String Invalid_firstname_test_blnk(String employ_code,String first_name)
			{
				enter_employ_code(employ_code);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_frst_name(first_name);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				click_next();
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				return Invalid_firstname_test_blnk.getText();
			   
			}	

		//3
			//method for error text with blank employee code
			public String Invalid_empcode_test_blnk(String employ_code,String first_name)
			{
				enter_employ_code(employ_code);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_frst_name(first_name);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
				click_next();
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				return Invalid_empcode_test_blnk.getText();
					   
			}			
	//4
			//method for error text with blank login id
			public String Invalid_login_id_test_blnk(String employ_code,String first_name,String login_id,String password)
			{
				enter_employ_code(employ_code);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_frst_name(first_name);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				click_next();
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_login_id(login_id);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_password(password);
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				click_next();
				return Invalid_login_id_test_blnk.getText();
					   
			}
	//5//method for error text with blank password
			public String Invalid_pass_test_blnk(String employ_code,String first_name,String login_id,String password)
			{
				enter_employ_code(employ_code);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_frst_name(first_name);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				click_next();
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				enter_login_id(login_id);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_password(password);
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				click_next();
				return Invalid_pass_test_blnk.getText();
					   
			}	
			
	//6
		//method for error text with blank password
			public String Invalid_same_empcode_test(String employ_code,String first_name,String login_id,String password)
			{
				enter_employ_code(employ_code);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_frst_name(first_name);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				click_next();
			    return Invalid_empcode_test_blnk.getText();				   
			}			
			
	//7
		//method for error text with blank password
			public String Invalid_same_loginid_test(String employ_code,String first_name,String login_id,String password)
			{
				enter_employ_code(employ_code);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_frst_name(first_name);
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				click_next();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				enter_login_id(login_id);
				browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				enter_password(password);
				browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			    return Invalid_login_id_test_blnk.getText();				   
			}				
		//**********************************************************************************
		
		//Common process component
		public void Commonprocess_employ(String UN,String PW)
		{
			UNtext.clear();
	        UNtext.sendKeys(UN);
	        PassTf.clear();
	        PassTf.sendKeys(PW, Keys.ENTER);
	        browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Click_CP();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Click_Employee();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			click_employ_list();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Edit_employee();
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			/*enter_username(u_name);
			browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			enter_password(password);
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			enter_con_name(con_name);
			enter_con_code.sendKeys(con_code);
			//click_save();	
	*/	}
	
	

}
