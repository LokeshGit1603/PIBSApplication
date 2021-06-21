package testCases;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.monte.media.Format;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Client_Contract_Details_Page_Objects;
import pageObjects.Client_Contract_List_Page_Objects;

public class Client_Contract_List extends CommonFunctions {

	static Logger logger = Logger.getLogger(Client_Contract_List.class);
	

	@Test(priority = 0)
	public void clicksetup() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase = extentReport.createTest("Verifying Client Contract Listing");
		logger.info("Logging in to the application");
		PageFactory.initElements(driver, Client_Contract_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Setup Menu");
		Client_Contract_List_Page_Objects.SetUp.click();
		
	}

	@Test(priority = 1)
	public void clientcontract() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		extenttestCase.log(Status.INFO, "Navigating to Client Contract");
		Client_Contract_List_Page_Objects.CCmenu.click();
		Thread.sleep(3000);
		
		Client_Contract_List_Page_Objects.CCresultheader.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCresultheader.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCSearchCriteria.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCSearchCriteria.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCSearchCriteria.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.INFO, "Verified Expand and Collapse functionality");

	}
	
	  @Test(priority = 2) public void Selectid() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Selecting Client");
	  Client_Contract_List_Page_Objects.CCClientId.click(); Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.CCClientId.sendKeys(getExcelData("cclist",
	  1, 0)); Thread.sleep(2000); 
	  }
	  
	  @Test(priority = 3) public void selectlob() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Selecting LOB");
	  Client_Contract_List_Page_Objects.CClob.click(); Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.CClob.sendKeys(getExcelData("cclist", 1,
	  1)); Thread.sleep(2000);
	  }
	  
	  @Test(priority = 4) public void selectdate() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Selecting Date Range");
	  Client_Contract_List_Page_Objects.CCStartDate.click(); Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.CCStartDate.sendKeys(getExcelData("cclist",
	  1, 2)); Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.CCEndDate.click(); Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.CCEndDate.sendKeys(getExcelData("cclist",
	  1, 3)); Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 5) public void searchsubmit() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Submitting Search");
	  Client_Contract_List_Page_Objects.CCSearchbtn.click(); 
	  Thread.sleep(2000);
	  }
	  
	  @Test(priority = 6) public void searchresult() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  extenttestCase.log(Status.INFO, "Verifying No Data Found Result"); String
	  actualResult = Client_Contract_List_Page_Objects.CCSearchResult.getText();
	  //Thread.sleep(3000);
	  
	  if(actualResult.contentEquals("No data found")) {
	  logger.info("Verification done. End of Client_Contract_List");
	  
	  extenttestCase.log(Status.PASS, "Got Expected No Data Found Result"); } else
	  { logger.info("Verification done. End of Client_Contract_List");
	  
	  extenttestCase.log(Status.FAIL, "Not Getting Expected Result"); }
	  
	  logger.info("Verified No Data Found Result"); }
	  
	  @Test(priority = 7) public void clearsearch() throws InterruptedException,
	  IOException, WebDriverException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  extenttestCase.log(Status.INFO, "Search Criteria Cleared");
	  Client_Contract_List_Page_Objects.CCClearSearch.click();
	  logger.info("Search configuration cleared");
	  
	  Thread.sleep(2000);
	  
	  TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
	  screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
	  File("ClientContract.png"); FileHandler.copy(sourceFile, destinationFile);
	  extenttestCase.addScreenCaptureFromPath("ClientContract.png");
	  
	  }
	  
	  @Test (priority = 8) public void sortcolumn() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying Listing Grid Sorting");
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.PerPage.sendKeys(getExcelData("cclist", 1, 5));
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.SortClient.click();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.Sortlob.click();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.SortSdate.click();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.SortEdate.click();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.Sortstatus.click();
	  Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.SortCdate.click();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.SortUdate.click();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.PerPage.sendKeys(getExcelData("cclist", 1, 6));
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.PageField.clear();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.PageField.sendKeys(getExcelData("cclist", 1, 7));
	  Thread.sleep(2000);
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  String PageWarn = Client_Contract_List_Page_Objects.PageWarn.getText();
	  
	  if(PageWarn.contentEquals("Please enter a valid page number!"))
	  {
		  extenttestCase.log(Status.PASS, "Invalid Page Validation Done");
	  }
	  else
	  {
		  extenttestCase.log(Status.FAIL, "Invalid Page Validation Failed");
	  }
	  
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.PageField.clear();
	  Thread.sleep(2000); 
	  Client_Contract_List_Page_Objects.PageField.sendKeys(getExcelData("cclist", 1, 8));
	  Thread.sleep(2000);
	  Robot robot1 = new Robot();
	  robot1.keyPress(KeyEvent.VK_ENTER);
	  robot1.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  Thread.sleep(2000); extenttestCase.log(Status.INFO,
	  "Verified Sorting Functionality in Contract list screen grid"); }
	  
	  @Test(priority = 9) public void ccpagination() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying Listing Grid Pagination");
	  Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.Nextpage.click(); 
	  Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.Lastpage.click(); 
	  Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.Previouspage.click(); 
	  Thread.sleep(2000);
	  Client_Contract_List_Page_Objects.Firstpage.click(); 
	  Thread.sleep(2000);
	  extenttestCase.log(Status.INFO,
	  "Verified Pagination Functionality in Contract list screen grid"); }
	 

	@Test(priority = 10)
	public void verifysearchresult() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Listing Records");
		Client_Contract_List_Page_Objects.CCClientId.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCClientId.sendKeys(getExcelData("cclist", 2, 0));
		Thread.sleep(2000);

		Client_Contract_List_Page_Objects.CClob.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CClob.sendKeys(getExcelData("cclist", 2, 1));
		Thread.sleep(2000);

		Client_Contract_List_Page_Objects.CCStartDate.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCStartDate.sendKeys(getExcelData("cclist", 2, 2));
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCEndDate.click();
		Thread.sleep(2000);
		Client_Contract_List_Page_Objects.CCEndDate.sendKeys(getExcelData("cclist", 2, 3));
		Thread.sleep(2000);

		Client_Contract_List_Page_Objects.CCStatus.click();
		Client_Contract_List_Page_Objects.CCStatus.sendKeys(getExcelData("cclist", 2, 4));
		Thread.sleep(2000);

		Client_Contract_List_Page_Objects.CCSearchbtn.click();

		Thread.sleep(2000);

		String Clientresult = Client_Contract_List_Page_Objects.Clientvalue.getText();
		
		String Lobresult = Client_Contract_List_Page_Objects.Lobvalue.getText();
		
		String SDateresult = Client_Contract_List_Page_Objects.SDatevalue.getText();
		
		String EDateresult = Client_Contract_List_Page_Objects.EDatevalue.getText();
		
		String Statusresult = Client_Contract_List_Page_Objects.Statusvalue.getText();

		if(Clientresult.contentEquals(getExcelData("cclist", 2, 0)) && Lobresult.contentEquals(getExcelData("cclist", 2, 1))
				&& SDateresult.contentEquals(getExcelData("cclist", 2, 2)) && EDateresult.contentEquals(getExcelData("cclist", 2, 3))
				&& Statusresult.contentEquals(getExcelData("cclist", 2, 4)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result");
		}
		
	}
	
	@Test(priority = 11)
	public void clientdetails() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Client Contract Details");
		logger.info("Navigating to client details page");

		PageFactory.initElements(driver, Client_Contract_Details_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Client details page");
		Client_Contract_Details_Page_Objects.Action.click();
		//Thread.sleep(3000);
	}
	
	@Test(priority = 12)
	public void checkUnsave() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Client Contract Unsave Changes Details");
		logger.info("Navigating to client Unsave Changes details page");
		 extenttestCase.log(Status.INFO, "Verifying Appointment Invoice Type Update");
		 Client_Contract_Details_Page_Objects.CDAwardedAmount.clear();
		 Thread.sleep(2000);
			Client_Contract_Details_Page_Objects.CDAwardedAmount.sendKeys(getExcelData("ccdetails", 1, 21));
			Thread.sleep(2000);
			
			Client_Contract_Details_Page_Objects.CDCancel.click();
			Thread.sleep(2000);
			
			Client_Contract_Details_Page_Objects.CDNoCancel.click();
			Thread.sleep(2000);
			
			PageFactory.initElements(driver, Client_Contract_List_Page_Objects.class);
			
			Client_Contract_List_Page_Objects.CCSearchCriteria.click();
			Thread.sleep(2000);
			
			verifysearchresult();
			Thread.sleep(2000);
			
			clientdetails();
			Thread.sleep(2000);
			
			Client_Contract_Details_Page_Objects.CDAwardedAmount.clear();
			 Thread.sleep(2000);
			
			Client_Contract_Details_Page_Objects.CDAwardedAmount.sendKeys(getExcelData("ccdetails", 1, 21));
			Thread.sleep(2000);
			
			Client_Contract_Details_Page_Objects.CDCancel.click();
			Thread.sleep(2000);
			
			Client_Contract_Details_Page_Objects.CDYesCancel.click();
			Thread.sleep(2000);
			
			PageFactory.initElements(driver, Client_Contract_List_Page_Objects.class);
			Thread.sleep(2000);
			
			Client_Contract_List_Page_Objects.CCSearchCriteria.click();
			Thread.sleep(2000);
			
			verifysearchresult();
			Thread.sleep(2000);
			
			
	}

}
