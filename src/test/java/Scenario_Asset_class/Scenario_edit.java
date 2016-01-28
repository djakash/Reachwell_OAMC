package Scenario_Asset_class;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_Asset_class.Pageobject_create;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();

	
	//1	
		@Test(dataProvider="Invalid_acc_class_test_blnk",dataProviderClass=Dataprovider_Asset_class.DataProvider_edit.class,groups={"branch"})
		public void Invalid_acc_class_test_blnk(String TC_ID,String Order,String acc_class,String parent_class,String asset_class,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_create lpob= new Pageobject_create(browser);
			lpob.Commonprocess_asset_class(uname,pwd);
			String Actual_Res = lpob.Invalid_acc_class_test_blnk(acc_class,parent_class,asset_class);		
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
		@Test(dataProvider="Invalid_asset_class_test_blnk",dataProviderClass=Dataprovider_Asset_class.DataProvider_edit.class,groups={"branch"})
		public void Invalid_asset_class_test_blnk(String TC_ID,String Order,String acc_class,String parent_class,String asset_class,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_create lpob= new Pageobject_create(browser);
			lpob.Commonprocess_asset_class(uname,pwd);
			String Actual_Res = lpob.Invalid_asset_class_test_blnk(acc_class,parent_class,asset_class);		
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
		@Test(dataProvider="Invalid_same_asset_class_test",dataProviderClass=Dataprovider_Asset_class.DataProvider_edit.class,groups={"branch"})
		public void Invalid_same_asset_class_test(String TC_ID,String Order,String acc_class,String parent_class,String asset_class,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_create lpob= new Pageobject_create(browser);
			lpob.Commonprocess_asset_class(uname,pwd);
			String Actual_Res = lpob.Invalid_same_asset_class_test(acc_class,parent_class,asset_class);		
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
		@Test(dataProvider="Valid_asset_test",dataProviderClass=Dataprovider_Asset_class.DataProvider_edit.class,groups={"branch"})
		public void Valid_asset_test(String TC_ID,String Order,String acc_class,String parent_class,String asset_class,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_create lpob= new Pageobject_create(browser);
			lpob.Commonprocess_asset_class(uname,pwd);
			String Actual_Res = lpob.Valid_asset_test(acc_class,parent_class,asset_class);		
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
