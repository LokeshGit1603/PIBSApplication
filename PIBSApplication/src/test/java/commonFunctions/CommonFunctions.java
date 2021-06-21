package commonFunctions;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.monte.media.Format;
import org.monte.media.Registry;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testCases.MyScreenRecorder;
import utils.ExcelUtils;

public class CommonFunctions{


	public static WebDriver driver = null; 
	public static Properties properties = null;
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest extenttestCase;
	static String ProjectPath;
	static XSSFWorkbook  workbook;
	static XSSFSheet sheet;
	public static ScreenRecorder screenRecorder;
	public String name;
	

	Logger logger = Logger.getLogger(CommonFunctions.class);


	public Properties loadpropertyFile() throws IOException
	{
		FileInputStream fileInputStream = new FileInputStream("Config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;

	}

	@BeforeSuite
	public void launchBrowser() throws Exception
	{
		/* MyScreenRecorder.startRecording("launchBrowser"); */
		extentReport = new ExtentReports();
		
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		
		extentReport.attachReporter(htmlReporter);
		
		PropertyConfigurator.configure("log4j.properties");
		logger.info("PIBS Application Test Begins");
		logger.info("Loading the property file");
		loadpropertyFile();
		String browser=properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverLocation);
			logger.info("Launching Chrome");
			driver=new ChromeDriver();

		} 
		else if(browser.equalsIgnoreCase("FireFox")) 
		{
			System.setProperty("webdriver.gecko.driver", driverLocation); 
			logger.info("Launching FireFox");
			driver=new FirefoxDriver(); 
		}


		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearDown() throws Exception
	{
		Thread.sleep(2000);
		logger.info("Execution done. Closing the browser");
		/* driver.quit(); */
		extentReport.flush();
		/* MyScreenRecorder.stopRecording(); */
	}
	
	////////////////////////////// Excel Code /////////////////////////////////////
	
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

         





