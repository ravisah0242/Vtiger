package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Generic_ActionClass;

public class Vtiger_LogoutPage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administartor;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
	
	public Vtiger_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMathod(WebDriver driver) throws InterruptedException
	{
		Generic_ActionClass ga=new Generic_ActionClass();
		ga.mouseHOverAction(driver, Administartor);
		Thread.sleep(3000);
		
		signout.click();
	}
	
}



