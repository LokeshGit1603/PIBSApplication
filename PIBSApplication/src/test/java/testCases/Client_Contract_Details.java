package testCases;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.log4j.Logger;
import org.monte.media.Format;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Client_Contract_Details_Page_Objects;
import pageObjects.Client_Contract_List_Page_Objects;

public class Client_Contract_Details extends CommonFunctions {

	static Logger logger = Logger.getLogger(Client_Contract_Details.class);

	@Test(priority = 0)
	public void clientdetails() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase = extentReport.createTest("Verifying Client Contract Details");
		logger.info("Navigating to client details page");

		PageFactory.initElements(driver, Client_Contract_Details_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Client details page");
		Client_Contract_Details_Page_Objects.Action.click();
		Thread.sleep(3000);
		
		 TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				  screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				  File("ClientContractDetails.png"); FileHandler.copy(sourceFile, destinationFile);
				  extenttestCase.addScreenCaptureFromPath("ClientContractDetails.png");
				  Thread.sleep(2000);
	}

	
	  @Test(priority = 1) public void verifyexpandcollapse() throws
	  InterruptedException { 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);extenttestCase.log(Status.INFO,
	  "Verifying Expand and Collapse functionality");
	  
	  Client_Contract_Details_Page_Objects.CDHeader.click(); 
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDHeader.click(); 
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scroll(0,450)", ""); 
	  Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.POHeader.click(); 
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.POHeader.click(); 
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.OYHeader.click(); 
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.OYHeader.click(); 
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.AHHeader.click(); 
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.AHHeader.click(); 
	  Thread.sleep(2000);
	  
