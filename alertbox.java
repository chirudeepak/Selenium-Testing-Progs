package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {
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
	public void alert() throws InterruptedException
	{
		d.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		d.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alertbox a1=new alertbox();
		a1.opening_browser();
		a1.title();
		a1.currenturl();
		a1.alert();
		
	}

}
