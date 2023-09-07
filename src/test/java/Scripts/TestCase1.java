package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.skillraryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		skillraryLoginPage s = new skillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydempapplication();
		utilies.switchingtabs(driver);
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.mouseOver(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddtoCartPage d = new AddtoCartPage(driver);
		utilies.doubleClick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilies.alertPopup(driver);
		
	}
	

}
