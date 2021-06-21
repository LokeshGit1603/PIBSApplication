package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Cash_Postings_List_Page_Objects;
import pageObjects.Client_Contract_List_Page_Objects;
import pageObjects.MedicareOWCP_List_Page_Objects;
import pageObjects.Services_List_Page_Objects;

public class Cash_Postings_List extends CommonFunctions {

	static Logger logger = Logger.getLogger(Cash_Postings_List.class);

	JavascriptExecutor js;

	@Test(priority = 0)
	public void clickCashPostMenu() throws InterruptedException, IOException
	{
		extenttestCase = extentReport.createTest("Verifying Cash Postings Listing");
		logger.info("Logging in to the application");
	}

	@Test(priority = 1)
	public void clickCashPost() throws InterruptedException, IOException
	{
		extenttestCase.log(Status.INFO, "Verifying Cash Postings Listing");
		PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Cash Postings Menu");
		Cash_Postings_List_Page_Objects.CashPostingsMenu.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void verifyExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality in Services Listing");
		Cash_Postings_List_Page_Objects.SearchResultheader.click();
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.SearchResultheader.click();
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void VerifyNoResult() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result in CAsh Postings Listing");

		Cash_Postings_List_Page_Objects.SearchLOB.sendKeys(getExcelData("cashPostingslist", 1, 0));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchInvoice.sendKeys(getExcelData("cashPostingslist", 1, 1));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchAmount.sendKeys(getExcelData("cashPostingslist", 1, 2));
		Thread.sleep(2000);


		Cash_Postings_List_Page_Objects.SearchStatus.sendKeys(getExcelData("cashPostingslist", 1, 3)); 
		Thread.sleep(2000);             


		Cash_Postings_List_Page_Objects.SearchDDate.sendKeys(getExcelData("cashPostingslist", 1, 4)); 
		Thread.sleep(2000);


		Cash_Postings_List_Page_Objects.SearchPDate.sendKeys(getExcelData("cashPostingslist", 1, 5));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchCheck.sendKeys(getExcelData("cashPostingslist", 1, 6));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);

		String actualResult = Cash_Postings_List_Page_Objects.SearchResult.getText();

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
		Cash_Postings_List_Page_Objects.ClearClick.click();
		logger.info("Search configuration cleared");

		Thread.sleep(2000);

		TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("CashPostingList.png"); FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("CashPostingList.png");

	}

	@Test(priority = 5) public void VerifySort() throws Throwable {
		extenttestCase.log(Status.INFO, "Verifying Cash Posting Listing Grid Sorting");


		Thread.sleep(2000); 
		Cash_Postings_List_Page_Objects.PerPage.sendKeys(getExcelData("cashPostingslist", 1, 7));

		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortLOB.click();
		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortInvoice.click();
		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortDDate.click();
		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortPDate.click();
		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortCDate.click();
		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortAmount.click();
		Thread.sleep(2000); Cash_Postings_List_Page_Objects.SortCheck.click();

		Thread.sleep(2000); Cash_Postings_List_Page_Objects.PerPage.sendKeys(getExcelData("cashPostingslist", 1, 8));
		
		 Thread.sleep(2000); Cash_Postings_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); Cash_Postings_List_Page_Objects.PageField.sendKeys(getExcelData("cashPostingslist", 1, 9));
		  Thread.sleep(2000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  String PageWarn = Cash_Postings_List_Page_Objects.PageWarn.getText();
		  
		  if(PageWarn.contentEquals("Please enter a valid page number!"))
		  {
			  extenttestCase.log(Status.PASS, "Invalid Page Validation Done");
		  }
		  else
		  {
			  extenttestCase.log(Status.FAIL, "Invalid Page Validation Failed");
		  }
		  Thread.sleep(2000); Cash_Postings_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); Cash_Postings_List_Page_Objects.PageField.sendKeys(getExcelData("cashPostingslist", 1, 10));
		  Thread.sleep(2000);
		  Robot robot1 = new Robot();
		  robot1.keyPress(KeyEvent.VK_ENTER);
		  robot1.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		extenttestCase.log(Status.
				INFO,"Verified Sorting Functionality in Cash Posting list screen grid"); 

		Thread.sleep(2000);

	}

	@Test(priority = 6) public void VerifyPagination() throws
	InterruptedException { extenttestCase.log(Status.INFO,
			"Verifying Cash Posting Listing Grid Pagination");

	Cash_Postings_List_Page_Objects.NextPage.click(); Thread.sleep(2000);
	Cash_Postings_List_Page_Objects.LastPage.click(); Thread.sleep(2000);
	Cash_Postings_List_Page_Objects.PreviousPage.click(); Thread.sleep(2000);
	Cash_Postings_List_Page_Objects.FirstPage.click(); Thread.sleep(2000);

	extenttestCase.log(Status.INFO,
			"Verified Pagination Functionality in Cash Postings list screen grid"); 
	}

	@Test(priority = 7)
	public void VerifySearchResult() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Cash Postings Listing Record");

		Cash_Postings_List_Page_Objects.SearchLOB.sendKeys(getExcelData("cashPostingslist", 1, 0));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchInvoice.sendKeys(getExcelData("cashPostingslist", 1, 1));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchAmount.sendKeys(getExcelData("cashPostingslist", 1, 2));
		Thread.sleep(2000);


		Cash_Postings_List_Page_Objects.SearchStatus.sendKeys(getExcelData("cashPostingslist", 1, 3)); 
		Thread.sleep(2000);             


		Cash_Postings_List_Page_Objects.SearchDDate.sendKeys(getExcelData("cashPostingslist", 1, 4)); 
		Thread.sleep(2000);


		Cash_Postings_List_Page_Objects.SearchPDate.sendKeys(getExcelData("cashPostingslist", 1, 5));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchCheck.sendKeys(getExcelData("cashPostingslist", 2, 6));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public void GetResult() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Getting Result in Cash Postings Listing");

		String LOBResult = Cash_Postings_List_Page_Objects.LOBResult.getText();
		

		String InvoiceResult = Cash_Postings_List_Page_Objects.InvoiceResult.getText();
		

		String DDateResult = Cash_Postings_List_Page_Objects.DDateResult.getText();
		

		String PDateResult = Cash_Postings_List_Page_Objects.PDateResult.getText();
		

		String StatusResult = Cash_Postings_List_Page_Objects.StatusResult.getText();
		

		String CheckResult = Cash_Postings_List_Page_Objects.CheckResult.getText();
		

		if(LOBResult.contentEquals(getExcelData("cashPostingslist", 1, 0))
				&& InvoiceResult.contentEquals(getExcelData("cashPostingslist", 1, 1)) && DDateResult.contentEquals(getExcelData("cashPostingslist", 1, 4))
				&& PDateResult.contentEquals(getExcelData("cashPostingslist", 1, 5)) && StatusResult.contentEquals(getExcelData("cashPostingslist", 1, 3))
				&& CheckResult.contentEquals(getExcelData("cashPostingslist", 2, 6)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Cash Postings Listing");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Cash Postings Listing");
		}

	}

	@Test(priority = 9)
	public void GoToDetails() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Cash Postings Detail Redirection");
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.DetailAction.click();
		Thread.sleep(2000);

		String DetailLabel = Cash_Postings_List_Page_Objects.DetailLabel.getText();

		if(DetailLabel.contains("Cash Posting Details"))
		{
			extenttestCase.log(Status.PASS, "Cash Postings Detail Page Redirected Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Cash Postings Detail Page Redirection Failed");
		}
	}

	@Test(priority = 10)
	public void GoBackList() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Cash Postings List Redirection");
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.CancelDetail.click();
	}

	@Test(priority = 11) 
	public void VerifyAddNewvalidation() throws Throwable {
		extenttestCase.log(Status.INFO,
				"Verifying Medicate Add New Cash Posting"); 
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.Searchheader.click(); 
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.addnewClick.click(); 
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.SaveNewCash.click(); 
		Thread.sleep(2000);
		String Warn1 = Cash_Postings_List_Page_Objects.Warn1.getText();
		

		String Warn2 =
				Cash_Postings_List_Page_Objects.Warn2.getText();
		

		String Warn3 =
				Cash_Postings_List_Page_Objects.Warn3.getText();
		

		String Warn4 =
				Cash_Postings_List_Page_Objects.Warn4.getText();
		

		String Warn5 =
				Cash_Postings_List_Page_Objects.Warn5.getText();
		

		String Warn6 =
				Cash_Postings_List_Page_Objects.Warn6.getText();
		

		Thread.sleep(2000);

		if(Warn1.contentEquals("Please select LOB") &&
				Warn2.contentEquals("Please select Bank Name") &&
				Warn3.contentEquals("Please select Payment Method") && 
				Warn4.contentEquals("Please enter Deposited Date") &&
				Warn5.contentEquals("Please enter Check number") &&
				Warn6.contentEquals("Please enter Amount Received"))
		{
			extenttestCase.log(Status.PASS, "Validation Done Successfully"); 
		} 
		else 
		{
			extenttestCase.log(Status.FAIL, "Validation Not Done Successfully"); 
		}
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.AcceptError.click();
		Thread.sleep(2000);


		/* Cash_Postings_List_Page_Objects.NewCashCancel.click(); Thread.sleep(2000); */

	}

	@Test(priority = 12) 
	public void AddCancelValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add button cancellation");
		Thread.sleep(2000);
		Cash_Postings_List_Page_Objects.NewLOB.sendKeys(getExcelData("cashPostingslist", 5, 0));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewBank.sendKeys(getExcelData("cashPostingslist", 5, 1));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewPaymentModel.sendKeys(getExcelData("cashPostingslist", 5, 2));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewDDate.sendKeys(getExcelData("cashPostingslist", 5, 3));
		Thread.sleep(2000);
		
		Cash_Postings_List_Page_Objects.NewCheck.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewCheck.sendKeys(getExcelData("cashPostingslist", 5, 4));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewAmount.sendKeys(getExcelData("cashPostingslist", 5, 5));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewNotes.sendKeys(getExcelData("cashPostingslist", 5, 6));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.CancelDetail.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NoUnsave.click();
		Thread.sleep(2000);

		String ListLabel =  Cash_Postings_List_Page_Objects.ListLabel.getText();
		

		if(ListLabel.contentEquals("Cash Postings"))
		{
			extenttestCase.log(Status.PASS, "List page redirected and Unsaved validation Done Successfully"); 
		} 
		else 
		{
			extenttestCase.log(Status.FAIL, "List page not redirected and Unsaved validation Failed"); 
		}
	}

	@Test(priority = 13)
	public void AddNewCP() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Add New Cash Posting");
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.addnewClick.click(); 
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewLOB.sendKeys(getExcelData("cashPostingslist", 5, 0));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewBank.sendKeys(getExcelData("cashPostingslist", 5, 1));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewPaymentModel.sendKeys(getExcelData("cashPostingslist", 5, 2));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewDDate.sendKeys(getExcelData("cashPostingslist", 5, 3));
		Thread.sleep(2000);
		
		Cash_Postings_List_Page_Objects.NewCheck.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewCheck.sendKeys(getExcelData("cashPostingslist", 5, 4));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewAmount.sendKeys(getExcelData("cashPostingslist", 5, 5));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.NewNotes.sendKeys(getExcelData("cashPostingslist", 5, 6));
		Thread.sleep(2000);
		
		Cash_Postings_List_Page_Objects.CancelDetail.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.YesUnsave.click();
		Thread.sleep(2000);

		/*
		 * Cash_Postings_List_Page_Objects.CancelDetail.click(); Thread.sleep(2000);
		 */
	}
	
}
