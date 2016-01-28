package Dataprovider_acc_class;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_component.ExcelReadWrite;

public class DataProvider_edit {
	//1
		@DataProvider(name="Invalid_acc_class_test_blnk")
		public static Iterator<String[]> Invalid_acc_class_test_blnk() throws IOException
		{	
			List<String[]> Obj = flagRowCount("Invalid_acc_class_test_blnk");
			return Obj.iterator();	
		}
		
	//2	
		@DataProvider(name="Invalid_acc_class_name_test")
		public static Iterator<String[]> Invalid_acc_class_name_test() throws IOException
		{	
			List<String[]> Obj = flagRowCount("Invalid_acc_class_name_test");
			return Obj.iterator();	
		}
		
	//3
		@DataProvider(name="Valid_acc_class_test")
		public static Iterator<String[]> Valid_acc_class_test() throws IOException
		{
			List<String[]> Obj = flagRowCount("Valid_acc_class_test");
			return Obj.iterator();	
		}
		
		
		
		//to get the flag row count
		public static List<String[]> flagRowCount(String script_name) throws IOException
		{
			
			ExcelReadWrite x=new ExcelReadWrite(System.getProperty("user.dir") + "\\Excel_sheets\\Asset\\02_Reachwell_CP_Asset_acc_class_Data.xls");
			HSSFSheet create_criti = x.Setsheet("Edit_acc_class");
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
					
					String[] arr_login= new String[6];
					
					arr_login[0]=x.Readvalue(create_criti, xlRow, "TC_ID");
					arr_login[1]=x.Readvalue(create_criti, xlRow, "Order");
					arr_login[2]=x.Readvalue(create_criti, xlRow, "parent");
					arr_login[3]=x.Readvalue(create_criti, xlRow, "acc_class");
					arr_login[4]=x.Readvalue(create_criti, xlRow, "desp");
					arr_login[5]=x.Readvalue(create_criti, xlRow, "Exp_Res");
					
					List_login.add(arr_login);			
					}//end of if
									
			}//end of for
			
			return List_login;
		}

}
