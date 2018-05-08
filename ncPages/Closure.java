package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class Closure extends TestBase{

	VerifyNCInitiationPage verifyInitiationPage;
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_1_Yes")
	WebElement Response1;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_2_Yes")
	WebElement Response2;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_3_Yes")
	WebElement Response3;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_4_Yes")
	WebElement Response4;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_5_Yes")
	WebElement Response5;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_6_Yes")
	WebElement Response6;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_5_No")
	WebElement Response5_No;
	
	@FindBy(id="textArea_V_SS_NC_CLOSURE_COMMENT_1")
	WebElement ClosureComment;
	
	public Closure()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setYesToQuestions()
	{
		Response1.click();
		Response2.click();
		Response3.click();
		Response4.click();
		Response5.click();
		Response6.click();
		ClosureComment.sendKeys("testing");
		verifyInitiationPage.ClickOnSignOff();
	}
	
	public void setNoToOneQuestion()
	{
		Response1.click();
		Response2.click();
		Response3.click();
		Response4.click();
		Response5_No.click();
		Response6.click();
		ClosureComment.sendKeys("testing");
		verifyInitiationPage.ClickOnSignOff();
	}
	
	
	
	
}
