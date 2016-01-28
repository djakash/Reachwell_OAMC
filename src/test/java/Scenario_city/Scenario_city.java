package Scenario_city;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_city.PageObject_city;

public class Scenario_city extends Base_Class {
	
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_city.class);
	Utility_Class c1= new Utility_Class();

	
	
	@Test(dataProvider="dp_Invalidcurr_blnk",dataProviderClass=Dataprovider_city.DataProvider_city_create.class,groups={"city"})
	public void test_Invalidcurr_blnk(String TC_ID,String Order,String city_name,String Exp_Res) throws IOException
	{
		String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		
		initBrowsersession1();
		PageObject_city lpob= new PageObject_city(browser);
		lpob.Commonprocesscity(uname,pwd, city_name);//, Pwd);
		String Actual_Res = lpob.getInvalidcurrResult_blnk();
	
		
		sAssert.assertEquals(Exp_Res, Actual_Res);
		
		if(Actual_Res.equals(Exp_Res))
		{
			
			log.info("Passed as Expected msg was Valid");
		}
		else
		{
			log.info("Failed as Expected msg was "+Exp_Res + "Actual msg was   "+Actual_Res);
			sAssert.fail("Failed as Expected msg was "+Exp_Res + "Actual msg was   "+Actual_Res);
			
		}
		tearDown();
		sAssert.assertAll();
		log.info("******************************************");
				
	}
	
    @Test(dataProvider="dp_Invalidcurr",dataProviderClass=Dataprovider_city.DataProvider_city_create.class,groups={"city"})
	public void test_Invalidcurr(String TC_ID,String Order,String city_name,String Exp_Res) throws IOException
	{
    	String uname = c1.Reading_Properties("uname");
		String pwd = c1.Reading_Properties("pwd");
		log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
		
		initBrowsersession1();
		PageObject_city lpob= new PageObject_city(browser);
		lpob.Commonprocesscity(uname,pwd, city_name);//, Pwd);
		String Actual_Res = lpob.getInvalidcurrResult();		
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

@Test(dataProvider="dp_Validcurr",dataProviderClass=Dataprovider_city.DataProvider_city_create.class,groups={"city"})
public void test_Validcurr(String TC_ID,String Order,String city_name,String Exp_Res) throws IOException
{
	String uname = c1.Reading_Properties("uname");
	String pwd = c1.Reading_Properties("pwd");
	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
	//System.out.println("hi");
	initBrowsersession1();
	PageObject_city lpob= new PageObject_city(browser);
	lpob.Commonprocesscity(uname,pwd, city_name);//, Pwd);
	String Actual_Res = lpob.getvalidcurrResult();		
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
