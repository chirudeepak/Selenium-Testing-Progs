package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dezlearn_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		/*
		d.get("https://demoqa.com/frames");
		d.manage().window().maximize();
		d.switchTo().frame("frame1");
		WebElement txt=d.findElement(By.id("sampleHeading"));
		System.out.println(txt.getText());
		*/
		d.get("https://www.dezlearn.com/nested-iframes-example/");
		d.manage().window().maximize();
		d.switchTo().frame("parent_iframe");
		d.findElement(By.id("u_5_5")).click();
		Thread.sleep(2000);
		WebElement txt=d.findElement(By.id("processing"));
		System.out.println(txt.getText());
		
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		Thread.sleep(2000);
		WebElement txt1=d.findElement(By.id("processing"));
		System.out.println(txt1.getText());
		
		d.close();
		
	}

}
