package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class NCHomePage extends TestBase{
	//CreateNCTest createNCTest;
	//OR
	
	@FindBy(xpath="//section[@class='dashboard-header-logo']/img")
	WebElement HomePageLogo;
	
	@FindBy(xpath="//a[contains(text(),'Create Nonconformance')]")
	WebElement CreateNCLink;
	
	@FindBy(xpath="//a[text()='Nonconformance']")
	WebElement FindNC;
	
	@FindBy(xpath="//span[@id='expandToSearch']")
	WebElement SearchNCClick;
	
	@FindBy(xpath="//input[@id='txtSearch']")
	WebElement SerachForNCTextField;
	
	@FindBy(xpath="//input[@name='btnSearchButton']")
	WebElement SearchButton;
	
	@FindBy(id="Logout")
	WebElement LogOut;
	
	public NCHomePage()
	{
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, NCXHomePage.class);
	}
	//methods
	
	public boolean HomePageImg()
	{
		boolean logoVisisble=HomePageLogo.isDisplayed();
		return logoVisisble;
	}
	
	public CreateNCRecordPage clickOnCreateNC()
	{
		CreateNCLink.click();
		return new CreateNCRecordPage();
	}
	public void ClickFindNC()
	{
		FindNC.click();
	}
	
	
	
}
