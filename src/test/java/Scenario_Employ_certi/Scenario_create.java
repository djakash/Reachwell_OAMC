package Scenario_Employ_certi;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_Employ_certi.Pageobject_create;

public class Scenario_create extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_create.class);
	Utility_Class c1= new Utility_Class();

	
	@Test(dataProvider="dp_Validcerti",dataProviderClass=Dataprovider_Employ_certi.DataProvider_create.class,groups={"employ_Certification"})
	public void test_Validcerti(String TC_ID,String Order,String certi_name,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocesscerti(uname,pwd,TC_ID, certi_name,desp);//, Pwd);
		String Actual_Res = lpob.getvalidcertiResult();		
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
	
	@Test(dataProvider="dp_Invalidcerti_blnk",dataProviderClass=Dataprovider_Employ_certi.DataProvider_create.class,groups={"employ_Certification"})
	public void test_Invalidcerti_blnk(String TC_ID,String Order,String certi_name,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocesscerti(uname,pwd,TC_ID, certi_name,desp);//, Pwd);
		String Actual_Res = lpob.getInvalidcertiResult_blnk();		
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
	
	
	
@Test(dataProvider="dp_Invalidcerti",dataProviderClass=Dataprovider_Employ_certi.DataProvider_create.class,groups={"employ_Certification"})
public void test_Invalidcerti(String TC_ID,String Order,String certi_name,String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_create lpob= new Pageobject_create(browser);
	lpob.Commonprocesscerti(uname,pwd,TC_ID, certi_name,desp);//, Pwd);
	String Actual_Res = lpob.getInvalidcertiResult();		
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
