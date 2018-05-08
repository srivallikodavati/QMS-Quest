package ncPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class ApproveDispositionPage extends TestBase{
	VerifyNCInitiationPage verifyInitiationPage;
	
	@FindBy(id="pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Approve")
	WebElement Approve;
	
	@FindBy(id="pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Reject")
	WebElement Reject;
	
	@FindBy(id="textArea_V_ENU_NONPERSIS_USER_DATA_ENU_COMMENT_1")
	WebElement Comment;
	
	@FindBy(xpath="//span[contains(text(),'Disposition Plan ')]")
	WebElement DispPlanPanel;
	
	public ApproveDispositionPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void approveDispositionPlan()
	{
		Approve.click();
		verifyInitiationPage.ClickOnSignOff();
	}
}
