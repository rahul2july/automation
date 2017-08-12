package Day6;

public class TestExcelRW {
	
	public static void main(String[] args) throws Exception {
		
		ExcelReadwrite ex = new ExcelReadwrite("/Users/rahulgupta/Desktop/CurlGroup.xlsx");
//		ex.intializeWorkbook("C:\\Users\\DELL\\Desktop\\Age.xlsx");
//		get Row count
		int rowCount = ex.rowCount("Age");
		
		for(int i =1;i<=rowCount;i++){
//			read value
			String cellval = ex.readCellValue("Age", i, 1);
			
//			write
			if(Double.parseDouble(cellval) > 18){
				ex.writeCellValue("Age", i, 2, "Major");
			}else{
				ex.writeCellValue("Age", i, 2, "Minor");
			}
			
			
		}
		
		ex.saveAndClose("/Users/rahulgupta/Desktop/CurlGroup.xlsx");
		
	}
}
