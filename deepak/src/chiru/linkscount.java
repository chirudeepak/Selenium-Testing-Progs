package chiru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		/*WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table"));
		List<WebElement> b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
			System.out.println(b.get(i).getText());
		*/
		
		/*
		WebElement a=d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table"));
		List<WebElement> b=a.findElements(By.tagName("td"));
		System.out.println(b.size());
		*/
		
		/*d.findElement(By.linkText("REGISTER")).click();
		d.findElement(By.name("firstName")).sendKeys("deepak");
		d.findElement(By.name("country")).sendKeys("INDIA");
		*/
		
		/*
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement> b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
			System.out.println(b.get(i).getText());
		*/
		
		
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement> b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			b.get(i).click();
			Thread.sleep(1000);
			d.navigate().back();
			d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
			b=a.findElements(By.tagName("a"));
			
		}
		
		d.close();
	}

}
