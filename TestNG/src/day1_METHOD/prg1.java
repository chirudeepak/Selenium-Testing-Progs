package day1_METHOD;

import org.testng.annotations.Test;

public class prg1 {
  @Test(priority=3)
  public void opening() {
	  System.out.println("successfully opened");
  }
  @Test(priority=2)
  public void cust()
  {
	  System.out.println("success cust");
  }
  @Test(priority=1)
  public void payment()
  {
	  System.out.println("Success pavement");
  }
  @Test(enabled=false)   //to skip this method
  public void logoff()
  {
	  System.out.println("Successfully close");
  }
}
