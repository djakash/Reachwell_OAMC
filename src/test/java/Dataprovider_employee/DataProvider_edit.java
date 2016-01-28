package Dataprovider_employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_edit {
	//1
		@DataProvider(name="Invalid_firstname_test_blnk")
		public static Iterator<String[]> Invalid_firstname_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_firstname_test_blnk");
			return Obj.iterator();	
		}
	//2	
		@DataProvider(name="Invalid_empcode_test_blnk")
		public static Iterator<String[]> Invalid_empcode_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_empcode_test_blnk");
			return Obj.iterator();	
		}
	//3
		@DataProvider(name="Invalid_login_id_test_blnk")
		public static Iterator<String[]> Invalid_login_id_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_login_id_test_blnk");
			return Obj.iterator();	
		}
	//4	
		@DataProvider(name="Invalid_pass_test_blnk")
		public static Iterator<String[]> Invalid_pass_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_pass_test_blnk");
			return Obj.iterator();	
		}
	//5
		@DataProvider(name="Invalid_same_empcode_test")
		public static Iterator<String[]> Invalid_brnchcode_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_same_empcode_test");
			return Obj.iterator();	
		}
	//6
		@DataProvider(name="Invalid_same_loginid_test")
		public static Iterator<String[]> Invalid_same_loginid_test() throws IOException
		{
		
	      	List<String[]> Obj = flagRowCount("Invalid_same_loginid_test");
			return Obj.iterator();	
		}	
	//7
		@DataProvider(name="Valid_brnch_test")
		public static Iterator<String[]> Validcritidata() throws IOException
		{
			List<String[]> Obj = flagRowCount("Valid_brnch_test");
			return Obj.iterator();	
		}
		
		
		
		//to get the flag row count
		public static List<String[]> flagRowCount(String script_name) throws IOException
		{
			
			ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Employee\\01_Reachwell_CP_Employee_list_Data.xls");
			HSSFSheet create_criti = x.Setsheet("edit_employ");
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
					
					String[] arr_login= new String[11];
					
					arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
					arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
					arr_login[2]=x.Readvalue(create_criti, xlRow, "employ_code");
					arr_login[3]=x.Readvalue(create_criti, xlRow, "first_name");
					arr_login[4]=x.Readvalue(create_criti, xlRow, "login_id");
					arr_login[5]=x.Readvalue(create_criti, xlRow, "password");
					arr_login[6]=x.Readvalue(create_criti, xlRow, "landline");
					arr_login[7]=x.Readvalue(create_criti, xlRow, "e_mail");
					arr_login[8]=x.Readvalue(create_criti, xlRow, "qual");
					arr_login[9]=x.Readvalue(create_criti, xlRow, "cert");
					arr_login[10]=x.Readvalue(create_criti, xlRow,"Exp_Res");
					
					List_login.add(arr_login);			
					}//end of if
									
			}//end of for
			
			return List_login;
		}
}
