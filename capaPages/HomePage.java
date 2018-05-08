package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[text()='Create CAPA']")
	WebElement CreateCAPA;
	
	@FindBy(xpath="//a[text()='CAPA']")
	WebElement FindCAPA;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	

}
