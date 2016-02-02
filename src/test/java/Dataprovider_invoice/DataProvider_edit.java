package Dataprovider_invoice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_edit {
	@DataProvider(name="Invalid_edit_blnk")
	public static Iterator<String[]> Invalid_edit_blnk() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_edit_blnk");
		return Obj.iterator();	
	}
	
	@DataProvider(name="Invalid_edit")
	public static Iterator<String[]> Invalid_edit() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Invalid_edit");
		return Obj.iterator();	
	}

	@DataProvider(name="Valid_edit")
	public static Iterator<String[]> Valid_edit() throws IOException
	{
		
		List<String[]> Obj = flagRowCount("Valid_edit");
		return Obj.iterator();	
	}
	
	
	public static List<String[]> flagRowCount(String script_name) throws IOException
	{
		
		ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir")+"\\Excel_sheets\\MAsters\\03_Reachwell_masters_invoice_Data.xls");
		HSSFSheet create_criti = x.Setsheet("Edit_invoice");
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
				arr_login[2]=x.Readvalue(create_criti, xlRow, "invoice_name");
				arr_login[3]=x.Readvalue(create_criti, xlRow, "desp");
				arr_login[4]=x.Readvalue(create_criti, xlRow, "Exp_Res");
				
				List_login.add(arr_login);			
				}//end of if
								
		}//end of for
		
		return List_login;
	}


}
