package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	//https://demoapp.skillrary.com/ 
	//Declaration
	//address of course webelement
	@FindBy(id="course")
	private WebElement coursetab;
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtaining;
	//address of dropdown
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//Initialization
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization 
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	
	public void seleniumtrainingtab() {
		seleniumtaining.click();
	}

	public WebElement getCoursedd()
	{
		return coursedd;
	}

	

}
