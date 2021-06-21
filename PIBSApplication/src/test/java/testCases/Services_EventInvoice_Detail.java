package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import pageObjects.Services_AppInvoice_Detail_Page_Objects;
import pageObjects.Services_EventInvoice_Detail_Page_Objects;
import pageObjects.Services_List_Page_Objects;

public class Services_EventInvoice_Detail extends CommonFunctions {

	static Logger logger = Logger.getLogger(Services_EventInvoice_Detail.class);

	@Test(priority = 0)
	public void EventInvoicedetails() throws InterruptedException {
		extenttestCase = extentReport.createTest("Verifying Event Invoice Details");
		logger.info("Verifying Event Invoice Details");
		PageFactory.initElements(driver, Services_List_Page_Objects.class);
		/*
		 * Services_List_Page_Objects.ServiceMenu.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void CheckServiceRecord() throws Throwable {
		extenttestCase.log(Status.INFO, "Verify Search Event Invoice in Listing");
		Services_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.UniqueId.sendKeys(getExcelData("serviceEventInvoicedetail", 1, 0));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchLOB.sendKeys(getExcelData("serviceEventInvoicedetail", 1, 1));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchDOR.sendKeys(getExcelData("serviceEventInvoicedetail", 1, 2));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchDOS.sendKeys(getExcelData("serviceEventInvoicedetail", 1, 3));
		Thread.sleep(2000);
		Services_List_Page_Objects.UniqueId.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchLocation.sendKeys(getExcelData("serviceEventInvoicedetail", 1, 5));
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchStatus.sendKeys(getExcelData("serviceEventInvoicedetail", 1, 7));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void getRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Event Invoice Record in Listing");
		String UniqueResult = Services_List_Page_Objects.UniqueResult.getText();
	

		String LOBResult = Services_List_Page_Objects.LOBResult.getText();
		

		String DORResult = Services_List_Page_Objects.DORResult.getText();
		

		String DOAResult = Services_List_Page_Objects.DOAResult.getText();
		

		String LocationResult = Services_List_Page_Objects.LocationResult.getText();
		

		String StatusResult = Services_List_Page_Objects.StatusResult.getText();
	

		
		  if(UniqueResult.contentEquals(getExcelData("serviceEventInvoicedetail", 1,
		  0)) && LOBResult.contentEquals(getExcelData("serviceEventInvoicedetail", 1,
		  1)) && DORResult.contentEquals(getExcelData("serviceEventInvoicedetail", 1,
		  2)) && DOAResult.contentEquals(getExcelData("serviceEventInvoicedetail", 1,
		  3)) && LocationResult.contentEquals(getExcelData("serviceEventInvoicedetail",
		  2, 5)) &&
		  StatusResult.contentEquals(getExcelData("serviceEventInvoicedetail", 1, 7)))
		  { extenttestCase.log(Status.PASS, "Got Expected Result in Services Listing");
		  }
		  
		  else { extenttestCase.log(Status.FAIL,
		  "Not Getting Expected Result in Services Listing"); }
		 
	}


  @Test(priority = 3) public void GoToDetail() throws InterruptedException,
  IOException {
  
  extenttestCase.log(Status.INFO,"Verifying Details Page Redirection");
  PageFactory.initElements(driver,
  Services_EventInvoice_Detail_Page_Objects.class); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.DetailAction.click();
  Thread.sleep(2000);
  
  String DetailLabel =
  Services_EventInvoice_Detail_Page_Objects.DetailLabel.getText();
  
  if(DetailLabel.contains("Service Details")) { extenttestCase.log(Status.PASS,
  "Service Detail Page Redirected Successfully"); } else {
  extenttestCase.log(Status.FAIL, "Service Detail Page Redirection Failed"); }
  TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
  screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
  File("ServiceEventInvoiceDetail.png"); FileHandler.copy(sourceFile,
  destinationFile);
  extenttestCase.addScreenCaptureFromPath("ServiceEventInvoiceDetail.png");
  
  }
  
  @Test(priority = 4) public void VerifyExpand() throws InterruptedException {
  extenttestCase.log(Status.
  INFO,"Verifying Expand and Collapse Functionality in Services Details");
  Services_EventInvoice_Detail_Page_Objects.Detailsheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Detailsheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.InvoiceLineItemheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.InvoiceLineItemheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.InvoiceAdjustheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.InvoiceAdjustheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.PaymentLineItemheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.PaymentLineItemheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.PaymentAdjustheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.PaymentAdjustheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AuditHistoryheader.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AuditHistoryheader.click();
  Thread.sleep(2000); }
  
  @Test(priority = 5) public void VerifySearch() throws Throwable {
  extenttestCase.log(Status.INFO,"Verifying Search Field with Invalid Value");
  Services_EventInvoice_Detail_Page_Objects.SearchInvoiceItemCode.sendKeys(
  getExcelData("serviceEventInvoicedetail", 5, 0)); Thread.sleep(2000); String
  actualresult =
  Services_EventInvoice_Detail_Page_Objects.SearchResultInvoiceItemCode.getText
  ();
  
  if(actualresult.contentEquals("No data found")) {
  extenttestCase.log(Status.PASS,
  "Invalid Search Validation Done Successfully"); } else {
  extenttestCase.log(Status.FAIL, "Invalid Search Validation Failed");
  
  }
  
  Services_EventInvoice_Detail_Page_Objects.SearchInvoiceItemCode.clear();
  
  Services_EventInvoice_Detail_Page_Objects.SearchInvoiceItemCode.sendKeys(
  getExcelData("serviceEventInvoicedetail", 5, 1));
  
  String actualvalue1 =
  Services_EventInvoice_Detail_Page_Objects.SearchValueResultInvoiceItemCode.
  getText();
  
  if(actualvalue1.contentEquals(getExcelData("serviceEventInvoicedetail", 5,
  1))) { extenttestCase.log(Status.PASS,
  "Valid Search Validation Done Successfully"); } else {
  extenttestCase.log(Status.FAIL, "Valid Search Validation Failed"); }
  
  Services_EventInvoice_Detail_Page_Objects.SearchInvoiceItemCode.clear();
  
  }
  
  @Test(priority = 6) public void AddAdjustValidation() throws Throwable {
  extenttestCase.log(Status.INFO,"Verifying Validation in Add Adjust Popup");
  Services_EventInvoice_Detail_Page_Objects.AdjustAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.CancelAdjustAction.click();
	Thread.sleep(2000);
	Services_EventInvoice_Detail_Page_Objects.AdjustAction.click();
	Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Codepopup.clear();
  Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.Codepopup.sendKeys(getExcelData("serviceAppInvoicedetail", 5, 7));
	Thread.sleep(2000);
	
	Services_EventInvoice_Detail_Page_Objects.QTYpopup.click();
	Thread.sleep(2000);
	
	String InvalidWarn = Services_EventInvoice_Detail_Page_Objects.InvalidWarn.getText();
	Thread.sleep(2000);
	
	if(InvalidWarn.contains("No approved client pricing schedule found for"))
	{
		  extenttestCase.log(Status.PASS, "Invalid Code Search Got Validated");
		  } 
	else
		  { 
		extenttestCase.log(Status.FAIL, "Invalid Code Search Validation Failed");
		}
  
	Services_EventInvoice_Detail_Page_Objects.Codepopup.clear();
	  Thread.sleep(2000);
	
  boolean savepopup =
  Services_EventInvoice_Detail_Page_Objects.SavePopup.isEnabled();
  
  if(savepopup=true) { extenttestCase.log(Status.PASS,
  "Save Button disabled and Got Expected Result"); }
  
  else { extenttestCase.log(Status.FAIL,
  "Save Button enabled and Not Getting Expected Result"); } 
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Typepopup.sendKeys(getExcelData(
  "serviceEventInvoicedetail", 5, 2)); 
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Codepopup.clear();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
  "serviceEventInvoicedetail", 5, 3)); 
  Thread.sleep(3000);
  Services_EventInvoice_Detail_Page_Objects.QTYpopup.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.QTYpopup.clear();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  
  String validation1 =
  Services_EventInvoice_Detail_Page_Objects.Warn1.getText();
 
  
  String validation2 =
  Services_EventInvoice_Detail_Page_Objects.Warn2.getText();

  
  if(validation1.contentEquals("Please enter Quantity") &&
  validation2.contentEquals("Please select Adjustment Code")) {
  extenttestCase.log(Status.PASS, "Validation Done in Adjustment Popup"); }
  else { extenttestCase.log(Status.FAIL,
  "Validation Not Done in Adjustment Popup"); }
  
  }
  
  @Test(priority = 7) public void AddAdjustByIcon() throws Throwable {
  extenttestCase.log(Status.INFO,"Adding Adjustment By Icon");
  Services_EventInvoice_Detail_Page_Objects.QTYpopup.sendKeys(getExcelData(
  "serviceEventInvoicedetail", 5, 4)); 
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AdjustCodepopup.sendKeys(
  getExcelData("serviceEventInvoicedetail", 5, 5)); 
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.No.click();
	Thread.sleep(2000);
	Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
	Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Accepttwo.click();
  Thread.sleep(2000);
  
  }
  
  @Test(priority = 8) public void Searchvalidation() throws Throwable {
  extenttestCase.log(Status.INFO,"Search Validation in Adjustment");
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.
  sendKeys(getExcelData("serviceEventInvoicedetail", 5, 0));
  Thread.sleep(2000); String actualresult =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchResultInvoiceItemCode.
  getText();
  
  if(actualresult.contentEquals("No data found")) {
  extenttestCase.log(Status.PASS,
  "Invalid Search Validation Done Successfully in Adjustment Menu"); } else {
  extenttestCase.log(Status.FAIL,
  "Invalid Search Validation Failed in Adjustment Menu");
  
  }
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
  ; Thread.sleep(2000); }
  
  @Test(priority = 9) public void SearchValidRecord() throws Throwable {
  extenttestCase.log(Status.INFO,"Search Added Record in Adjustment");
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.
  sendKeys(getExcelData("serviceEventInvoicedetail", 5, 1));
  
  String AdjustSearchValueResultType =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultType.getText
  (); 
  
  String AdjustSearchValueResultCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultCode.getText
  (); 
  
  String AdjustSearchValueResultQTY =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultQTY.getText(
  ); 
  
  String AdjustSearchValueResultAdjCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultAdjCode.
  getText(); 
  
  if(AdjustSearchValueResultType.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 2)) && AdjustSearchValueResultCode.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 3))
		  && AdjustSearchValueResultQTY.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 4)) && AdjustSearchValueResultAdjCode.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 5)))
  {
	  extenttestCase.log(Status.PASS,"Got Expected Result"); 
  }
  
  else
  {
	  extenttestCase.log(Status.FAIL,"Not Getting Expected Result");   
  }
	  
  }
  
  @Test(priority = 10) public void EditAdjustment() throws Throwable {
  extenttestCase.log(Status.INFO,"Edit Added Record in Adjustment");
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.EditAction.click();
  Thread.sleep(2000);
  
	/*
	 * Services_EventInvoice_Detail_Page_Objects.AdjustCodepopup.clear();
	 * Thread.sleep(2000);
	 */
  
  Services_EventInvoice_Detail_Page_Objects.AdjustCodepopup.sendKeys(
  getExcelData("serviceEventInvoicedetail", 5, 6)); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.No.click();
	Thread.sleep(2000);
	
	Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
	Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.Accepttwo.click();
  Thread.sleep(2000);
  
  extenttestCase.log(Status.PASS, "Record Edited Successfully");
  
  
	
	/*
	 * Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
	 * ; Thread.sleep(2000);
	 */
	 
  
  }
  
