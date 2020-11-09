package windowHandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandel 
{
	//public WebDriver driver;
	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Kishor%20sir%202.30/Google.html");
		//List<WebElement> links = driver.findElements(By.id("a1"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("Number of link - "+count); 
		
		for( WebElement we : links) 		//All the Element click
		{
			Actions act = new Actions(driver);
			Thread.sleep(1000);
			act.contextClick(we).perform();	
			Thread.sleep(1000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);		//Action class to Right click;
			r.keyRelease(KeyEvent.VK_T);
		}
		Thread.sleep(2000);
		Set<String> alllinks = driver.getWindowHandles();		// all the Tabs to count and haldle;
		int tabs = alllinks.size();
		System.out.println("All the Tab:-"+tabs);
		
		ArrayList<String> l=new ArrayList<String>(alllinks); 	//l==alltabs all  in Array List;
		Thread.sleep(3000);
		//driver.switchTo().window(l.get(1));
		String tabs2 = l.get(2);
		//String tab = l.get(3);  	//go to 4th Tabs;
		driver.switchTo().window(tabs2);
		Thread.sleep(1000);
		//driver.switchTo().window(l.get(3));
	}

}
