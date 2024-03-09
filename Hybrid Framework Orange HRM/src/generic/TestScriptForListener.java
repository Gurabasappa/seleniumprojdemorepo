package generic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScriptForListener 
{
	@Test
	public void test_script()
	{
		Assert.fail();
		System.out.println("test script 1");
	}
	@Test(dependsOnMethods= {"test_script"})
	public void test_script2()
	{
		System.out.println("test script 2");
	}
}
