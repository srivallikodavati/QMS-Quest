package ncPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class LoginPage extends TestBase{
	// PageFactory OR
	@FindBy(xpath = "//input[@id='username']")
	WebElement UserName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//a[contains(text(),'Sign On')]")
	WebElement LoginBtn;

	// Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	//  PageFactory.initElements(driver, LoginPage.class);
	}

	// Methods
	public String loginPageTitle() {
		return driver.getTitle();
	}
	public NCHomePage Login(String UsN,String Pwd){
		UserName.sendKeys(UsN);
		Password.sendKeys(Pwd);
		LoginBtn.click();
		return new NCHomePage();	
	}
}
