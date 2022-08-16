package BatchNo30_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import BatchNo30_Reports.Log;
import BatchNo30_Reports.Reports;

public class ExcelUtils {
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFCell cell;
	public static Object[][] excelData;
	public static  XSSFSheet sheet;
	public static FileOutputStream fout;
	

	// re-usable component 1
	public static void invokeExcel(String Filepath) {
		try {
			fis = new FileInputStream(Filepath);
			Reports.info("Excel Invocation", "Excel Invoked Successfully");
			Log.info("Excel" + Filepath + " Invoked successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // console
			Log.error(e.fillInStackTrace().toString()); // Log file
			Reports.fail("Invocation Excel", e.toString(), "");
		}

		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param rowNum
	 * @param colNum
	 * @return String
	 * @author GcReddy
	 */
	// re-usable component 2.....
	public static String readSpecificCellData(int rowNum, int colNum) {
		String value = null;
		try {
			cell = sheet.getRow(rowNum).getCell(colNum);
			value = cell.getStringCellValue();
		} catch (Exception e) {
			cell = sheet.getRow(rowNum).getCell(colNum);
			DataFormatter formatter = new DataFormatter();
			value = formatter.formatCellValue(cell);
		}

		return value;
	}
	/**
	 * 
	 * @param sheetName
	 * @return Objectp[][]
	 * @author GcReddy
	 */	
	
	public static Object[][] readSheetData(String sheetName){
		 excelData = null;
		 sheet = workbook.getSheet(sheetName);
		 int nur = sheet.getLastRowNum();
		 int nuc = sheet.getRow(0).getPhysicalNumberOfCells();
		 
		 excelData = new Object[nur][nuc];
		 int i =1; // i represents rows (excle sheet)
		 int ci =0;   // double dimentional arrau rows
		 for(i=1; i<=nur; i++, ci++) {
			 int j=0;   // excel columns
			 int cj=0;  // double dimentional arry columns
			 for(j=0; j<nuc; j++, cj++) {
				 excelData[ci][cj] = ExcelUtils.readSpecificCellData(i, j);		
				 
				 System.out.println("Data store at index-- " + "Data[" + ci + "]" + "[" + cj + "]==>>" + "[" + i
							+ "]" + "[" + j + "]" + "--->" + excelData[ci][cj]);
			 }
		 }		
		
		return excelData;		
	}
	
	
//----------------------------------------------------------------	
	public static void SetExcelData(String Filepath, String Result, int rownum, int colnum ) {
		cell = sheet.getRow(rownum).createCell(colnum);
		cell.setCellValue(Result);
		try {
			 fout = new FileOutputStream(Filepath);

		} catch (FileNotFoundException e) {
			Reports.fail("outputFile","output file invocation failed", "");
			System.out.println("Unable to locate Excel ");
			e.printStackTrace();
		}
		try {
			workbook.write(fout);
		} catch (IOException e) {
			Reports.fail("", e.toString(),"");
			System.out.println("unable to set Excel Data");
		}
	}  
//------------------------------------------------------------------------------
	
	

}
