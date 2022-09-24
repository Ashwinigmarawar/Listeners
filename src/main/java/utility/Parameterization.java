package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pojo.LaunchBrowser;



public class Parameterization 
{
public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\ASHWINI\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\Zerodha login Credentials.xlsx");
    String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
    return value;
}
}
