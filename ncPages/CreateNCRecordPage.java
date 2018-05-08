package ncPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclass.TestBase;
import utilities.TestUtil;

public class CreateNCRecordPage extends TestBase{
	TestUtil testUtil;

	@FindBy(xpath = "//span[@id='ui-dialog-title-dialog-popup']")
	WebElement NCTitle;

	@FindBy(id = "pRadioButton_V_SS_NC_NC_TYPE_1_Nonconformance")
	WebElement NCRadioButton;
    
	@FindBy(id="pRadioButton_V_SS_NC_NC_CATEGORY_1_Material")
	WebElement AgainstMaterial;
	
	@FindBy(id = "pRadioButton_V_SS_NC_NC_CATEGORY_1_Process")
	WebElement AgainstProcess;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_SOURCE_1_CAPA")
	WebElement SourceCAPA;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_SOURCE_1_General")
	WebElement SourceGeneral;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_SOURCE_1_Receiving Inspection")
	WebElement SourceReceiving;

	@FindBy(id = "pRadioButton_V_SS_NC_NC_SOURCE_1_In Process")
	WebElement SourceInProcess;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_SOURCE_1_Audit")
	WebElement SourceAudit;
	
	@FindBy(id="V_SS_NC_PRODUCT_CODE_1")
	WebElement Material;
	
	@FindBy(id="V_SS_NC-V_PRS_NC_EXTEND_PRS_PROD_ORDER_NO_1")
	WebElement ProdOrderNumber;
	
	@FindBy(id="V_SS_NC-V_PRS_NC_EXTEND_PRS_OPERATION_1")
	WebElement OperationNumber;
	
	@FindBy(id="V_SS_NC_WORK_CENTER_CODE_1")
	WebElement WorkCenter;

	@FindBy(xpath = "//input[@id='V_SS_NC_OWNING_SITE_CODE_1']")
	WebElement Site;
	
	@FindBy(id = "V_SS_NC_PROCESS_CODE_1")
	WebElement Process;

	@FindBy(id="V_SS_NC-V_SS_NC_PART-V_SS_NC_PART_LOT_LOT_NUMBER_1")
	WebElement Batch;
	
	@FindBy(id="V_SS_NC-V_SS_NC_PART-V_SS_NC_PART_LOT_PRS_PRODUCT_REVISION_1")
	WebElement BatchRevision;
	
	@FindBy(id="V_SS_NC-V_SS_NC_PART-V_SS_NC_PART_LOT_LOT_QTY_1")
	WebElement InspectionLotQty;
	
	@FindBy(xpath="//span[text()='Add Material Batch']")
	WebElement AddMaterialBtn;
	
	@FindBy(id = "comboBox_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_DEFECT_CATEGORY_1")
	WebElement DefectCategory;

	@FindBy(id = "comboBox_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_DEFECT_1")
	WebElement Defect;

	@FindBy(xpath = "//textarea[@id='textArea_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_STATE_OF_REQ_1']")
	WebElement StmtOfReq;

	@FindBy(xpath = "//textarea[@id='textArea_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_STATE_OF_NC_1']")
	WebElement StmtOfNC;


	@FindBy(xpath = "//span[text()='Submit']")
	WebElement Submit;

	public CreateNCRecordPage() {
		PageFactory.initElements(driver, this);
	//	PageFactory.initElements(driver, CreateNCRecordPage.class);
	}

	// methods

	public String checkNCTitle() {
		String NCRecordHomePageTitle = NCTitle.getText();
		Assert.assertEquals(NCRecordHomePageTitle, "Initiate Nonconformance");
		return NCRecordHomePageTitle;
	}
	
	public void CreateNC_PInP() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstProcess.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceInProcess.click();
	}

	public void CreateNC_MC() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstMaterial.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceCAPA.click();
	}
	
	public void CreateNC_MG() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstMaterial.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceGeneral.click();
	}
	
	public void CreateNC_MR() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstMaterial.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceReceiving.click();
	}
	
	public void CreateNC_MA() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstMaterial.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceAudit.click();
	}
	public void CreateNC_PG() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstProcess.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceGeneral.click();
	}
	
	public void CreateNC_PR() throws InterruptedException
	{
		NCRadioButton.click();
		AgainstProcess.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceReceiving.click();
	}
	
	public void CreateNC_PA() throws InterruptedException
	{
		NCRadioButton.click();
	    AgainstProcess.click();
	    Thread.sleep(TestUtil.SLEEP_WAIT);
	    SourceAudit.click();
		
	}
	public void SiteTextBox() throws InterruptedException {
		Site.sendKeys("ACT");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Site.sendKeys(Keys.ARROW_DOWN);
		Site.sendKeys(Keys.ENTER);
	}

	public void ProcessTextBox() throws InterruptedException {
		Process.sendKeys("Assembly");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Process.sendKeys(Keys.ARROW_DOWN);
		Process.sendKeys(Keys.ENTER);
	}
	public void DefectCategoryTextBox(){
		DefectCategory.sendKeys("Procedural");
	}

	public void DefectTextBox() {
		Defect.sendKeys("failure to follow");
	}

	public void StmtOfReqTextArea() {
		StmtOfReq.sendKeys("Testing");
	}

	public void StmtOfNCTextArea() {
		StmtOfNC.sendKeys("Testing");
	}
	


	public void SubmitButton() {
		Submit.click();
	}

}
