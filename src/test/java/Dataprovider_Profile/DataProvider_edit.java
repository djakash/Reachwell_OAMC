package Dataprovider_Profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_edit {
	@DataProvider(name="Invalid_privi_test_blnk")
	public static Iterator<String[]> Invalid_privi_test_blnk() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_privi_test_blnk");
		return Obj.iterator();	
	}
	
	@DataProvider(name="Valid_privi_test")
	public static Iterator<String[]> Valid_privi_test() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Valid_privi_test");
		return Obj.iterator();	
	}

	@DataProvider(name="dp_Validcriti")
	public static Iterator<String[]> Validcritidata() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Valid_edit");
		return Obj.iterator();	
	}
	
	
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
		//"D:\\akash\\salenium\\Reach_OAMC\\Excel-files\\Profiles\\02_Reachwell_CP_Profiles_privileges_Data.xls"
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Profile\\02_Reachwell_CP_Profiles_privileges_Data.xls");
		HSSFSheet create_criti = x.Setsheet("edit_privi");
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
				
				String[] arr_login= new String[4];
				
				arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
				arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
				arr_login[2]=x.Readvalue(create_criti, xlRow, "role_name");
				arr_login[3]=x.Readvalue(create_criti, xlRow, "Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}


}
