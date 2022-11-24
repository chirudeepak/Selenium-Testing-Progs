package javatopics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromeamzon {
	
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}
	public void gettitle()
	{
		System.out.println(d.getTitle());
	}
	public String geturl()
	{
		return d.getCurrentUrl();
	}
	public void drop()
	{
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
			System.out.println(drop1.get(i).getText());
	}
	public void screenshot() throws IOException
	{
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\new3.png"));
	}
	public void close()
	{
		d.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		chromeamzon ca=new chromeamzon();
		ca.opening_browser();
		ca.gettitle();
		String s=ca.geturl();
		System.out.println(s);
		ca.drop();
		ca.screenshot();
		ca.close();
	}

}
