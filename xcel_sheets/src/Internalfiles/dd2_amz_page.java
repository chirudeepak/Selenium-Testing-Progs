package Internalfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd2_amz_page {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		FileInputStream f1=new FileInputStream("D:\\Book3.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("Sheet2");
		Row r=null;
		Cell c=null;
		
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
		WebElement w=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement> w1=w.findElements(By.tagName("a"));
		System.out.println(w1.size());
		
		for(int i=0;i<w1.size();i++)
		{
			String a=w1.get(i).getText();
			System.out.println(a);
			w1.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			
			 w=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			 w1=w.findElements(By.tagName("a"));
				
			r=ws.createRow(i);
			r.createCell(0).setCellValue(a);
			
			if(w1.get(i).isSelected())
			{
				r.createCell(1).setCellValue("pass");
			}
			else
			{
				r.createCell(1).setCellValue("fail");
			}
		}
		FileOutputStream f2=new FileOutputStream("D:\\Book3.xlsx");
		wb.write(f2);
		f2.close();

	}

}
