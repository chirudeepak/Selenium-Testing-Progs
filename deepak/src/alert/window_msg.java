package alert;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_msg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String pid=d.getWindowHandle();
		System.out.println(pid);
		d.findElement(By.id("messageWindowButton")).click();
		Set<String> child_id=d.getWindowHandles();
		System.out.println(child_id);
		for(String handle:child_id)
		{
			if(!handle.equalsIgnoreCase(pid))
			{
				d.switchTo().window(handle);
				WebElement txt=d.findElement(By.xpath("/html/body"));
				System.out.println(txt.getText());
				d.switchTo().window(handle);
				d.close();
			}
		}
	}

}
