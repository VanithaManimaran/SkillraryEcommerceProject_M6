package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	//declaration
	//address of selenium icon
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	//address of My cart
	@FindBy(id="cartArea")
	private WebElement carttab;
	
	@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[1]")
	private WebElement facebook;
	
	//initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCarttab() {
		return carttab;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon()
	{
		facebook.click();
	}

	
	
	

}
