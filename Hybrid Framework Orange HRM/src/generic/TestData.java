package generic;

import org.testng.annotations.DataProvider;

public class TestData 
{
	@DataProvider(name = "endtoend")
	public Object[][] getData() 
	{
		
		Object [][]arr= {{"C:\\Users\\USER\\Desktop\\scoreboard.jfif","firstname",
			"middlename","lastname"}};
		return arr;
	}
}
