package ncTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseclass.TestBase;
import ncPages.CreateNCRecordPage;
import ncPages.LoginPage;
import ncPages.NCHomePage;
import ncPages.PopUpWindowPage;
import utilities.TestUtil;

public class CreateNCTest extends TestBase{
	public static String NC_RecordNum;
	LoginPage loginPage;
	NCHomePage ncHomePage;
	CreateNCRecordPage createNCRecord;
	TestUtil testUtil;
	PopUpWindowPage popupWindow;
	
	public CreateNCTest()
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
		popupWindow = new PopUpWindowPage();
		
	}
	
	@Test()
	public void createNC() throws InterruptedException {
		ncHomePage = loginPage.Login(prop.getProperty("NC_Role"), prop.getProperty("password"));
		testUtil.CustomWait(120, "//a[contains(text(),'Create Nonconformance')]");
		ncHomePage.clickOnCreateNC();
		/*int fr=driver.findElements(By.tagName("iframe")).size();
	    System.out.println("frames: "+fr);*/
	    testUtil.SwitchToFrame(1);
	    Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
	    Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		//driver.switchTo().frame("record-pane-content-iframe");
		testUtil.CustomWait(60, "//span[@id='ui-dialog-title-dialog-popup']");
		createNCRecord.checkNCTitle();
		createNCRecord.CreateNC_PInP();
		createNCRecord.SiteTextBox();
		createNCRecord.ProcessTextBox();
		createNCRecord.DefectCategoryTextBox();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		createNCRecord.DefectTextBox();
		createNCRecord.StmtOfReqTextArea();
		createNCRecord.StmtOfNCTextArea();
		String MainWindow = driver.getWindowHandle();
		createNCRecord.SubmitButton();
		testUtil.ChildWindowHandle();
		testUtil.SwitchToFrame(1);
		testUtil.CustomWait(60, "//div[@id='navigationBody']/ul[2]/li/a[text()='Verify Nonconformance Initiation']");
		popupWindow.ClickVerifyNonConformanceInitiation();
		driver.switchTo().window(MainWindow);
		testUtil.CustomWait(180, "//div[@id='recordNumber']");
		NC_RecordNum = driver.findElement(By.xpath("//div[@id='recordNumber']")).getText();
		System.out.println(NC_RecordNum);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
