package Scenario_shift;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_shift.Pageobject_del;

public class Scenario_del extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_del.class);
	Utility_Class c1= new Utility_Class();

	@Test(dataProvider="dp_Invaliddel_blnk",dataProviderClass=Dataprovider_shift.DataProvider_del.class,groups={"shift"})
	public void test_Invalid_delcountry_blnk(String TC_ID,String Order,String Exp_Res) throws IOException
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
		lpob.Commonprocess_shift(uname,pwd);//,curr_name);//, Pwd);
		String Actual_Res = lpob.getInvalidcountryResult_blnk();
	
		
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
	@Test(dataProvider="dp_validdel",dataProviderClass=Dataprovider_shift.DataProvider_del.class,groups={"shift"})
	public void test_valid_frstcountry_del(String TC_ID,String Order,String Exp_Res) throws IOException, InterruptedException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		
         initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_shift(uname,pwd);
		String Actual_Res = lpob.firstcountry_delete();
		
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
	
	
	@Test(dataProvider="dp_Valid_mul_del",dataProviderClass=Dataprovider_shift.DataProvider_del.class,groups={"shift"})
	public void test_valid_mul_del(String TC_ID,String Order,String Exp_Res) throws IOException, InterruptedException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
        initBrowsersession1();
		
		Pageobject_del lpob= new Pageobject_del(browser);
		lpob.Commonprocess_shift(uname,pwd);
		String Actual_Res = lpob.getValid_mul_del();		
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
