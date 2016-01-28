package Dataprovider_city;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_city_create {
	
	@DataProvider(name="dp_Invalidcurr_blnk")
	public static Iterator<String[]> Invalidcurr_blnkdata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_city_test_blnk");
		return Obj.iterator();	
	}
	
	@DataProvider(name="dp_Invalidcurr")
	public static Iterator<String[]> Invalidcurrdata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_city_test");
		return Obj.iterator();	
	}

	@DataProvider(name="dp_Validcurr")
	public static Iterator<String[]> Validcurrdata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Valid_city_test");
		return Obj.iterator();	
	}
	
	
	
	//to get the flag row count
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
		//"D:\\akash\\salenium\\Reach_OAMC\\Excel-files\\04_Reachwell_masters_city_Data.xls"
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir")+"\\Excel_sheets\\Masters\\04_Reachwell_masters_city_Data.xls");
		HSSFSheet create_curr = x.Setsheet("create_city");
		int xlRowcount = x.getrowcount(create_curr);
		
		//Declare a Array List
		List<String[]> List_login= new ArrayList<String[]>();
		
		//traversing Excel
		for(int xlRow=1;xlRow<=xlRowcount;xlRow++)
		{
			
			String Execute_Flag = x.Readvalue(create_curr, xlRow, "Execute_Flag");
			String Scriptname = x.Readvalue(create_curr, xlRow, "Scriptname");
			
			
			if((Execute_Flag.equals("Y")&&(Scriptname.equals(script_name))))
				{
				
				String[] arr_login= new String[4];
				
				arr_login[0]=x.Readvalue(create_curr, xlRow, "TC_ID");
				arr_login[1]=x.Readvalue(create_curr, xlRow, "Order");
				arr_login[2]=x.Readvalue(create_curr, xlRow, "city_name");
				//arr_login[3]=x.Readvalue(create_curr, xlRow, "Pwd");
				arr_login[3]=x.Readvalue(create_curr, xlRow, "Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}

}
