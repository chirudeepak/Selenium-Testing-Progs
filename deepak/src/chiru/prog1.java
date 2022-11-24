package chiru;

import org.openqa.selenium.chrome.ChromeDriver;
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.amazon.com/");
		d.close();
	}

}
