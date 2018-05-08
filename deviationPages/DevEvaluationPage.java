package deviationPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import utilities.TestUtil;

public class DevEvaluationPage extends TestBase {
	
	@FindBy(xpath="//textarea[@id='textArea_V_SS_NC-V_SS_NC_INVEST_RESULT_RESULT_COMMENT_1']")
	WebElement Result;
	
	@FindBy(xpath="//input[@id='comboBox_V_SS_NC-V_PRS_NC_DEVIATION_VALIDITY_APPLIES_TO_1']")
	WebElement AppliesTo;
	
	@FindBy(xpath="//li[@class='t-item t-state-selected']")
	WebElement Autopopulate;

	@FindBy(id="V_SS_NC-V_SS_NC_ACTION_ASSIGNED_ACT_CODE_1")
	WebElement AssignedToUser;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ACTION_DUE_DATE_2")
	WebElement DueDate;
	
	@FindBy(xpath="//input[@id='comboBox_V_SS_NC-V_PRS_NC_DEVIATION_VALIDITY_MATERIAL_1']")
	WebElement Material;
	
	@FindBy(xpath="//span[text()='Sign-off']")
	WebElement SignOff;
	
	public DevEvaluationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setAppliesTo() throws InterruptedException
	{
		AppliesTo.sendKeys("Batches/Serial No"); //Time
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Autopopulate.click();
		Autopopulate.sendKeys(Keys.ENTER);
	}
	
	public void setMaterial() throws InterruptedException
	{
		Material.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Autopopulate.click();
		Autopopulate.sendKeys(Keys.ENTER);
	}
	
	public void setRationale(){
		Result.sendKeys("testing");
	}
	
	public void setAssignedToUser()
	{
		AssignedToUser.sendKeys(prop.getProperty("SignOffActionPlans_Role"));
		AssignedToUser.sendKeys(Keys.ENTER);
	}
	public void setDueDate()
	{
		DueDate.sendKeys("20-Apr-2018");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
