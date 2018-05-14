package ncTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.TestBase;
import ncPages.ApproveEvaluationPage;
import ncPages.ConnectingPage;
import ncPages.ContainmentActionPage;
import ncPages.CreateNCRecordPage;
import ncPages.EvaluationPage;
import ncPages.LoginPage;
import ncPages.NCHomePage;
import ncPages.PopUpWindowPage;
import ncPages.SignOffActionPlanPage;
import ncPages.VerifyNCInitiationPage;
import utilities.TestUtil;

public class SignOffActionPlanTest extends TestBase{
	    public String NC_RecordNum="NCR-03008";
		LoginPage loginPage;
		NCHomePage ncHomePage;
		CreateNCRecordPage createNCRecord;
		ConnectingPage connectingPage;
		TestUtil testUtil;
		PopUpWindowPage popupWindow;
		VerifyNCInitiationPage verifyInitiationPage;
		CreateNCTest createNCTest;
		ContainmentActionPage containmentAction;
		EvaluationPage evaluationPage;
		ApproveEvaluationPage approveEvaluationPage;
		SignOffActionPlanPage signOffActionPlanPage;
		
		public SignOffActionPlanTest()
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
			testUtil=new TestUtil();
			popupWindow=new PopUpWindowPage();
			connectingPage=new ConnectingPage();
			verifyInitiationPage=new VerifyNCInitiationPage();
			createNCTest=new CreateNCTest();
			containmentAction=new ContainmentActionPage();
			evaluationPage=new EvaluationPage();
			approveEvaluationPage=new ApproveEvaluationPage();
			signOffActionPlanPage=new SignOffActionPlanPage();
		}
		
		@Test
		public void SignOffActionPlan() throws InterruptedException
		{
			ncHomePage = loginPage.Login(prop.getProperty("SignOffActionPlan_Role"), prop.getProperty("password"));
			WebElement FindNC=driver.findElement(By.xpath("//a[contains(text(),'Nonconformance')]"));
			testUtil.ExplicitWaitToAnElement(120,FindNC);
			ncHomePage.ClickFindNC();
			testUtil.SwitchToFrame(0);
			//Thread.sleep(TestUtil.SLEEP_WAIT);
			Thread.sleep(TestUtil.SLEEP_WAIT);
			WebElement table=driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
			testUtil.ExplicitWaitToAnElement(120, table);
			//CustomWait(120, "//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a");
			TestUtil.SearchNCRecord(NC_RecordNum);
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
