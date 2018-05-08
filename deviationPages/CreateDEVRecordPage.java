package deviationPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import utilities.TestUtil;

public class CreateDEVRecordPage extends TestBase{

	@FindBy(id="pRadioButton_V_SS_NC_NC_TYPE_1_Deviation")
	WebElement Deviation;
    
	@FindBy(id="pRadioButton_V_SS_NC_NC_CATEGORY_1_Material")
	WebElement AgainstMaterial;
	
	@FindBy(id = "pRadioButton_V_SS_NC_NC_CATEGORY_1_Process")
	WebElement AgainstProcess;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_SOURCE_1_Supplier")
	WebElement SourceSupplier;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_SOURCE_1_Internal")
	WebElement SourceInternal;

	@FindBy(id="V_SS_NC-V_PRS_NC_EXTEND_PRS_LBL_SUPPLIER_CODE_1")
	WebElement SupplierCode;
	
	@FindBy(xpath = "//input[@id='V_SS_NC_OWNING_SITE_CODE_1']")
	WebElement Site;
	
	@FindBy(id="V_SS_NC_PRODUCT_CODE_1")
	WebElement Material;
	
	@FindBy(id="V_SS_NC-V_PRS_NC_EXTEND_PRS_LBL_REQUESTOR_CODE_1")
	WebElement Requestor;
	
	@FindBy(id="textArea_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_STATE_OF_DEFECT_1")
	WebElement StmtOfDev;
	
	@FindBy(id="textArea_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_STATE_OF_REQ_1")
	WebElement DevStmtOfReq;
	
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement Submit;
	
	public CreateDEVRecordPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void CreateDEV_MI() throws InterruptedException
	{
		Deviation.click();
		AgainstMaterial.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceInternal.click();
	}
	public void CreateDEV_MS() throws InterruptedException
	{
		Deviation.click();
		AgainstMaterial.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceSupplier.click();
	}
	public void CreateDEV_PI() throws InterruptedException
	{
		Deviation.click();
		AgainstProcess.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceInternal.click();
	}
	public void CreateDEV_PS() throws InterruptedException
	{
		Deviation.click();
		AgainstProcess.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SourceSupplier.click();
	}
	public void SiteTextBox() throws InterruptedException
	{
		Site.sendKeys("ACT");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Site.sendKeys(Keys.ARROW_DOWN);
		Site.sendKeys(Keys.ENTER);
	}
	public void MaterialTextBox() throws InterruptedException
	{
		Material.sendKeys("AR-0011");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Material.sendKeys(Keys.ARROW_DOWN);
		Material.sendKeys(Keys.ENTER);
	}
	
	public void RequestorTextBox() throws InterruptedException
	{
		Requestor.sendKeys("SKODAVATI");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Requestor.sendKeys(Keys.ARROW_DOWN);
		Requestor.sendKeys(Keys.ENTER);
	}
	
	public void SupplierCodeTextBox() throws InterruptedException
	{
		SupplierCode.sendKeys("0000100000");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		SupplierCode.sendKeys(Keys.ARROW_DOWN);
		SupplierCode.sendKeys(Keys.ENTER);
	}
	
	public void StmntOfDevTextArea()
	{
		StmtOfDev.sendKeys("testing");
		DevStmtOfReq.sendKeys("testing");
		Submit.click();
	}
	public void SubmitButton() {
		Submit.click();
	}


	
}
