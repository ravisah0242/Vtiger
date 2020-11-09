package product;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_01 
{

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
		driver.findElement(By.xpath("//img[contains(@title,'Create Product...')]")).click();
		driver.findElement(By.name("productname")).sendKeys("Raj");
		driver.findElement(By.name("sales_start_date")).sendKeys("2020-04-04");
		
		Select sel = new Select( driver.findElement(By.name("productcategory")));
		sel.selectByVisibleText("Software");
		
		driver.findElement(By.name("sales_end_date")).sendKeys("2021-04-04");
		driver.findElement(By.xpath("//img[contains(@title,'Select')]")).click();
		
	/*//    driver.findElement(By.xpath("//a[text()='Mary']")).click();
		
		driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//a[text()='Mary']")).click();
		driver.switchTo().defaultContent();
	*/	
		driver.findElement(By.id("productsheet")).sendKeys("1");
		
		Select sel1 = new Select( driver.findElement(By.name("glacct")));
		sel1.selectByIndex(1);
		
		driver.findElement(By.id("productcode")).sendKeys("11");
		
		Select sel2 = new Select( driver.findElement(By.name("manufacturer")));
		sel2.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@name='start_date' and @id='jscal_field_start_date']")).sendKeys("2020-01-04");
	    driver.findElement(By.xpath("//input[@name='expiry_date' and @id='jscal_field_expiry_date']")).sendKeys("2022-01-04");
		driver.findElement(By.xpath("//input[@class='detailedViewTextBox' and @name='website']")).sendKeys("www.abc.com");
		driver.findElement(By.id("serial_no")).sendKeys("89353737");
		driver.findElement(By.id("unit_price")).clear();
		driver.findElement(By.id("unit_price")).sendKeys("9999999999");
		driver.findElement(By.id("commissionrate")).sendKeys("5");
		driver.findElement(By.id("tax1_check")).click();
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("tax3_check")).click();
	
		Select sel3 = new Select( driver.findElement(By.name("usageunit")));
		sel3.selectByIndex(1);
		
		driver.findElement(By.id("qtyinstock")).sendKeys("100");
		driver.findElement(By.cssSelector("input[value='T']")).click();
		
		Select sel4 = new Select( driver.findElement(By.name("assigned_group_id")));
		sel4.selectByIndex(1);
		
		driver.findElement(By.id("qty_per_unit")).sendKeys("500");
		driver.findElement(By.id("reorderlevel")).sendKeys("50");
		driver.findElement(By.id("qtyindemand")).sendKeys("300");
		driver.findElement(By.name("file_0")).sendKeys("F:/Tutorial Beigenar/QSpider Tutorial Lecture/Kishor sir 2.30/SElenium.png");
		driver.findElement(By.name("description")).sendKeys("hheuweiewoiwehio");
//		driver.findElement(By.xpath("(//input[@value='  Save  '])[2]")).click();
		System.out.println("pass");
		
		

	}

}
