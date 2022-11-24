package chiru;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","D:\\chromedriver.exe");
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("https://www.amazon.com/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		d.close();
	}

}
