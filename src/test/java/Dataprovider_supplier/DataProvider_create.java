package Dataprovider_supplier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;
public class DataProvider_create {

//1
	@DataProvider(name="Invalid_supplier_name_test_blnk")
	public static Iterator<String[]> Invalid_supplier_name_test_blnk() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_supplier_name_test_blnk");
		return Obj.iterator();	
	}
//2	
	@DataProvider(name="Invalid_same_supplier_name_test")
	public static Iterator<String[]> Invalid_same_supplier_name_test() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_same_supplier_name_test");
		return Obj.iterator();	
	}
	
//3	
	@DataProvider(name="Valid_supplier_test")
	public static Iterator<String[]> Valid_supplier_test() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Valid_supplier_test");
		return Obj.iterator();	
	}
/*	
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
		
		//D
		@DataProvider(name="Invalid_same_username_test")
		public static Iterator<String[]> Invalid_same_username_test() throws IOException
		{
			List<String[]> Obj = flagRowCount("Invalid_same_username_test");
			return Obj.iterator();	
		}
		
		
		//3	
	@DataProvider(name="dp_Invalidbranch_blnk")
	public static Iterator<String[]> Invalidcriti_blnkdata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_brnch_test_blnk");
		return Obj.iterator();	
	}
//4	
	@DataProvider(name="dp_Invalidbranch_blnk")
	public static Iterator<String[]> Invalidcriti_blnkdata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_brnch_test_blnk");
		return Obj.iterator();	
	}
	
	
	@DataProvider(name="dp_Invalidbranch_blnk")
	public static Iterator<String[]> Invalidcriti_blnkdata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_brnch_test_blnk");
		return Obj.iterator();	
	}
	
	@DataProvider(name="dp_InvalidCountry")
	public static Iterator<String[]> Invalidcritidata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_brnch_test");
		return Obj.iterator();	
	}

	@DataProvider(name="Valid_brnch_test")
	public static Iterator<String[]> Validcritidata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Valid_brnch_test");
		return Obj.iterator();	
	}*/
	
	
	
	//to get the flag row count
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
	//"D:\\akash\\salenium\\Reach_OAMC\\Excel-files\\Supplier\\Reachwell_CP_Supplier_Data.xls"	
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Supplier\\Reachwell_CP_Supplier_Data.xls");
		HSSFSheet create_criti = x.Setsheet("Create_supplier");
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
				
				String[] arr_login= new String[16];
				
				arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
				arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
				arr_login[2]=x.Readvalue(create_criti, xlRow, "supplier_name");
				arr_login[3]=x.Readvalue(create_criti, xlRow, "address");
				arr_login[4]=x.Readvalue(create_criti, xlRow, "city");
				arr_login[5]=x.Readvalue(create_criti, xlRow, "state");
				arr_login[6]=x.Readvalue(create_criti, xlRow, "country");
				arr_login[7]=x.Readvalue(create_criti, xlRow, "email");
				arr_login[8]=x.Readvalue(create_criti, xlRow, "phone");
				arr_login[9]=x.Readvalue(create_criti, xlRow, "website");
				arr_login[10]=x.Readvalue(create_criti, xlRow, "fax");
				arr_login[11]=x.Readvalue(create_criti, xlRow, "bank");
				arr_login[12]=x.Readvalue(create_criti, xlRow, "acc_no");
				arr_login[13]=x.Readvalue(create_criti, xlRow, "ifsc");
				arr_login[14]=x.Readvalue(create_criti, xlRow, "ARMS");
				arr_login[15]=x.Readvalue(create_criti, xlRow,"Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}

}
