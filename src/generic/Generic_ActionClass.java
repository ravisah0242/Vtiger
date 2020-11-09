package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_ActionClass 
{
	public void mouseHOverAction(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();	
	}
	public void mouseRightClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public void mouseDoubleClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	public void dragNdrop(WebDriver driver, WebElement source, WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	public void mouseClickNHold(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();
	}

}
