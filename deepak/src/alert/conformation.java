package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformation {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void title()
	{
		String a=d.getTitle();
		System.out.println(a);
	}
	public void currenturl()
	{
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void conform() throws InterruptedException
	{
		d.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		
		Alert alt=d.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		String txt=d.findElement(By.id("confirmResult")).getText();
		System.out.println(txt);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		conformation c1=new conformation();
		c1.opening_browser();
		c1.title();
		c1.currenturl();
		c1.conform();
		c1.d.close();
	}

}
