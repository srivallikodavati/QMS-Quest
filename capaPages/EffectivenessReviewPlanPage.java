package capaPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class EffectivenessReviewPlanPage extends TestBase{
	
	@FindBy(xpath="//textarea[@id='textArea_V_SS_CAPA-V_SS_CAPA_ACTION_PLAN_DESCRIPTION_1']")
	WebElement PlanDescription;
	
	@FindBy(xpath="//input[@id='V_SS_CAPA_EFFECT_REVIEW_INTERVAL_1']")
	WebElement EffectivenessReviewInterval;
	
	@FindBy(xpath="//input[@id='comboBox_V_SS_CAPA_EFFECT_REVIEW_INTVL_UNIT_1']")
	WebElement Unit;
	
	
	public EffectivenessReviewPlanPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EffectivenessReviewPlan()
	{
		PlanDescription.sendKeys("testing");
		EffectivenessReviewInterval.sendKeys("5");
		Unit.sendKeys("Days");
		Unit.sendKeys(Keys.ENTER);
	}

}
