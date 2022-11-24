package multi_class;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() 
  {
	  System.out.println("welcome to newtours");
  }
  @AfterClass
  public void cutsdeatils()
  {
	  System.out.println("customer details collected");
  }
  @Test(priority=2)
  public void tets3()
  {
	  System.out.println("test3 runned");
  }
}
