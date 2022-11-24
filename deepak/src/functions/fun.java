package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fun {
	WebDriver d;
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void details(String a,String b) throws InterruptedException
	{
		d.findElement(By.xpath("//input[@type='text']")).sendKeys(a);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys(b);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		fun f=new fun();
		String s1="Deepak";
		String s2="Deepka*123";
		f.open_browser();
		f.details(s1,s2);
		
	}

}
