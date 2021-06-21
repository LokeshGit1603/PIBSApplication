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
import pageObjects.Unapplied_Cash_Posting_Details_Page_Objects;

public class Unapplied_Cash_Posting_Details extends CommonFunctions {

	static Logger logger = Logger.getLogger(Unapplied_Cash_Posting_Details.class);

	@Test(priority = 0)
	public void clickCashPostMenu() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying Unapplied Cash Postings Details");
		logger.info("Logging in to the application");
	}

	@Test(priority = 1)
	public void clickCashPost() throws InterruptedException, IOException {
		extenttestCase.log(Status.INFO, "Verifying Cash Postings Listing");
		PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Unapplied Cash Postings Menu");
		/*
		 * Cash_Postings_List_Page_Objects.CashPostingsMenu.click(); Thread.sleep(2000);
		 */
	}

	
	  @Test(priority = 2) public void verifySearch() throws Throwable {
	  extenttestCase.log(Status.INFO,
	  "Verifying Added Cash Posting Record in Listing");
	  logger.info("Verifying Added Cash Posting Record in Listing");
	  PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
	  Cash_Postings_List_Page_Objects.Searchheader.click(); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchLOB.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 0)); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchStatus.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 8)); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchClick.click(); Thread.sleep(2000);
	  
	  
	  String LOBResult = Cash_Postings_List_Page_Objects.LOBResult.getText();
	 
	  
	  String StatusResult = Cash_Postings_List_Page_Objects.StatusResult.getText();
	  
	  
	  if(LOBResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 0)) &&
	  StatusResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 8)))
	  
	  { extenttestCase.log(Status.PASS,
	  "Got Expected Result in Cash Postings Listing"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Not Getting Expected Result in Cash Postings Listing"); }
	  
	  }
	  
	  @Test(priority = 3) public void cashpostingdetails() throws
	  InterruptedException, IOException { extenttestCase.log(Status.INFO,
	  "Verifying UnappliedCash Posting Details");
	  logger.info("Navigating to Unapplied Cash Posting details page");
	  
	  PageFactory.initElements(driver,
	  Unapplied_Cash_Posting_Details_Page_Objects.class);
	  extenttestCase.log(Status.INFO,
	  "Navigating to Unapplied Cash Posting details page");
	  Unapplied_Cash_Posting_Details_Page_Objects.DetailAction.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 4) public void TakeScreenshot() throws IOException {
	  TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
	  screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
	  File("UnappliedCashPostingDetails.png"); FileHandler.copy(sourceFile,
	  destinationFile);
	  extenttestCase.addScreenCaptureFromPath("UnappliedCashPostingDetails.png"); }
	  
	  @Test(priority = 5) public void VerifyPageLabel() throws InterruptedException
	  { extenttestCase.log(Status.INFO,
	  "Verifying UnappliedCash Posting Page Lable");
	  
	  String PageLabel =
	  Unapplied_Cash_Posting_Details_Page_Objects.PageLabel.getText();
	  Thread.sleep(2000); 
	  
	  if(PageLabel.contentEquals("Cash Posting Details - Unapplied Cash")) {
	  extenttestCase.log(Status.PASS,
	  "Got Expected Unapplied Cash Posting Detail Page"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Not Getting Expected Unapplied Cash Posting Detail Page"); } }
	  
	  
	  
	  @Test(priority = 6) public void VerifyExpand() throws InterruptedException {
	  extenttestCase.log(Status.INFO,
	  "Verifying Expand and Collapse Functionality");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.detailsheader.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.detailsheader.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.invoiceheader.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.invoiceheader.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AUheader.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AUheader.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 7) public void VerifyUnsaveNo() throws Throwable {
	  extenttestCase.log(Status.INFO, "Verifying Unsaved No Functionality");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Notes.clear();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Notes.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 6)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Canceldetail.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.NoCancel.click();
	  Thread.sleep(2000);
	  
	  verifySearch(); Thread.sleep(2000);
	  
	  cashpostingdetails(); Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 8) public void VerifyUnsaveYes() throws Throwable {
	  extenttestCase.log(Status.INFO, "Verifying Unsaved Yes Functionality");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Notes.clear();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Notes.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 6)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Canceldetail.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.YesCancel.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  
	  @Test(priority = 9) public void clickAddInvoice() throws InterruptedException
	  { extenttestCase.log(Status.INFO, "Verifying Add Invoice button");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AddInvoicebtn.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceAddbtn.click();
	  Thread.sleep(2000);
	  
	  String Warn =
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSelectWarn.getText();
	  
	  
	  if(Warn.contentEquals("Please select invoice(s)")) {
	  extenttestCase.log(Status.PASS, "Add Invoice Validation Done Successfully");
	  } else { extenttestCase.log(Status.FAIL, "Add Invoice Validation Failed"); }
	  }
	  
	  @Test(priority = 10) public void sortAddInvoicepopup() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Verifying Sort Functionality in Add Invoice Popup");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSearch.click();
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.SortLOB.click();
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.SortSDate.click();
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.SortPaymentDue.click();
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.SortInvoiceAmount.click();
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.SortInvoiceStatus.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 11) public void InvalidSearch() throws Throwable {
	  extenttestCase.log(Status.INFO, "Verifying Invalid Data Search Validation");
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceClear.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceNum.sendKeys(getExcelData(
	  "cashPostingsDetails", 5, 0)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSatus.sendKeys(
	  getExcelData("cashPostingsDetails", 5, 3)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSearch.click();
	  Thread.sleep(2000);
	  
	  String InvoiceNoData =
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceNoData.getText();
	  Thread.sleep(2000);
	  
	  if(InvoiceNoData.contentEquals("No data found")) {
	  extenttestCase.log(Status.PASS, "Got Expected No Data Found Result"); } else
	  { extenttestCase.log(Status.FAIL,
	  "Not Getting Expected No Data Found Result"); }
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceClear.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 12) public void ValidSearch() throws Throwable {
	  extenttestCase.log(Status.INFO, "Verifying Valid Data Search Validation");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceNum.sendKeys(getExcelData(
	  "cashPostingsDetails", 5, 1)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSatus.sendKeys(
	  getExcelData("cashPostingsDetails", 5, 3)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSearch.click();
	  Thread.sleep(2000);
	  
	  String ResultInvNum =
	  Unapplied_Cash_Posting_Details_Page_Objects.ResultInvNum.getText();
	 
	  
	  String ResultStatus =
	  Unapplied_Cash_Posting_Details_Page_Objects.ResultStatus.getText();
	  
	  
	  if(ResultInvNum.contentEquals(getExcelData("cashPostingsDetails", 5, 1)) &&
	  ResultStatus.contentEquals(getExcelData("cashPostingsDetails", 5, 3))) {
	  extenttestCase.log(Status.PASS, "Got Expected Result"); }
	  
	  else { extenttestCase.log(Status.FAIL, "Not Getting Expected Result"); }
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceClear.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceClosePopup.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  
	  @Test(priority = 13) public void AddAllInvoice() throws InterruptedException
	  { extenttestCase.log(Status.INFO, "Add All Invoices");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AddInvoicebtn.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSearch.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.SelectAllCheckbox.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceAddbtn.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 14) public void RemoveAll() throws InterruptedException {
	  extenttestCase.log(Status.INFO, "Remove All Invoices");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.RemoveAll.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.RemoveYes.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.RemoveAll.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.RemoveYes.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.RemoveAll.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.RemoveYes.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  
	  @Test(priority = 15) public void VerifyConfirmInvWarn() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Verifying Invoice Selection Warning");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.ConfirmPostingbtn.click();
	  Thread.sleep(2000);
	  
	  
	  String ConfirmInvWarn =
	  Unapplied_Cash_Posting_Details_Page_Objects.ConfirmInvWarn.getText();
	 
	  
	  if(ConfirmInvWarn.contains("Please select invoice(s) for cash posting")) {
	  extenttestCase.log(Status.PASS, "Confirm Invoice Selection Got Validated"); }
	  else { extenttestCase.log(Status.FAIL,
	  "Confirm Invoice Selection Not Validated"); }
	  
	  
	  }
	  
	  @Test(priority = 16) public void AddValidInvoice() throws Throwable {
	  
	  extenttestCase.log(Status.INFO, "Verifying Add Invoice button");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AddInvoicebtn.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceNum.sendKeys(getExcelData(
	  "cashPostingsDetails", 5, 1)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSatus.sendKeys(
	  getExcelData("cashPostingsDetails", 5, 3)); Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceSearch.click();
	  Thread.sleep(2000);
	  
	  String ResultInvNum =
	  Unapplied_Cash_Posting_Details_Page_Objects.ResultInvNum.getText();
	 
	  
	  String ResultStatus =
	  Unapplied_Cash_Posting_Details_Page_Objects.ResultStatus.getText();
	 
	  
	  if(ResultInvNum.contentEquals(getExcelData("cashPostingsDetails", 5, 1)) &&
	  ResultStatus.contentEquals(getExcelData("cashPostingsDetails", 5, 3))) {
	  extenttestCase.log(Status.PASS, "Got Expected Result"); }
	  
	  else { extenttestCase.log(Status.FAIL, "Not Getting Expected Result"); } }
	  
	  @Test(priority = 17) public void SelectInvoice() throws InterruptedException
	  { extenttestCase.log(Status.INFO, "Select Invoice");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.SelectCheckbox.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceAddbtn.click();
	  Thread.sleep(2000);
	  
	  
	  
	  }
	  
	  @Test(priority = 18) public void VerifySelectedInvoice() throws Throwable {
	  extenttestCase.log(Status.INFO, "Verify Selected Invoice");
	  
	  String AddedInv =
	  Unapplied_Cash_Posting_Details_Page_Objects.AddedInv.getText();
	  Thread.sleep(2000);
	  
	  if(AddedInv.contentEquals(getExcelData("cashPostingsDetails", 5, 1))) {
	  extenttestCase.log(Status.PASS, "Invoice Added Successfully"); }
	  
	  else { extenttestCase.log(Status.FAIL, "Selected Invoice Not Added"); }
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AddedInv.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AddedInv.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.InvoiceLink.click();
	  String mainwindow = driver.getWindowHandle();
	  Thread.sleep(2000);
	  Set<String> handles = driver.getWindowHandles();
	  for (String handle : handles) 
	  {
		  if(!handle.equals(mainwindow))
		  {
			  driver.switchTo().window(handle);
			  Thread.sleep(2000);
			  String InvoiceLabel = Unapplied_Cash_Posting_Details_Page_Objects.InvoiceLabel.getText();
			 
			  if(InvoiceLabel.contentEquals(getExcelData("UnappliedcashPosting", 5, 1)))
			  {
				  extenttestCase.log(Status.PASS, "Invoice Link Redirected Successfully");
				  driver.close();
			  }
		  }

		  driver.switchTo().window(mainwindow);	
	  }
	  }
	  
	  @Test(priority = 19) public void VerifyEnterAmountWarn() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Verify Add Amount Validation");
	  
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.ConfirmPostingbtn.click();
	  Thread.sleep(2000);
	  
	  
	  String EnterAmountWarn =
	  Unapplied_Cash_Posting_Details_Page_Objects.EnterAmountWarn.getText();
	 
	  
	  if(EnterAmountWarn.
	  contains("Please enter the amount posting now for the following Invoice Number"
	  )) { extenttestCase.log(Status.PASS, "Enter Amount Validation Done"); }
	  
	  else { extenttestCase.log(Status.FAIL, "Enter Amount Validation Failed"); }
	  
	  Thread.sleep(2000);
	  Unapplied_Cash_Posting_Details_Page_Objects.AcceptEnterAmountWarn.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 20) public void EnterAmountNow() throws Throwable {
	  extenttestCase.log(Status.INFO, "Add Amount Posting Now");
	  Unapplied_Cash_Posting_Details_Page_Objects.AmtPostNow.clear();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.AmtPostNow.sendKeys(getExcelData(
	  "UnappliedcashPosting", 5, 7)); Thread.sleep(2000);
	  
	  
	  }
	  
	  @Test(priority = 21) public void CheckApplyPending() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Check Apply Pending Balance to unapplied bucket");
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.ConfirmPostingbtn.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.NoConfirm.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.ConfirmPostingbtn.click();
	  Thread.sleep(2000);
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.YesConfirm.click();
	  Thread.sleep(2000); }
	 

	
	  @Test(priority = 22) public void GoToList() throws Throwable {
	  extenttestCase.log(Status.INFO, "Go Back to List to do Reverse Posting");
	  
	  
	  Unapplied_Cash_Posting_Details_Page_Objects.Canceldetail.click();
	  Thread.sleep(2000);
	  
	  
	  PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
	  Cash_Postings_List_Page_Objects.Searchheader.click(); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchLOB.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 0)); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchStatus.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 7)); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchCheck.sendKeys(getExcelData(
	  "UnappliedcashPosting", 1, 4)); Thread.sleep(2000);
	  
	  Cash_Postings_List_Page_Objects.SearchClick.click(); Thread.sleep(2000);
	  
	  String LOBResult = Cash_Postings_List_Page_Objects.LOBResult.getText();
	  
	  
	  String StatusResult = Cash_Postings_List_Page_Objects.StatusResult.getText();
	  
	  
	  String CheckResult = Cash_Postings_List_Page_Objects.CheckResult.getText();
	  
	  
	  if(LOBResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 0)) &&
	  StatusResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 7)) &&
	  CheckResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 4)))
	  
	  { extenttestCase.log(Status.PASS,
	  "Got Expected Result in Cash Postings Listing"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Not Getting Expected Result in Cash Postings Listing"); }
	  
	  }
	  
	  
	  @Test(priority = 23) public void Reversecashpostingdetails() throws
	  InterruptedException, IOException { extenttestCase.log(Status.INFO,
	  "Verifying UnappliedCash Posting Details");
	  logger.info("Navigating to Unapplied Cash Posting details page");
	  
	  PageFactory.initElements(driver, Cash_Postings_Details_Page_Objects.class);
	  extenttestCase.log(Status.INFO,
	  "Navigating to Unapplied Cash Posting details page");
	  Cash_Postings_Details_Page_Objects.DetailAction.click(); Thread.sleep(2000);
	  
	  String DetailLabel = Cash_Postings_List_Page_Objects.DetailLabel.getText();
	  
	  if(DetailLabel.contains("Cash Posting Details")) {
	  extenttestCase.log(Status.PASS,
	  "Cash Postings Detail Page Redirected Successfully"); } else {
	  extenttestCase.log(Status.FAIL,
	  "Cash Postings Detail Page Redirection Failed"); }
	  
	  }
	  
	  @Test(priority = 24) public void ClickReversePost() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Verifying UnappliedCash Posting Details");
	  
	  Cash_Postings_Details_Page_Objects.ReversePostbtn.click();
	  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.NoReverse.click(); Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.ReversePostbtn.click();
	  Thread.sleep(2000);
	  
	  Cash_Postings_Details_Page_Objects.YesReverse.click(); Thread.sleep(2000);
	  
	  }
	 

	@Test(priority = 25)
	public void GoToListforclose() throws Throwable {
		extenttestCase.log(Status.INFO, "Go Back to List for Cash Posting close");
		 Cash_Postings_Details_Page_Objects.CancelDetail.click(); 

		PageFactory.initElements(driver, Cash_Postings_List_Page_Objects.class);
		Cash_Postings_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchLOB.sendKeys(getExcelData("UnappliedcashPosting", 1, 0));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchStatus.sendKeys(getExcelData("UnappliedcashPosting", 1, 7));
		Thread.sleep(2000);

		Cash_Postings_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);

		String LOBResult = Cash_Postings_List_Page_Objects.LOBResult.getText();
		

		String StatusResult = Cash_Postings_List_Page_Objects.StatusResult.getText();
		

		if (LOBResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 0))
				&& StatusResult.contentEquals(getExcelData("UnappliedcashPosting", 1, 7)))

		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Cash Postings Listing");
		}

		else {
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Cash Postings Listing");
		}

	}

	@Test(priority = 26)
	public void GoToUnappliedCash() throws InterruptedException {
		extenttestCase.log(Status.INFO, "Go to Unapplied Cash Posting details to close");
		PageFactory.initElements(driver, Unapplied_Cash_Posting_Details_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Unapplied Cash Posting details page");
		Unapplied_Cash_Posting_Details_Page_Objects.DetailAction.click();
		Thread.sleep(2000);
	}

	@Test(priority = 27)
	public void RefundClose() throws InterruptedException {
		extenttestCase.log(Status.INFO, "Refund and Closing Unapplied Cash Posting details");
		Unapplied_Cash_Posting_Details_Page_Objects.RefundClosebtn.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Page_Objects.NoRefund.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Page_Objects.RefundClosebtn.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Page_Objects.YesRefund.click();
		Thread.sleep(3000);

		String RefundCloseStatus = Unapplied_Cash_Posting_Details_Page_Objects.RefundCloseStatus.getText();

		if (RefundCloseStatus.contentEquals("Closed")) {
			extenttestCase.log(Status.PASS, "Cash Posting Closed Successfully");
		}

		else {
			extenttestCase.log(Status.FAIL, "Closing Cash Posting Failed");
		}

		Unapplied_Cash_Posting_Details_Page_Objects.Canceldetail.click();
		Thread.sleep(3000);
	}

}
