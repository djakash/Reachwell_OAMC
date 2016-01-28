package Scenario_Employ_qual;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_Employ_qual.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();

	
	@Test(dataProvider="dp_Validqual",dataProviderClass=Dataprovider_Employ_qual.DataProvider_edit.class,groups={"employ_Qualification"})
	public void test_Validqual(String TC_ID,String Order,String qual_name,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_edit lpob= new Pageobject_edit(browser);
		lpob.Commonprocessqual_edit(uname,pwd,TC_ID, qual_name,desp);//, Pwd);
		String Actual_Res = lpob.getvalidqualResult();		
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
	
	@Test(dataProvider="dp_Invalidqual_blnk",dataProviderClass=Dataprovider_Employ_qual.DataProvider_edit.class,groups={"employ_Qualification"})
	public void test_Invalidqual_blnk(String TC_ID,String Order,String qual_name,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_edit lpob= new Pageobject_edit(browser);
		lpob.Commonprocessqual_edit(uname,pwd,TC_ID, qual_name,desp);//, Pwd);
		String Actual_Res = lpob.getInvalidqualResult_blnk();		
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
	
	
	
@Test(dataProvider="dp_Invalidqual",dataProviderClass=Dataprovider_Employ_qual.DataProvider_edit.class,groups={"employ_Qualification"})
public void test_Invalidqual(String TC_ID,String Order,String qual_name,String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_edit lpob= new Pageobject_edit(browser);
	lpob.Commonprocessqual_edit(uname,pwd,TC_ID, qual_name,desp);//, Pwd);
	String Actual_Res = lpob.getInvalidqualResult();		
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
