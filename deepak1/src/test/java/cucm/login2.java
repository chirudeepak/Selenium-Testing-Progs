package cucm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login2 {
	WebDriver d;
	@Given("user is in newtour page")
	public void user_is_in_newtour_page() {
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
	}

	@When("user need to enter uname and pass")
	public void user_need_to_enter_uname_and_pass() throws IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\chiru\\eclipse-workspace\\xcel_sheets\\src\\Internalfiles\\p1.properties");
		Properties p1=new Properties();
		p1.load(f1);
		
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	}

	@Then("user need to click on backpage")
	public void user_need_to_click_on_submitpage() {
	    d.findElement(By.name("submit ")).click();
	}

	@Then("user need to take sc,click on submit button,back to home")
	public void user_need_to_take_sc_back_to_home() throws IOException {
	    File new1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    com.google.common.io.Files.copy(new1,new File("D:\\new45.png"));
	    d.close();
	}


}
