package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Droupdown_SelectClass
{
	public void SelectIndex(WebElement ele, int i)
	{
		Select s=new Select(ele);	
		s.selectByIndex(i);
	}
	public void SelectVisibaltext(WebElement ele, String text)
	{
		Select s=new Select(ele);		
		s.selectByVisibleText(text);
	}
	public void SelectValue(WebElement ele, String val)
	{
		Select s=new Select(ele);
		s.selectByValue(val);
	}
	public void deselectIndex(WebElement ele, int i)
	{
		Select s=new Select(ele);
		s.deselectByIndex(i);
	}
	public void deselectVisibletext(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	public void deselectValue(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}

}
