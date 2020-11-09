package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import generic.BaseTest;

public class  TC1 extends  BaseTest

{
		@Test(groups="ta1")
		public void test1()
		{
			System.out.println("RAj");
			Assert.fail();
		}	
}
