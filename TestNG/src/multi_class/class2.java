package multi_class;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {
	 @Test(priority=5)
  public void paymtdetails() 
  {
	  System.out.println("payment successfully");
  }
 
  @BeforeClass//(priority=4)
  public void delivery()
  {
	  System.out.println("delivered to ryt address");
  }
}
