package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.TestBase;
import ncPages.VerifyNCInitiationPage;
import ncTestCases.CreateNCTest;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT=60;
	public static long IMPLICIT_WAIT=60;
	public static long SLEEP_WAIT=1000;
	
	VerifyNCInitiationPage verifyInitiationPage;
	TestUtil testUtil;
	CreateNCTest createNCTest;
	
	public void ChildWindowHandle()
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i1 = windows.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			driver.switchTo().window(ChildWindow);
		}
	}


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

	public void CustomWait(int Time_IN_Seconds,String Objectxpath)
	{
		WebDriverWait wait= new WebDriverWait(driver,Time_IN_Seconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(
				By.xpath(Objectxpath))));
	}

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

	public void GetWindowHandles()
	{
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows)
		{
			driver.switchTo().window(window);
		}
	}
	
	public void SearchNCRecord()
	{
		testUtil.CustomWait(60,"//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a");
		int row_count=driver.findElements(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a")).size();
		boolean found = false;
		WebElement NCTableLocator=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
		for(int i=1;i<=row_count;i++ ){
			String record=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr["+i+"]/td/div/span/a")).getText();
			if(record.equals(CreateNCTest.NC_RecordNum))
	//if(record.equals(NC_RecordNum))
			{
		      found=true;
		      driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr["+i+"]/td/div/span/a")).click();
			  break;
			}
			  else
			  found=false;
		}
		if(found=true)
			System.out.println("NC Record found: "+CreateNCTest.NC_RecordNum);
		//System.out.println("NC Record found: "+NC_RecordNum);
		else
			System.out.println("NC Record not found: "+CreateNCTest.NC_RecordNum);
		//System.out.println("NC Record not found: "+NC_RecordNum);
	}
}
