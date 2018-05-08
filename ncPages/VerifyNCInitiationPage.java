package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class VerifyNCInitiationPage extends TestBase {
	
	//Page Factory- OR
	@FindBy(xpath="//input[@id='comboBox_V_SS_NC-V_PRS_DEFECT_CONDITION_PRS_DEFECT_1']")
	WebElement Defect;
	
	@FindBy(xpath="//li[@class='t-item t-state-selected']")
	WebElement AutopopulateText;
	
	@FindBy(xpath="//*[text()='Sign-off']")
	WebElement SignOff;
	
	//Initializing PageFactory
	public VerifyNCInitiationPage()
	{
		PageFactory.initElements(driver, this);
	//	PageFactory.initElements(driver, VerifyNCInitiationPage.class);
	}
	public void DefectTextBox()
	{
		Defect.sendKeys("failure to follow");
		driver.findElement(By.xpath("//li[text()='failure to follow']")).click();
	}
	public void ClickOnAutopopulateText()
	{
		AutopopulateText.click();
	}
	public void ClickOnSignOff()
	{
		SignOff.click();
	}

}
