package Scenario_item_cat;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_item_cat.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();
	
	
	//1	
		@Test(dataProvider="Invalid_brnch_name_test_blnk",dataProviderClass=Dataprovider_item_cat.DataProvider_edit.class,groups={"branch"})
		public void Invalid_brnch_name_test_blnk(String TC_ID,String Order,String branch_name,String item_type,String item_code,String item_name,String desp,String Exp_Res) throws IOException
		{
			
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			
			initBrowsersession1();
			
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_item_cat_edit(uname,pwd,branch_name,item_type,item_code,item_name,desp);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_brnch_name_test_blnk();		
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
		//	tearDown();
			sAssert.assertAll();
			log.info("******************************************");			
		}

	/*//2
		@Test(dataProvider="Invalid_item_code_test_blnk",dataProviderClass=Dataprovider_item_cat.DataProvider_edit.class,groups={"branch"})
		public void Invalid_item_code_test_blnk(String TC_ID,String Order,String branch_name,String item_type,String item_code,String item_name,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_item_cat_edit(uname,pwd,branch_name,item_type,item_code,item_name,desp);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_item_code_test_blnk();		
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
		@Test(dataProvider="Invalid_item_name_test_blnk",dataProviderClass=Dataprovider_item_cat.DataProvider_edit.class,groups={"branch"})
		public void Invalid_item_name_test_blnk(String TC_ID,String Order,String branch_name,String item_type,String item_code,String item_name,String desp,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_item_cat_edit(uname,pwd,branch_name,item_type,item_code,item_name,desp);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_item_name_test_blnk();		
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
			@Test(dataProvider="Invalid_same_item_code",dataProviderClass=Dataprovider_item_cat.DataProvider_edit.class,groups={"branch"})
			public void Invalid_same_item_code(String TC_ID,String Order,String branch_name,String item_type,String item_code,String item_name,String desp,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_item_cat_edit(uname,pwd,branch_name,item_type,item_code,item_name,desp);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_same_item_code();		
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
			@Test(dataProvider="Invalid_same_item_name",dataProviderClass=Dataprovider_item_cat.DataProvider_edit.class,groups={"branch"})
			public void Invalid_same_item_name(String TC_ID,String Order,String branch_name,String item_type,String item_code,String item_name,String desp,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_item_cat_edit(uname,pwd,branch_name,item_type,item_code,item_name,desp);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_same_item_name();		
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
			@Test(dataProvider="Valid_item_cat_test",dataProviderClass=Dataprovider_item_cat.DataProvider_edit.class,groups={"branch"})
			public void Valid_item_cat_test(String TC_ID,String Order,String branch_name,String item_type,String item_code,String item_name,String desp,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_item_cat_edit(uname,pwd,branch_name,item_type,item_code,item_name,desp);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Valid_item_cat_test();		
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
			}*/
}
