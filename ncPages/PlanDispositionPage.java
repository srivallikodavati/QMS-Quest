package ncPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import utilities.TestUtil;

public class PlanDispositionPage extends TestBase{

	@FindBy(xpath="//input[@id='V_SS_NC_PRS_DISPOSITION_PRIORITY_1']")
	WebElement DispositionPriority;
	
	@FindBy(id="comboBox_V_SS_NC-V_SS_NC_DISPOSITION_DISPOSITION_NAME_2")
	WebElement Disposition;
	
	@FindBy(id="V_SS_NC-V_SS_NC_DISPOSITION_ASSIGNED_ACT_CODE_1")
	WebElement AssignedToUser;
	
	@FindBy(id="textArea_V_SS_NC-V_SS_NC_DISPOSITION_DISPOSITION_JUSTIFICATION_1")
	WebElement DispJustification;
	
	@FindBy(id="V_SS_NC-V_SS_NC_DISPOSITION_DISPOSITION_ASSIGNED_QTY_2")
	WebElement Disposition_Quantity;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_1")
	WebElement TeamDispApprover;
	
	@FindBy(xpath="//span[text()='Add Team Member']")
	WebElement AddTeamMember;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_2")
	WebElement TeamDispApprover2;
	
	@FindBy(xpath="//span[@id='V_SS_NC-V_SS_NC_TEAM_GridDelete_2']")
	WebElement TeamMemberDeleteRow;
	
	@FindBy(xpath="//li[@class='t-item t-state-selected']")
	WebElement AutopopulateText;
	
	public PlanDispositionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setDisposition() throws InterruptedException
	{
		Disposition.sendKeys("No Cause for Rejection");
		Thread.sleep(TestUtil.SLEEP_WAIT);
		AutopopulateText.click();
		Disposition.sendKeys(Keys.ENTER);
	}
	public void setAssignedToUser()
	{
		AssignedToUser.sendKeys(prop.getProperty("ExecuteDisposition_Role"));
	}
	public void setDispJustification()
	{
		DispJustification.sendKeys("testing");
	}
	public void setTeamMember()
	{
		TeamDispApprover.sendKeys(prop.getProperty("Disposition_ApproverRole"));
	}
	
}
