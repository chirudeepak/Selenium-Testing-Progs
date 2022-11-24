package module1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_data {
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f1=new FileInputStream("D:\\Book3.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r= null;
		Cell c=null;
		
		r=ws.createRow(2);
		r.createCell(1).setCellValue("manual teasting");
		
		r=ws.createRow(3);
		r.createCell(2).setCellValue("QTP");
		
		r=ws.createRow(4);
		r.createCell(3).setCellValue("Selenium");
		
		FileOutputStream f=new FileOutputStream("D:\\Book3.xlsx");
		wb.write(f);
		f1.close();
	}

}
