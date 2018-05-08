package deviationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;
import ncPages.VerifyNCInitiationPage;

public class DevClosure extends TestBase{
	
	VerifyNCInitiationPage verifyInitiationPage;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_1_Yes']")
	WebElement Response1;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_2_Yes']")
	WebElement Response2;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_3_Yes']")
	WebElement Response3;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_4_Yes']")
	WebElement Response4;
	
	@FindBy(id="pRadioButton_V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_RESPONSE_3_No")
	WebElement Response3_No;
	
	@FindBy(xpath="//input[@id='V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_QUESTION_1']")
	WebElement Question1;
	
	@FindBy(xpath="//input[@id='V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_QUESTION_2']")
	WebElement Question2;
	
	@FindBy(xpath="//input[@id='V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_QUESTION_3']")
	WebElement Question3;
	
	@FindBy(xpath="//input[@id='V_SS_NC-V_SS_NC_CHECKLIST_CHK_LIST_QUESTION_4']")
	WebElement Question4;
	
	@FindBy(id="textArea_V_SS_NC_CLOSURE_COMMENT_1")
	WebElement Comment;
	
	public DevClosure()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setYesToQuestions()
	{
		Response1.click();
		Response2.click();
		Response3.click();
		Response4.click();
		Comment.sendKeys("testing");
		verifyInitiationPage.ClickOnSignOff();
	}
	
	public void setNoToOneQuestion()
	{
		Response1.click();
		Response2.click();
		Response3_No.click();
		Response4.click();
		Comment.sendKeys("testing");
		verifyInitiationPage.ClickOnSignOff();
	}
	
	public void validateQuestions()
	{
		String Text1=Question1.getAttribute("value");
		if(Text1.equalsIgnoreCase("Were the correct approvers selected (Verification section) based on the statement of deviation?"))
			System.out.println("Question 1 is same: "+Text1);
		else
			System.out.println("Question 1 is not same: "+Text1);
		String Text2=Question2.getAttribute("value");
		if(Text1.equalsIgnoreCase("If the Deviation applies to specific Batch #’s (Evaluation Section), have the listed Batch #’s been received into Stock??"))
			System.out.println("Question 2 is same: "+Text2);
		else
			System.out.println("Question 2 is not same: "+Text2);
		String Text3=Question3.getAttribute("value");
		if(Text1.equalsIgnoreCase("Is there objective evidence listed for the Action Plan (Evaluation section)?"))
			System.out.println("Question 3 is same: "+Text3);
		else
			System.out.println("Question 3 is not same: "+Text3);
		String Text4=Question4.getAttribute("value");
		if(Text1.equalsIgnoreCase("If the Deviation Action Plan (Evaluation section) references an ECO or CR to resolve the Deviation, has the ECO or CR been approved/implemented?"))
			System.out.println("Question 4 is same: "+Text4);
		else
			System.out.println("Question 4 is not same: "+Text4);
	}
	
	
	
	

}
