package ncTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseclass.TestBase;
import ncPages.ConnectingPage;
import ncPages.CreateNCRecordPage;
import ncPages.LoginPage;
import ncPages.NCHomePage;
import ncPages.PopUpWindowPage;
import ncPages.VerifyNCInitiationPage;
import utilities.TestUtil;

public class VerifyNCInitiationTest extends TestBase{
	LoginPage loginPage;
	NCHomePage ncHomePage;
	CreateNCRecordPage createNCRecord;
	ConnectingPage connectingPage;
	// CommonTablePage commonTablePage;
	TestUtil testUtil;
	PopUpWindowPage popupWindow;
	VerifyNCInitiationPage verifyInitiationPage;
	CreateNCTest createNCTest;

	public VerifyNCInitiationTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialization();
		loginPage = new LoginPage();
		createNCRecord = new CreateNCRecordPage();
		ncHomePage = new NCHomePage();
		// commonTablePage=new CommonTablePage();
		testUtil = new TestUtil();
		popupWindow = new PopUpWindowPage();
		connectingPage = new ConnectingPage();
		verifyInitiationPage = new VerifyNCInitiationPage();
		createNCTest = new CreateNCTest();
	}

	@Test
	public void VerifyNCRecord() throws InterruptedException {
		ncHomePage = loginPage.Login(prop.getProperty("NC_Role"), prop.getProperty("password"));
		testUtil.CustomWait(120, "//a[contains(text(),'Create Nonconformance')]");
		ncHomePage.ClickFindNC();
		testUtil.SwitchToFrame(0);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		/*Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);*/
		testUtil.CustomWait(60, "//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a");
		int row_count = driver.findElements(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"))
				.size();
		boolean found = false;
		WebElement NCTableLocator = driver
				.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr/td/div/span/a"));
		for (int i = 1; i <= row_count; i++) {
			String record = driver
					.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr[" + i + "]/td/div/span/a"))
					.getText();
			if (record.equals(CreateNCTest.NC_RecordNum))
			// if(record.equals(NC_RecordNum))
			{
				found = true;
				driver.findElement(By.xpath("//table[@id='ctl04_resultGrid_ctl00']/tbody/tr[" + i + "]/td/div/span/a"))
						.click();
				break;
			} else
				found = false;
		}
		if (found = true)
			System.out.println("NC Record found: " + CreateNCTest.NC_RecordNum);
		// System.out.println("NC Record found: "+NC_RecordNum);
		else
			System.out.println("NC Record not found: " + CreateNCTest.NC_RecordNum);
		// System.out.println("NC Record not found: "+NC_RecordNum);
		driver.switchTo().defaultContent();
		testUtil.SwitchToFrame(1);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		/*Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);*/
		//WebElement OT=driver.findElement(By.xpath("//li[@class='topMenu dc-mega-li']/a[text()='Other Tasks']"));
		testUtil.CustomWait(120,"//li[@class='topMenu dc-mega-li']/a[text()='Other Tasks']");
		connectingPage.ClickOnOtherTasks();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		connectingPage.ClickVerifyNCInitiation();
		driver.switchTo().defaultContent();
		// driver.switchTo().frame("record");
		testUtil.SwitchToFrame(1);
		// driver.switchTo().frame("workSpaceFrame");
		testUtil.SwitchToFrame(0);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		verifyInitiationPage.DefectTextBox();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_1']",
				"NCX_COORDINATOR");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_2']",
				"NCX_COORDINATOR");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_3']",
				"NCX_DISPOSITION_PLAN");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_4']",
				"NCX_EVALUATOR");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_5']",
				"NCX_OWNER");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_6']",
				"NCX_APPROVER");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_7']",
				"NCX_COORDINATOR");
		testUtil.SetTextInNCTeamMemberPanel(
				"//table[@class='ui-jqgrid-btable']/tbody/tr/td[3]/div/input[@id='V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_8']",
				"NCX_APPROVER");
		//String MainWindow = driver.getWindowHandle();
		verifyInitiationPage.ClickOnSignOff();
		testUtil.ChildWindowHandle();
		testUtil.SwitchToFrame(1);
		testUtil.CustomWait(60, "//input[@id='_ctl7_btnOk']");
		popupWindow.SignOffInPopUp();
		testUtil.ChildWindowHandle();
		testUtil.CustomWait(60, "//input[@id='username']");
		popupWindow.popupSignOff(prop.getProperty("NC_Role"), prop.getProperty("password"));
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		testUtil.ChildWindowHandle();
		driver.switchTo().frame("record");
		testUtil.CustomWait(120, "//a[contains(text(),'Close')]");
		connectingPage.ClickClose();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		connectingPage.ClickLogOut();

	}

	@AfterMethod
	public void Close() {
		driver.quit();
	}

}
