package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class VerifyCAPAInitiationPage extends TestBase {

	@FindBy(xpath="//input[@id='comboBox_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_PRS_RISK_ESCALATION_1']")
	WebElement RiskEscalationMatrix;
	
	@FindBy(xpath="//li[@class='t-item t-state-selected']")
	WebElement AutopopulateText;
	
	@FindBy(xpath="//input[@id='comboBox_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_SEVERITY_RATING_NAME_1']")
	WebElement SeverityRating;
	
	@FindBy(xpath="//input[@id='comboBox_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_OCCURRENCE_RATING_NAME_1']")
	WebElement OccurrenceRating;
	
	@FindBy(xpath="textArea_V_SS_CAPA-V_SS_CAPA_RISK_ASSESSMENT_RATIONALE_SEV_SELECTON_1")
	WebElement SeverityAndOccurrenceRationale;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_TEAM_ACTOR_CODE_1")
	WebElement CAPAOwner;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_POLICY_INVEST_INTERVAL_1")
	WebElement InvestigationInterval;
	
	public VerifyCAPAInitiationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
