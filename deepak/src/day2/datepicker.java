package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).click();
		d.findElement(By.xpath("//*[@class=\"ui-state-default ui-state-highlight\"]")).click();
		
		
		
	}

}