	  extenttestCase.log(Status.INFO,
	  "Verified Expand and Collapse functionality"); }
	  
	  @Test(priority = 2) public void verifystatus() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying Client Contract Details Status");
	  String CDetailStatus =
	  Client_Contract_Details_Page_Objects.CDStatus.getText();
	  
	  PageFactory.initElements(driver, Client_Contract_List_Page_Objects.class);
	  if(CDetailStatus.contentEquals(getExcelData("cclist", 2, 4))) {
	  extenttestCase.log(Status.PASS,
	  "Status Matched between client listing and details"); } else {
	  extenttestCase.log(Status.FAIL,
	  "Status Mismatched between client listing and details"); } }
	  
	  @Test(priority = 3) public void verifyPOvalidationmsg() throws
	  InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);extenttestCase.log(Status.INFO,
	  "Verifying Validation Message in Add PO Screen");
	  Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.AddPurchaseOrder.click();
	  Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.CancelPurchaseOrder.click();
	  Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.AddPurchaseOrder.click();
	  Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.SaveAddedPO.click();
	  Thread.sleep(2000); 
	  String SCvalidation =
	  Client_Contract_Details_Page_Objects.ServiceCatValidation.getText(); String
	  POvalidation =
	  Client_Contract_Details_Page_Objects.PONumValidation.getText(); String
	  POAvalidation =
	  Client_Contract_Details_Page_Objects.POAmountValidation.getText(); String
	  ADvalidation =
	  Client_Contract_Details_Page_Objects.AwardDateValidation.getText();
	  
	  if(SCvalidation.contains("Please Select Service Category") &&
	  POvalidation.contains("Please Enter PO Number") &&
	  POAvalidation.contains("Please Enter PO Amount") &&
	  ADvalidation.contains("Please Enter Awarded Date")) {
	  extenttestCase.log(Status.PASS, "Validation Done Successfully"); } else {
	  extenttestCase.log(Status.FAIL, "Validation Not Done Successfully"); } 
	  
	  }
	  
	  @Test(priority = 4) public void verifyAddPO() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO,
	  "Adding Purchase Order in Client Contract Details");
	  
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SelectServiceCat.sendKeys(getExcelData(
	  "ccdetails", 1, 0)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.EnterPONum.sendKeys(getExcelData(
	  "ccdetails", 1, 1)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.EnterPOAmount.sendKeys(getExcelData(
	  "ccdetails", 1, 2)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.EnterPOAwardedDate.sendKeys(getExcelData
	  ("ccdetails", 1, 3)); Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.CancelPO.click(); Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.AddPurchaseOrder.click(); Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.SelectServiceCat.sendKeys(getExcelData(
			  "ccdetails", 1, 0)); Thread.sleep(2000);
			  Client_Contract_Details_Page_Objects.EnterPONum.sendKeys(getExcelData(
			  "ccdetails", 1, 1)); Thread.sleep(2000);
			  Client_Contract_Details_Page_Objects.EnterPOAmount.sendKeys(getExcelData(
			  "ccdetails", 1, 2)); Thread.sleep(2000);
			  Client_Contract_Details_Page_Objects.EnterPOAwardedDate.sendKeys(getExcelData
			  ("ccdetails", 1, 3)); Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.SaveAddedPO.click(); 
	  Thread.sleep(2000);
	  
	  
	  }
	  
	  @Test(priority = 5) public void VerifyPOSearch() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "verifying PO Search");
	  Client_Contract_Details_Page_Objects.POSearch.sendKeys(getExcelData(
	  "ccdetails", 1, 3)); 
	  Thread.sleep(2000);
	  
	  String NewSearch =
	  Client_Contract_Details_Page_Objects.POSearchresult.getText();
	  
	  Thread.sleep(2000);
	  
	  if(NewSearch.contentEquals(getExcelData("ccdetails", 1, 3))) {
	  extenttestCase.log(Status.PASS,"Added Purchase Order Successfully"); } else {
	  extenttestCase.log(Status.FAIL,"Purchase Order is not Added"); }
	  
	  Client_Contract_Details_Page_Objects.POSearch.clear(); }
	  
	  @Test(priority = 6) public void VerifyEditPO() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying PO Edit");
	  Client_Contract_Details_Page_Objects.POEdit.click(); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.EnterPOAwardedDate.clear();
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.EnterPOAwardedDate.sendKeys(getExcelData
	  ("ccdetails", 2, 3)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SaveAddedPO.click(); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.POSearch.sendKeys(getExcelData(
	  "ccdetails", 2, 3)); Thread.sleep(2000); 
	  String EditSearch =
	  Client_Contract_Details_Page_Objects.POEditSearchresult.getText();
	  if(EditSearch.contentEquals(getExcelData("ccdetails", 2, 3))) {
	  extenttestCase.log(Status.PASS,"Updated Purchase Order Successfully"); } else
	  { extenttestCase.log(Status.FAIL,"Purchase Order is not Edited"); }
	  
	  }
	  
	  @Test(priority = 7) public void deletePO() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying Delete PO");
	  Client_Contract_Details_Page_Objects.PODelete.click(); 
	  Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.PONoDelete.click(); 
	  Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.PODelete.click(); Thread.sleep(2000);
	  Thread.sleep(2000);

	  Client_Contract_Details_Page_Objects.POAcceptDelete.click();
	  Thread.sleep(2000);

	  Client_Contract_Details_Page_Objects.POSearch.click();
	  Thread.sleep(2000);

	  Client_Contract_Details_Page_Objects.POSearch.clear();
	  Thread.sleep(2000);

	  Client_Contract_Details_Page_Objects.POSearch.sendKeys(getExcelData(
	  "ccdetails", 2, 3));
	  
	  Thread.sleep(2000);

	  String DeletePO = Client_Contract_Details_Page_Objects.POGrid.getText();
	  
	  if(DeletePO.contains("No data found")) 
	  {
	  extenttestCase.log(Status.PASS,"Delete Purchase Order Successfully"); 
	  } 
	  else
	  { 
		  extenttestCase.log(Status.FAIL,"Purchase Order is not Deleted"); 
	  }
	  
	 
	  Client_Contract_Details_Page_Objects.POSearch.click();
	  Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.POSearch.clear();
	  Thread.sleep(2000); 
	  }
	 
	  @Test(priority = 8) public void verifyPOSorting() throws InterruptedException
	  { 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  extenttestCase.log(Status.INFO, "Verifying Purchase Order Column Sorting");
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortOptionYear.click();
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortServicecat.click();
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortPONumber.click();
	 // Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortPOAmount.click();
	 // Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.SortBalance.click();
	//  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortAwardeddate.click();
	//  Thread.sleep(2000);
	  
	  extenttestCase.log(Status.INFO,
	  "Verified Sorting Functionality in Purchase Order grid");
	  
	  }
	  
	  @Test(priority = 9) public void verifyYOSorting() throws InterruptedException
	  { 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  extenttestCase.log(Status.INFO, "Verifying Option Year Column Sorting");
	  Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.SortName.click();
	 // Thread.sleep(2000); 
	  Client_Contract_Details_Page_Objects.SortDName.click();
	 // Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortUTCSDate.click();
	 // Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.SortUTCEDate.click();
	 // Thread.sleep(2000);
	  
	  extenttestCase.log(Status.INFO,
	  "Verified Sorting Functionality in Option Year grid");
	  
	  }
	  
	  @Test(priority = 10) public void VerifyViewall() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying View All Link in Audit History");
	  Thread.sleep(2000);
	  
	  Client_Contract_Details_Page_Objects.CDViewall.click(); String mainwindow =
	  driver.getWindowHandle(); Thread.sleep(2000); 
	  Set<String> handles =
	  driver.getWindowHandles(); for (String handle : handles) {
	  if(!handle.equals(mainwindow)) { driver.switchTo().window(handle);
	  System.out.println(driver.getCurrentUrl().toString());
	  extenttestCase.log(Status.PASS, "View All Link Verified in Audit History");
	  driver.close(); } driver.switchTo().window(mainwindow); } }
	  
	
	  @Test(priority = 11) public void UpdateClientDetails() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  extenttestCase.log(Status.INFO, "Verifying Appointment Invoice Type Update");
		Client_Contract_Details_Page_Objects.CDInvoiceType.sendKeys(getExcelData("ccdetails", 1, 5));
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDInvoiceCadence.sendKeys(getExcelData("ccdetails", 1, 6));
		Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDSubmissionDue.sendKeys(getExcelData(
	  "ccdetails", 1, 7)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDPaymentDue.sendKeys(getExcelData(
	  "ccdetails", 1, 8)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDPricingType.sendKeys(getExcelData(
	  "ccdetails", 1, 9)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDFirstDiscount.clear();
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDFirstDiscount.sendKeys(getExcelData(
	  "ccdetails", 1, 10)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDFirstPay.sendKeys(getExcelData(
	  "ccdetails", 1, 11)); Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDAwardedAmount.clear();
	  Thread.sleep(2000);
	  Client_Contract_Details_Page_Objects.CDAwardedAmount.sendKeys(getExcelData(
	  "ccdetails", 1, 12)); Thread.sleep(2000); 
	  }
	 
	@Test(priority = 12)
	public void SaveClientDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Saving Client Details");
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDSave.click();
		Thread.sleep(2000);
		String CDetailsStatus = Client_Contract_Details_Page_Objects.CDStatus.getText();
		

		if(CDetailsStatus.contentEquals("Draft"))
		{
			extenttestCase.log(Status.PASS, "Contract Saved Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Contract Not Saved Successfully");
		}

	}

	@Test(priority = 13)
	public void SubmitClientDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Submitting Client Details");
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDSubmit.click();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.No.click();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDSubmit.click();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDSubmitpopup.click();
		Thread.sleep(2000);
		String CDetailsStatus = Client_Contract_Details_Page_Objects.CDStatus.getText();
		

		if(CDetailsStatus.contentEquals("Submitted"))
		{
			extenttestCase.log(Status.PASS, "Contract Submitted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Contract Not Submitted Successfully");
		}
	}

	@Test(priority = 14)
	public void RejectClientDetails() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Rejecting Client Details");
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDReject.click();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.NoCDReject.click();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDReject.click();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDRejectNotes.click();
		Thread.sleep(2000);
		String CDRejectvalidation = Client_Contract_Details_Page_Objects.CDRejectWarning.getText();
		if(CDRejectvalidation.contains("Please enter the notes"))
		{
			extenttestCase.log(Status.PASS, "Contract Rejection Notes Validated Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Contract Rejection Notes Not Validated Successfully");
		}

		Client_Contract_Details_Page_Objects.CDRejectPopup.sendKeys(getExcelData("ccdetails", 1, 13));
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDRejectNotes.click();
		Thread.sleep(2000);
		String CDetailsStatus = Client_Contract_Details_Page_Objects.CDStatus.getText();
		

		if(CDetailsStatus.contentEquals("Rejected"))
		{
			extenttestCase.log(Status.PASS, "Contract Rejected Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Contract Not Rejected Successfully");
		}
	}

	@Test(priority = 15)
	public void CDBatchupdate() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Verifying Bath Invoice Type Update");
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDInvoiceType.sendKeys(getExcelData("ccdetails", 1, 14));
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDInvoiceCadence.sendKeys(getExcelData("ccdetails", 1, 15));
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDSubmissionDue.sendKeys(getExcelData("ccdetails", 1, 16));
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDPaymentDue.sendKeys(getExcelData("ccdetails", 1, 17));
		Thread.sleep(2000);


		Client_Contract_Details_Page_Objects.CDPricingType.sendKeys(getExcelData("ccdetails", 1, 18)); 
		Thread.sleep(2000);

		Client_Contract_Details_Page_Objects.CDFirstDiscount.clear();
		Thread.sleep(2000);

		Client_Contract_Details_Page_Objects.CDFirstDiscount.sendKeys(getExcelData("ccdetails", 1, 19)); 
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDFirstPay.sendKeys(getExcelData("ccdetails", 1, 20)); 
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDAwardedAmount.clear();
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDAwardedAmount.sendKeys(getExcelData("ccdetails", 1, 21)); 
		Thread.sleep(2000);

		SaveClientDetails();
		Thread.sleep(2000);
		
		SubmitClientDetails();
		Thread.sleep(2000);
		
		RejectClientDetails();
		Thread.sleep(2000);
		
		SaveClientDetails();

	}

	@Test(priority = 16)
	public void CDCancel() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase.log(Status.INFO, "Cancelling Client Details ");
		Thread.sleep(2000);
		Client_Contract_Details_Page_Objects.CDCancel.click();
	}
	 
	  
	 
}
