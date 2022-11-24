package cucm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
	WebDriver d;
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	   
	}

	@When("^user needs to (.*) and (.*)$")
	public void user_needs_to(String uname,String password) {
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(password);
	    
	}

	@Then("user need to click on back page")
	public void user_need_to_click_on_back_page() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
	    
	}

	@And("user need to home page")
	public void user_need_to_home_page() {
		System.out.println("navigated");
		d.close();
	    
	}

}
