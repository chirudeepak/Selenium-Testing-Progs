package javatopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passingparameters {

	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passingparameters c=new passingparameters();
		c.opening_browser();
		c.gettitle();
		String s= c.geturl();
		System.out.println(s);

	}

}
