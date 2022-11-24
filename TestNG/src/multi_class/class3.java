package multi_class;

import org.testng.annotations.Test;

public class class3 {
  @Test(priority=6)
  public void feedback() 
  {
	  System.out.println("feedback generated");
  }
  @Test(priority=7)
  public void close()
  {
	  System.out.println("closed");
  }
}
