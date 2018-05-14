package ncPages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
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

	@FindBy(id = "radioLabel_pRadioButton_V_SS_NC_NC_TYPE_1_Nonconformance")
	WebElement NCRadioButton;
	
	@FindBy(id="radioLabel_pRadioButton_V_SS_NC_NC_TYPE_1_Deviation")
	WebElement Deviation;
    
	@FindBy(id="radioLabel_pRadioButton_V_SS_NC_NC_CATEGORY_1_Material")
	WebElement AgainstMaterial;
	
	@FindBy(id = "radioLabel_pRadioButton_V_SS_NC_NC_CATEGORY_1_Process")
	WebElement AgainstProcess;
	
	@FindBy(id="radioLabel_pRadioButton_V_SS_NC_NC_SOURCE_1_CAPA")
	WebElement SourceCAPA;
	
	@FindBy(id="radioLabel_pRadioButton_V_SS_NC_NC_SOURCE_1_General")
	WebElement SourceGeneral;
	
	@FindBy(id="radioLabel_pRadioButton_V_SS_NC_NC_SOURCE_1_Receiving Inspection")
	WebElement SourceReceiving;
	
	@FindBy(id = "radioLabel_pRadioButton_V_SS_NC_NC_SOURCE_1_In Process")
	WebElement SourceInProcess;
	
	@FindBy(id="radioLabel_pRadioButton_V_SS_NC_NC_SOURCE_1_Audit")
	WebElement SourceAudit;
	
	@FindBy(id="V_SS_NC_NC_SOURCE_NUMBER_1")
	WebElement SourceNumber;
	
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
	
	@FindBy(id="V_SS_NC-V_PRS_NC_EXTEND_PRS_LBL_SUPPLIER_CODE_1")
	WebElement SupplierCode;
	
	@FindBy(id="V_SS_NC_zoom_7")
	WebElement SpplierCodeZoom;
	
	@FindBy(id = "comboBox_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_DEFECT_CATEGORY_1")
	WebElement DefectCategory;

	@FindBy(id = "comboBox_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_DEFECT_1")
	WebElement Defect;
	
	@FindBy(id="V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_DEFECT_ID_1")
	WebElement DefectID;

	@FindBy(xpath = "//textarea[@id='textArea_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_STATE_OF_REQ_1']")
	WebElement StmtOfReq;

	@FindBy(xpath = "//textarea[@id='textArea_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_STATE_OF_NC_1']")
	WebElement StmtOfNC;
	
	@FindBy(xpath="//*[@id='WorkflowErrorPrompt_errorHeader']/span/img")
	WebElement AlertPopupClose;
	
	@FindBy(id="V_SS_NC_zoom_1")
	WebElement SiteZoom;
	
	@FindBy(xpath="//div[@id='RadWindowWrapper_supportRadWindow']/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em")
	WebElement titleOnSitePopUp;
	
	@FindBy(id="V_SS_NC_zoom_2")
	WebElement MaterialZoom;
	
	@FindBy(xpath="//div[@id='RadWindowWrapper_supportRadWindow']/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em[text()='Product']")
	WebElement titleOnMaterialPopUp;
	
	@FindBy(xpath="//span[@id='V_SS_NC_zoomOperatonSite_1']")
	WebElement ProcessZoom;
	
	@FindBy(xpath="//div[@id='RadWindowWrapper_supportRadWindow']/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em[text()='Operation']")
	WebElement titleOnProcessPopUp;
	
	@FindBy(xpath="//div[@id='RadWindowWrapper_supportRadWindow']/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em[text()='Client with Contact']")
	WebElement titleOnSupplierCodePopUp;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUP_ADDRESS_1_1")
	WebElement StreetField;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUPPLIER_STATE_1")
	WebElement StateField;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUPPLIER_CITY_1")
	WebElement CityField;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUPPLIER_ZIP_1")
	WebElement ZipField;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUP_CONTACT_NAME_1")
	WebElement ContactNameField;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUP_CONTACT_NUMBER_1")
	WebElement ContactNumberField;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_PRS_NC_EXTEND_PRS_SUP_EMAIL_1")
	WebElement ContactEmailField;
	
	@FindBy(id="V_SS_NC-V_SS_NC_PART_REPEATING_ROW_TITLE_1")
	WebElement MaterialSection;
	
	@FindBy(id="elementContainer_V_SS_NC-V_SS_NC_PART_PRODUCT_CODE_1")
	WebElement Material2;
	
	@FindBy(id="fieldLabel_V_SS_NC-V_SS_NC_PART_CATALOG_NUMBER_1")
	WebElement DesignGroup;
	
	@FindBy(id="V_SS_NC_REPORTED_BY_CODE_1")
	WebElement ReportedBy;
	
	@FindBy(id="V_SS_NC_REPORT_DATE_1")
	WebElement ReportDate;
	
	@FindBy(id="V_SS_NC_OCCURRENCE_DATE_1")
	WebElement OccurrenceDate;
	
	@FindBy(xpath="//span[contains(text(),'Attachment (0)')]")
	WebElement AttachmentPanel;
	
	@FindBy(xpath="//*[@id='elementContainer_V_SS_NC_COLUMN_HEADER_1']")
	WebElement AttachmentColumn1;
	
	@FindBy(id="elementContainer_V_SS_NC_COLUMN_HEADER_2")
	WebElement AttachmentColumn2;

	@FindBy(id="elementContainer_V_SS_NC_COLUMN_HEADER_3")
	WebElement AttachmentColumn3;
	
	@FindBy(id="elementContainer_V_SS_NC_COLUMN_HEADER_4")
	WebElement AttachmentColumn4;

	@FindBy(xpath="//span[text()='Add Attachment']")
	WebElement AddAttachment;
	
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement Submit;

	public CreateNCRecordPage() {
		PageFactory.initElements(driver, this);
	//	PageFactory.initElements(driver, CreateNCRecordPage.class);
	}

	// methods

	public String checkNCTitle() {
		String NCRecordHomePageTitle =driver.getTitle();
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
	public void clickAgainstMaterial()
	{
		AgainstMaterial.click();
	}
	public void clickOnSourceGeneral()
	{
		SourceGeneral.click();
	}
	public void clickOnSourceReceivingInspection()
	{
		SourceReceiving.click();
	}
	public void SiteTextBox() throws InterruptedException {
		Site.sendKeys("ACT");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Site.sendKeys(Keys.ARROW_DOWN);
		Site.sendKeys(Keys.ENTER);
	}
	
	public void MaterialTextBox() throws InterruptedException {
		Material.sendKeys("AR-0011");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Material.sendKeys(Keys.ARROW_DOWN);
		Material.sendKeys(Keys.ENTER);
	}

	public void ProcessTextBox() throws InterruptedException {
		Process.sendKeys("Assembly");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Process.sendKeys(Keys.ARROW_DOWN);
		Process.sendKeys(Keys.ENTER);
	}
	public void DefectCategoryTextBox() throws InterruptedException {
		
		Assert.assertTrue(DefectCategory.isDisplayed(), "Defect Category is not displayed under Conditions panel");
		DefectCategory.sendKeys("Physical");
		Thread.sleep(TestUtil.SLEEP_WAIT);
        driver.findElement(By.xpath("//li[@class='t-item t-state-selected']")).click();
	}

	public void DefectTextBox() throws InterruptedException  {
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Assert.assertTrue(Defect.isDisplayed(), "Defect is not displayed under Conditions panel");
		Defect.sendKeys("hardness");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		driver.findElement(By.xpath("//li[@class='t-item t-state-selected']")).click();
	}

	public void StmtOfReqTextArea() {
		StmtOfReq.sendKeys("Testing");
	}

	public void StmtOfNCTextArea() {
		StmtOfNC.sendKeys("Testing");
	}
	
	public void checkDefectID()
	{
		Assert.assertTrue(DefectID.isDisplayed(), "Defect ID is not displayed under Conditions Panel");
	}
	public void closeAlertPopUp()
	{
		AlertPopupClose.click();
	}
	public boolean ncIsDisplayed()
	{
		boolean visible=NCRadioButton.isDisplayed();
		String name=NCRadioButton.getText();
		Assert.assertEquals(name, "Nonconformance");
		Assert.assertTrue(true, "NC RadioButton not displayed");
		return visible;
	}
	public boolean devIsDisplayed()
	{
		boolean visible=Deviation.isDisplayed();
		String name=Deviation.getText();
		Assert.assertEquals(name, "Deviation");
		Assert.assertTrue(true, "Dev RadioButton not displayed");
		return visible;
	}
	public boolean materialIsdisplayed()
	{
		boolean visible=AgainstMaterial.isDisplayed();
		String name=AgainstMaterial.getText();
		Assert.assertEquals(name, "Material");
		Assert.assertTrue(true, "Material RadioButton not displayed");
		return visible;
	}
	public boolean processIsdisplayed()
	{
		boolean visible=AgainstProcess.isDisplayed();
		String name=AgainstProcess.getText();
		Assert.assertEquals(name, "Process");
		Assert.assertTrue(true, "Process RadioButton not displayed");
		return visible;
	}
	public void sourceRadioButtonsIsDisplayed()
	{
		boolean visibleCAPA=SourceCAPA.isDisplayed();
		String nameOfCAPA=SourceCAPA.getText();
		Assert.assertEquals(nameOfCAPA,"CAPA");
		Assert.assertTrue(true, "CAPA RadioButton not displayed");
		boolean visibleGeneral=SourceGeneral.isDisplayed();
		String nameofGeneral=SourceGeneral.getText();
		Assert.assertEquals(nameofGeneral,"General");
		Assert.assertTrue(true, "General RadioButton not displayed");
		boolean visibleInProcess=SourceInProcess.isDisplayed();
		String nameofInProcess=SourceInProcess.getText();
		Assert.assertEquals(nameofInProcess,"In Process");
		Assert.assertTrue(true, "In-Process RadioButton not displayed");
		boolean visibleReceiving=SourceReceiving.isDisplayed();
		String nameofReceiving=SourceReceiving.getText();
		Assert.assertEquals(nameofReceiving,"Receiving Inspection");
		Assert.assertTrue(true, "Receiving Inspection RadioButton not displayed");
		boolean visibleAudit=SourceAudit.isDisplayed();
		String nameofAudit=SourceAudit.getText();
		Assert.assertEquals(nameofAudit,"Audit");
		Assert.assertTrue(true, "Audit RadioButton not displayed");
		
	}
	
	public boolean sourceNumberIsDisplayed()
	{
		boolean visible=SourceNumber.isDisplayed();
		Assert.assertTrue(true,"Source Number textbox is not displyed");
		SourceNumber.sendKeys("N/A");
		return visible;
	}
	
	public void clickOnSiteZoom()
	{
		SiteZoom.click();
	}
	
	public String getTitleOnSitePopUp()
	{
		//testUtil.ExplicitWaitToAnElement(60, titleOnSitePopUp);
		String SiteText=titleOnSitePopUp.getText();
		Assert.assertEquals(SiteText, "Org. Unit");
		return SiteText;
	}
	
	public void clickOnMaterialZoom()
	{
		MaterialZoom.click();
	}
 
	
	public String getTitleOnMaterialPopUp()
	{
		//testUtil.ExplicitWaitToAnElement(60, titleOnMaterialPopUp);
		String MaterialText=titleOnMaterialPopUp.getText();
		Assert.assertEquals(MaterialText, "Product");
		return MaterialText;
		
	}
	
	public void clickOnProcessZoom()
	{
		ProcessZoom.click();
	}
	
	public String getTitleOnProcessPopUp()
	{
		//testUtil.ExplicitWaitToAnElement(60, titleOnProcessPopUp);
		String ProcessText=titleOnProcessPopUp.getText();
		Assert.assertEquals(ProcessText, "Operation");
		return ProcessText;
	}
	
	public void clickOnSupplierCodeZoom()
	{
		SpplierCodeZoom.click();
	}
	
	public String getTitleOnSupplierCodeZoom()
	{
		//testUtil.ExplicitWaitToAnElement(60, titleOnSupplierCodePopUp);
		String SupplierCodeText=titleOnSupplierCodePopUp.getText();
		Assert.assertEquals(SupplierCodeText, "Client with Contact");
		return SupplierCodeText;
	}
	
	public void SupplierCodeSectionIsDisplayed()
	{
		Assert.assertTrue(StreetField.isDisplayed(), "Street Field is not dispalyed in Supplier Code Section");
		Assert.assertTrue(StateField.isDisplayed(), "StateField is not dispalyed in Supplier Code Section");
		Assert.assertTrue(CityField.isDisplayed(), "CityField is not dispalyed in Supplier Code Section");
		Assert.assertTrue(ZipField.isDisplayed(),"ZipField is not dispalyed in Supplier Code Section");
		Assert.assertTrue(ContactNameField.isDisplayed(),"ContactNameField is not dispalyed in Supplier Code Section");
		Assert.assertTrue(ContactNumberField.isDisplayed(),"ContactNumberField is not dispalyed in Supplier Code Section");
		Assert.assertTrue(ContactEmailField.isDisplayed(),"ContactEmailField is not dispalyed in Supplier Code Section");	
	}
	public String ProductionOrderTextBox()
	{
		//ProdOrderNumber.sendKeys("1234");
		String POType=ProdOrderNumber.getAttribute("type");
		Assert.assertEquals(POType, "text");
		return POType;
		
	}
	
	public String OperationNumberTextBox()
	{
		//OperationNumber.sendKeys("123");
		String ONType=OperationNumber.getAttribute("type");
		Assert.assertEquals(ONType, "text");
		return ONType;
	}
	public String WorkCenterTextBox() 
	{
		/*WorkCenter.sendKeys("10976");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		WorkCenter.sendKeys(Keys.ARROW_DOWN);
		WorkCenter.sendKeys(Keys.ENTER);*/
		String WCType=WorkCenter.getAttribute("type");
		Assert.assertEquals(WCType, "text");
		return WCType;
	}
	
	public void BatchSection()
	{
		Assert.assertTrue(Batch.isDisplayed(),"Batch is not displayed under Material Batch Section");
		Batch.sendKeys("batch1");
		Assert.assertTrue(BatchRevision.isDisplayed(),"BatchRevision is not displayed under Material Batch section");
		BatchRevision.sendKeys("2");
		Assert.assertTrue(InspectionLotQty.isDisplayed(),"Inspection Lot Quantity is not displayed under Material Batch section");
		InspectionLotQty.sendKeys("2");
	}
	
	public void ValidateMaterialSection()
	{
		String text=MaterialSection.getText();
		System.out.println("Header of Material Section: "+text);
		Assert.assertTrue(Material2.isDisplayed(),"Material is not displayed under Material section");
		Assert.assertTrue(DesignGroup.isDisplayed(), "Design group is not displayed under Material section");
			
	}
	
	public void ValidateDatesSection()
	{
		Assert.assertEquals(ReportDate.getAttribute("type"), "text");
		Assert.assertEquals(ReportedBy.getAttribute("type"), "text");
		Assert.assertEquals(OccurrenceDate.getAttribute("type"), "text");
	}
	
	public void AttachmentSection()
	{
		System.out.println("Attachment Panel is: "+AttachmentPanel.getText());
		System.out.println("Column1 Name: "+AttachmentColumn1.getText());
		System.out.println("Column2 Name: "+AttachmentColumn2.getText());
		System.out.println("Column3 Name: "+AttachmentColumn3.getText());
		System.out.println("Column4 Name: "+AttachmentColumn4.getText());
		System.out.println("Add Attchment button: "+AddAttachment.getText());
	}
	
	public void SubmitButton() {
		Submit.click();
	}

}
