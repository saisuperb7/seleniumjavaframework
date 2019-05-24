package util;

public class ExcelUtildemo {
		public static void main(String[] args) {
			String projectpath = System.getProperty("user.dir");
			ExcelUtils Excel = new ExcelUtils(projectpath+"/excel/data.xls","sheet1");
			Excel.GetRowcount();
			Excel.GetCelldata(1, 1);
		}
		
}
