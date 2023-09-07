package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.TestingPage;
import pomPages.skillraryLoginPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable 
	{
		skillraryLoginPage s = new skillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydempapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.switchingtabs(driver);
		utilies.dropdown(sd.getCoursedd(), pdata.getProperty("coursedd"));
		TestingPage tp = new TestingPage(driver);
		utilies.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());

	}
	

}
