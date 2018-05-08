package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class VerifyCAPACompletionPage extends TestBase{

	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_1_Yes")
	WebElement Response1;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_2_Yes")
	WebElement Response2;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_3_Yes")
	WebElement Response3;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_4_Yes")
	WebElement Response4;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_5_Yes")
	WebElement Response5;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_6_Yes")
	WebElement Response6;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_7_Yes")
	WebElement Response7;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_8_Yes")
	WebElement Response8;
	
	@FindBy(id="textArea_V_SS_CAPA_CLOSURE_COMMENT_1")
	WebElement Comment;
	
	@FindBy(id="V_SS_CAPA_EFFECT_REVIEW_INTERVAL_1")
	WebElement EffectivenessReviewInternal;
	
	public VerifyCAPACompletionPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void setResponses()
	{
		Response1.click();
		Response2.click();
		Response3.click();
		Response4.click();
		Response5.click();
		Response6.click();
		Response7.click();
		Response8.click();
		Comment.sendKeys("testing");
	}
	
}
