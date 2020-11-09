package generic;

import org.openqa.selenium.WebDriver;

public class Generic_Webdriver 
{
	public String title(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String url(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public String pageSource(WebDriver driver)
	{
		String pages = driver.getPageSource();	
		return pages;
	}
	public String windowHandle(WebDriver driver)
	{
		String windowhandle = driver.getWindowHandle();
		return windowhandle;
	}
}
