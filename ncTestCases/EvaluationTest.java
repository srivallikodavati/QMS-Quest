package ncTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.TestBase;
import ncPages.ConnectingPage;
import ncPages.ContainmentActionPage;
import ncPages.CreateNCRecordPage;
import ncPages.EvaluationPage;
import ncPages.LoginPage;
import ncPages.NCHomePage;
import ncPages.PopUpWindowPage;
import ncPages.VerifyNCInitiationPage;
import utilities.TestUtil;

public class EvaluationTest extends TestBase {
	public String NC_RecordNum="NCR-03011";
	LoginPage loginPage;
	NCHomePage ncHomePage;
	CreateNCRecordPage createNCRecord;
	ConnectingPage connectingPage;
	//CommonTablePage commonTablePage;
	TestUtil testUtil;
	PopUpWindowPage popupWindow;
	VerifyNCInitiationPage verifyInitiationPage;
	CreateNCTest createNCTest;
	ContainmentActionPage containmentAction;
	EvaluationPage evaluationPage;
	public EvaluationTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		Initialization();
		loginPage=new LoginPage();
		createNCRecord=new CreateNCRecordPage();
		ncHomePage=new NCHomePage();
		//commonTablePage=new CommonTablePage();
		testUtil=new TestUtil();
		popupWindow=new PopUpWindowPage();
		connectingPage=new ConnectingPage();
		verifyInitiationPage=new VerifyNCInitiationPage();
		createNCTest=new CreateNCTest();
		containmentAction=new ContainmentActionPage();
		evaluationPage=new EvaluationPage();
	}
	
	@Test
	public  void Evaluation() throws InterruptedException
	{
		ncHomePage = loginPage.Login(prop.getProperty("Evlauator_Role"), prop.getProperty("password"));
		WebElement NC=driver.findElement(By.xpath("//a[contains(text(),'Nonconformance')]"));
		testUtil.CustomWait(120,"//a[contains(text(),'Nonconformance')]");
		ncHomePage.ClickFindNC();
		testUtil.SwitchToFrame(0);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		WebElement table=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.CustomWait(60,"//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a");
		//testUtil.SearchNCRecord(NC_RecordNum);
		int row_count=driver.findElements(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a")).size();
		boolean found = false;
		WebElement NCTableLocator=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
		for(int i=1;i<=row_count;i++ ){
			String record=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr["+i+"]/td/div/span/a")).getText();
			//if(record.equals(CreateNCTest.NC_RecordNum))
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
			//System.out.println("NC Record found: "+CreateNCTest.NC_RecordNum);
		System.out.println("NC Record found: "+NC_RecordNum);
		else
			//System.out.println("NC Record not found: "+CreateNCTest.NC_RecordNum);
		System.out.println("NC Record not found: "+NC_RecordNum);
		driver.switchTo().defaultContent();
		testUtil.SwitchToFrame(1);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		WebElement OtherTasks=driver.findElement(By.xpath("//li[@class='topMenu dc-mega-li']/a[text()='Other Tasks']"));
		testUtil.CustomWait(60,"//li[@class='topMenu dc-mega-li']/a[text()='Other Tasks']");
		//"//li[@class='topMenu dc-mega-li']/a[text()='Other Tasks']"
		connectingPage.ClickOnOtherTasks();
		Thread.sleep(1000);
		connectingPage.ClickEvaluation();
		driver.switchTo().defaultContent();
		testUtil.SwitchToFrame(1);
		testUtil.SwitchToFrame(0);
		WebElement Signoff=driver.findElement(By.xpath("//span[text()='Sign-off']"));
		testUtil.CustomWait(90,"//span[text()='Sign-off']" );
		evaluationPage.setResult();
		evaluationPage.setOrgUnitType();
		evaluationPage.setCausedBy();
		evaluationPage.setProcess();
		evaluationPage.setFailureMode();
		evaluationPage.setDirectCauseCategory();
		evaluationPage.setDirectCause();
		evaluationPage.setActionPlan();
		evaluationPage.setActionPlanDetail();
		evaluationPage.setAssignedToUser();
		evaluationPage.setDueDate();
		evaluationPage.ClickSignOff();
		testUtil.ChildWindowHandle();
		testUtil.SwitchToFrame(1);
		WebElement SignOffInPopup=driver.findElement(By.xpath("//input[@id='_ctl7_btnOk']"));
		testUtil.CustomWait(60,"//input[@id='_ctl7_btnOk']");
		popupWindow.SignOffInPopUp();
		testUtil.ChildWindowHandle();
		WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
		testUtil.CustomWait(60,"//input[@id='username']" );
		popupWindow.popupSignOff(prop.getProperty("Evlauator_Role"),prop.getProperty("password"));
		testUtil.ChildWindowHandle();
		driver.switchTo().frame("record");
		WebElement Close=driver.findElement(By.xpath("//a[contains(text(),'Close')]"));
		testUtil.CustomWait(120,"//a[contains(text(),'Close')]");
		connectingPage.ClickClose();
		Thread.sleep(2000);
		connectingPage.ClickLogOut();
		
	}
	
	@AfterMethod
	public void Close(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus())
		{
			testUtil.TakeScreenshot(result.getName());
		}
		driver.quit();
	}
	
		
		
		
}
