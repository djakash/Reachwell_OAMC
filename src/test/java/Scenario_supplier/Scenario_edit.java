package Scenario_supplier;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_component.Base_Class;
import Generic_component.Utility_Class;
import PageObject_branch.Pageobject_edit;

public class Scenario_edit extends Base_Class{
	SoftAssert sAssert= new SoftAssert();
	static Logger log=Logger.getLogger(Scenario_edit.class);
	Utility_Class c1= new Utility_Class();

	
	//1	
		@Test(dataProvider="Invalid_brnchname_test_blnk",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
		public void Invalid_brnchname_test_blnk(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_brnchname_test_blnk(parent,branch_manager);		
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
		}//  getInvalidcritiResult_blnk

	//2
		@Test(dataProvider="Invalid_locatncode_test_blnk",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
		public void Invalid_locatncode_test_blnk(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_locatncode_test_blnk(parent,branch_manager);		
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
		@Test(dataProvider="Invalid_brnchcode_test_blnk",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
		public void Invalid_brnchcode_test_blnk(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
		{
			String uname = c1.Reading_Properties("uname");
			String pwd = c1.Reading_Properties("pwd");
			log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
			//System.out.println("hi");
			initBrowsersession1();
			Pageobject_edit lpob= new Pageobject_edit(browser);
			lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
			String Actual_Res = lpob.Invalid_brnchcode_test_blnk(parent,branch_manager);	
			System.out.println(Actual_Res);
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

		//4
			@Test(dataProvider="Invalid_frstname_test_blnk",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Invalid_frstname_test_blnk(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_frstname_test_blnk(parent,branch_manager);		
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
			@Test(dataProvider="Invalid_username_test_blnk",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Invalid_username_test_blnk(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_username_test_blnk(parent,branch_manager);		
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
		
	//6	
			@Test(dataProvider="Invalid_password_test_blnk",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Invalid_password_test_blnk(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_password_test_blnk(parent,branch_manager);		
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

			//A
			@Test(dataProvider="Invalid_same_brnchname_test",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Invalid_same_brnchname_test(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
			    log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_brnchname_test_blnk(parent,branch_manager);		
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
					
			//B
			@Test(dataProvider="Invalid_same_locatncode_test",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Invalid_same_locatncode_test(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
				log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_locatncode_test_blnk(parent,branch_manager);		
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

			//C
			@Test(dataProvider="Invalid_same_brnchcode_test",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Invalid_same_brnchcode_test(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
			   	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Invalid_brnchcode_test_blnk(parent,branch_manager);		
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
			@Test(dataProvider="Valid_brnch_test",dataProviderClass=Dataprovider_Branch.DataProvider_edit.class,groups={"branch"})
			public void Valid_brnch_test(String TC_ID,String Order,String branch_name,String location_code,String Branch_code,String First_name,String u_name,String password,String parent,String branch_manager,String Exp_Res) throws IOException
			{
				String uname = c1.Reading_Properties("uname");
				String pwd = c1.Reading_Properties("pwd");
			   	log.info("Executing the testcase "+TC_ID+  "  Order of  "+Order);
				//System.out.println("hi");
				initBrowsersession1();
				Pageobject_edit lpob= new Pageobject_edit(browser);
				lpob.Commonprocess_branch_edit(uname,pwd,branch_name,location_code,Branch_code,First_name,u_name,password);//,hr,min);//, Pwd);
				String Actual_Res = lpob.Valid_brnch_test(parent,branch_manager);		
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
