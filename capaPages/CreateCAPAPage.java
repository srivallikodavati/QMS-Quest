package capaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclass.TestBase;
import utilities.TestUtil;

public class CreateCAPAPage extends TestBase{
	
@FindBy(xpath="//span[text()='Initiate CAPA']")
WebElement CAPATitle;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_TYPE_1_Internal")
WebElement TypeInternal;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_TYPE_1_Supplier")
WebElement TypeSupplier;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_CATEGORY_1_Material")
WebElement AgainstMaterial;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_CATEGORY_1_Process")
WebElement AgainstProcess;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_SOURCE_1_General")
WebElement SourceGeneral;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_SOURCE_1_Complaint")
WebElement SourceComplaint;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_SOURCE_1_NC")
WebElement SourceNC;

@FindBy(id="pRadioButton_V_SS_CAPA_CAPA_SOURCE_1_Audit")
WebElement SourceAudit;

@FindBy(xpath="//input[@id='V_SS_CAPA_CAPA_SOURCE_NUMBER_1']")
WebElement SourceNumber;

@FindBy(xpath="//input[@id='V_SS_CAPA_OWNING_SITE_CODE_1']")
WebElement Site;

@FindBy(id="V_SS_CAPA_PRODUCT_CODE_1")
WebElement Material;

@FindBy(xpath="//input[@id='V_SS_CAPA_PRODUCT_REVISION_1']")
WebElement BatchRevision;

@FindBy(xpath="//input[@id='V_SS_CAPA_SUPPLIER_CODE_1']")
WebElement SupplierCode;

@FindBy(id="V_SS_CAPA_PROCESS_CODE_1")
WebElement Process;

@FindBy(id="textArea_V_SS_CAPA_TITLE_1")
WebElement Title;

@FindBy(id="textArea_V_SS_CAPA_PROBLEM_STATEMENT_1")
WebElement Description;

@FindBy(xpath="//span[text()='Add Attachment']")
WebElement AddAttachment;

@FindBy(xpath="//span[text()='Submit']")
WebElement Submit;

public CreateCAPAPage()
{
	PageFactory.initElements(driver, this);
}

public String ValidateCAPAtitle()
{
	String CTitle=CAPATitle.getText();
	Assert.assertEquals(CTitle, "Initiate CAPA");
	return CTitle;
}
public void CreateCAPA_IMG() throws Exception
{
	TypeInternal.click();
	AgainstMaterial.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceGeneral.click();
}
public void CreateCAPA_SMG() throws Exception
{
	TypeSupplier.click();
	AgainstMaterial.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceGeneral.click();
}
public void CreateCAPA_SPG() throws Exception
{
	TypeSupplier.click();
	AgainstProcess.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceGeneral.click();
}
public void CreateCAPA_IPG() throws Exception
{
	TypeInternal.click();
	AgainstProcess.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceGeneral.click();
}
public void CreateCAPA_IPC() throws Exception
{
	TypeInternal.click();
	AgainstProcess.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceComplaint.click();
}
public void CreateCAPA_IPN() throws Exception
{
	TypeInternal.click();
	AgainstProcess.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceNC.click();
}
public void CreateCAPA_IPA() throws Exception
{
	TypeInternal.click();
	AgainstProcess.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceAudit.click();
}
public void CreateCAPA_IMC() throws Exception
{
	TypeInternal.click();
	AgainstMaterial.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceComplaint.click();
}
public void CreateCAPA_IMN() throws Exception
{
	TypeInternal.click();
	AgainstMaterial.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceNC.click();
}
public void CreateCAPA_IMA() throws Exception
{
	TypeInternal.click();
	AgainstMaterial.click();
	Thread.sleep(TestUtil.SLEEP_WAIT);
	SourceAudit.click();
}
public void setSourceNumber()
{
	SourceNumber.sendKeys("N/A");
}
public void setSite() throws InterruptedException
{
	Site.sendKeys("ACT");
	Thread.sleep(TestUtil.SLEEP_WAIT);
	Site.sendKeys(Keys.ARROW_DOWN);
	Site.sendKeys(Keys.ENTER);
}
public void setMaterial() throws InterruptedException
{
	Material.sendKeys("AR-0011");
	Thread.sleep(TestUtil.SLEEP_WAIT);
	Material.sendKeys(Keys.ARROW_DOWN);
	Material.sendKeys(Keys.ENTER);
}
public void setBatchRevision()
{
	BatchRevision.sendKeys("1");
}
public void setTitleAndDesc()
{
	Title.sendKeys("testing");
	Description.sendKeys("testing");
}
public void ValidateAttachmentTable()
{
for(int i=2;i<=4;i++)
{
	String ColumnName=driver.findElement(By.xpath("//table[@class='ui-jqgrid-htable']/thead/tr/th[" +i+ "]")).getText();
	System.out.println("coulms in Attachment table: "+ColumnName);	
}
}
public boolean ValidateAddAttachment()
{
	boolean visible=AddAttachment.isDisplayed();
	Assert.assertEquals(visible,true );
	return visible;
}
}
