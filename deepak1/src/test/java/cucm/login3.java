package cucm;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login3 {
	WebDriver d;

	@Given("user need to enter amazon page")
	public void user_need_to_enter_amazon_page() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https:\\www.amazon.com");
		d.manage().window().maximize();
	}

	@When("user capture all links and navigate back and capture all links")
	public void user_capture_all_links_and_navigate_back_and_capture_all_links() {
		WebElement w=d.findElement(By.xpath("//*[@id=\"nav-xshop\"]"));
		List<WebElement> w1=w.findElements(By.tagName("a"));
		System.out.println(w1.size());
		d.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
		FileInputStream f=new FileInputStream("D:\\book3.xlsx");
		XSSFWorkbook wc= new XSSFWorkbook(f);
		XSSFSheet s=wc.getSheet("sheet3");
		Row r=null;
		Cell c=null;
		String s1="//*[@id=\"nav-xshop\"]/a[";
		String s1="]";
		for(int i=1;i<w1.size();i++)
		{
			d.findElement(By.xpath(s1+i+s1)).click();
			System.out.println(d.getTitle());
			d.navigate().back();
		}
	 
	}

	@Then("capture the screen shot")
	public void capture_the_screen_shot() {

	}

	@Then("closeing the browser")
	public void closeing_the_browser() {
		
		d.close();
	}

}
