package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import testcases.Base1;

public class ReadExcel{
	@DataProvider(name="login")
	public String[][] getExcelData() throws IOException {
			File excelFile=new File("C://Users//ritzz//Desktop//newfile.xlsx");
			FileInputStream fis=new FileInputStream(excelFile);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("sheet1");
			System.out.print(sheet.getPhysicalNumberOfRows());
			int noofrow=sheet.getPhysicalNumberOfRows();
			int noofcol=sheet.getRow(0).getLastCellNum();
			String[][] data=new String[noofrow-1][noofcol];
			for(int i=0;i<noofrow-1;i++)
			{
				for(int j=0;j<noofcol;j++)
				{
					DataFormatter df=new DataFormatter();
					
					data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				}
			}
			workbook.close();
			fis.close();
			return data;
	}

}
