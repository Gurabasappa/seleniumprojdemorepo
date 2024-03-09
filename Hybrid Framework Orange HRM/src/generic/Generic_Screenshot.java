package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Generic_Screenshot implements Framework_Constants
{
	public static void getPhoto(WebDriver driver,ITestResult result) 
	{
		Date d=new Date();
		String converted = d.toString().replaceAll("/", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File(SCREENSHOT_PATH+converted+result.getName()+".png");
		try 
		{
		FileHandler.copy(temp, perm);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
