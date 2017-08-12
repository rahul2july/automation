package Day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRw {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
//		Fileinput stream
		FileInputStream fis = new FileInputStream("/Users/rahulgupta/Desktop/CurlGroup.xlsx");
		
//		Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);		
//		Sheet
		XSSFSheet sheet = wb.getSheet("Age");
		
//		Read
		
//		get row count
		int rows = sheet.getLastRowNum();
		
		for(int iRow = 1 ;iRow<=rows;iRow++){
					
			XSSFCell cell = sheet.getRow(iRow).getCell(1);
			String celltext = null;
			
			if(cell.getCellType()==Cell.CELL_TYPE_STRING){
				celltext = cell.getStringCellValue();
			}else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
				celltext = String.valueOf(cell.getNumericCellValue());			
			}else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
				celltext = "";			
			}

		
//			Write
			if(Double.parseDouble(celltext) > 18){
				System.out.println(sheet.getRow(iRow).getCell(1));
				sheet.getRow(iRow).getCell(2).setCellValue("Major");}
			else{
				System.out.println(sheet.getRow(iRow).getCell(1));
				sheet.getRow(iRow).getCell(2).setCellValue("Minor");
			}
		}
		
		

//		fileoutput Stream
		FileOutputStream fos = new FileOutputStream("/Users/rahulgupta/Desktop/CurlGroup.xlsx");
		
//		Save
		wb.write(fos);
		
//		Close stream
		fis.close();
		fos.close();
		
		
		
		
	}

}
