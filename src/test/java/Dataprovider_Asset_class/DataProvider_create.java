package Dataprovider_Asset_class;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;
public class DataProvider_create {

//1
	@DataProvider(name="Invalid_acc_class_test_blnk")
	public static Iterator<String[]> Invalid_acc_class_test_blnk() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_acc_class_test_blnk");
		return Obj.iterator();	
	}
//2	
	@DataProvider(name="Invalid_asset_class_test_blnk")
	public static Iterator<String[]> Invalid_asset_class_test_blnk() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_asset_class_test_blnk");
		return Obj.iterator();	
	}
//3	
	@DataProvider(name="Invalid_same_asset_class_test")
	public static Iterator<String[]> Invalid_same_asset_class_test() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_same_asset_class_test");
		return Obj.iterator();	
	}
	
//4
	@DataProvider(name="Valid_asset_test")
	public static Iterator<String[]> Valid_asset_test() throws IOException
	{
		List<String[]> Obj = flagRowCount("Valid_asset_test");
		return Obj.iterator();	
	}	

	
	
	
	//to get the flag row count
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
	//"D:\\akash\\salenium\\Reach_OAMC\\Excel-files\\Asset\\01_Reachwell_Asset_assset_class_Data.xls"	
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Asset\\01_Reachwell_Asset_assset_class_Data.xls");
		HSSFSheet create_criti = x.Setsheet("create_asset_class");
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
				
				String[] arr_login= new String[7];
				
				arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
				arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
				arr_login[2]=x.Readvalue(create_criti, xlRow, "acc_class");
				arr_login[3]=x.Readvalue(create_criti, xlRow, "parent_class");
				arr_login[4]=x.Readvalue(create_criti, xlRow, "asset_class");
				arr_login[5]=x.Readvalue(create_criti, xlRow, "desp");
				arr_login[6]=x.Readvalue(create_criti, xlRow,"Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}

}
