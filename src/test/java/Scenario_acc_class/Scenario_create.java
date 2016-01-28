package Scenario_acc_class;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_acc_class.Pageobject_create;

public class Scenario_create extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_create.class);
	Utility_Class c1= new Utility_Class();
//1
	@Test(dataProvider="Invalid_acc_class_test_blnk",dataProviderClass=Dataprovider_acc_class.DataProvider_create.class,groups={"acc_class"})
	public void Invalid_acc_class_test_blnk(String TC_ID,String Order,String parent,String acc_class,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_acc_class(uname,pwd,parent,acc_class,desp);
		String Actual_Res = lpob.Invalid_acc_class_test_blnk();		
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
	
	@Test(dataProvider="Invalid_acc_class_name_test",dataProviderClass=Dataprovider_acc_class.DataProvider_create.class,groups={"acc_class"})
	public void Invalid_acc_class_name_test(String TC_ID,String Order,String parent,String acc_class,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		
		//System.out.println(region_head);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_acc_class(uname,pwd,parent,acc_class,desp);
		String Actual_Res = lpob.Invalid_acc_class_name_test();		
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
	@Test(dataProvider="Valid_acc_class_test",dataProviderClass=Dataprovider_acc_class.DataProvider_create.class,groups={"acc_class"})
	public void Valid_acc_class_test(String TC_ID,String Order,String parent,String acc_class,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		
		//System.out.println(region_head);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_acc_class(uname,pwd,parent,acc_class,desp);
		String Actual_Res = lpob.Valid_acc_class_test();		
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
