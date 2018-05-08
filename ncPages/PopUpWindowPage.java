package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class PopUpWindowPage extends TestBase{
    
	// PageFactory - OR
	@FindBy(xpath="//div[@id='navigationBody']/ul[2]/li/a[text()='Verify Nonconformance Initiation']")
	WebElement VerifyNonConformanceInitiation;
	
	@FindBy(xpath="//input[@id='_ctl7_btnOk']")
	WebElement SignOff;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//a[text()='Sign On']")
	WebElement PopUpSignOff;
	
	//Initializing PageFactory
	public PopUpWindowPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void ClickVerifyNonConformanceInitiation()
	{
		VerifyNonConformanceInitiation.click();
	}
	public void SignOffInPopUp()
	{
		SignOff.click();
	}
	public void popupSignOff(String un,String pw)
	{
		UserName.sendKeys(un);
		Password.sendKeys(pw);
		PopUpSignOff.click();
	}
	
}
