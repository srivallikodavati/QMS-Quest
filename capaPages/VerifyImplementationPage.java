package capaPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import utilities.TestUtil;

public class VerifyImplementationPage extends TestBase{

	@FindBy(xpath="//input[@id='pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Acceptable']")
	WebElement VerificationDecisionAccept;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_ENU_NONPERSIS_USER_DATA_ENU_ACTION_1_Not Acceptable']")
	WebElement VerificationDecisionDecline;
	
	@FindBy(xpath="//textarea[@id='textArea_V_ENU_NONPERSIS_USER_DATA_ENU_COMMENT_1']")
	WebElement Comment;
	
	public VerifyImplementationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void DecisionAccept()
	{
		VerificationDecisionAccept.click();
		
	}
	public void DecisionDecline() throws InterruptedException
	{
		VerificationDecisionDecline.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Comment.sendKeys("testing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
