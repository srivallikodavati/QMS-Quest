package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class ExecuteDispositionPage extends TestBase{
    
	@FindBy(xpath="//input[@id='V_SS_NC-V_SS_NC_DISPOSITION_DISPOSITIONED_QTY_1']")
	WebElement DispositionedQuantity;
	
	@FindBy(xpath="//textarea[@id='textArea_V_SS_NC-V_SS_NC_DISPOSITION_DISPOSITION_COMP_COMMENT_1']")
	WebElement CompletionComment;
	
	@FindBy(id="V_SS_NC-V_SS_NC_DISPOSITION_DISPOSITION_COMP_DATE_1")
	WebElement DispositionComplDate;
	
	public ExecuteDispositionPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validatedate()
	{
		String dateTooltip=DispositionComplDate.getAttribute("title");
		if(dateTooltip.equalsIgnoreCase("Please enter the correct date format for Disposition Completed Date: dd-mmm-yyyy"))
         System.out.println("Tooltip for Dispostion Completion Date: "+dateTooltip);
		else
			System.out.println("Tooltip for Dispostion Completion Date: "+dateTooltip);
	}
	
	public void setDispositionedQuantity()
	{
		DispositionedQuantity.sendKeys("1");
	}
	public void setCompletionComment()
	{
		CompletionComment.sendKeys("testing");
	}
	
}
