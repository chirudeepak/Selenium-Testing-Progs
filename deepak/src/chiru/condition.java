package chiru;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.amazon.com/");
		d.manage().window().maximize();
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		boolean selected=d.findElement(By.id("twotabsearchtextbox")).isSelected();
		System.out.println(selected);
		boolean enabled = d.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(enabled);
		boolean enabled = d.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(enabled);
		
	}

}
