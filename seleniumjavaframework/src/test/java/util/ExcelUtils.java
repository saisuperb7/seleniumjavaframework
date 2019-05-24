package util;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
		
		static String projectpath = System.getProperty("user.dir");
		static XSSFWorkbook workbook;
		static XSSFSheet sheet;
		
		public ExcelUtils(String excelpath,String sheetname )
		{
			try {
				workbook = new XSSFWorkbook(excelpath);
				sheet = workbook.getSheet(sheetname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		public static void main(String[] args) 
		{
			
			GetCelldata(1, 0);
			GetCelldataNum(1,1);
		}
	
		public static int GetRowcount()
		{
		
		int ROWCOUNT = sheet.getPhysicalNumberOfRows();
		System.out.println(ROWCOUNT);
		return ROWCOUNT;
		
		}
		
		public static int GetColcount()
		{
		
		int COLCOUNT = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(COLCOUNT);
		return COLCOUNT;
		
		}
		
		public static String GetCelldata(int rownum, int colnum)
		{
			String celldata = null;
			
			try 
			{
				workbook = new XSSFWorkbook(projectpath+"/excel/data.xls");
				sheet = workbook.getSheet("Sheet1");
				 
				 Cell cell1 = sheet.getRow(rownum).getCell(colnum);   
				 //celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		            //SET AS STRING TYPE
		            //cell1.setCellType(Cell.CELL_TYPE_STRING);
		            switch (cell1.getCellType()) 
		        {

		            case STRING:
		            	celldata = cell1.getStringCellValue();
		                System.out.println(cell1.getStringCellValue());
		                
		                break;

		            case NUMERIC:
		            	celldata = String.valueOf(cell1.getNumericCellValue());
		                    System.out.println(cell1.getNumericCellValue());
		                
		                break;

		            case BOOLEAN:
		                System.out.println(cell1.getBooleanCellValue());
		                break;

		            case FORMULA:
		                System.out.println(cell1.getCellFormula());
		                break;

		            default:
		                System.out.println();
		        }

		            //String data0= cell1.getStringCellValue();
		            //String data0= cell1.getStringCellValue();
			} catch (IOException e) {
			
				e.printStackTrace();
				
			}
			return celldata;
			
		}
		
		public static String GetCelldataNum(int rownum, int colnum)
		{
			//Double cellnum=null;
			String cellnum = null;
			try 
			{
				workbook = new XSSFWorkbook(projectpath+"/excel/data.xls");
				sheet = workbook.getSheet("Sheet1");
				 cellnum = String.valueOf(sheet.getRow(rownum).getCell(colnum).getNumericCellValue());
				 //cellnum = 
			} catch (IOException e) {
			
				e.printStackTrace();
				
			}
		
			return cellnum;
			
		}
		

}
	
	

