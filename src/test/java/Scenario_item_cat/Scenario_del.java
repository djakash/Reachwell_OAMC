package Scenario_item_cat;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_item_cat.Pageobject_del;

public class Scenario_del extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_del.class);
	Utility_Class c1= new Utility_Class();

	@Test(dataProvider="Invalid_delete_blnk",dataProviderClass=Dataprovider_item_cat.DataProvider_del.class,groups={"branch"})
	public void Invalid_delete_blnk(String TC_ID,String Order,String Exp_Res) throws IOException
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
		lpob.Commonprocess_item_cat_del(uname,pwd);//,curr_name);//, Pwd);
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
	@Test(dataProvider="Valid_first_item_cat_delete",dataProviderClass=Dataprovider_item_cat.DataProvider_del.class,groups={"branch"})
	public void Valid_first_item_cat_delete(String TC_ID,String Order,String Exp_Res) throws IOException, InterruptedException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		
         initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_item_cat_del(uname,pwd);
		String Actual_Res = lpob.Valid_first_item_cat_delete();
		
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
	
	
	@Test(dataProvider="Valid_mul_item_cat_del",dataProviderClass=Dataprovider_item_cat.DataProvider_del.class,groups={"branch"})
	public void Valid_mul_item_cat_del(String TC_ID,String Order,String Exp_Res) throws IOException, InterruptedException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
        initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_item_cat_del(uname,pwd);
		String Actual_Res = lpob.Valid_mul_item_cat_del();		
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
