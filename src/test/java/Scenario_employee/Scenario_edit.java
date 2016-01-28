package Scenario_employee;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_employee.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();

	//1	
		@Test(dataProvider="Valid_brnch_test",dataProviderClass=Dataprovider_employee.DataProvider_edit.class,groups={"employee_list"})
		public void Valid_brnch_test(String TC_ID,String Order,String employ_code,String first_name,String login_id,String password,String landline,String e_mail,String qual,String cert,String Exp_Res) throws IOException, AWTException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ(uname,pwd);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Valid_brnch_test(landline,e_mail,employ_code,first_name,login_id,password);		
			sAssert.assertEquals(Exp_Res, Actual_Res);
			
			if(Actual_Res.equals(Exp_Res))
			{
				log.info("Passed as Expected msg was Valid");	
			}
			else
			{
				log.info("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
				sAssert.fail("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
			}
			tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}//  getInvalidcritiResult_blnk

	//2
	    @Test(dataProvider="Invalid_firstname_test_blnk",dataProviderClass=Dataprovider_employee.DataProvider_edit.class,groups={"employee_list"})
		public void Invalid_firstname_test_blnk(String TC_ID,String Order,String employ_code,String first_name,String login_id,String password,String landline,String e_mail,String qual,String cert,String Exp_Res) throws IOException
		{

			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ(uname,pwd);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_firstname_test_blnk(employ_code,first_name);		
			sAssert.assertEquals(Exp_Res, Actual_Res);
			
			if(Actual_Res.equals(Exp_Res))
			{
				log.info("Passed as Expected msg was Valid");	
			}
			else
			{
				log.info("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
				sAssert.fail("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
			}
			tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}
		
	    
	//3	
		@Test(dataProvider="Invalid_empcode_test_blnk",dataProviderClass=Dataprovider_employee.DataProvider_edit.class,groups={"employee_list"})
		public void Invalid_empcode_test_blnk(String TC_ID,String Order,String employ_code,String first_name,String login_id,String password,String landline,String e_mail,String qual,String cert,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ(uname,pwd);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_empcode_test_blnk(employ_code,first_name);		
			sAssert.assertEquals(Exp_Res, Actual_Res);
			
			if(Actual_Res.equals(Exp_Res))
			{
				log.info("Passed as Expected msg was Valid");	
			}
			else
			{
				log.info("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
				sAssert.fail("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
			}
			tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}
		//4
			@Test(dataProvider="Invalid_login_id_test_blnk",dataProviderClass=Dataprovider_employee.DataProvider_edit.class,groups={"employee_list"})
		public void Invalid_login_id_test_blnk(String TC_ID,String Order,String employ_code,String first_name,String login_id,String password,String landline,String e_mail,String qual,String cert,String Exp_Res) throws IOException
		{

				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ(uname,pwd);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_login_id_test_blnk(employ_code,first_name,login_id,password);		
			sAssert.assertEquals(Exp_Res, Actual_Res);
			
			if(Actual_Res.equals(Exp_Res))
			{
				log.info("Passed as Expected msg was Valid");	
			}
			else
			{
				log.info("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
				sAssert.fail("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
			}
			tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}
			
			//5	
				@Test(dataProvider="Invalid_same_empcode_test",dataProviderClass=Dataprovider_employee.DataProvider_edit.class,groups={"employee_list"})
		public void Invalid_same_empcode_test(String TC_ID,String Order,String employ_code,String first_name,String login_id,String password,String landline,String e_mail,String qual,String cert,String Exp_Res) throws IOException
		{
					String uname = c1.Reading_Properties("uname");
					String pwd = c1.Reading_Properties("pwd");
			
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ(uname,pwd);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_same_empcode_test(employ_code,first_name,login_id,password);		
			sAssert.assertEquals(Exp_Res, Actual_Res);
			
			if(Actual_Res.equals(Exp_Res))
			{
				log.info("Passed as Expected msg was Valid");	
			}
			else
			{
				log.info("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
				sAssert.fail("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
			}
			tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}
				
	//6
		@Test(dataProvider="Invalid_same_loginid_test",dataProviderClass=Dataprovider_employee.DataProvider_edit.class,groups={"employee_list"})
		public void Invalid_same_loginid_test(String TC_ID,String Order,String employ_code,String first_name,String login_id,String password,String landline,String e_mail,String qual,String cert,String Exp_Res) throws IOException
		{

			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ(uname,pwd);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_same_loginid_test(employ_code,first_name,login_id,password);		
			sAssert.assertEquals(Exp_Res, Actual_Res);
			
			if(Actual_Res.equals(Exp_Res))
			{
				log.info("Passed as Expected msg was Valid");	
			}
			else
			{
				log.info("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
				sAssert.fail("Failed as Expected msg was "+Exp_Res +"Actual msg was   "+Actual_Res);
			}
			tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}				
}
