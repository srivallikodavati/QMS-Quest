package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class VerifyCAPAEffectivenessPage extends TestBase{
	
	@FindBy(id="comboBox_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_SEVERITY_RATING_NAME_2")
	WebElement SeverityRating;
	
	@FindBy(id="comboBox_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_OCCURRENCE_RATING_NAME_2")
	WebElement OccurrenceRating;
	
	@FindBy(id="textArea_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_RATIONALE_SEV_SELECTON_2")
	WebElement SeverityAndOccurrenceRatinale;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_POLICY_EFFECT_FOLLOWUP_REQ_1_true")
	WebElement IsFollowUpRequiredYes;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_POLICY_VOE_DUE_DATE_1")
	WebElement EffectivenessReviewDueDate;

	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_POLICY_EFFECT_FOLLOWUP_REQ_1_false")
	WebElement IsFollowUpRequiredNo;
	
	@FindBy(id="pRadioButton_V_SS_CAPA_IS_CAPA_JUDGED_EFFECTIVE_1_true")
	WebElement IsCAPAEffectiveYes;
	
	@FindBy(id="pRadioButton_V_SS_CAPA_IS_CAPA_JUDGED_EFFECTIVE_1_false")
	WebElement IsCAPAEffectiveNo;
	
	@FindBy(id="comboBox_V_SS_CAPA_VOE_RESULT_1")
	WebElement EffectivenessReviewResult;
	
	@FindBy(id="pRadioButton_V_SS_CAPA_UDF_BOOLEAN_3_1_true")
	WebElement AdditionalNCRequiredYes;
	
	@FindBy(id="pRadioButton_V_SS_CAPA_PRS_NC_TYPE_1_Nonconformance")
	WebElement TypeNC;
	
	@FindBy(id="pRadioButton_V_SS_CAPA_PRS_NC_TYPE_1_Deviation")
	WebElement TypeDeviation;
	
	@FindBy(id="pRadioButton_V_SS_CAPA_UDF_BOOLEAN_3_1_false")
	WebElement AdditionalNCRequiredNo;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_CHECKLIST_CHK_LIST_RESPONSE_1_Yes")
	WebElement Response;
	
	@FindBy(id="textArea_V_ENU_NONPERSIS_USER_DATA_ENU_COMMENT_1")
	WebElement Summary;
	
	
	
	public VerifyCAPAEffectivenessPage()
	{
		PageFactory.initElements(driver, this);
	}

}
