package multi_class_login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class get_details extends login {
  @Test(priority=3)
  public void get_title() 
  {
	  System.out.println(d.getTitle());
  }
  @Test(priority=4)
  public void get_url()
  {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=5)
  public void elements()
  {
	  WebElement e=d.findElement(By.id("searchDropdownBox"));
	  List<WebElement> e1=e.findElements(By.tagName("option"));
	  System.out.print(e1.size());
	  for(int i=1;i<e1.size();i++)
		  System.out.println(e1.get(i).getText());
	  
  }
}
