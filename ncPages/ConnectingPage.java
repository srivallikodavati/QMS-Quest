package ncPages;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    import baseclass.TestBase;

	public class ConnectingPage extends TestBase{
		
		//Page Factory - OR
		
		@FindBy(xpath="//li[@class='topMenu dc-mega-li']/a[text()='Other Tasks']")
		WebElement OtherTasks;
		
		@FindBy(xpath="//a[text()='Verify Nonconformance Initiation']")
		WebElement VerifyNC;
		
		@FindBy(xpath="//a[contains(text(),'Containment Action')]")
		WebElement Containment;
		
		@FindBy(xpath="//a[contains(text(),'Evaluation')]")
		WebElement Evaluation;
		
		@FindBy(xpath="//a[contains(text(),'Approve Evaluation')]")
		WebElement ApproveEvaluation;
		
		@FindBy(xpath="//a[contains(text(),'Plan Disposition')]")
		WebElement PlanDisposition;
		
		@FindBy(xpath="//a[contains(text(),'Approve Disposition Plan')]")
		WebElement ApproveDispositionPlan;
		
		@FindBy(xpath="//a[contains(text(),'Execute Disposition')]")
		WebElement ExecuteDisposition;
		
		@FindBy(xpath="//a[contains(text(),'Sign-off Action Plans')]")
		WebElement SignOffActionPlans;
		
		@FindBy(xpath="//a[contains(text(),'Verify Nonconformance Closure')]")
		WebElement NCClosure;
		
		@FindBy(xpath="//a[text()='Approve Evaluation - DEV_APPROVER']")
		WebElement ApproveDeviation;
		
		@FindBy(xpath="//a[text()='Approve Evaluation - TEST_SMART_TEST2']")
		WebElement ApproveDeviation2;
		
		@FindBy(xpath="//a[contains(text(),'Verify Nonconformance Closure')]")
		WebElement DevClosure;
		
		@FindBy(xpath="//a[contains(text(),'Close')]")
		WebElement Close;
		
		@FindBy(xpath="//span[text()='Logout']")
		WebElement Logout;
		
		@FindBy(xpath="//a[text()='CAPA Detail']")
		WebElement CAPADetail;
		
		@FindBy(xpath="//*[@id='navigationBody']/ul[2]/li/a[text()='Verify CAPA Initiation']")
		WebElement VerifyCAPAInitiation;
		
		//Initializing PageFcatory
		
		public ConnectingPage()
		{
			PageFactory.initElements(driver, this);
		//  PageFactory.initElements(driver, ConnectingPage.class);
		}
        
		//Methods
		public void ClickOnOtherTasks()
		{
			OtherTasks.click();
		}
		
		public VerifyNCInitiationPage ClickVerifyNCInitiation()
		{
			VerifyNC.click();
			return new VerifyNCInitiationPage();
		}
		
		public ContainmentActionPage ClickContainmentAction()
		{
			Containment.click();
			return new ContainmentActionPage();
		}
		public EvaluationPage ClickEvaluation()
		{
	        Evaluation.click();
	        return new EvaluationPage();
		}
		public ApproveEvaluationPage ClickApproveEvaluation()
		{
			ApproveEvaluation.click();
			return new ApproveEvaluationPage();
		}
	    public PlanDispositionPage ClickPlanDisposition()
	    {
	    	PlanDisposition.click();
	    	return new PlanDispositionPage();
	    }
	    public ApproveDispositionPage ClickApproveDisposition()
	    {
	    	ApproveDispositionPlan.click();
	    	return new ApproveDispositionPage();
	    }
	    public ExecuteDispositionPage ClickExecuteDisposition()
	    {
	    	ExecuteDisposition.click();
	    	return new ExecuteDispositionPage();
	    }
		public SignOffActionPlan ClickSignOffActionPlans()
		{
			SignOffActionPlans.click();
			return new SignOffActionPlan();
		}
		
		public void ClickApproveDeviation()
		{
			ApproveDeviation.click();
			
		}
		public void ClickApproveDeviation2()
		{
			ApproveDeviation2.click();
		}
		public deviationPages.DevClosure ClickDevClosure()
		{
			DevClosure.click();
			return new deviationPages.DevClosure();
		}
	    public Closure ClickNCClosure()
	    {
	    	NCClosure.click();
	    	return new Closure();
	    }
		public void ClickClose()
		{
			Close.click();
		}
		public void ClickLogOut()
		{
			Logout.click();
		}
	}

