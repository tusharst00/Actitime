import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Testdata/data driver.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double data=wb.getSheet("Sheet1").getRow(5).getCell(1).setcellValue("Leela");
		
		FileOutputStream fos=new FileOutputStream("./Testdata/data driver.xlsx")
		wb.write(fos);
		
		
		
	}

}
