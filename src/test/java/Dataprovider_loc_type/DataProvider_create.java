package Dataprovider_loc_type;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;
public class DataProvider_create {
	
//1
	@DataProvider(name="Invalid_loctype_test_blnk")
	public static Iterator<String[]> Invalid_loctype_test_blnk() throws IOException
	{	
		List<String[]> Obj = flagRowCount("Invalid_loctype_test_blnk");
		return Obj.iterator();	
	}
	
//2	
	@DataProvider(name="Invalid_loctypename_test")
	public static Iterator<String[]> Invalid_loctypename_test() throws IOException
	{	
		List<String[]> Obj = flagRowCount("Invalid_loctypename_test");
		return Obj.iterator();	
	}
	
//3
	@DataProvider(name="Valid_loctype_test")
	public static Iterator<String[]> Valid_loctype_test() throws IOException
	{
		List<String[]> Obj = flagRowCount("Valid_loctype_test");
		return Obj.iterator();	
	}
	
	
	
	//to get the flag row count
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
		//"D:\\akash\\salenium\\Reach_OAMC\\Excel-files\\Loacation\\02_Reachwell_CP_loc_type_Data.xls"
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Location\\02_Reachwell_CP_loc_type_Data.xls");
		HSSFSheet create_criti = x.Setsheet("create_loc_type");
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
				
				String[] arr_login= new String[5];
				
				arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
				arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
				arr_login[2]=x.Readvalue(create_criti, xlRow, "loc_type");
				arr_login[3]=x.Readvalue(create_criti, xlRow, "desp");
				arr_login[4]=x.Readvalue(create_criti, xlRow, "Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}

}
