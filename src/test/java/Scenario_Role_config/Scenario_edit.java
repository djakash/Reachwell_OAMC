package Scenario_Role_config;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_Role_config.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();

	//1
		@Test(dataProvider="Invalid_rolename_test_blnk",dataProviderClass=Dataprovider_Role_config.DataProvider_edit.class,groups={"Role_config"})
		public void test_dp_Invalidrole_blnk(String TC_ID,String Order,String role_name,String desp,String stakeholder,String  branch,String department,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_config_edit(uname,pwd,role_name,desp);//, Pwd);
			String Actual_Res = lpob.enter_blnk_role(stakeholder,department,branch);		
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
	//2	
		@Test(dataProvider="Invalid_stakeholder_test_blnk",dataProviderClass=Dataprovider_Role_config.DataProvider_edit.class,groups={"Role_config"})
		public void Invalid_stakeholder_test_blnk(String TC_ID,String Order,String role_name,String desp,String stakeholder,String  branch,String department,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_config_edit(uname,pwd,role_name,desp);//, Pwd);
			String Actual_Res = lpob.enter_blnk_stakeholder(branch,department);		
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
		@Test(dataProvider="Invalid_branch_test_blnk",dataProviderClass=Dataprovider_Role_config.DataProvider_edit.class,groups={"Role_config"})
		public void Invalid_branch_test_blnk(String TC_ID,String Order,String role_name,String desp,String stakeholder,String  branch,String department,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_config_edit(uname,pwd,role_name,desp);//, Pwd);
			String Actual_Res = lpob.enter_blnk_brnch(stakeholder,department);		
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
		@Test(dataProvider="Invalid_department_test_blnk",dataProviderClass=Dataprovider_Role_config.DataProvider_edit.class,groups={"Role_config"})
		public void Invalid_department_test_blnk(String TC_ID,String Order,String role_name,String desp,String stakeholder,String  branch,String department,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_config_edit(uname,pwd,role_name,desp);//, Pwd);
			String Actual_Res = lpob.enter_blnk_depart(stakeholder,branch);		
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
		@Test(dataProvider="Valid_config_role_test",dataProviderClass=Dataprovider_Role_config.DataProvider_edit.class,groups={"Role_config"})
		public void Valid_config_role_test(String TC_ID,String Order,String role_name,String desp,String stakeholder,String branch,String department,String Exp_Res) throws IOException, InterruptedException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_config_edit(uname,pwd,role_name,desp);//, Pwd);
			String Actual_Res = lpob.getvalid_config_role_Result(stakeholder,department,branch);		
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
