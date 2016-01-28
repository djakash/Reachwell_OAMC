package Scenario_loc_loclist;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_loc_loclist.Pageobject_del;

public class Scenario_del extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_del.class);
	Utility_Class c1= new Utility_Class();

	@Test(dataProvider="Invalid_delete_blnk",dataProviderClass=Dataprovider_loc_loclist.DataProvider_del.class,groups={"loc_list"})
	public void test_Invalid_delloc_list_blnk(String TC_ID,String Order,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		int j = (int)Double.parseDouble(Order);
		for(int i=0;i<j;i++)
		{
			//System.out.println(j);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		
		initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_loc(uname,pwd);//,curr_name);//, Pwd);
		String Actual_Res = lpob.Invalid_delete_blnk();
	
		
		sAssert.assertEquals(Exp_Res, Actual_Res);
		
		if(Actual_Res.equals(Exp_Res))
		{
			
			log.info("Passed as Expected msg was Valid");
			
		}
		else
		{
			log.info("Failed as Expected msg was " +Exp_Res + "Actual msg was   "+Actual_Res);
			sAssert.fail("Failed as Expected msg was " +Exp_Res + "Actual msg was   "+Actual_Res);
			
		}
		
		
		tearDown();
		sAssert.assertAll();
		log.info("******************************************");
		}			
	}
	
	@Test(dataProvider="valid_frst_loc_del",dataProviderClass=Dataprovider_loc_loclist.DataProvider_del.class,groups={"loc_list"})
	public void valid_frst_loc_del(String TC_ID,String Order,String Exp_Res) throws IOException, InterruptedException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		
         initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_loc(uname,pwd);
		String Actual_Res = lpob.valid_frst_loc_del();
		
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
	
	
	@Test(dataProvider="Valid_mul_loc_del",dataProviderClass=Dataprovider_loc_loclist.DataProvider_del.class,groups={"loc_list"})
	public void Valid_mul_loc_del(String TC_ID,String Order,String Exp_Res) throws IOException, InterruptedException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
         initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_loc(uname,pwd);
		String Actual_Res = lpob.Valid_mul_loc_del();		
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
