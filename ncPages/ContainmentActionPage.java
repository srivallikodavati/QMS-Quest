package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseclass.TestBase;

public class ContainmentActionPage extends TestBase{

	@FindBy(xpath="//textarea[@id='textArea_V_SS_NC-V_SS_NC_CONTAINMENT_NC_COMMENT_1']")
	WebElement Comment;
	
	@FindBy(xpath="//span[text()='Sign-off']")
	WebElement SignOff;
	
	public ContainmentActionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setComment()
	{
		Comment.sendKeys("testing");
	}
    public void SignOff()
    {
    	SignOff.click();
    }
	
}
