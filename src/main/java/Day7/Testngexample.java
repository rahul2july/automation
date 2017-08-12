package Day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngexample {
	
//	@Test(dataProvider="dptest")
//	public void sum(Map<String,String> hm){
//		
//		String a = hm.get("Num1");
//		String b =hm.get("Num2");
//		String exp= hm.get("Sum");
//		
//		if((Double.parseDouble(a) + Double.parseDouble(b))==Double.parseDouble(exp)){
//			System.out.println( "pass");
//					
//		}else{
//			System.out.println("fail");
//		}
//			
//		
//	}
//	
////	Data
//	@DataProvider(name="dptest")
//	public Iterator<Object[]> dp() throws Exception{
//		
//		ExcelReadwrite ex = new ExcelReadwrite("C:\\Users/DELL\\Desktop\\Sums.xlsx");
//		int rowCount = ex.rowCount("Sheet1");
//		int colCount = ex.colCount("Sheet1");
//		
//		ArrayList<Object[]> ls = new ArrayList<Object[]>();	
//		
////		iterate thru each row
//		for(int iRow = 1 ;iRow<=rowCount;iRow++){
////			create object array
//			Object[] obj = new Object[1];
//			
////			create map
//			Map<String, String> Map = new HashMap<String,String>();
////			iterate thru column
//			for(int iCol = 0;iCol<colCount;iCol++){
//				
//				String Key = ex.readCellValue("Sheet1", 0, iCol);
//				String Val = ex.readCellValue("Sheet1", iRow, iCol);
//				
//				Map.put(Key, Val);
//				
//			}	//			iterate thru column
//			
//			obj[0]=Map;
//			ls.add(obj);
//			
//		}//		iterate thru each row
//		
//		
//		return ls.iterator();
//		
//	}
//	
	
//	---------------------Second way--------------------
	
	
	@Test(dataProvider="dptest2")
	public void sum(String n1,String n2,String sums){
		
		String a = n1;
		String b =n2;
		String exp= sums;
		
		if((Double.parseDouble(a) + Double.parseDouble(b))==Double.parseDouble(exp)){
			System.out.println( "pass");
					
		}else{
			System.out.println("fail");
		}
			
		
	}
	
//	Data
	@DataProvider(name="dptest2")
	public Iterator<String[]> dp() throws Exception{
		
		ExcelReadwrite ex = new ExcelReadwrite("C:\\Users/DELL\\Desktop\\Sums.xlsx");
		int rowCount = ex.rowCount("Sheet1");
		int colCount = ex.colCount("Sheet1");
		
		List<String[]> ls = new ArrayList<String[]>();	
		
//		iterate thru each row
		for(int iRow = 1 ;iRow<=rowCount;iRow++){
//Create array
				String[] x = new String[colCount];
//			iterate thru column
			for(int iCol = 0;iCol<colCount;iCol++){
				
				x[iCol] = ex.readCellValue("Sheet1", iRow, iCol);
								
			}	//			iterate thru column

			ls.add(x);
			
		}//		iterate thru each row
		
		
		return ls.iterator();
		
	}
	
	
	
	
	
	
}
