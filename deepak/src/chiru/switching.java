package chiru;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("give browser name :");
		String browse=sc.next();
		sc.close();
		switch(browse)
		{
		case "chrome" :
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.navigate().to("https://www.amazon.com/");
			d.close();
			break;
		case "browser" :
			FirefoxDriver d1=new FirefoxDriver();
			d1.navigate().to("https://www.amazon.com/");
			d1.close();
			break;
		default :
			System.out.println("invalid browser");
			
		}
	}

}
