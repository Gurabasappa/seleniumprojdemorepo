package Simple_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshopComparePrice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gurupatilf@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Guru@12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../div[3]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fiction']/../../div[3]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Health Book']/../../div[3]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		List<WebElement> Priceall = driver.findElements(By.xpath("//input[@type='checkbox']/../following-sibling::td[5]"));
	  double data = 0;
		for(WebElement price:Priceall)
		{
	  String Completeallprice = price.getText(); 
	  double g = Double.parseDouble(Completeallprice);
	  data=data+g;
	  System.out.println(g);
	  
	 }
	 WebElement suballtotal = driver.findElement(By.xpath("//span[contains(text(),'Sub-Total')]/../following-sibling::td[1]/span/span"));
	 String allratevalues = suballtotal.getText();
	 double b = Double.parseDouble(allratevalues);
	 System.out.println(b);
	 if(data==b)
	 {
		 System.out.println("same price");
	 }
	 else
	 {
		 System.out.println("not same");
	 }
	 Thread.sleep(2000);
	 driver.quit();

	}

}
