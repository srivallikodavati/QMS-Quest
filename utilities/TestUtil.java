package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.TestBase;
import ncPages.VerifyNCInitiationPage;
import ncTestCases.CreateNCTest;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT=90;
	public static long IMPLICIT_WAIT=60;
	public static long SLEEP_WAIT=1000;
	
	VerifyNCInitiationPage verifyInitiationPage;
	static TestUtil testUtil;
	CreateNCTest createNCTest;
	
	/* #################################
	 * Function Name: ChildWindowHandle
	 * Description: to handle new or additional windows
	 * #################################
	 */
	public void ChildWindowHandle()
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i1 = windows.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			driver.switchTo().window(ChildWindow);
		}
	}
	/* #################################
	 * Function Name: SwitchToFrame
	 * Description: to switch between frames
	 * #################################
	 */
	public void SwitchToFrame(int index)
	{
		try{
			driver.switchTo().frame(index);
		}
		catch(NoSuchFrameException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	/* #################################
	 * Function Name: CustomWait
	 * Description: to wait for specific WebElement in WebPage
	 * #################################
	 */
	public void CustomWait(int Time_IN_Seconds,String Objectxpath)
	{
		WebDriverWait wait= new WebDriverWait(driver,Time_IN_Seconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(
				By.xpath(Objectxpath))));
		
	}
	/* #################################
	 * Function Name: SetTextInNCTeamMemberPanel
	 * Description: to set roles in NC Team member Section
	 * #################################
	 */
	public boolean SetTextInNCTeamMemberPanel(String objectxpath,String value) throws InterruptedException
	{
		boolean setstatus=true;
		driver.findElement(By.xpath(objectxpath)).click();
		driver.findElement(By.xpath(objectxpath)).sendKeys(Keys.CONTROL+ "a");
		driver.findElement(By.xpath(objectxpath)).sendKeys(Keys.DELETE);
		//driver.findElement(By.xpath(objectxpath)).clear();
		driver.findElement(By.xpath(objectxpath)).sendKeys(value);
		Thread.sleep(SLEEP_WAIT);
		Thread.sleep(SLEEP_WAIT);
		//verifyInitiationPage.ClickOnAutopopulateText();
		driver.findElement(By.xpath("//li[@class='t-item t-state-selected']")).click();
		String enteredValue="";
		enteredValue=driver.findElement(By.xpath(objectxpath)).getAttribute("value");
		if(!enteredValue.equalsIgnoreCase(value))
			setstatus=false;
		Thread.sleep(SLEEP_WAIT);
		return setstatus;
		
	}
	/* #################################
	 * Function Name: GetWindowHandles
	 * Description: to switch between windows
	 * #################################
	 */
	public void GetWindowHandles()
	{
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows)
		{
			driver.switchTo().window(window);
		}
	}
	/* #################################
	 * Function Name: SearchNCRecord
	 * Description: to search record from NC table
	 * #################################
	 */
	public static String SearchNCRecord(String NC_RecordNum)
	{
		//WebElement NCTable=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
		//testUtil.CustomWait(60,"//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a");
		//testUtil.ExplicitWaitToAnElement(60, NCTable);
		int row_count=driver.findElements(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a")).size();
		boolean found = false;
		//WebElement NCTableLocator=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
		for(int i=1;i<=row_count;i++ ){
			String record=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr["+i+"]/td/div/span/a")).getText();
			if(record.equals(NC_RecordNum))
			{
		      found=true;
		      driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr["+i+"]/td/div/span/a")).click();
			  break;
			}
			  else
			  found=false;
		}
		if(found=true)
		{
			System.out.println("NC Record found: "+NC_RecordNum);
		    return NC_RecordNum;
		}
		else
			System.out.println("NC Record not found: "+NC_RecordNum);
		     return NC_RecordNum;
		
	}
	/* #################################
	 * Function Name: TakeScreenshot
	 * Description: it takes screenshot of webpage
	 * #################################
	 */
	public void TakeScreenshot(String ScreenshotName)
	{
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+ScreenshotName+".png"));
		} catch (Exception e) {
			System.out.println("Exception while taking the screenshot "+e.getMessage());
		}	
	}
	/* #################################
	 * Function Name: ExplicitWaitToAnElement
	 * Description: it waits for specific element in a web page
	 * #################################
	 */
	public void ExplicitWaitToAnElement(int Time,WebElement ele)
	{
		try{
		WebDriverWait wait= new WebDriverWait(driver,Time);
		wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
	}
	/* #################################
	 * Function Name: GetTextFromAlertWindow
	 * Description: get text from Alert Errors Window
	 * #################################
	 */
	public void GetTextFromAlertWindow() throws InterruptedException
	{
		List<WebElement> list=driver.findElements(By.className("errorPromptSpanLink"));
		for(WebElement err:list)
		{
			String errormsg=err.getText();
			System.out.println(errormsg);
			Thread.sleep(1000);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
