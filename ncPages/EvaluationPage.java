package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseclass.TestBase;
import utilities.TestUtil;

public class EvaluationPage extends TestBase{
TestUtil testUtil;
	
	@FindBy(xpath="//textarea[@id='textArea_V_SS_NC-V_SS_NC_INVEST_RESULT_RESULT_COMMENT_1']")
	WebElement Result;
	
	@FindBy(id="comboBox_V_SS_NC-V_SS_NC_ROOT_CAUSE_CAUSE_BY_ORG_UNIT_TYPE_1")  //Site
    WebElement OrgUnitType;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ROOT_CAUSE_ORG_UNIT_CODE_1")
	WebElement CausedBy;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ROOT_CAUSE_PROCESS_CODE_2")
	WebElement Process;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ROOT_CAUSE_FAILURE_MODE_NAME_2")
	WebElement FailureMode;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ROOT_CAUSE_DIRECT_CAUSE_1")
	WebElement DirectCauseCategory;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ROOT_CAUSE_FAILURE_CAUSE_NAME_2")
	WebElement DirectCause;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_CAPA_ESCALATION_1_No")
	WebElement CAPAEscalation_No;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_CAPA_ESCALATION_1_Create CAPA")
	WebElement CAPAEscalation_CreateCAPA;
	
	@FindBy(id="pRadioButton_V_SS_NC_NC_CAPA_ESCALATION_1_Attached to Existing CAPA")
	WebElement CAPAEscalation_Existing;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_PRS_NC_EXTEND_PRS_ACTION_PLAN_REQUIRED_1_true")
	WebElement ActionPlanYes;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_PRS_NC_EXTEND_PRS_ACTION_PLAN_REQUIRED_1_false")
	WebElement ActionPlanNo;
	
	@FindBy(id="textArea_V_SS_NC-V_SS_NC_ACTION_TITLE_2")
	WebElement ActionPlan;
	
	@FindBy(id="textArea_V_SS_NC-V_SS_NC_ACTION_PLAN_DESCRIPTION_1")
	WebElement ActionPlanDetail;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ACTION_ASSIGNED_ACT_CODE_1")
	WebElement AssignedToUser;
	
	@FindBy(id="V_SS_NC-V_SS_NC_ACTION_DUE_DATE_2")
	WebElement DueDate;
	
	@FindBy(xpath="//span[text()='Sign-off']")
	WebElement SignOff;
	
	public EvaluationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setResult() throws InterruptedException
	{
		Result.click();
		//driver.switchTo().frame("RadTextEditor_contentIframe");
		Thread.sleep(10000);
		testUtil.ChildWindowHandle();
		//driver.switchTo().alert().sendKeys("text");
		driver.findElement(By.xpath("//table[@id='RadTextEditorWrapper']/tbody/tr[3]/td")).sendKeys("testing");
	    driver.findElement(By.xpath("//span[text()='Save And Close']")).click();	
	}
	
	public void setOrgUnitType() throws InterruptedException
	{
		OrgUnitType.sendKeys("SITE");
		Thread.sleep(TestUtil.SLEEP_WAIT);
        driver.findElement(By.xpath("//li[@class='t-item t-state-selected']")).click();
	}
	
	public void setCausedBy() throws InterruptedException
	{
		CausedBy.sendKeys("ACT");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		CausedBy.sendKeys(Keys.ARROW_DOWN);
		CausedBy.sendKeys(Keys.ENTER);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Thread.sleep(TestUtil.SLEEP_WAIT);
		
	}
	
	public void setProcess() throws InterruptedException
	{
		Process.sendKeys("Assembly");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Process.sendKeys(Keys.ARROW_DOWN);
		Process.sendKeys(Keys.ENTER);	
	}
	
	public void setFailureMode() throws InterruptedException
	{
		FailureMode.sendKeys("product not assembled to specification");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		FailureMode.sendKeys(Keys.ARROW_DOWN);
		FailureMode.sendKeys(Keys.ENTER);
	}
	
	public void setDirectCauseCategory() throws InterruptedException
	{
		DirectCauseCategory.sendKeys("ENVIRONMENT");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		DirectCauseCategory.sendKeys(Keys.ARROW_DOWN);
		DirectCauseCategory.sendKeys(Keys.ENTER);
	}
	
	public void setDirectCause() throws InterruptedException
	{
		DirectCause.sendKeys("bioburden excursion");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		DirectCause.sendKeys(Keys.ARROW_DOWN);
		DirectCause.sendKeys(Keys.ENTER);
	}
	
	public String ActionPlanPolicyYes()
	{
		String flag=ActionPlanYes.getAttribute("value");
		return flag;
	}
	
	public String ActionPlanPolicyNo()
	{
		String flag=ActionPlanNo.getAttribute("value");
		return flag;
	}
	
	public void setActionPlan() 
	{
		ActionPlan.sendKeys("testing");		
	}
	
	public void setActionPlanDetail()
	{
		ActionPlanDetail.sendKeys("desc");	
	}

	public void setAssignedToUser() throws InterruptedException
	{
		AssignedToUser.sendKeys("NCX_ACTION_PLAN_OWN");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		//AssignedToUser.sendKeys(Keys.ARROW_DOWN);
		AssignedToUser.sendKeys(Keys.ENTER);
	}
	
	public void setDueDate()
	{
		DueDate.sendKeys("18-Apr-2018");
		DueDate.sendKeys(Keys.ENTER);
	}
	 public void ClickSignOff()
	 {
		 SignOff.click();
	 }
}
