package scripts;

import org.testng.annotations.Test;
import generic.BaseTest;
import pom.Vtiger_LoginPage;
import pom.Vtiger_LogoutPage;

public class Test_Login_Logout_test extends BaseTest
{
	
	@Test(groups="Regration")
	public void login_logout_test() throws InterruptedException
	{
		Vtiger_LoginPage lp=new Vtiger_LoginPage(driver);
		lp.login("admin", "manager");
	
		Vtiger_LogoutPage hp=new Vtiger_LogoutPage(driver);
		hp.logoutMathod(driver);				 
	}

}
