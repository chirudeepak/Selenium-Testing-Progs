package alert;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switching_w_to_w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String str=d.getWindowHandle();
		System.out.println(str);
		d.findElement(By.id("tabButton")).click();
		Set<String> child=d.getWindowHandles();
		System.out.println(child);
		for(String handle: child)
		{
			if(!handle.equalsIgnoreCase(str))
			{
				d.switchTo().window(handle);
				WebElement text=d.findElement(By.id("sampleHeading"));
				System.out.println(text.getText());
				
			}
		}
		d.close();
		
		
	}	

}
