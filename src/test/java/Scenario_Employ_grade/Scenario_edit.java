package Scenario_Employ_grade;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_Employ_desig.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();

	
	//1
		@Test(dataProvider="Invalid_designame_test_blnk",dataProviderClass=Dataprovider_Employ_desig.DataProvider_edit.class,groups={"employ_grade"})
		public void test_Validcriti(String TC_ID,String Order,String desig_name,String desig_code,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			
			//System.out.println(region_head);
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ_desig_edit(uname,pwd,desig_name,desig_code,desp);//, Pwd);
			String Actual_Res = lpob.Invalid_designame_test_blnk();		
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
		
		@Test(dataProvider="Invalid_desigcode_test_blnk",dataProviderClass=Dataprovider_Employ_desig.DataProvider_edit.class,groups={"employ_grade"})
		public void Invalid_desigcode_test_blnk(String TC_ID,String Order,String desig_name,String desig_code,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			
			//System.out.println(region_head);
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ_desig_edit(uname,pwd,desig_name,desig_code,desp);
			String Actual_Res = lpob.Invalid_desigcode_test_blnk();		
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
		@Test(dataProvider="Invalid_designame_test",dataProviderClass=Dataprovider_Employ_desig.DataProvider_edit.class,groups={"employ_grade"})
		public void Invalid_designame_test(String TC_ID,String Order,String desig_name,String desig_code,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			
			//System.out.println(region_head);
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ_desig_edit(uname,pwd,desig_name,desig_code,desp);
			String Actual_Res = lpob.Invalid_designame_test();		
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
		@Test(dataProvider="Invalid_desigcode_test",dataProviderClass=Dataprovider_Employ_desig.DataProvider_edit.class,groups={"region"})
		public void Invalid_desigcode_test(String TC_ID,String Order,String desig_name,String desig_code,String desp,String Exp_Res) throws IOException
		{

			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			//System.out.println(region_head);
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ_desig_edit(uname,pwd,desig_name,desig_code,desp);
			String Actual_Res = lpob.Invalid_desigcode_test();		
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
		@Test(dataProvider="Valid_region_test",dataProviderClass=Dataprovider_Employ_desig.DataProvider_edit.class,groups={"region"})
		public void Valid_region_test(String TC_ID,String Order,String desig_name,String desig_code,String desp,String Exp_Res) throws IOException
		{

			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			//System.out.println(region_head);
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_employ_desig_edit(uname,pwd,desig_name,desig_code,desp);
			String Actual_Res = lpob.Valid_region_test();		
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
