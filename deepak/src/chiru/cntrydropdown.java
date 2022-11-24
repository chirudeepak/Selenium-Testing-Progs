package chiru;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cntrydropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.findElement(By.linkText("REGISTER")).click();
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement> drop1= drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1, new File("D://new1.png"));
		for(int i=0;i<drop1.size();i++)
			System.out.println(drop1.get(i).getText());
		
	}

}
