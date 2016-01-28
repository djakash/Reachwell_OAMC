package PageObject_criticality;

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
		@FindBy(xpath="//li[@id='Masters']")
		 WebElement MastButt;
		
		//criticality click
	    @FindBy(xpath="//span[text()=' Criticality']")
	    WebElement clk_criti;
		////////////////////////////////////////////////


	  //main delete button 
	    @FindBy(xpath="//*[@id='CriticalityTableContainer']/div/div[3]/div[2]/span[1]/span[2]")
	    WebElement click_delete_main;


	    //blank delete error OK conifirmation
	    	@FindBy(xpath="//button[@class='btn btn-primary']")
	    	WebElement main_delete_OK;
	    	
	    	//blank delete error msg text
	        @FindBy(xpath="html/body/ul/li/div/div[1]/span")
	        WebElement blnk_delete_error;


	    	//first row text 
	    	@FindBy(xpath="//*[@id='CriticalityTableContainer']/div/table/tbody/tr[1]/td[2]")
	    	WebElement first_row_text;
	    	
	    	//first check box click
	    		@FindBy(xpath="//*[@id='CriticalityTableContainer']/div/table/tbody/tr[1]/td[1]/input")
	    		WebElement clk_first_checkbox_curr;
	    	
	    		//first checkbox delete button
	    		@FindBy(xpath="//button[@class='jtable-command-button jtable-delete-command-button']")
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

//method to click Masters
public void Click_Masters()
{
MastButt.click();

}


//method to click criticality
	public void click_criti()
	{
		clk_criti.click();
		
	}
//////////////////////////////////////////////////////////////////




	public String getInvalidcurrResult_blnk()
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

	public String firstcurr_delete() throws InterruptedException
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
			browser.findElement(By.xpath("//*[@id='CriticalityTableContainer']/div/table/tbody/tr["+j+"]/td[2]")).click();
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
	}



	public void Commonprocess_criti(String UN,String PW)
	{
		  browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		UNtext.clear();
	  UNtext.sendKeys(UN);
	  browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	  PassTf.clear();
	  PassTf.sendKeys(PW, Keys.ENTER);
	  browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		Click_CP();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		Click_Masters();
		browser.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		click_criti();
		
		
	}
}
