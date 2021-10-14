package readers;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
public class ReaderExcel {


	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
			
			String filePath = System.getProperty("user.dir") + "\\Excel\\ReadExcel.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			testData = String.valueOf(ws.getRow(row).getCell(column));
			
			wb.close();
		}catch(Exception e)
		{
			System.out.println("Excel Read");
		}
		return testData;
	}
	
	public static void main(String[] args) throws Exception{
		
		System.out.println(readExcel(1,1));
		System.out.println(readExcel(1,2));
		System.out.println(readExcel(1,3));
		System.out.println(readExcel(1,4));
		System.out.println(readExcel(1,5));
		

		System.out.println(readExcel(2,1));
		System.out.println(readExcel(2,2));
		System.out.println(readExcel(2,3));
		System.out.println(readExcel(2,4));
		System.out.println(readExcel(2,5));
		

		System.out.println(readExcel(3,1));
		System.out.println(readExcel(3,2));
		System.out.println(readExcel(3,3));
		System.out.println(readExcel(3,4));
		System.out.println(readExcel(3,5));
		

		System.out.println(readExcel(4,1));
		System.out.println(readExcel(4,2));
		System.out.println(readExcel(4,3));
		System.out.println(readExcel(4,4));
		System.out.println(readExcel(4,5));
		
	}
}



