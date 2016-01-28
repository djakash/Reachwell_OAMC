package Dataprovider_supplier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_edit {
	//1
		@DataProvider(name="Invalid_brnchname_test_blnk")
		public static Iterator<String[]> Invalid_brnch_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_brnchname_test_blnk");
			return Obj.iterator();	
		}
	//2	
		@DataProvider(name="Invalid_locatncode_test_blnk")
		public static Iterator<String[]> Invalid_locatncode_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_locatncode_test_blnk");
			return Obj.iterator();	
		}
	//3	
		@DataProvider(name="Invalid_brnchcode_test_blnk")
		public static Iterator<String[]> Invalid_brnchcode_test_blnk() throws IOException
		{
			
			List<String[]> Obj = flagRowCount("Invalid_brnchcode_test_blnk");
			return Obj.iterator();	
		}
		
	//4
		@DataProvider(name="Invalid_frstname_test_blnk")
		public static Iterator<String[]> Invalid_frstname_test_blnk() throws IOException
		{
			List<String[]> Obj = flagRowCount("Invalid_frstname_test_blnk");
			return Obj.iterator();	
		}	
		
		//5
			@DataProvider(name="Invalid_username_test_blnk")
			public static Iterator<String[]> Invalid_username_test_blnk() throws IOException
			{
				List<String[]> Obj = flagRowCount("Invalid_username_test_blnk");
				return Obj.iterator();	
			}		
		
			//6
			@DataProvider(name="Invalid_password_test_blnk")
			public static Iterator<String[]> Invalid_password_test_blnk() throws IOException
			{
				List<String[]> Obj = flagRowCount("Invalid_password_test_blnk");
				return Obj.iterator();	
			}	

			//A
			@DataProvider(name="Invalid_same_brnchname_test")
			public static Iterator<String[]> Invalid_same_brnchname_test() throws IOException
			{
				List<String[]> Obj = flagRowCount("Invalid_same_brnchname_test");
		     	return Obj.iterator();	
			}	
					
			//B
			@DataProvider(name="Invalid_same_locatncode_test")
			public static Iterator<String[]> Invalid_same_locatncode_test() throws IOException
			{
				List<String[]> Obj = flagRowCount("Invalid_same_locatncode_test");
				return Obj.iterator();	
			}	
					
			//C
			@DataProvider(name="Invalid_same_brnchcode_test")
			public static Iterator<String[]> Invalid_same_brnchcode_test() throws IOException
			{
				List<String[]> Obj = flagRowCount("Invalid_same_brnchcode_test");
				return Obj.iterator();	
			}	
			
			@DataProvider(name="Valid_brnch_test")
			public static Iterator<String[]> Validcritidata() throws IOException
			{
				
				List<String[]> Obj = flagRowCount("Valid_brnch_test");
				return Obj.iterator();	
			}
			
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
		
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Supplier\\Reachwell_CP_Supplier_Data.xls");
		HSSFSheet create_criti = x.Setsheet("Edit_branch");
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
				arr_login[2]=x.Readvalue(create_criti, xlRow, "branch_name");
				arr_login[3]=x.Readvalue(create_criti, xlRow, "location_code");
				arr_login[4]=x.Readvalue(create_criti, xlRow, "Branch_code");
				arr_login[5]=x.Readvalue(create_criti, xlRow, "First_name");
				arr_login[6]=x.Readvalue(create_criti, xlRow, "u_name");
				arr_login[7]=x.Readvalue(create_criti, xlRow, "password");
				arr_login[8]=x.Readvalue(create_criti, xlRow, "parent");
				arr_login[9]=x.Readvalue(create_criti, xlRow, "branch_manager");
				arr_login[10]=x.Readvalue(create_criti, xlRow,"Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}
}
