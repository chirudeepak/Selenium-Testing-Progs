package chiru;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='userName']")).sendKeys("chiru");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("bewarse");
		d.findElement(By.name("submit")).click();
		
	}

}
