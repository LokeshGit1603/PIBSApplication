package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String ProjectPath;
	static XSSFWorkbook  workbook;
	static XSSFSheet sheet;

	 public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		 FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      Row row = sh.getRow(rowNum);
		      String data = row.getCell(colNum).getStringCellValue();
		      wb.close();
		 return data;
		 }

		  public static int getExcelData1(String sheetName, int rowNum, int colNum) throws Throwable{
		 FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      Row row = sh.getRow(rowNum);
		      int data1 = (int) row.getCell(colNum).getNumericCellValue();
		      wb.close();
		 return data1;
		 }
		  
		  public static int getCellCount(String sheetName) throws Throwable {
		    FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetName);
		 Row row = sh.getRow(0);
		 int cell = row.getLastCellNum();
		 return cell;
		 }

		 public static int getExcelRandomRowNum(String sheetName) throws Throwable{
		 FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      Random rand = new Random();
		      int rowNum = rand.nextInt(sh.getLastRowNum());
		      return rowNum;
		 }
		 public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		 FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      Row row = sh.getRow(rowNum);
		      Cell cel = row.createCell(colNum);
		      cel.setCellValue(data);
		      FileOutputStream fos = new FileOutputStream("D:\\\\Eclipse\\\\Workspace\\\\PIBSApplication\\\\excel\\\\TestData.xlsx");
		 wb.write(fos);
		 wb.close();
		 }
		 public static int getRowCount(String sheetName) throws Throwable {
		 FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      int rowIndex = wb.getSheet(sheetName).getLastRowNum();
		      return rowIndex;
		 }

		 public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
		 FileInputStream fis = new FileInputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      Row row = sh.getRow(rowNum);
		      Cell cel = row.createCell(colNum);
		      cel.setCellValue(data);
		      FileOutputStream fos = new FileOutputStream("D:\\Eclipse\\Workspace\\PIBSApplication\\excel\\TestData.xlsx");
		 wb.write(fos);
		 wb.close();
		 
		 }
}
