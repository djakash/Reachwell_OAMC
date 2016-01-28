package Scenario_loc_loclist;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_loc_loclist.Pageobject_create;

public class Scenario_create extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_create.class);
	Utility_Class c1= new Utility_Class();

	
	@Test(dataProvider="Invalid_loctype_test_blnk",dataProviderClass=Dataprovider_loc_loclist.DataProvider_create.class,groups={"loc_list"})
	public void Invalid_loctype_test_blnk(String TC_ID,String Order,String parent,String loc_type,String loc_code,String loc_name, String desp,String Exp_Res) throws IOException
	{

		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		//System.out.println(loc_list_head);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_loclist(uname,pwd);
		String Actual_Res = lpob.Invalid_loctype_test_blnk(parent,loc_type,loc_code,loc_name,desp);		
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
	
	@Test(dataProvider="Invalid_loctype_test",dataProviderClass=Dataprovider_loc_loclist.DataProvider_create.class,groups={"loc_list"})
	public void Invalid_loctype_test(String TC_ID,String Order,String parent,String loc_type,String loc_code,String loc_name, String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_loclist(uname,pwd);//, Pwd);
		String Actual_Res = lpob.Invalid_loctype_test(parent,loc_type,loc_code,loc_name,desp);		
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
	
	
	
@Test(dataProvider="Invalid_locname_test_blnk",dataProviderClass=Dataprovider_loc_loclist.DataProvider_create.class,groups={"loc_list"})
public void Invalid_locname_test_blnk(String TC_ID,String Order,String parent,String loc_type,String loc_code,String loc_name, String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_create lpob= new Pageobject_create(browser);
	lpob.Commonprocess_loclist(uname,pwd);
	String Actual_Res = lpob.Invalid_locname_test_blnk(parent,loc_type,loc_code,loc_name,desp);		
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

@Test(dataProvider="Invalid_same_locname_test",dataProviderClass=Dataprovider_loc_loclist.DataProvider_create.class,groups={"loc_list"})
public void Invalid_same_locname_test(String TC_ID,String Order,String parent,String loc_type,String loc_code,String loc_name, String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_create lpob= new Pageobject_create(browser);
	lpob.Commonprocess_loclist(uname,pwd);
	String Actual_Res = lpob.Invalid_same_locname_test(parent,loc_type,loc_code,loc_name,desp);		
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
@Test(dataProvider="Valid_loc_test",dataProviderClass=Dataprovider_loc_loclist.DataProvider_create.class,groups={"loc_list"})
public void Valid_loc_test(String TC_ID,String Order,String parent,String loc_type,String loc_code,String loc_name, String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_create lpob= new Pageobject_create(browser);
	lpob.Commonprocess_loclist(uname,pwd);
	String Actual_Res = lpob.Valid_loc_test(parent,loc_type,loc_code,loc_name,desp);		
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
