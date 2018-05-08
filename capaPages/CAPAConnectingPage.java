package capaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class CAPAConnectingPage extends TestBase{
	
	@FindBy(xpath="//label[text()='CLOSED']")
	WebElement Status;
	
	@FindBy(xpath="//a[text()='Other Tasks']")
	WebElement OtherTasks;
	
	@FindBy(xpath="//li[@class='mega-unit mega-hdr last']/ul/li/a[text()='Verify CAPA Initiation']")
	WebElement CAPAInitiation;
	
	@FindBy(xpath="//a[contains(text(),'Investigate CAPA')]")
	WebElement InvestigateCAPA;
	
	@FindBy(xpath="//a[contains(text(),'Approve CAPA Investigation - CAPA_COORDINATOR')]")
	WebElement ApproveCAPAInvestigation;
	
	@FindBy(xpath="//a[contains(text(),'Approve CAPA Investigation - CAPA_DEPT_HEAD')]")
	WebElement ApproveCAPAInvestigation2;
	
	@FindBy(xpath="//a[contains(text(),'Include Effectiveness Review Plan')]")
	WebElement EffectivenessReviewPlan;
	
	@FindBy(xpath="//a[contains(text(),'Implement Action Plans')]")
	WebElement ImplementActionPlans;
	
	@FindBy(xpath="//a[contains(text(),'Verify Implementation')]")
	WebElement VerifyImplementation;
	
	@FindBy(xpath="//a[contains(text(),'Verify CAPA Completion')]")
	WebElement VerifyCAPACompletion;
	
	@FindBy(xpath="//a[contains(text(),'Verify CAPA Effectiveness')]")
	WebElement VerifyCAPAEffectiveness;
	
	@FindBy(xpath="//div[@id='recordNumber']")
	WebElement CAPARecordNumber;
	
	public CAPAConnectingPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOnOtherTasks()
	{
		OtherTasks.click();
	}
	public VerifyCAPAInitiationPage ClickOnCAPAInitiation()
	{
		CAPAInitiation.click();
		return new VerifyCAPAInitiationPage();
	}
    public InvestigationPage ClickOnInvestigateCAPA()
    {
    	InvestigateCAPA.click();
    	return new InvestigationPage();
    }
    public ApproveCAPAInvestigationPage ClickOnApproveCAPAInvestigation()
    {
    	ApproveCAPAInvestigation.click();
    	return new ApproveCAPAInvestigationPage();
    }
    public ApproveCAPAInvestigationPage ClickOnApproveCAPAInvestigation2()
    {
    	ApproveCAPAInvestigation2.click();
    	return new ApproveCAPAInvestigationPage();
    }
    public EffectivenessReviewPlanPage clickOnEffectivenessReviewPlan()
    {
    	EffectivenessReviewPlan.click();
		return new EffectivenessReviewPlanPage();	
    }
    public ImplementActionPlansPage ClickOnImplementActionPlans()
    {
    	ImplementActionPlans.click();
    	return new ImplementActionPlansPage();
    }
    public VerifyImplementationPage ClickOnVerifyImplementation()
    {
    	VerifyImplementation.click();
    	return new VerifyImplementationPage();
    }
    public VerifyCAPACompletionPage VerifyCAPACompletion()
    {
    	VerifyCAPACompletion.click();
    	return new VerifyCAPACompletionPage();
    }
    public VerifyCAPAEffectivenessPage VerifyCAPAEffectiveness()
    {
    	VerifyCAPAEffectiveness.click();
    	return new VerifyCAPAEffectivenessPage();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
