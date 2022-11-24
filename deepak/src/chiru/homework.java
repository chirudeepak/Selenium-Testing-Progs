package chiru;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		s.close();
		switch(a)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.amazon.com/");
			d.findElement(By.id("searchDropdownBox")).click();
			WebElement drop=d.findElement(By.id("searchDropdownBox"));
			List<WebElement> drop1=drop.findElements(By.tagName("option"));
			System.out.println(drop1.size());
			for(int i=1;i<drop1.size();i++)
				System.out.println(drop1.get(i).getText());
			File dee=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(dee,new File("D:\\pak.png"));
			break;
		case "firefox":
			FirefoxDriver a1=new FirefoxDriver();
			a1.get("https://www.amazon.com/");
			a1.findElement(By.id("searchDropdownBox")).click();
			WebElement dro=a1.findElement(By.id("searchDropdownBox"));
			List<WebElement> dro1=dro.findElements(By.tagName("option"));
			System.out.println(dro1.size());
			for(int i=1;i<dro1.size();i++)
				System.out.println(dro1.get(i).getText());
			File de=((TakesScreenshot)a1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(de,new File("D:\\pak.png"));
			break;
		default:
			System.out.println("invalid browser");
			
		}
	}

}
