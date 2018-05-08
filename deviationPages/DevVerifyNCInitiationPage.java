package deviationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class DevVerifyNCInitiationPage extends TestBase{
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_1")
	WebElement Dev_Coordinator;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_2")
	WebElement NC_Evaluator;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_3")
	WebElement DEV_Approver1;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_4")
	WebElement DEV_Approver2;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_5")
	WebElement Dev_Owner;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_6")
	WebElement DEV_Coordinator2;
	
	@FindBy(id="V_SS_NC-V_SS_NC_TEAM_ACTOR_CODE_7")
	WebElement DEV_Approver3;
	
	public DevVerifyNCInitiationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
