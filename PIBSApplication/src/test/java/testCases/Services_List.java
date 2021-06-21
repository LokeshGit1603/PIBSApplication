package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Client_Contract_List_Page_Objects;
import pageObjects.Services_List_Page_Objects;

public class Services_List extends CommonFunctions{

	static Logger logger = Logger.getLogger(Services_List.class);
	

	@Test(priority = 0)
	public void clickServiceMenu() throws InterruptedException, IOException
	{
		extenttestCase = extentReport.createTest("Verifying Services Listing");
		logger.info("Logging in to the application");
	}

	@Test(priority = 1)
	public void clickServices() throws InterruptedException, IOException
	{
		extenttestCase.log(Status.INFO, "Verifying Services Listing");
		PageFactory.initElements(driver, Services_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Services Menu");
		Services_List_Page_Objects.ServiceMenu.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifyExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality in Services Listing");
		Services_List_Page_Objects.SearchResultheader.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchResultheader.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void VerifyNoResult() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result in Services Listing");
		Services_List_Page_Objects.UniqueId.sendKeys(getExcelData("servicelist", 1, 0));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchLOB.sendKeys(getExcelData("servicelist", 1, 1));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchDOR.sendKeys(getExcelData("servicelist", 1, 2));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchDOS.sendKeys(getExcelData("servicelist", 1, 3));
		Thread.sleep(2000);

		Services_List_Page_Objects.UniqueId.click();
		Thread.sleep(2000);


		Services_List_Page_Objects.SearchProvider.sendKeys(getExcelData("servicelist", 1, 4)); 
		Thread.sleep(2000);             

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Services_List_Page_Objects.SearchLocation.sendKeys(getExcelData("servicelist", 1, 5)); 
		Thread.sleep(2000);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Services_List_Page_Objects.SearchSpeciality.sendKeys(getExcelData("servicelist", 1, 6));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchStatus.sendKeys(getExcelData("servicelist", 1, 7));
		Thread.sleep(2000);
		
		Services_List_Page_Objects.SearchExaminee.sendKeys(getExcelData("servicelist", 1, 8));
		Thread.sleep(2000);
		
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);

		Services_List_Page_Objects.SearchAssignUsers.sendKeys(getExcelData("servicelist", 1, 9));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);

		String actualResult = Services_List_Page_Objects.SearchResult.getText();

