package ncTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.TestBase;
import ncPages.ConnectingPage;
import ncPages.CreateNCRecordPage;
import ncPages.LoginPage;
import ncPages.NCHomePage;
import ncPages.PopUpWindowPage;
import utilities.TestUtil;

public class NCR_Initiation_FormPropertiesTest extends TestBase{
	public static String NC_RecordNum;
	LoginPage loginPage;
	NCHomePage ncHomePage;
	CreateNCRecordPage createNCRecord;
	TestUtil testUtil;
	ConnectingPage connectingPage;
	PopUpWindowPage popupWindow;
	private String mainWindow;
	
	public NCR_Initiation_FormPropertiesTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		Initialization();
		loginPage = new LoginPage();
		createNCRecord = new CreateNCRecordPage();
		ncHomePage = new NCHomePage();
		testUtil = new TestUtil();
		connectingPage = new ConnectingPage();
		popupWindow = new PopUpWindowPage();
		
	}
	@Test
	public void NCR_InitiationFormProperties() throws InterruptedException
	{
		ncHomePage = loginPage.Login(prop.getProperty("NC_Role"), prop.getProperty("password"));
		testUtil.CustomWait(120, "//a[contains(text(),'Create Nonconformance')]");
		ncHomePage.clickOnCreateNC();
	    testUtil.SwitchToFrame(1);
	    Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.CustomWait(60, "//span[@id='ui-dialog-title-dialog-popup']");
		createNCRecord.checkNCTitle();
		createNCRecord.SubmitButton();
		testUtil.ChildWindowHandle();
		testUtil.SwitchToFrame(1);
		testUtil.GetTextFromAlertWindow();
		createNCRecord.closeAlertPopUp();
		driver.switchTo().defaultContent();
		testUtil.SwitchToFrame(1);
		createNCRecord.ncIsDisplayed();
		createNCRecord.devIsDisplayed();
		createNCRecord.materialIsdisplayed();
		createNCRecord.processIsdisplayed();
		createNCRecord.CreateNC_PInP();
		createNCRecord.sourceRadioButtonsIsDisplayed();
		System.out.println("Source Number: "+createNCRecord.sourceNumberIsDisplayed());
		mainWindow = driver.getWindowHandle();
		createNCRecord.clickOnSiteZoom();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.ChildWindowHandle();
		System.out.println("Title on Site popUp: "+createNCRecord.getTitleOnSitePopUp());
		testUtil.SwitchToFrame(1);
		List<WebElement> SiteTable=driver.findElements(By.xpath("//*[@id='ctl04_resultGrid_ctl00']/tbody/tr/td[2]"));
		boolean found=false;
		for(int i=1;i<=SiteTable.size();i++)
		{
			String text=driver.findElement(By.xpath("//*[@id='ctl04_resultGrid_ctl00']/tbody/tr["+i+"]/td[2]")).getText();
			if (text.equalsIgnoreCase("Arthrex"))
					
			{
				found=true;
				break;
			}else
			
				found=false;
		}
		if(found=false)
			System.out.println("Arthrex Inc is present in Site table");
		else
			System.out.println("Arthrex Inc text is not present in Site table");
		for(int j=1;j<=SiteTable.size();j++)
		{
			String text=driver.findElement(By.xpath("//*[@id='ctl04_resultGrid_ctl00']/tbody/tr["+j+"]/td[3]")).getText();
		    System.out.println(text);
		}		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		driver.switchTo().window(mainWindow);
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		createNCRecord.SiteTextBox();
		createNCRecord.clickOnMaterialZoom();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.ChildWindowHandle();
		System.out.println("Title on Material PopUp: "+createNCRecord.getTitleOnMaterialPopUp());
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().window(mainWindow);
		driver.switchTo().frame("record");
		//testUtil.SwitchToFrame(1);
		createNCRecord.MaterialTextBox();
		createNCRecord.clickOnProcessZoom();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.ChildWindowHandle();
		System.out.println("Title on Process popUp: "+createNCRecord.getTitleOnProcessPopUp());
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().window(mainWindow);
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		createNCRecord.ProcessTextBox();
		createNCRecord.clickAgainstMaterial();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		createNCRecord.BatchSection();
		createNCRecord.DefectCategoryTextBox();
		createNCRecord.DefectTextBox();
		createNCRecord.StmtOfNCTextArea();
		createNCRecord.StmtOfReqTextArea();
		createNCRecord.SubmitButton();
		testUtil.ChildWindowHandle();
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		System.out.println("Mandatory fields when Against : Material and Source : InProcess");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.GetTextFromAlertWindow();
		createNCRecord.closeAlertPopUp();
		driver.switchTo().defaultContent();
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		createNCRecord.clickOnSourceReceivingInspection();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		createNCRecord.SubmitButton();
		testUtil.ChildWindowHandle();
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		System.out.println("Mandatory fields when Against : Material and Source : Receiving Inspection");
		testUtil.GetTextFromAlertWindow();
		createNCRecord.closeAlertPopUp();
		driver.switchTo().defaultContent();
		driver.switchTo().window(mainWindow);
		driver.switchTo().frame("record");
		createNCRecord.clickOnSupplierCodeZoom();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.ChildWindowHandle();
		System.out.println("Title on Supplier Code popUp: "+createNCRecord.getTitleOnSupplierCodeZoom());
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().window(mainWindow);
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		createNCRecord.SupplierCodeSectionIsDisplayed();
		System.out.println("Production Order input type is: "+createNCRecord.ProductionOrderTextBox());
		System.out.println("Operation Number input type is: "+createNCRecord.OperationNumberTextBox());
		System.out.println("WorkCenter input type is: "+createNCRecord.WorkCenterTextBox());
		createNCRecord.ValidateMaterialSection();
		createNCRecord.ValidateDatesSection();
		createNCRecord.AttachmentSection();
		createNCRecord.clickOnSourceGeneral();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		createNCRecord.SubmitButton();
		testUtil.ChildWindowHandle();
		//testUtil.SwitchToFrame(1);
		driver.switchTo().frame("record");
		testUtil.CustomWait(60, "//div[@id='navigationBody']/ul[2]/li/a[text()='Verify Nonconformance Initiation']");
		popupWindow.ClickVerifyNonConformanceInitiation();
		driver.switchTo().window(mainWindow);
		testUtil.CustomWait(90, "//div[@id='recordNumber']");
		NC_RecordNum = driver.findElement(By.xpath("//div[@id='recordNumber']")).getText();
		System.out.println("NC Record Number: "+NC_RecordNum);
		connectingPage.ClickLogOut();
		
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			testUtil.TakeScreenshot(result.getName());
		}
		driver.quit();	
}
	
	
}
