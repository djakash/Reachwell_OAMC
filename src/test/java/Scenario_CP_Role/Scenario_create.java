package Scenario_CP_Role;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import Pageobject_CP_Role.Pageobject_create;

public class Scenario_create extends Base_Class{

	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_create.class);
	Utility_Class c1= new Utility_Class();

/*//1
	@Test(dataProvider="Invalid_rolename_test_blnk",dataProviderClass=Dataprovider_CP_Role.DataProvider_create.class,groups={"Role"})
	public void test_Validrole(String TC_ID,String Order,String role_name,String parent,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		
		//System.out.println(region_head);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_Roles_Role(uname,pwd,role_name,parent,desp);//, Pwd);
		String Actual_Res = lpob.Invalid_Rolecode_test_blnk();		
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

//2
	@Test(dataProvider="Invalid_rolename_test",dataProviderClass=Dataprovider_CP_Role.DataProvider_create.class,groups={"Role"})
	public void Invalid_rolename_test(String TC_ID,String Order,String role_name,String parent,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		
		//System.out.println(region_head);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_Roles_Role(uname,pwd,role_name,parent,desp);//, Pwd);
		String Actual_Res = lpob.Invalid_Rolename_test();		
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

/*//3
	@Test(dataProvider="Valid_role_test",dataProviderClass=Dataprovider_CP_Role.DataProvider_create.class,groups={"Role"})
	public void Valid_role_test(String TC_ID,String Order,String role_name,String parent,String desp,String Exp_Res) throws IOException
	{
		
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		//System.out.println(region_head);
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_create lpob= new Pageobject_create(browser);
		lpob.Commonprocess_Roles_Role(uname,pwd,role_name,parent,desp);//, Pwd);
		String Actual_Res = lpob.Valid_Role_test();		
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
