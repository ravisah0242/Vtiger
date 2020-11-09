package product;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_02 {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://localhost:8888/index.php?action=Login&module=Users");
			
			
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("manager");
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.xpath("//a[text()='Products']")).click();
			driver.findElement(By.name("search_text")).sendKeys("Raj");
			
			Select sel = new Select( driver.findElement(By.id("bas_searchfield")));
			sel.selectByIndex(1);
			
			driver.findElement(By.name("submit")).click();
			

	}

}
