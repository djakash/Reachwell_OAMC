package Dataprovider_Role_config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_edit {
	//1	
		@DataProvider(name="Invalid_rolename_test_blnk")
		public static Iterator<String[]> Invalid_rolename_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_rolename_test_blnk");
			return Obj.iterator();	
		}
	//2	
		@DataProvider(name="Invalid_stakeholder_test_blnk")
		public static Iterator<String[]> Invalid_stakeholder_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_stakeholder_test_blnk");
			return Obj.iterator();	
		}
	//3
		@DataProvider(name="Invalid_branch_test_blnk")
		public static Iterator<String[]> Invalid_branch_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_branch_test_blnk");
			return Obj.iterator();	
		}
	//4	
		@DataProvider(name="Invalid_department_test_blnk")
		public static Iterator<String[]> Invalid_department_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_department_test_blnk");
			return Obj.iterator();	
		}
	//5	
		@DataProvider(name="Valid_config_role_test")
		public static Iterator<String[]> Valid_config_role_test() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Valid_config_role_test");
			return Obj.iterator();	
		}
		
		//to get the flag row count
		public static List<String[]> flagRowCount(String script_name) throws IOException
		{
			
			ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Roles\\02_Reachwell_CP_Role_config_Data.xls");
			HSSFSheet create_criti = x.Setsheet("Edit_config_role");
			int xlRowcount = x.getrowcount(create_criti);
			
			//Declare a Array List
			List<String[]> List_login= new ArrayList<String[]>();
			
			//traversing Excel
			for(int xlRow=1;xlRow<=xlRowcount;xlRow++)
			{
				
				String Execute_Flag = x.Readvalue(create_criti, xlRow, "Execute_Flag");
				String Scriptname = x.Readvalue(create_criti, xlRow, "Scriptname");
				
				
				if((Execute_Flag.equals("Y")&&(Scriptname.equals(script_name))))
					{
					
					String[] arr_login= new String[8];
					
					arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
					arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
					arr_login[2]=x.Readvalue(create_criti, xlRow, "role_name");
					arr_login[3]=x.Readvalue(create_criti, xlRow, "desp");
					arr_login[4]=x.Readvalue(create_criti, xlRow, "stakeholder");
					arr_login[5]=x.Readvalue(create_criti, xlRow, "branch");
					arr_login[6]=x.Readvalue(create_criti, xlRow, "department");
					arr_login[7]=x.Readvalue(create_criti, xlRow, "Exp_Res");
					
					List_login.add(arr_login);			
					}//end of if
									
			}//end of for
			
			return List_login;

		}
}
