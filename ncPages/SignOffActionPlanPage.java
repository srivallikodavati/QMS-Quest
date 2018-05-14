package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import utilities.TestUtil;

public class SignOffActionPlanPage extends TestBase{
	VerifyNCInitiationPage verifyInitiationPage;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_NC-V_SS_NC_ACTION_STATUS_1_Yes']")
	WebElement IsPlanCompleteYes;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_NC-V_SS_NC_ACTION_STATUS_1_No']")
	WebElement IsPlanCompleteNo;
	
	@FindBy(xpath="//textarea[@id='textArea_V_SS_NC-V_SS_NC_ACTION_COMPLETION_COMMENT_1']")
	WebElement Comment;
	
	@FindBy(xpath="//input[@id='V_SS_NC-V_SS_NC_ACTION_COMPLETED_BY_CODE_1']")
	WebElement CompletedBy;
	
	@FindBy(xpath="V_SS_NC-V_SS_NC_ACTION_COMPLETED_DATE_1")
	WebElement CompletedDate;
	
	public SignOffActionPlanPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String checkIsPlanCompleteDefaultedToNo()
	{
		String value=IsPlanCompleteNo.getAttribute("value");
		if(value.equalsIgnoreCase("No"))
			System.out.println("Is Plan Complete RdioButton is defaulted to: "+value);
		else
			System.out.println("Is Plan Complete RdioButton is defaulted to: "+value);
		
		return value;
	}
	
	public void IsPlanCompleteYes() throws InterruptedException
	{
		IsPlanCompleteYes.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Comment.sendKeys("testing");
		verifyInitiationPage.ClickOnSignOff();
	}
	
}
