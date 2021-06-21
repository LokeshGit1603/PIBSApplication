package testCases;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Cash_Postings_Details_Page_Objects;
import pageObjects.Cash_Postings_List_Page_Objects;
import pageObjects.Client_Contract_Details_Page_Objects;

public class Cash_Postings_Details extends CommonFunctions{

	static Logger logger = Logger.getLogger(Cash_Postings_Details.class);


	@Test(priority = 0)
	public void clickCashPostMenu() throws InterruptedException, IOException
	{
		extenttestCase = extentReport.createTest("Verifying Cash Postings Details");
		logger.info("Logging in to the application");
	}

	@Test(priority = 1)
	public void clickCashPost() throws InterruptedException, IOException
	{
		extenttestCase.log(Status.INFO, "Verifying Cash Postings Listing");
		PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Cash Postings Menu");
		/*
		 * Cash_Postings_List_Page_Objects.CashPostingsMenu.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 2)
	public void verifySearch() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Added Cash Posting Record in Listing");
		logger.info("Verifying Added Cash Posting Record in Listing");
		PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
		Cash_Postings_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchLOB.sendKeys(getExcelData("cashPostingslist", 5, 0));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchAmount.sendKeys(getExcelData("cashPostingslist", 5, 5));
		Thread.sleep(2000);


		Cash_Postings_List_Page_Objects.SearchStatus.sendKeys(getExcelData("cashPostingslist", 5, 7)); 
		Thread.sleep(2000);             


		Cash_Postings_List_Page_Objects.SearchDDate.sendKeys(getExcelData("cashPostingslist", 5, 3)); 
		Thread.sleep(2000);


		Cash_Postings_List_Page_Objects.SearchCheck.sendKeys(getExcelData("cashPostingslist", 5, 4));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);


		String LOBResult = Cash_Postings_List_Page_Objects.LOBResult.getText();
		

		String DDateResult = Cash_Postings_List_Page_Objects.DDateResult.getText();
		

		String StatusResult = Cash_Postings_List_Page_Objects.StatusResult.getText();
		

		String CheckResult = Cash_Postings_List_Page_Objects.CheckResult.getText();
		

		if(LOBResult.contentEquals(getExcelData("cashPostingslist", 5, 0))
				&& DDateResult.contentEquals(getExcelData("cashPostingslist", 5, 3))
				&& StatusResult.contentEquals(getExcelData("cashPostingslist", 5, 7))
				&& CheckResult.contentEquals(getExcelData("cashPostingslist", 5, 4)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Cash Postings Listing");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Cash Postings Listing");
		}

	}

	@Test(priority = 3)
	public void cashpostingdetails() throws InterruptedException, IOException {
		logger.info("Navigating to Cash Posting details page");

		PageFactory.initElements(driver, Cash_Postings_Details_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Cash Posting details page");
		Cash_Postings_Details_Page_Objects.DetailAction.click();
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void TakeScreenshot() throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("CashPostingDetails.png"); FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("CashPostingDetails.png");
	}

	
	
	  @Test(priority = 5) public void checkUnsaved() throws Throwable {
	  Thread.sleep(2000); extenttestCase.log(Status.INFO,
	  "Verifying Check Unsaved Functionality");
	  
	  if(Cash_Postings_Details_Page_Objects.LOBDetail.isEnabled()) {
	  extenttestCase.log(Status.FAIL,
	  "Not Getting Expected and LOB Field enabled"); }
	  
	  else { extenttestCase.log(Status.PASS,
	  "Got Expected and LOB Field disabled"); }
	  
	  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.BankDetail.sendKeys(getExcelData(
	  "cashPostingsDetails", 2, 1)); Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.CancelDetail.click(); Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.NoSaveDetail.click(); Thread.sleep(5000);
	  
	  String ListLabel = Cash_Postings_Details_Page_Objects.ListLabel.getText();
	
	  
	  if(ListLabel.contentEquals("Cash Postings")) {
	  extenttestCase.log(Status.PASS,
	  "List page redirected and Unsaved validation Done Successfully"); } else {
	  extenttestCase.log(Status.FAIL,
	  "List page not redirected and Unsaved validation Failed"); }
	  
	  Thread.sleep(2000); }
	  
	  @Test(priority = 6) public void VerifyList() throws Throwable {
	  Thread.sleep(2000); 
	  verifySearch(); 
	  Thread.sleep(2000); 
	  cashpostingdetails();
	  Thread.sleep(5000); 
	  String BankCDetail =
	  Cash_Postings_Details_Page_Objects.BankCDetail.getText();
	 
	  
	  if(BankCDetail.contentEquals(getExcelData("cashPostingsDetails", 1, 1))) 
	  {
	  extenttestCase.log(Status.PASS, "Changes Not Saved"); 
	  } 
	  else 
	  {
	  extenttestCase.log(Status.FAIL, "Changes Saved and Not Getting Expected"); 
	  }
	  Thread.sleep(2000); 
	  }
	  
	  @Test(priority = 7) public void VerifyYesChange() throws Throwable {
	  Thread.sleep(2000);
	  Cash_Postings_Details_Page_Objects.BankDetail.sendKeys(getExcelData(
	  "cashPostingsDetails", 2, 1)); Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.CancelDetail.click(); Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.YesSaveDetail.click(); Thread.sleep(5000);
	  
	  String ListLabel = Cash_Postings_Details_Page_Objects.ListLabel.getText();
	  Thread.sleep(2000);
	  
	  if(ListLabel.contentEquals("Cash Postings")) {
	  extenttestCase.log(Status.PASS,
	  "List page redirected and Unsaved validation Done Successfully"); } else {
	  extenttestCase.log(Status.FAIL,
	  "List page not redirected and Unsaved validation Failed"); }
	  Thread.sleep(2000); }
	  
	  @Test(priority = 8) 
	  public void VerifyChangedetail() throws Throwable 
	  {
	  Thread.sleep(2000); 
	  verifySearch(); 
	  Thread.sleep(2000); 
	  cashpostingdetails();
	  Thread.sleep(5000); 
	  String BankBDetail =
	  Cash_Postings_Details_Page_Objects.BankBDetail.getText();
	  
	  
	  if(BankBDetail.contentEquals(getExcelData("cashPostingsDetails", 2, 1))) 
	  {
	  extenttestCase.log(Status.PASS, "Changes Saved Successfully"); 
	  } 
	  else 
	  {
	  extenttestCase.log(Status.FAIL, "Changes Not Saved"); 
	  } 
	  
	  Thread.sleep(2000);
	  Cash_Postings_Details_Page_Objects.BankDetail.sendKeys(getExcelData(
			  "cashPostingsDetails", 1, 1)); 
	  Thread.sleep(2000);
	  Cash_Postings_Details_Page_Objects.SaveDetail.click();
	  Thread.sleep(2000);
	  }
	  
	  
	  
	
	@Test(priority = 9)
	public void clickAddInvoice() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Verifying Add Invoice button");
		
		Cash_Postings_Details_Page_Objects.AddInvoicebtn.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceAddbtn.click();
		Thread.sleep(2000);
		
		String Warn = Cash_Postings_Details_Page_Objects.InvoiceSelectWarn.getText();
		
		
		if(Warn.contentEquals("Please select invoice(s)"))
		{
			extenttestCase.log(Status.PASS, "Add Invoice Validation Done Successfully"); 
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Add Invoice Validation Failed"); 
		}
	}
	
	@Test(priority = 10)
	public void sortAddInvoicepopup() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Verifying Sort Functionality in Add Invoice Popup");
		
		Cash_Postings_Details_Page_Objects.InvoiceSearch.click();
		Thread.sleep(2000);
		Cash_Postings_Details_Page_Objects.SortLOB.click();
		Thread.sleep(2000);
		Cash_Postings_Details_Page_Objects.SortSDate.click();
		Thread.sleep(2000);
		Cash_Postings_Details_Page_Objects.SortPaymentDue.click();
		Thread.sleep(2000);
		Cash_Postings_Details_Page_Objects.SortInvoiceAmount.click();
		Thread.sleep(2000);
		Cash_Postings_Details_Page_Objects.SortInvoiceStatus.click();
		Thread.sleep(2000);
			
	}
	
	@Test(priority = 11)
	public void InvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,
				"Verifying Invalid Data Search Validation");
		Cash_Postings_Details_Page_Objects.InvoiceClear.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceNum.sendKeys(getExcelData("cashPostingsDetails", 5, 0));
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceSatus.sendKeys(getExcelData("cashPostingsDetails", 5, 3));
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceSearch.click();
		Thread.sleep(2000);
		
		String InvoiceNoData =  Cash_Postings_Details_Page_Objects.InvoiceNoData.getText();
		Thread.sleep(2000);
		
		if(InvoiceNoData.contentEquals("No data found"))
		{
			extenttestCase.log(Status.PASS, "Got Expected No Data Found Result"); 
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected No Data Found Result"); 
		}
		
		Cash_Postings_Details_Page_Objects.InvoiceClear.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 12)
	public void ValidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,
				"Verifying Valid Data Search Validation");
		
		Cash_Postings_Details_Page_Objects.InvoiceNum.sendKeys(getExcelData("cashPostingsDetails", 5, 1));
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceSatus.sendKeys(getExcelData("cashPostingsDetails", 5, 3));
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceSearch.click();
		Thread.sleep(2000);
		
		String ResultInvNum = Cash_Postings_Details_Page_Objects.ResultInvNum.getText();
		
		
		String ResultStatus = Cash_Postings_Details_Page_Objects.ResultStatus.getText();
		
		
		if(ResultInvNum.contentEquals(getExcelData("cashPostingsDetails", 5, 1)) 
				&& ResultStatus.contentEquals(getExcelData("cashPostingsDetails", 5, 3)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result"); 
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result"); 
		}
		
	}
	
	@Test(priority = 13)
	public void SelectInvoice() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Select Invoice");
		
		Cash_Postings_Details_Page_Objects.SelectCheckbox.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceAddbtn.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 14)
	public void VerifySelectedInvoice() throws Throwable
	{
		extenttestCase.log(Status.INFO,
				"Verify Selected Invoice");
		
		String AddedInv = Cash_Postings_Details_Page_Objects.AddedInv.getText();
		
		Thread.sleep(2000);
		
		if(AddedInv.contentEquals(getExcelData("cashPostingsDetails", 5, 1)))
		{
			extenttestCase.log(Status.PASS, "Invoice Added Successfully"); 
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Selected Invoice Not Added"); 
		}
		
		Cash_Postings_Details_Page_Objects.AddedInv.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.AddedInv.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 15)
	public void VerifyEnterAmountWarn() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Verify Add Amount Validation");
		
		Cash_Postings_Details_Page_Objects.SaveDetail.click();
		Thread.sleep(2000);
		
		String EnterAmountWarn = Cash_Postings_Details_Page_Objects.EnterAmountWarn.getText();
		
		
		if(EnterAmountWarn.contains("Please enter the amount posting now for the following Invoice Number"))
		{
			extenttestCase.log(Status.PASS, "Enter Amount Validation Done"); 
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Enter Amount Validation Failed"); 
		}
		
		 Cash_Postings_Details_Page_Objects.AcceptEnterAmountWarn.click();
		 Thread.sleep(2000);
	}
	
	@Test(priority = 16)
	public void EnterAmountNow() throws Throwable
	{
		extenttestCase.log(Status.INFO,
				"Add Amount Posting Now");
		Cash_Postings_Details_Page_Objects.AmtPostNow.clear();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.AmtPostNow.sendKeys(getExcelData("cashPostingsDetails", 5, 7));
		Thread.sleep(2000);
		
		/*
		 * Cash_Postings_Details_Page_Objects.SaveDetail.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 17)
	public void RemoveAmountNow() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Remove Add Amount Posting Now");
		
		Cash_Postings_Details_Page_Objects.Remove.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveNo.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.Remove.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveYes.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 18)
	public void AddAllInvoice() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Add All Invoices");
		
		Cash_Postings_Details_Page_Objects.AddInvoicebtn.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceSearch.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.SelectAllCheckbox.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.InvoiceAddbtn.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 19)
	public void RemoveAll() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Remove All Invoices");
		
		Cash_Postings_Details_Page_Objects.RemoveAll.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveYes.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveAll.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveYes.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveAll.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.RemoveYes.click();
		Thread.sleep(2000);
		
		Cash_Postings_Details_Page_Objects.SaveDetail.click(); 
		Thread.sleep(2000);
		 
	}
	
	@Test(priority = 20)
	public void ApplyPendingBalWarn() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,
				"Verifying Apply Pending Balance to unapplied bucket Validation");
		Cash_Postings_Details_Page_Objects.ConfirmPostDetail.click();
		Thread.sleep(2000);
		
		String ConfirmPostwarn = Cash_Postings_Details_Page_Objects.ConfirmPostwarn.getText();
		
		
		if(ConfirmPostwarn.contentEquals("Please apply the pending balance to unapplied bucket"))
		{
			extenttestCase.log(Status.PASS, "Apply Pending Balance Bucket Validation Done Successfully"); 
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Apply Pending Balance Bucket Validation Failed"); 
		}
		
		Cash_Postings_Details_Page_Objects.AcceptConfirmPost.click();
		Thread.sleep(2000);
		
	}
	
	
	  @Test(priority = 21) public void CheckApplyPending() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Check Apply Pending Balance to unapplied bucket");
	  
	  Cash_Postings_Details_Page_Objects.CheckApplyPending.click();
	  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.ConfirmPostDetail.click();
	  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.NoConfirm.click(); Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.ConfirmPostDetail.click();
	  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.YesConfirm.click(); Thread.sleep(2000); }
	  
	  @Test(priority = 22) public void CheckConfirmPost() {
	  extenttestCase.log(Status.INFO, "Check Confirm Posting Functionality");
	  
	  String CashStatusLabel =
	  Cash_Postings_Details_Page_Objects.CashStatusLabel.getText();
	  
	  
	  if(CashStatusLabel.contentEquals("Posted")) { extenttestCase.log(Status.PASS,
	  "Invoice Posted Successfully"); }
	  
	  else { extenttestCase.log(Status.FAIL, "Invoice Posting Failed"); }
	  
	  }
	  
	  @Test(priority = 23) public void VerifyExpand() throws InterruptedException {
	  Thread.sleep(2000); extenttestCase.log(Status.INFO,
	  "Verifying Expand and Collapse functionality");
	  Cash_Postings_Details_Page_Objects.Detailsheader.click(); Thread.sleep(2000);
	  Cash_Postings_Details_Page_Objects.Detailsheader.click(); Thread.sleep(2000);
	  Cash_Postings_Details_Page_Objects.Invoicesheader.click();
	  Thread.sleep(2000);
	  Cash_Postings_Details_Page_Objects.Invoicesheader.click();
	  Thread.sleep(2000); Cash_Postings_Details_Page_Objects.AUheader.click();
	  Thread.sleep(2000); Cash_Postings_Details_Page_Objects.AUheader.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 24) public void VerifyViewall() throws InterruptedException
	  { 
		  extenttestCase.log(Status.INFO,"Verifying View All Link in Audit History"); 
		  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.CPDViewall.click(); 
	  String mainwindow = driver.getWindowHandle(); 
	  Thread.sleep(2000); 
	  Set<String> handles = driver.getWindowHandles(); 
	  for (String handle : handles) 
	  {
	  if(!handle.equals(mainwindow)) 
	  { 
		  driver.switchTo().window(handle);
	  System.out.println(driver.getCurrentUrl().toString());
	  extenttestCase.log(Status.PASS, "View All Link Verified in Audit History");
	  driver.close(); 
	  } 
	  driver.switchTo().window(mainwindow); 
	  } 
	  }
	  
	  @Test(priority = 25)
	  public void CancelDetail()
	  {
		  extenttestCase.log(Status.INFO,
				  "Verifying Cancel functionality");
		  
		  Cash_Postings_Details_Page_Objects.CancelDetail.click();
	  }
	 
}
