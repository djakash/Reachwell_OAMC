package Pageobject_Employ_desig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageobject_del {
	
	WebDriver browser;
	//*************************************************
		//Strorage for Elements
		///////////////for login///////////////////////
		@FindBy(xpath="//input[@id='username']")
		 WebElement UNtext;
	    
	    @FindBy(xpath="//input[@id='password']")
	    WebElement PassTf;
		////////////////////////////////////////////////
	    
	    /////////// Control panel and Masters //////////
	    @FindBy(xpath="//span[text()='Control Panel']")
	    WebElement controlbutt;
	    @FindBy(linkText="Employee")
		 WebElement employbutt;
	    
	  //Designation click
	    @FindBy(linkText="Designation")
	    WebElement clk_desig;
		////////////////////////////////////////////////


	  //main delete button 
	    @FindBy(xpath="//*[@id='DesignationTableContainer']/div/div[3]/div[2]/span[2]/span[2]")
	    WebElement click_delete_main;


	    //blank delete error OK conifirmation
	    	@FindBy(xpath="//button[@class='btn btn-primary']")
	    	WebElement main_delete_OK;
	    	
	    	//blank delete error msg text
	        @FindBy(xpath="html/body/ul/li/div/div[1]/span")
	        WebElement blnk_delete_error;


	    	//first row text 
	        
	    	@FindBy(xpath="//*[@id='DesignationTableContainer']/div/table/tbody/tr[1]/td[2]")
	    	WebElement first_row_text;
	    	
	    	//first check box click
	    		@FindBy(xpath="//*[@id='DesignationTableContainer']/div/table/tbody/tr[1]/td[1]/input")
	    		WebElement clk_first_checkbox_curr;
	    	
	    		//first checkbox delete button
	    		@FindBy(xpath="//*[@id='DesignationTableContainer']/div/table/tbody/tr[1]/td[8]/button")
	    		WebElement frst_chkbox_delete;	
	    	
	    		//sub delete button OK confirmation
	    		@FindBy(xpath="//button[@id='DeleteDialogButton']")
	    		WebElement subdelete_OK;
	    		
	    		
public Pageobject_del(WebDriver Dbrowser)
{
this.browser=Dbrowser;
PageFactory.initElements(browser, this);
}

public void Click_CP()
{
controlbutt.click();

}

//method to click employee
		public void Click_Employee()
		{ 
			employbutt.click();
			
		}
	
	// method to click desig
	public void click_desig()
	{
		clk_desig.click();
		
	}
//////////////////////////////////////////////////////////////////




	public String getInvalidemploy_desigResult_blnk()
	{
		click_delete_main.click();
		
		//click delete button
				WebElement element = browser.findElement(By.xpath("html/body/ul/li/div/div[2]/button"));
				WebDriverWait wait = new WebDriverWait(browser, 10); //here, wait time is 02 seconds

				//wait for delete pop_up message
				wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 02 seconds
				 String text = blnk_delete_error.getText();
				browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 element.click();
				 browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			main_delete_OK.click();
			return text;
	}

	public String firstemploy_desig_delete() throws InterruptedException
	{
		String Actual_reslt = null;//=null;
		String initial_value = first_row_text.getText();
		//clk_first_checkbox_curr.click();
		frst_chkbox_delete.click();
		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		subdelete_OK.click();
		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		browser.navigate().refresh();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String after_del_value = first_row_text.getText();
		if(!(after_del_value.equals(initial_value)))
			Actual_reslt="Deleted";
		//Thread.sleep(3000);
		return Actual_reslt;
	}




	public String getValid_mul_del()
	{
		String Actual_reslt = null;
		String initial_value = first_row_text.getText();
		//clk_first_checkbox_curr.click();
		//frst_chkbox_delete.click();
		//browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		for(int j=1;j<=2;j++)
		{	
			browser.findElement(By.xpath("//*[@id='DesignationTableContainer']/div/table/tbody/tr["+j+"]/td[1]/input")).click();
			//browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		}
		
		click_delete_main.click();
		
		//click delete button
		WebElement element = browser.findElement(By.xpath("//button[@class='btn btn-primary']"));
		WebDriverWait wait = new WebDriverWait(browser, 10); //here, wait time is 02 seconds

		//wait for delete pop_up message
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.navigate().refresh();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String after_del_value = first_row_text.getText();
			if(!(after_del_value.equals(initial_value)))
				Actual_reslt="Deleted";
			//Thread.sleep(3000);
			return Actual_reslt;
		
		/*res="Deleted";
		return res;*/
	}



	public void Commonprocess_employ_desig_del(String UN,String PW)
	{
		UNtext.clear();
	  UNtext.sendKeys(UN);
	  PassTf.clear();
	  PassTf.sendKeys(PW, Keys.ENTER);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Click_Employee();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click_desig();
		
		
	}
}
