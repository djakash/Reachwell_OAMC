package Scenario_invoice;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_invoice.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_create.class);
	Utility_Class c1= new Utility_Class();

	
	
	
	@Test(dataProvider="Invalid_edit_blnk",dataProviderClass=Dataprovider_invoice.DataProvider_edit.class,groups={"invoice"})
	public void Invalid_edit_blnk(String TC_ID,String Order,String invoice_name,String desp,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		//System.out.println("hi");
		initBrowsersession1();
		Pageobject_edit lpob= new Pageobject_edit(browser);
		lpob.Commonprocessinvoice(uname,pwd,TC_ID, invoice_name,desp);//, Pwd);
		String Actual_Res = lpob.Invalid_edit_blnk();		
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
	
	
	
@Test(dataProvider="Invalid_edit",dataProviderClass=Dataprovider_invoice.DataProvider_edit.class,groups={"invoice"})
public void Invalid_edit(String TC_ID,String Order,String invoice_name,String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_edit lpob= new Pageobject_edit(browser);
	lpob.Commonprocessinvoice(uname,pwd,TC_ID, invoice_name,desp);//, Pwd);
	String Actual_Res = lpob.Invalid_edit();		
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

@Test(dataProvider="Valid_edit",dataProviderClass=Dataprovider_invoice.DataProvider_edit.class,groups={"invoice"})
public void Valid_edit(String TC_ID,String Order,String invoice_name,String desp,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	Pageobject_edit lpob= new Pageobject_edit(browser);
	lpob.Commonprocessinvoice(uname,pwd,TC_ID, invoice_name,desp);//, Pwd);
	String Actual_Res = lpob.Valid_edit();		
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
