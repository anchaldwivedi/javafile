package selenium;

import java.io.FileInputStream;


import java.io.FileOutputStream;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Write_Excel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis=new FileInputStream("./excel/trial.xlsx");
		   Workbook book=WorkbookFactory.create(fis);
		   Sheet s = book.getSheet("Sheet1");
		   Row r=s.createRow(0);
		   Cell c= r.createCell(0);
		   c.setCellValue("hello");
		 FileOutputStream fout=new FileOutputStream("./excel/trial.xlsx");
		 book.write(fout);
		 
		   
		   
	}

}
