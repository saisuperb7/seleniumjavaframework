package util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider 
{
	
	static String projectpath = System.getProperty("user.dir");
	
	@Test(dataProvider="test1")
	public void test1(String username, String password)
	{
		System.out.println("username is : "+username +"password is: " +password);
	}
	
	@DataProvider(name="test1")
	public Object[][] getData()
	{
		Object data[][] = testdata(projectpath+"/excel/data.xls", "sheet1");
		return data;
	}
	public static Object[][] testdata(String excelpath,String sheetname)
	{
		String projectpath = System.getProperty("user.dir");
		ExcelUtils Excel = new ExcelUtils(excelpath,sheetname);
		int rowcount = Excel.GetRowcount();
		int colcount = Excel.GetColcount();
		
		Object data[][] = new Object[rowcount-1][colcount];
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String ddata = Excel.GetCelldata(i, j);
				System.out.println(data);
				data[i-1][j] = ddata;
			}
		}
		return data;
		
		
	}
}
