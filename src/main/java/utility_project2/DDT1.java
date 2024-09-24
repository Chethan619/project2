package utility_project2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT1 
{
	public static String email;
	public static String pass;
    public void credentials1() throws EncryptedDocumentException, IOException
    {
    	FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Project2Spicejet\\DDT\\chethan.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		email=w1.getSheet("loginspicejet").getRow(0).getCell(0).getStringCellValue();
		pass=w1.getSheet("loginspicejet").getRow(0).getCell(1).getStringCellValue();
    }
}
