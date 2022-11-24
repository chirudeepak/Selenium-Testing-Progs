package multi_class_login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class sc_and_close extends get_details {
  @Test(priority=6)
  public void sc() throws IOException 
  {
	  File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(a,new File("D:\\amz.png"));
  }
  @Test(priority=7)
  public void close()
  {
	  d.close();
  }
}
