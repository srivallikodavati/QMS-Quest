package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseclass.TestBase;
import org.testng.Assert;
import utilities.TestUtil;

public class ImplementActionPlansPage extends TestBase{

	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_ACTION_STATUS_1_Yes")
	WebElement IsPlanCompleteYes;
	
	@FindBy(id="pRadioButton_V_SS_CAPA-V_SS_CAPA_ACTION_STATUS_1_No")
	WebElement IsPlanCompleteNo;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ACTION_COMPLETED_BY_CODE_1")
	WebElement CompletedBy;
	
	@FindBy(id="V_SS_CAPA-V_SS_CAPA_ACTION_COMPLETED_DATE_1")
	WebElement CompletedDate;
	
	@FindBy(id="textArea_V_SS_CAPA-V_SS_CAPA_ACTION_COMPLETION_COMMENT_1")
	WebElement Comment;
	
	public ImplementActionPlansPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnIsPlanCompletsYes() throws InterruptedException
	{
		IsPlanCompleteYes.click();
		Thread.sleep(TestUtil.SLEEP_WAIT);
		Comment.sendKeys("testing");
	}
	public String VerifyIsPlanCompleteNo()
	{
		String val=IsPlanCompleteNo.getAttribute("value");
		Assert.assertEquals(val, "No");
		return val;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