		if(actualResult.contentEquals("No data found"))
		{
			extenttestCase.log(Status.PASS, "Got Expected No Data Found Result");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result"); 
		}

	}


	@Test(priority = 4) public void clearsearch() throws InterruptedException,
	IOException, WebDriverException {

		extenttestCase.log(Status.INFO, "Search Criteria Cleared");
		Services_List_Page_Objects.ClearClick.click();
		logger.info("Search configuration cleared");

		Thread.sleep(2000);

		TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("ServiceList.png"); FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("ServiceList.png");

	}

	@Test(priority = 5) public void VerifySort() throws Throwable {
		extenttestCase.log(Status.INFO, "Verifying Services Listing Grid Sorting");
		 
		Thread.sleep(2000); Services_List_Page_Objects.PerPage.sendKeys(getExcelData("servicelist", 1, 10));
		
		Thread.sleep(2000); Services_List_Page_Objects.SortUnique.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortLOB.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortDOR.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortDOA.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortProvider.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortLocation.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortSpeciality.click();
		Thread.sleep(2000); Services_List_Page_Objects.SortStatus.click();
		Thread.sleep(2000); Services_List_Page_Objects.PerPage.sendKeys(getExcelData("servicelist", 1, 11));
		  Thread.sleep(2000); Services_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); Services_List_Page_Objects.PageField.sendKeys(getExcelData("servicelist", 1, 12));
		  Thread.sleep(2000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  String PageWarn = Services_List_Page_Objects.PageWarn.getText();
		  
		  if(PageWarn.contentEquals("Please enter a valid page number!"))
		  {
			  extenttestCase.log(Status.PASS, "Invalid Page Validation Done");
		  }
		  else
		  {
			  extenttestCase.log(Status.FAIL, "Invalid Page Validation Failed");
		  }
		  Thread.sleep(2000); Services_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); Services_List_Page_Objects.PageField.sendKeys(getExcelData("servicelist", 1, 13));
		  Thread.sleep(2000);
		  Robot robot1 = new Robot();
		  robot1.keyPress(KeyEvent.VK_ENTER);
		  robot1.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
	
		
	}

	@Test(priority = 6) public void VerifyPagination() throws
	InterruptedException { extenttestCase.log(Status.INFO,
			"Verifying Services Listing Grid Pagination");
		
	Services_List_Page_Objects.NextPage.click(); Thread.sleep(2000);
	Services_List_Page_Objects.LastPage.click(); Thread.sleep(2000);
	Services_List_Page_Objects.PreviousPage.click(); Thread.sleep(2000);
	Services_List_Page_Objects.FirstPage.click(); Thread.sleep(2000);
	
	extenttestCase.log(Status.INFO,
			"Verified Pagination Functionality in Services list screen grid"); 
	}
	
	@Test(priority = 7)
	public void VerifySearchResult() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Services Listing Record");
		
		Services_List_Page_Objects.UniqueId.sendKeys(getExcelData("servicelist", 2, 0));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchLOB.sendKeys(getExcelData("servicelist", 2, 1));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchDOR.sendKeys(getExcelData("servicelist", 2, 2));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchDOS.sendKeys(getExcelData("servicelist", 2, 3));
		Thread.sleep(2000);

		Services_List_Page_Objects.UniqueId.click();
		Thread.sleep(2000);


		Services_List_Page_Objects.SearchProvider.sendKeys(getExcelData("servicelist", 2, 4)); 
		Thread.sleep(2000);             

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Services_List_Page_Objects.SearchLocation.sendKeys(getExcelData("servicelist", 2, 5)); 
		Thread.sleep(2000);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Services_List_Page_Objects.SearchSpeciality.sendKeys(getExcelData("servicelist", 2, 6));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchStatus.sendKeys(getExcelData("servicelist", 2, 7));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchExaminee.sendKeys(getExcelData("servicelist", 2, 8));
		Thread.sleep(2000);
		
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		
		Services_List_Page_Objects.SearchAssignUsers.sendKeys(getExcelData("servicelist", 2, 9));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public void GetResult() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Getting Result in Services Listing");
		
		String UniqueResult = Services_List_Page_Objects.UniqueResult.getText();
	
		
		String LOBResult = Services_List_Page_Objects.LOBResult.getText();
		
		
		String DORResult = Services_List_Page_Objects.DORResult.getText();
		
		
		String DOAResult = Services_List_Page_Objects.DOAResult.getText();
		
		
		String ProviderResult = Services_List_Page_Objects.ProviderResult.getText();
		
		
		String LocationResult = Services_List_Page_Objects.LocationResult.getText();
		
		
		String SpecialityResult = Services_List_Page_Objects.SpecialityResult.getText();
		
		
		String StatusResult = Services_List_Page_Objects.StatusResult.getText();
		
		
		if(UniqueResult.contentEquals(getExcelData("servicelist", 2, 0)) && LOBResult.contentEquals(getExcelData("servicelist", 2, 1))
				&& DORResult.contentEquals(getExcelData("servicelist", 2, 2)) && DOAResult.contentEquals(getExcelData("servicelist", 2, 3))
				&& ProviderResult.contentEquals(getExcelData("servicelist", 3, 4)) && LocationResult.contentEquals(getExcelData("servicelist", 3, 5))
				&& SpecialityResult.contentEquals(getExcelData("servicelist", 2, 6)) && StatusResult.contentEquals(getExcelData("servicelist", 2, 7)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Services Listing");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Services Listing");
		}
		
	}
	
	@Test(priority = 9)
	public void GoToDetails() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Services Detail Redirection");
		Thread.sleep(2000);
		Services_List_Page_Objects.DetailAction.click();
		Thread.sleep(2000);
		
		String DetailLabel = Services_List_Page_Objects.DetailLabel.getText();
		
		if(DetailLabel.contains("Service Details"))
		{
			extenttestCase.log(Status.PASS, "Service Detail Page Redirected Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Service Detail Page Redirection Failed");
		}
	}
	
	@Test(priority = 10)
	public void GoBackList() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Services List Redirection");
		Thread.sleep(2000);
		Services_List_Page_Objects.CancelDetail.click();
	}

}
