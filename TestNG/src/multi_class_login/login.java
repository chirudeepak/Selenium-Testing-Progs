package multi_class_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver d;
  @Test(priority=1)
  public void set() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  d=new ChromeDriver();
  }
  @Test(priority=2)
  public void log_in()
  {
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize();
  }
}
