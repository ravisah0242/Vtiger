package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest  implements Auto_Constant
{
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException
	{
		System.setProperty(CHROME_KEY, CHROME_VALVE);
		driver=new ChromeDriver();
		//driver.get(url);			//in Excel Library;
		String data = Generic_PropertiesFile.test("./Vtiger.properties", "url");
		driver.get(data);
		//driver.get("http://localhost:8888/"); //direct Hard Coding;
		//driver.get("https://www.gmail.com");
		//driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		ExtentReports reports= new ExtentReports("./reports/extentreports.html", false);
		ExtentTest test = reports.startTest("Regration Test Cases");
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{ 
		int status=res.getStatus();
		String tcname=res.getName();
		
		if(status==2)		//fass==1;  failed==2;   Skiped==3;
		{
			String path = GenericScreenshot.photo(driver, tcname);
			 test.log(LogStatus.FAIL, test.addScreenCapture(path));
		}
		driver.close();
		 reports.endTest(test);
		 reports.flush();  //--> Never Ever Generate/seen new reports its a Old reports; 
	}
}
