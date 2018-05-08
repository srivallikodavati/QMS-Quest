package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class ApproveCAPAInvestigationPage extends TestBase{

	@FindBy(id="pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Approve")
	WebElement Approve;
	
	@FindBy(id="pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Reject")
	WebElement Reject;
	
	@FindBy(id="textArea_V_ENU_NONPERSIS_USER_DATA_ENU_COMMENT_1")
	WebElement Comment;
	
	@FindBy(xpath="//span[text()='Sign-off']")
	WebElement SignOff;
	
	public ApproveCAPAInvestigationPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void ApproveInvestigation()
	{
		Approve.click();
		SignOff.click();
	}
	public void RejectInvestigation()
	{
		Reject.click();
		Comment.sendKeys("testing");
		SignOff.click();
	}
}
