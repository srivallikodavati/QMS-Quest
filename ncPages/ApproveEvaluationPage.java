package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class ApproveEvaluationPage extends TestBase{
	
	VerifyNCInitiationPage verifyInitiationPage;
	
	@FindBy(xpath="//div[@id='ctrlContainer_V_SS_NC-V_SS_NC_POLICY_INVEST_DUE_DATE_1']")
	WebElement EvaluationDueDate;
	
	@FindBy(id="pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Approve")
	WebElement Approve;
	
	@FindBy(id="pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Reject")
	WebElement Reject;
	
	@FindBy(id="textArea_V_ENU_NONPERSIS_USER_DATA_ENU_COMMENT_1")
	WebElement Comment;
	
	public ApproveEvaluationPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean displayEvaluationDueDate()
	{
		boolean status=EvaluationDueDate.isDisplayed();
		return status;
	}
	public void approveEval()
	{
		Approve.click();
		verifyInitiationPage.ClickOnSignOff();
	}
	public void rejectEval()
	{
		Reject.click();
		Comment.sendKeys("testing");
		verifyInitiationPage.ClickOnSignOff();
	}
	

}
