package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class PopUpWindowPage extends TestBase{

	
	@FindBy(xpath="//a[text()='CAPA Detail']")
	WebElement CAPADetail;
	
    @FindBy(xpath="//*[@id='navigationBody']/ul[2]/li/a[text()='Verify CAPA Initiation']")
	WebElement VerifyCAPAInitiation;
    
    @FindBy(xpath="//span[text()='Go to the next workflow step:']/following-sibling::ul/li/a[contains(text(),'Implement Action Plans')]")
    WebElement ImplementActionPlans;
    
    @FindBy(xpath="//span[text()='Go to the next workflow step:']/following-sibling::ul/li/a[contains(text(),'Verify CAPA Effectiveness')]")
    WebElement VerifyCAPAEffectiveness;
    
    public PopUpWindowPage()
    {
    	PageFactory.initElements(driver, this);
    }
}
