package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class InvestigationPage extends TestBase{

	@FindBy(id="comboBox_V_SS_CAPA-V_SS_CAPA_INVEST_TOOL_INVEST_TOOL_1")
	WebElement Tool;
	
	@FindBy(id="textArea_V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_RESULT_COMMENT_1")
	WebElement Result;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_PRS_ALERT_ISSUED_1_true")
	WebElement WasAnAlertIssuedYes;

	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_PRS_ALERT_ISSUED_1_false")
	WebElement WasAnAlertIssuedNo;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_PRS_HHE_ASSOCIATED_1_true")
	WebElement HHEAssociatedToThisCAPAYes;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_PRS_HHE_ASSOCIATED_1_false")
	WebElement HHEAssociatedToThisCAPANo;
	
	@FindBy(id="textArea_V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_PRS_HHE_DESC_1")
	WebElement HHEDescription;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_INVEST_RESULT_PERFORMED_BY_CODE_1")
	WebElement PerformedBy;
	
	@FindBy(id="comboBox_V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_CAUSE_BY_ORG_UNIT_TYPE_1")
	WebElement OrgUnitType;
	
	@FindBy(xpath="//li[@class='t-item t-state-selected']")
	WebElement Autopopulate;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_ORG_UNIT_CODE_1")
	WebElement CausedBy;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_PRODUCT_CODE_2")
	WebElement Material;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_PROCESS_CODE_2")
	WebElement Process;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_FAILURE_MODE_NAME_2")
	WebElement FailureMode;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_ROOT_CAUSE_CATEGORY_1")
	WebElement RootCauseCategory;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ROOT_CAUSE_FAILURE_CAUSE_NAME_2")
	WebElement RootCause;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_CAPA_UDF_BOOLEAN_1_1_true']")
	WebElement ProcessOrDesignVerification;
	
	@FindBy(xpath="//input[@id='pRadioButton_V_SS_CAPA_UDF_BOOLEAN_2_1_true']")
	WebElement ProcessOrDesignValidation;
	
	@FindBy(id="textArea_V_SS_CAPA-V_SS_CAPA_ACTION_TITLE_2")
	WebElement ActionPlan;
	
	@FindBy(id="textArea_V_SS_CAPA-V_SS_CAPA_ACTION_PLAN_DESCRIPTION_1")
	WebElement PlanDescription;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ACTION_ASSIGNED_ROLE_CODE_1")
	WebElement AssignedToRole;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ACTION_ASSIGNED_ACT_CODE_2")
	WebElement AssignedToUser;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ACTION_DUE_DATE_2")
	WebElement DueDate;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_ACTION_STATUS_1_No")
	WebElement IsPlanCompleteNo;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_ACTION_STATUS_1_Yes")
	WebElement IsPlanCompleteYes;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_POLICY_IMPL_INTERVAL_1")
	WebElement ImplementationInterval;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_POLICY_CLOSURE_INTERVAL_1")
	WebElement CompletionInterval;
	
	public InvestigationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
