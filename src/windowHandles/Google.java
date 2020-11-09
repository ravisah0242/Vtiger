package windowHandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Kishor%20sir%202.30/Google.html");
		//List<WebElement> links = driver.findElements(By.id("a1"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("Number of link - "+count); 
		
		for(WebElement we:links)
		{
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			act.contextClick(we).perform();
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		java.util.Set<String> allids = driver.getWindowHandles();
		int tabs=allids.size();
		System.out.println("All tab = "+tabs);
		
		ArrayList<String> l=new ArrayList<String>(allids);
		
		Thread.sleep(2000);
	
		String tab = l.get(3);	
		
		driver.switchTo().window(tab);
		
		//links.get(2).click();		// there are 5 links but we want to click 3 link;
		
		//driver.switchTo().
		
		//driver.findElement(By.id("a1")).click();
		
	}

}
