package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Client_Contract_List_Page_Objects;
import pageObjects.Client_PricingSchedule_List_Page_Objects;

public class Client_PricingSchedule_List extends CommonFunctions{

	static Logger logger = Logger.getLogger(Client_PricingSchedule_List.class);

	@Test(priority = 0)
	public void clicksetup() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase = extentReport.createTest("Verifying Client Pricing Schedules Listing");
		logger.info("Logging in to the application");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Setup Menu");
		/*
		 * Client_PricingSchedule_List_Page_Objects.SetUp.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void clickCPSMenu() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * extenttestCase =
		 * extentReport.createTest("Verifying Client Pricing Schedules Listing");
		 */
		logger.info("Logging in to the application");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Client Pricing Schedule Menu");
		Client_PricingSchedule_List_Page_Objects.CPSmenu.click();
		Thread.sleep(2000);

	}
	@Test(priority = 2)
	public void ExpandCollapse() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
		Client_PricingSchedule_List_Page_Objects.CPSresultheader.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSresultheader.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSearchheader.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSearchheader.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSearchheader.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void SelectClient() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Selecting Client");
		Client_PricingSchedule_List_Page_Objects.CPSClientId.sendKeys(getExcelData("cpslist", 1, 0));
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void SelectLOB() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Selecting LOB");
		Client_PricingSchedule_List_Page_Objects.CPSClientLob.sendKeys(getExcelData("cpslist", 1, 1));
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void SelectType() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Selecting Type");
		Client_PricingSchedule_List_Page_Objects.CPSClientType.sendKeys(getExcelData("cpslist", 1, 2));
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void SelectStatus() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Selecting Status");
		Client_PricingSchedule_List_Page_Objects.CPSClientStatus.sendKeys(getExcelData("cpslist", 1, 3));
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void SelectStartDate() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Selecting Start Date");
		Client_PricingSchedule_List_Page_Objects.CPSStartDate.sendKeys(getExcelData("cpslist", 1, 4));
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void SelectEndDate() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Selecting End Date");
		Client_PricingSchedule_List_Page_Objects.CPSEndDate.sendKeys(getExcelData("cpslist", 1, 5));
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void ClickSearch() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Search Submit");
		Client_PricingSchedule_List_Page_Objects.CPSSearchClick.click();
		Thread.sleep(2000);
	}

	@Test(priority = 10)
	public void Searchresult() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result");
		String actualresult  = Client_PricingSchedule_List_Page_Objects.CPSSearchResult.getText();
		Thread.sleep(2000);

		if(actualresult.contains("No data found"))
		{
			logger.info("Verification done. End of Client_Contract_List");

			extenttestCase.log(Status.PASS, "Got Expected No Data Found Result"); 
		} 
		else
		{ 

			extenttestCase.log(Status.FAIL, "Not Getting Expected Result"); }

		logger.info("Verified No Data Found Result"); 
	}

	@Test(priority = 11)
	public void ClearSearch() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Search Criteria Cleared");
		Client_PricingSchedule_List_Page_Objects.CPSClearSearch.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSActiveDate.clear();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSearchClick.click();
		Thread.sleep(2000);
		logger.info("Search configuration cleared");
		Thread.sleep(2000);

		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destinationFile = new File("ClientPricingSchedules.png"); 
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ClientPricingSchedules.png");
	}
	
	@Test(priority = 12)
	public void SortColumn() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Listing Grid Sorting");
		
		 Thread.sleep(2000); 
		Client_PricingSchedule_List_Page_Objects.PerPage.sendKeys(getExcelData("cpslist", 1, 9));
		 Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSClient.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSLob.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSType.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSStartDate.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSEndDate.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSUpdatedDate.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SortCPSStatus.click();
		
		 Thread.sleep(2000); 
		 Client_PricingSchedule_List_Page_Objects.PerPage.sendKeys(getExcelData("cpslist", 1, 10));
		 
		 Thread.sleep(2000); 
		 Client_PricingSchedule_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); 
		  Client_PricingSchedule_List_Page_Objects.PageField.sendKeys(getExcelData("cpslist", 1, 11));
		  Thread.sleep(2000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  
		  String PageWarn = Client_PricingSchedule_List_Page_Objects.PageWarn.getText();
		
		  
		  if(PageWarn.contentEquals("Please enter a valid page number!"))
		  {
			  extenttestCase.log(Status.PASS, "Invalid Page Validation Done");
		  }
		  else
		  {
			  extenttestCase.log(Status.FAIL, "Invalid Page Validation Failed");
		  }
		  Thread.sleep(2000);
			  Client_PricingSchedule_List_Page_Objects.PageField.clear();
			  Thread.sleep(2000);
			  Client_PricingSchedule_List_Page_Objects.PageField.sendKeys(getExcelData(
			  "cpslist", 1, 12)); 
			  Thread.sleep(2000); 
			  Robot robot1 = new Robot();
			  robot1.keyPress(KeyEvent.VK_ENTER); 
			  robot1.keyRelease(KeyEvent.VK_ENTER);
			  Thread.sleep(2000);
			 
	}
	
	@Test(priority = 13)
	public void PaginationColumn() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Listing Grid Pagination");
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.NextPage.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.LastPage.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.PreviousPage.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.FirstPage.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 14)
	public void VerifyAddNewvalidation() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Add New Pricing Schedule");
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.AddNew.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSDate.clear();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SaveAddNew.click();
		Thread.sleep(2000);
		String Validation1 = Client_PricingSchedule_List_Page_Objects.Validationmsg1.getText();
	
		
		String Validation2 = Client_PricingSchedule_List_Page_Objects.Validationmsg2.getText();
		
		String Validation3 = Client_PricingSchedule_List_Page_Objects.Validationmsg3.getText();
	
		Thread.sleep(2000);
		
		if(Validation1.contains("Please select Client") && Validation2.contains("Please select LOB") 
				&& Validation3.contains("Please select Start Date"))
		{
			extenttestCase.log(Status.PASS, "Validation Done Successfully"); 
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Validation Not Done Successfully"); 
		}
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.AcceptError.click();
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSSDate.sendKeys(getExcelData("cpslist", 3, 4));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSEDate.sendKeys(getExcelData("cpslist", 3, 5));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.SaveAddNew.click();
		Thread.sleep(2000);
		
		String Validation4 = Client_PricingSchedule_List_Page_Objects.Validationmsg4.getText();
	
		Thread.sleep(2000);
		
		if(Validation4.contains("End date should be greater than Start date"))
		{
			extenttestCase.log(Status.PASS, "Start and End Date validation Done Successfully"); 
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Start and End Date validation Failed"); 
		}
		
		Client_PricingSchedule_List_Page_Objects.AcceptError.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 15)
	public void AddNew() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSDate.clear();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSEDate.clear();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.AddPriceType.sendKeys(getExcelData("cpslist", 2, 2));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSClient.sendKeys(getExcelData("cpslist", 2, 0));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSlob.sendKeys(getExcelData("cpslist", 2, 1));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSDate.sendKeys(getExcelData("cpslist", 2, 4));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSEDate.sendKeys(getExcelData("cpslist", 2, 5));
		Thread.sleep(2000);
		/*
		 * Client_PricingSchedule_List_Page_Objects.CPSPercentVarience.sendKeys(
		 * getExcelData("cpslist", 2, 5)); Thread.sleep(2000);
		 */
		Client_PricingSchedule_List_Page_Objects.SaveAddNew.click();
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSCancel.click();
		Thread.sleep(2000);
	}
}




