package Simple_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshopdotcom 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Guru");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Basav");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gurupatilf@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Guru@12345");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Guru@12345");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/logout']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gurupatilf@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Guru@12345");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(3000);
}
}
