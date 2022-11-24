package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class college_site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://collegedunia.com/college/28767-pbr-visvodaya-institute-of-technology-and-science-pbr-vits-nellore");
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		d.findElement(By.id("leadname")).sendKeys("deepak");
		d.findElement(By.id("leademail")).sendKeys("deepak@gmail.com");
		d.findElement(By.id("leadphone_no")).sendKeys("7569210998");
		d.findElement(By.id("leadcity")).sendKeys("nellore");
		d.findElement(By.id("leadcourse_tag_id")).click();
		d.findElement(By.xpath("//input[@name='course_tag_id']")).sendKeys("BE/B.Tech - Bachelors (Technology)");
		d.findElement(By.id("leadmessage")).sendKeys("i want to join in your college");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		d.findElement(By.id("leadstudy_start")).sendKeys("2023");
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/div/div[2]/form/div[2]/div[2]/button")).click();
		d.close();
	}

}
