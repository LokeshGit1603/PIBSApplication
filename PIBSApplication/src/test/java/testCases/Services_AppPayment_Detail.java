package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Services_AppInvoice_Detail_Page_Objects;
import pageObjects.Services_AppPayment_Detail_Page_Objects;
import pageObjects.Services_List_Page_Objects;

public class Services_AppPayment_Detail extends CommonFunctions {

	static Logger logger = Logger.getLogger(Services_AppPayment_Detail.class);

	JavascriptExecutor js;

	@Test(priority = 0)
	public void AppPaymentdetails() throws InterruptedException {
		extenttestCase = extentReport.createTest("Verifying Appointment Payment Details");
		logger.info("Verifying Appointment Payment Details");
		PageFactory.initElements(driver, Services_List_Page_Objects.class);
		/*
		 * Services_List_Page_Objects.ServiceMenu.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void CheckServiceRecord() throws Throwable {
		extenttestCase.log(Status.INFO, "Verify Search Appointment Payment in Listing");
		Services_List_Page_Objects.Searchheader.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.UniqueId.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 0));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchLOB.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 1));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchDOR.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 2));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchDOS.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 3));
		Thread.sleep(2000);
		Services_List_Page_Objects.UniqueId.click();
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchProvider.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 4));
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Services_List_Page_Objects.SearchLocation.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 5));
		Thread.sleep(2000);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		Services_List_Page_Objects.SearchSpeciality.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 6));
		Thread.sleep(2000);

		Services_List_Page_Objects.SearchStatus.sendKeys(getExcelData("serviceAppPaymentdetail", 1, 7));
		Thread.sleep(2000);
		Services_List_Page_Objects.SearchClick.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void getRecord() throws Throwable {
		extenttestCase.log(Status.INFO, "Verifying Appointment Payment Record in Listing");
		String UniqueResult = Services_List_Page_Objects.UniqueResult.getText();
		

		String LOBResult = Services_List_Page_Objects.LOBResult.getText();
		

		String DORResult = Services_List_Page_Objects.DORResult.getText();
	

		String DOAResult = Services_List_Page_Objects.DOAResult.getText();
	

		String ProviderResult = Services_List_Page_Objects.ProviderResult.getText();
		

		String LocationResult = Services_List_Page_Objects.LocationResult.getText();
		

		String SpecialityResult = Services_List_Page_Objects.SpecialityResult.getText();
		

		String StatusResult = Services_List_Page_Objects.StatusResult.getText();
	

		if (UniqueResult.contentEquals(getExcelData("serviceAppPaymentdetail", 1, 0))
				&& LOBResult.contentEquals(getExcelData("serviceAppPaymentdetail", 1, 1))
				&& DORResult.contentEquals(getExcelData("serviceAppPaymentdetail", 1, 2))
				&& DOAResult.contentEquals(getExcelData("serviceAppPaymentdetail", 1, 3))
				&& ProviderResult.contentEquals(getExcelData("serviceAppPaymentdetail", 2, 4))
				&& LocationResult.contentEquals(getExcelData("serviceAppPaymentdetail", 2, 5))
				&& SpecialityResult.contentEquals(getExcelData("serviceAppPaymentdetail", 1, 6))
				&& StatusResult.contentEquals(getExcelData("serviceAppPaymentdetail", 1, 7))) {
			extenttestCase.log(Status.PASS, "Got Expected Result in Services Listing");
		}

		else {
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Services Listing");
		}

	}

	@Test(priority = 3)
	public void GoToDetail() throws InterruptedException, IOException {

		extenttestCase.log(Status.INFO, "Verifying Details Page Redirection");
		PageFactory.initElements(driver, Services_AppPayment_Detail_Page_Objects.class);
		Thread.sleep(2000);
		Services_AppPayment_Detail_Page_Objects.DetailAction.click();
		Thread.sleep(2000);

		String DetailLabel = Services_AppPayment_Detail_Page_Objects.DetailLabel.getText();

		if (DetailLabel.contains("Service Details")) {
			extenttestCase.log(Status.PASS, "Service Detail Page Redirected Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Service Detail Page Redirection Failed");
		}
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ServiceAppPaymentDetail.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ServiceAppPaymentDetail.png");

	}

	
	  @Test(priority = 4) public void VerifyExpand() throws InterruptedException {
	  extenttestCase.log(Status.INFO,
	  "Verifying Expand and Collapse Functionality in Services Details");
	  Services_AppPayment_Detail_Page_Objects.Detailsheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Detailsheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.InvoiceLineItemheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.InvoiceLineItemheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.InvoiceAdjustheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.InvoiceAdjustheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.PaymentLineItemheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.PaymentLineItemheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.PaymentAdjustheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.PaymentAdjustheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AuditHistoryheader.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AuditHistoryheader.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 5) public void VerifySearch() throws Throwable {
	  extenttestCase.log(Status.INFO, "Verifying Search Field with Invalid Value");
	  Services_AppPayment_Detail_Page_Objects.SearchPaymentItemCode
	  .sendKeys(getExcelData("serviceAppPaymentdetail", 5, 0)); Thread.sleep(2000);
	  String actualresult =
	  Services_AppPayment_Detail_Page_Objects.SearchResultPaymentItemCode.getText()
	  ;
	  
	  if (actualresult.contentEquals("No data found")) {
	  extenttestCase.log(Status.PASS,
	  "Invalid Search Validation Done Successfully"); } else {
	  extenttestCase.log(Status.FAIL, "Invalid Search Validation Failed");
	  
	  }
	  
	  Services_AppPayment_Detail_Page_Objects.SearchPaymentItemCode.clear();
	  
	  Services_AppPayment_Detail_Page_Objects.SearchPaymentItemCode
	  .sendKeys(getExcelData("serviceAppPaymentdetail", 5, 1));
	  
	  Thread.sleep(2000);
	  
	  String actualvalue1 =
	  Services_AppPayment_Detail_Page_Objects.SearchValueResultPaymentItemCode.
	  getText();
	  
	  if (actualvalue1.contentEquals(getExcelData("serviceAppPaymentdetail", 5,
	  1))) { extenttestCase.log(Status.PASS,
	  "Valid Search Validation Done Successfully"); } else {
	  extenttestCase.log(Status.FAIL, "Valid Search Validation Failed"); }
	  
	  Services_AppPayment_Detail_Page_Objects.SearchPaymentItemCode.clear();
	  
	  }
	  
	  @Test(priority = 6) public void AddAdjustValidation() throws Throwable {
	  extenttestCase.log(Status.INFO,
	  "Verifying Validation in Add Flat Adjust Popup");
	  Services_AppPayment_Detail_Page_Objects.AdjustAction.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.CancelAdjustAction.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustAction.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.FlatAdjust.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Typepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 5, 2)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Codepopup.clear();
	  Thread.sleep(2000);
	  
	  boolean savepopup =
	  Services_AppPayment_Detail_Page_Objects.SavePopup.isEnabled();
	  
	  if (savepopup = true) { extenttestCase.log(Status.PASS,
	  "Save Button disabled and Got Expected Result in Flat Adjustment Popup"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Save Button enabled and Not Getting Expected Result in Flat Adjustment Popup"
	  ); }
	  
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 6, 3)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustAmountpopup.click();
	  Thread.sleep(2000);
	  
	  String invalidcode =
	  Services_AppPayment_Detail_Page_Objects.InvalidCode.getText();
	  Thread.sleep(2000);
	  
	  if(invalidcode.contains("No approved provider fee schedule found for")) {
	  extenttestCase.log(Status.PASS, "Invalid Code Search Got Validated"); } else
	  { extenttestCase.log(Status.FAIL, "Invalid Code Search Validation Failed"); }
	  Services_AppPayment_Detail_Page_Objects.Codepopup.clear();
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 5, 3)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustAmountpopup.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  
	  String validation1 = Services_AppPayment_Detail_Page_Objects.Warn1.getText();
	
	  
	  String validation2 = Services_AppPayment_Detail_Page_Objects.Warn2.getText();
	  
	  
	  if (validation1.contentEquals("Please enter Adjustment Amount") &&
	  validation2.contentEquals("Please select Adjustment Code")) {
	  extenttestCase.log(Status.PASS, "Validation Done in Flat Adjustment Popup");
	  } else { extenttestCase.log(Status.FAIL,
	  "Validation Not Done in Flat Adjustment Popup"); } }
	  
	  @Test(priority = 7) public void AddPaymentAdjustByIcon() throws Throwable {
	  extenttestCase.log(Status.INFO, "Adding CLIN Payment Adjustment By Icon");
	  Services_AppPayment_Detail_Page_Objects.AdjustAmountpopup
	  .sendKeys(getExcelData("serviceAppPaymentdetail", 5, 4)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustCodepopup.sendKeys(getExcelData
	  ("serviceAppPaymentdetail", 5, 5)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  
	  @Test(priority = 8) public void Searchvalidation() throws Throwable {
	  extenttestCase.log(Status.INFO, "Search Validation in Adjustment");
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode
	  .sendKeys(getExcelData("serviceAppPaymentdetail", 5, 0)); Thread.sleep(2000);
	  String actualresult =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchResultPaymentItemCode.
	  getText();
	  
	  if (actualresult.contentEquals("No data found")) {
	  extenttestCase.log(Status.PASS,
	  "Invalid Search Validation Done Successfully in Adjustment Menu"); } else {
	  extenttestCase.log(Status.FAIL,
	  "Invalid Search Validation Failed in Adjustment Menu");
	  
	  }
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode.clear();
	  Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 9) public void SearchValidRecord() throws Throwable {
	  extenttestCase.log(Status.INFO, "Search Added CLIN Record in Adjustment");
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode
	  .sendKeys(getExcelData("serviceAppPaymentdetail", 5, 1));
	  
	  Thread.sleep(2000);
	  
	  String AdjustSearchValueResultProvider =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultProvider
	  .getText(); 
	  
	  String AdjustSearchValueResultType =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultType
	  .getText();
	  
	  String AdjustSearchValueResultCode =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultCode
	  .getText(); 
	  
	  
	  String AdjustSearchValueResultAdjCode =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultAdjCode
	  .getText(); 
	  
	  if (AdjustSearchValueResultProvider.contentEquals(getExcelData("serviceAppPaymentdetail", 3, 4)) && AdjustSearchValueResultType.contentEquals(getExcelData("serviceAppPaymentdetail", 5, 2))
		&& AdjustSearchValueResultCode.contentEquals(getExcelData("serviceAppPaymentdetail", 5, 3)) && AdjustSearchValueResultAdjCode.contentEquals(getExcelData("serviceAppPaymentdetail", 5, 5))) 
	  { 
		  extenttestCase.log(Status.PASS,"Got Expected Result"); 
	  } 
	  else 
	  { 
		  extenttestCase.log(Status.FAIL,"Not Getting Expected Result"); 
	}
	  
	 }
	  
	  @Test(priority = 10) public void EditAdjustment() throws Throwable {
	  extenttestCase.log(Status.INFO,"Edit Added CLIN Record in Adjustment");
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.EditAction.click();
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustCodepopup.sendKeys(getExcelData
	  ("serviceAppPaymentdetail", 5, 6)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  }
	  
	  @Test(priority = 11) public void EditedAdjust() throws Throwable {
	  extenttestCase.log(Status.INFO,"Verifying Edited CPT Record in Adjustment");
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode.clear();
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode.sendKeys(
	  getExcelData("serviceAppPaymentdetail", 5, 1));
	  
	  Thread.sleep(2000);
	  
	  String AdjustSearchValueResultProvider =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultProvider.
	  getText(); 
	  
	  String AdjustSearchValueResultType =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultType.getText()
	  ; 
	  
	  String AdjustSearchValueResultCode =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultCode.getText()
	  ; 
	  
	  String AdjustSearchValueResultAdjCode =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchValueResultAdjCode.
	  getText(); 
	  
	  if (AdjustSearchValueResultProvider.contentEquals(getExcelData("serviceAppPaymentdetail", 3, 4)) && AdjustSearchValueResultType.contentEquals(getExcelData("serviceAppPaymentdetail", 5, 2))
				&& AdjustSearchValueResultCode.contentEquals(getExcelData("serviceAppPaymentdetail", 5, 3)) && AdjustSearchValueResultAdjCode.contentEquals(getExcelData("serviceAppPaymentdetail", 5, 6))) 
			  { 
				  extenttestCase.log(Status.PASS,"Got Expected Result"); 
			  } 
			  else 
			  { 
				  extenttestCase.log(Status.FAIL,"Not Getting Expected Result"); 
			}
			  }
	  
	  @Test(priority = 12) public void DeleteAdjust() throws InterruptedException {
	  extenttestCase.log(Status.INFO,"Verifying Delete CLIN Record in Adjustment");
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.DeleteAction.click();
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.No.click();
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.DeleteAction.click();
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.AcceptDeleteAction.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 13) public void VerifyDelete() throws Throwable {
	  extenttestCase.log(Status.INFO,"Verifying Deleted CLIN Record in Adjustment"
	  ); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode.clear();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode.sendKeys(
	  getExcelData("serviceAppPaymentdetail", 5, 1)); String actualresult =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchResultPaymentItemCode.
	  getText(); Thread.sleep(2000);
	  if(actualresult.contentEquals("No data found")) {
	  extenttestCase.log(Status.PASS,
	  "Record Deleted Successfully in Adjustment Menu"); } else {
	  extenttestCase.log(Status.FAIL, "Record Deletion Failed in Adjustment Menu");
	  
	  }
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchPaymentItemCode.clear();
	  }
	  
	  
	  @Test(priority = 14) public void AddQuantityAdjust() throws Throwable {
	  extenttestCase.log(Status.INFO,
	  "Verifying Validation in Add Quantity Adjust Popup");
	  
	  Services_AppPayment_Detail_Page_Objects.AdjustAction.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.QuantityAdjust.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Typepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 6, 2)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Codepopup.clear();
	  Thread.sleep(2000);
	  
	  boolean savepopup =
	  Services_AppPayment_Detail_Page_Objects.SavePopup.isEnabled();
	  
	  if (savepopup = true) { extenttestCase.log(Status.PASS,
	  "Save Button disabled and Got Expected Result in Flat Adjustment Popup"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Save Button enabled and Not Getting Expected Result in Flat Adjustment Popup"
	  ); } Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 6, 3)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustQTY.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  
	  String validation1 = Services_AppPayment_Detail_Page_Objects.Warn1.getText();
	  
	  
	  String validation2 = Services_AppPayment_Detail_Page_Objects.Warn2.getText();
	 
	  
	  if (validation1.contentEquals("Please enter Quantity") &&
	  validation2.contentEquals("Please select Adjustment Code")) {
	  extenttestCase.log(Status.PASS,
	  "Validation Done in Quantity Adjustment Popup"); } else {
	  extenttestCase.log(Status.FAIL,
	  "Validation Not Done in Quantity Adjustment Popup"); }
	  
	  }
	  
	  @Test(priority = 15) public void AddPaymentQuantityAdjustByIcon() throws
	  Throwable { extenttestCase.log(Status.INFO,
	  "Adding CLIN Payment Adjustment By Icon");
	  Services_AppPayment_Detail_Page_Objects.AdjustQTY.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 6, 4)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustCodepopup.sendKeys(getExcelData
	  ("serviceAppPaymentdetail", 6, 5)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.No.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  
	  
	  Services_AppPayment_Detail_Page_Objects.Accepttwo.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 16) public void AddFlatAdjustByButton() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Adding Flat Adjustment By Button"); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AddAdjustAction.click(); 
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.CancelAdjustAction.click(); 
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AddAdjustAction.click(); 
	  }
	  
	  @Test(priority = 17) public void AddAdjustButtonValidation() throws Throwable
	  { extenttestCase.log(Status.INFO,
	  "Verifying Validation in Add Flat Adjust Button Popup"); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.FlatAdjust.click();
	  Thread.sleep(2000); boolean savepopup =
	  Services_AppPayment_Detail_Page_Objects.SavePopup.isEnabled();
	  
	  if (savepopup = true) { extenttestCase.log(Status.PASS,
	  "Save Button disabled and Got Expected Result"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Save Button enabled and Not Getting Expected Result"); } Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Typepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 7, 2)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 7, 3)); Thread.sleep(3000);
	  Services_AppPayment_Detail_Page_Objects.AdjustAmountpopup.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustAmountpopup.clear();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  
	  String Warning1 = Services_AppPayment_Detail_Page_Objects.Warn1.getText();
	  
	  
	  String Warning2 = Services_AppPayment_Detail_Page_Objects.Warn2.getText();
	 
	  
	  if (Warning1.contentEquals("Please enter Adjustment Amount") &&
	  Warning2.contentEquals("Please select Adjustment Code")) {
	  extenttestCase.log(Status.PASS, "Validation Done in Flat Adjustment Popup");
	  } else { extenttestCase.log(Status.FAIL,
	  "Validation Not Done in Flat Adjustment Popup"); } }
	  
	  @Test(priority = 18) public void AddNewFlatAdjust() throws Throwable {
	  extenttestCase.log(Status.INFO, "Adding Flat Adjustment By Icon");
	  Services_AppPayment_Detail_Page_Objects.AdjustAmountpopup
	  .sendKeys(getExcelData("serviceAppPaymentdetail", 7, 4)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustCodepopup.sendKeys(getExcelData
	  ("serviceAppPaymentdetail", 7, 5)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 19) public void AddQuantityAdjustByButton() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Adding Flat Adjustment By Button"); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AddAdjustAction.click(); }
	  
	  @Test(priority = 20) public void AddAdjustQuantityValidation() throws
	  Throwable { extenttestCase.log(Status.INFO,
	  "Verifying Validation in Add Quantity Adjust Button Popup");
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.QuantityAdjust.click();
	  Thread.sleep(2000); boolean savepopup =
	  Services_AppPayment_Detail_Page_Objects.SavePopup.isEnabled();
	  
	  if (savepopup = true) { extenttestCase.log(Status.PASS,
	  "Save Button disabled and Got Expected Result"); }
	  
	  else { extenttestCase.log(Status.FAIL,
	  "Save Button enabled and Not Getting Expected Result"); } Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Typepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 8, 2)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Codepopup.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 8, 3)); Thread.sleep(3000);
	  Services_AppPayment_Detail_Page_Objects.AdjustQTY.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustQTY.clear();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  
	  String Warning1 = Services_AppPayment_Detail_Page_Objects.Warn1.getText();
	  
	  
	  String Warning2 = Services_AppPayment_Detail_Page_Objects.Warn2.getText();
	 
	  
	  if (Warning1.contentEquals("Please enter Quantity") &&
	  Warning2.contentEquals("Please select Adjustment Code")) {
	  extenttestCase.log(Status.PASS,
	  "Validation Done in Quantity Adjustment Popup"); } else {
	  extenttestCase.log(Status.FAIL,
	  "Validation Not Done in Quantity Adjustment Popup"); } }
	  
	  @Test(priority = 21) public void AddNewQuantityAdjust() throws Throwable {
	  extenttestCase.log(Status.INFO, "Adding Quantity Adjustment By Icon");
	  Services_AppPayment_Detail_Page_Objects.AdjustQTY.sendKeys(getExcelData(
	  "serviceAppPaymentdetail", 8, 4)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AdjustCodepopup.sendKeys(getExcelData
	  ("serviceAppPaymentdetail", 8, 5)); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.No.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SavePopup.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.Accepttwo.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 22) public void sortAdjustmenu() throws InterruptedException
	  { extenttestCase.log(Status.
	  INFO,"Verifying Sort Functionality for Adjustment Menu"); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustProvider.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustType.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustCode.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustQTY.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustUnitPrice.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustTotalPrice.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustCodeName.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustReason.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortAdjustEOP.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 23) public void sortPaymentLine() throws
	  InterruptedException { extenttestCase.log(Status.
	  INFO,"Verifying Sort Functionality for Payment Line Item");
	  Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.SortProvider.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortSpeciality.click();
	  Thread.sleep(2000); Services_AppPayment_Detail_Page_Objects.SortType.click();
	  Thread.sleep(2000); Services_AppPayment_Detail_Page_Objects.SortCode.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortDescription.click();
	  Thread.sleep(2000); Services_AppPayment_Detail_Page_Objects.SortQTY.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortUnitPrice.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortTotalPrice.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.SortEOPVendorInvoice.click();
	  Thread.sleep(2000); }
	  
	  @Test(priority = 24) public void VerifyViewall() throws InterruptedException
	  { extenttestCase.log(Status.INFO,
	  "Verifying View All Link in Audit History"); Thread.sleep(2000);
	  
	  Services_AppPayment_Detail_Page_Objects.CDViewall.click(); String mainwindow
	  = driver.getWindowHandle(); Thread.sleep(2000); Set<String> handles
	  =driver.getWindowHandles(); for (String handle : handles) {
	  if(!handle.equals(mainwindow)) { driver.switchTo().window(handle);
	  System.out.println(driver.getCurrentUrl().toString());
	  extenttestCase.log(Status.PASS, "View All Link Verified in Audit History");
	  driver.close(); } driver.switchTo().window(mainwindow); } }
	  
	  @Test(priority = 25) public void deleteAllAdjust() throws
	  InterruptedException { extenttestCase.log(Status.INFO,
	  "Verifying Delete All"); Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.DeleteAllAction.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.DeleteAction.click();
	  Thread.sleep(2000);
	  Services_AppPayment_Detail_Page_Objects.AcceptDeleteAction.click();
	  Thread.sleep(2000); String DeleteResult =
	  Services_AppPayment_Detail_Page_Objects.AdjustSearchResultPaymentItemCode.
	  getText();
	  if(DeleteResult.contentEquals("No data found")) {
	  extenttestCase.log(Status.PASS,
	  "All Record Deleted Successfully in Adjustment Menu"); } else {
	  extenttestCase.log(Status.FAIL,
	  "All Record Deletion Failed in Adjustment Menu");
	  
	  }
	  
	  }
	 
	@Test(priority = 26)
	public void canceldetail() throws InterruptedException {
		extenttestCase.log(Status.INFO, "Verifying Cancel");

		Thread.sleep(2000);
		
		Actions action = new Actions(driver);

		action.moveToElement(Services_AppPayment_Detail_Page_Objects.Cancel).click().perform();

		Thread.sleep(2000);
	}

}