  @Test(enabled = false) public void editedAdjustment() throws Throwable {
  extenttestCase.log(Status.INFO,"Verifying Edited Record in Adjustment");
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
  ;
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.
  sendKeys(getExcelData("serviceEventInvoicedetail", 5, 1));
  
  String AdjustSearchValueResultType =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultType.getText
  (); 
  
  String AdjustSearchValueResultCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultCode.getText
  (); 
  
  String AdjustSearchValueResultQTY =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultQTY.getText(
  ); 
  
  String AdjustSearchValueResultAdjCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultAdjCode.
  getText(); 
  
  if(AdjustSearchValueResultType.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 2)) && AdjustSearchValueResultCode.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 3))
		  && AdjustSearchValueResultQTY.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 4)) && AdjustSearchValueResultAdjCode.contentEquals(getExcelData("serviceEventInvoicedetail", 5, 6)))
  {
	  extenttestCase.log(Status.PASS,"Got Expected Result"); 
  }
  
  else
  {
	  extenttestCase.log(Status.FAIL,"Not Getting Expected Result");   
  }
  
  }
  
  @Test(priority = 11) public void DeleteAdjust() throws Throwable {
  extenttestCase.log(Status.INFO,"Verifying Delete Record in Adjustment");
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.DeleteAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.No.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.DeleteAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AcceptDeleteAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
  ; Thread.sleep(2000);
  
  extenttestCase.log(Status.PASS, "Record Deleted Successfully");
	
  }
  
  @Test(priority = 12) public void AddAdjustByButton() throws
  InterruptedException {
  extenttestCase.log(Status.INFO,"Adding Adjustment By Button");
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AddAdjustAction.click(); 
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.CancelAddAdjustAction.click(); 
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AddAdjustAction.click(); 
  
  
  }
  
  @Test(priority = 13) public void AddAdjustButtonValidation() throws Throwable
  { extenttestCase.log(Status.
  INFO,"Verifying Validation in Add Adjust Button Popup"); Thread.sleep(2000);
  boolean savepopup =
  Services_EventInvoice_Detail_Page_Objects.SavePopup.isEnabled();
  
  if(savepopup=true) { extenttestCase.log(Status.PASS,
  "Save Button disabled and Got Expected Result"); }
  
  else { extenttestCase.log(Status.FAIL,
  "Save Button enabled and Not Getting Expected Result"); } Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Typepopup.sendKeys(getExcelData(
  "serviceEventInvoicedetail", 8, 2)); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
  "serviceEventInvoicedetail", 8, 3)); Thread.sleep(3000);
  Services_EventInvoice_Detail_Page_Objects.QTYpopup.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.QTYpopup.clear();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  
  String Warning1 = Services_EventInvoice_Detail_Page_Objects.Warn1.getText();

  
  String Warning2 = Services_EventInvoice_Detail_Page_Objects.Warn2.getText();
  
  
  if(Warning1.contentEquals("Please enter Quantity") &&
  Warning2.contentEquals("Please select Adjustment Code")) {
  extenttestCase.log(Status.PASS, "Validation Done in Adjustment Popup"); }
  else { extenttestCase.log(Status.FAIL,
  "Validation Not Done in Adjustment Popup"); } }
  
  @Test(priority = 14) public void AddNewAdjust() throws Throwable {
  extenttestCase.log(Status.INFO,"Adding Adjustment By Icon");
  Services_EventInvoice_Detail_Page_Objects.QTYpopup.sendKeys(getExcelData(
  "serviceEventInvoicedetail", 8, 4)); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AdjustCodepopup.sendKeys(
  getExcelData("serviceEventInvoicedetail", 8, 5)); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.No.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.Accepttwo.click();
  Thread.sleep(2000); }
  
  @Test(priority = 15) public void SearchWithInvalidAdjust() throws Throwable {
  extenttestCase.log(Status.
  INFO,"Search Validation with invalid search in Adjustment");
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.
  sendKeys(getExcelData("serviceEventInvoicedetail", 8, 0));
  Thread.sleep(2000); String actualresult1 =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchResultInvoiceItemCode.
  getText();
  
  if(actualresult1.contentEquals("No data found")) {
  extenttestCase.log(Status.PASS,
  "Invalid Search Validation Done Successfully in Adjustment Menu"); } else {
  extenttestCase.log(Status.FAIL,
  "Invalid Search Validation Failed in Adjustment Menu");
  
  }
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
  ; Thread.sleep(2000); }
  
  @Test(enabled = false) public void SearchwithValidNewAdjust() throws Throwable
  { extenttestCase.log(Status.INFO,"Search Added Record in Adjustment");
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.
  sendKeys(getExcelData("serviceEventInvoicedetail", 8, 1));
  
  String AdjustSearchValueResultType =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultType.getText
  ();
  
  String AdjustSearchValueResultCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultCode.getText
  (); 
  
  String AdjustSearchValueResultQTY =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultQTY.getText(
  ); 
  
  String AdjustSearchValueResultAdjCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultAdjCode.
  getText(); 
  
  if(AdjustSearchValueResultType.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 2)) && AdjustSearchValueResultCode.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 3))
		  && AdjustSearchValueResultQTY.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 4)) && AdjustSearchValueResultAdjCode.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 5)))
  {
	  extenttestCase.log(Status.PASS,"Got Expected Result"); 
  }
  
  else
  {
	  extenttestCase.log(Status.FAIL,"Not Getting Expected Result");   
  }
  
  }
  
  @Test(priority = 16) public void EditNewAdjustment() throws Throwable {
  extenttestCase.log(Status.INFO,"Edit Added New Record in Adjustment");
  Services_EventInvoice_Detail_Page_Objects.EditAction.click();
  Thread.sleep(2000);
  
	/*
	 * Services_EventInvoice_Detail_Page_Objects.AdjustCodepopup.clear();
	 * Thread.sleep(2000);
	 */
  
  Services_EventInvoice_Detail_Page_Objects.AdjustCodepopup.sendKeys(
  getExcelData("serviceEventInvoicedetail", 8, 6)); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.No.click();
  Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.SavePopup.click();
  Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.Accepttwo.click();
  Thread.sleep(2000);
  
  extenttestCase.log(Status.PASS, "Record Edited Successfully");

  
  
	/*
	 * Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
	 * ;
	 */
  
  }
  
  @Test(enabled = false) public void editedNewAdjustment() throws Throwable {
  extenttestCase.log(Status.INFO,"Verifying Edited New Record in Adjustment");
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
  ;
  
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.
  sendKeys(getExcelData("serviceEventInvoicedetail", 8, 1));
  
  String AdjustSearchValueResultType =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultType.getText
  (); 
  
  String AdjustSearchValueResultCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultCode.getText
  (); 
  
  String AdjustSearchValueResultQTY =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultQTY.getText(
  ); 
  
  String AdjustSearchValueResultAdjCode =
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchValueResultAdjCode.
  getText(); 
  
  if(AdjustSearchValueResultType.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 2)) && AdjustSearchValueResultCode.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 3))
		  && AdjustSearchValueResultQTY.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 4)) && AdjustSearchValueResultAdjCode.contentEquals(getExcelData("serviceEventInvoicedetail", 8, 6)))
  {
	  extenttestCase.log(Status.PASS,"Got Expected Result"); 
  }
  
  else
  {
	  extenttestCase.log(Status.FAIL,"Not Getting Expected Result");   
  }
  
  }
  
  @Test(priority = 17) public void DeleteNewAdjust() throws Throwable {
  extenttestCase.log(Status.INFO,"Verifying Delete New Record in Adjustment");
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.DeleteAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.No.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.DeleteAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AcceptDeleteAction.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.AdjustSearchInvoiceItemCode.clear()
  ; Thread.sleep(2000);
  
  extenttestCase.log(Status.PASS, "Record Deleted Successfully");
	
	 }
  
  @Test(priority = 18) public void sortAdjustmenu() throws InterruptedException
  { extenttestCase.log(Status.
  INFO,"Verifying Sort Functionality for Adjustment Menu"); Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustType.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustCode.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustQTY.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustUnitPrice.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustTotalPrice.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustCodeName.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustReason.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortAdjustClient.click();
  Thread.sleep(2000); }
  
  @Test(priority = 19) public void sortInvoiceLine() throws
  InterruptedException { extenttestCase.log(Status.
  INFO,"Verifying Sort Functionality for Invoice Line Item");
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortType.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortCode.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortDescription.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortQTY.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortUnitPrice.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortTotalPrice.click();
  Thread.sleep(2000);
  Services_EventInvoice_Detail_Page_Objects.SortClientInvoice.click();
  Thread.sleep(2000); }
  
  
  @Test(priority = 20) public void VerifyViewall() throws InterruptedException
  { extenttestCase.log(Status.INFO,
  "Verifying View All Link in Audit History"); Thread.sleep(2000);
  
  Services_EventInvoice_Detail_Page_Objects.CDViewall.click(); String
  mainwindow = driver.getWindowHandle(); Thread.sleep(2000); Set<String>
  handles =driver.getWindowHandles(); for (String handle : handles) {
  if(!handle.equals(mainwindow)) { driver.switchTo().window(handle);
  System.out.println(driver.getCurrentUrl().toString());
  extenttestCase.log(Status.PASS, "View All Link Verified in Audit History");
  driver.close(); } driver.switchTo().window(mainwindow); } }
  
  @Test(priority = 21) public void canceldetail() throws InterruptedException {
  extenttestCase.log(Status.INFO,"Verifying Cancel");
  Services_EventInvoice_Detail_Page_Objects.Cancel.click(); Thread.sleep(2000);
  } 
 
}
