package genericLibrary;

import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.testng.ITestResult; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	
	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtilities utilies = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.edgedriver().setup();
		//opening the chromeBrowser
		driver = new EdgeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Open the browser
		driver.get(pdata.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name = res.getName();
		if (status==2) 
		{
			//photo p = new photo();
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
			
	}
	

}
