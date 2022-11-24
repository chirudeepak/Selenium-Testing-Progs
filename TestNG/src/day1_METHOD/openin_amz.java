package day1_METHOD;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openin_amz {
	WebDriver d;
	//@Test
	//@BeforeMethod
	@BeforeClass
  public void open_amz() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  d=new ChromeDriver();
  }
  @Test
  public void nav_to_amz()
  {
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize();
  }
  @Test
  public void get_title()
  {
	  System.out.println(d.getTitle());
  }
  @Test
  public void get_url()
  {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=5)
  public void screenshot() throws IOException
  {
	  File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(a,new File("D:\\ne.png"));
  }
  //@Test
  //@AfterMethod
  @AfterClass
  public void close()
  {
	  d.close();
  }
}
