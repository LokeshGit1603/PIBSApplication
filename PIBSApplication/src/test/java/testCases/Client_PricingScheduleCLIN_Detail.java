package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Client_Contract_Details_Page_Objects;
import pageObjects.Client_PricingScheduleCLIN_Detail_Page_Objects;
import pageObjects.Client_PricingSchedule_List_Page_Objects;
import pageObjects.MedicareOWCP_List_Page_Objects;
import pageObjects.Medicare_Detail_Page_Objects;
import pageObjects.OWCP_Detail_Page_Objects;

public class Client_PricingScheduleCLIN_Detail extends CommonFunctions{

	static Logger logger = Logger.getLogger(Client_PricingScheduleCLIN_Detail.class);
	
	@Test(priority = 0)
	public void CPSDetailTC()
	{
		extenttestCase = extentReport.createTest("Verifying Client Pricing Schedule Details");
	}
	

	@Test(priority = 1)
	public void SearchRecord() throws Throwable {
		
		logger.info("Navigating to Client Pricing Schedule list page");


		extenttestCase.log(Status.INFO, "Navigating to Client Pricing Schedule list page");

		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);

		Client_PricingSchedule_List_Page_Objects.CPSSearchheader.click();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSClientId.sendKeys(getExcelData("cpslist", 2, 0));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSClientLob.sendKeys(getExcelData("cpslist", 2, 1));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSClientType.sendKeys(getExcelData("cpslist", 2, 2));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSClientStatus.sendKeys(getExcelData("cpslist", 2, 3));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSStartDate.sendKeys(getExcelData("cpslist", 2, 4));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSEndDate.sendKeys(getExcelData("cpslist", 2, 5));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSActiveDate.clear();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSSearchClick.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, Client_PricingScheduleCLIN_Detail_Page_Objects.class);

		String ClientResult = Client_PricingScheduleCLIN_Detail_Page_Objects.CPSClientResult.getText();

		

		String LobResult = Client_PricingScheduleCLIN_Detail_Page_Objects.CPSLobResult.getText();

		

		String TypeResult = Client_PricingScheduleCLIN_Detail_Page_Objects.CPSTypeResult.getText();

		

		String SDateResult = Client_PricingScheduleCLIN_Detail_Page_Objects.CPSSDateResult.getText();

	

		String EDateResult = Client_PricingScheduleCLIN_Detail_Page_Objects.CPSEDateResult.getText();

		

		String StatusResult = Client_PricingScheduleCLIN_Detail_Page_Objects.CPSStatusResult.getText();

	

		if(ClientResult.contentEquals(getExcelData("cpslist", 2, 0)) && LobResult.contentEquals(getExcelData("cpslist", 2, 1))
				&& TypeResult.contentEquals(getExcelData("cpslist", 2, 2)) && SDateResult.contentEquals(getExcelData("cpslist", 2, 4)) 
				&& EDateResult.contentEquals(getExcelData("cpslist", 2, 5)) && StatusResult.contentEquals(getExcelData("cpslist", 2, 3)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Client Result");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Client in Result");
		}
	}

	@Test(priority = 2)
	public void GoDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSAction.click();
		extenttestCase.log(Status.INFO, "Navigating to Client Pricing Schedule Details page");
	}


	@Test(priority = 3)
	public void CLINExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand Collapse Funcationality");
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSCLINheader.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSCLINheader.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSCLINBillingheader.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSCLINBillingheader.click();
		Thread.sleep(2000);

		extenttestCase.log(Status.INFO, "Expand Collapse Funcationality Verified");

	}

	@Test(priority = 4)
	public void AddBillingClinValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Add Billing Validation Message");
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINAddBill.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CancelNewCLINpopup.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINAddBill.click();
		Thread.sleep(2000);
		
		boolean savepopup = Client_PricingScheduleCLIN_Detail_Page_Objects.SaveNewCLINpopup.isEnabled();

		if(savepopup=true)
		{
			extenttestCase.log(Status.PASS, "Save Button disabled and Got Expected Result");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Save Button enabled and Not Getting Expected Result");
		}
		

		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINCodepopup.sendKeys(getExcelData("cpsdetail", 1, 5));
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINFeepopup.click();
		Thread.sleep(2000);
		
		String InvalidCLINCodeWarn =
				 Client_PricingScheduleCLIN_Detail_Page_Objects.InvalidCLINCodeWarn.getText();
			
				 
				 if(InvalidCLINCodeWarn.contentEquals("Please enter a valid code")) {
				 extenttestCase.log(Status.PASS, "Invalid Code Validation Done Successfully");
				 } else { extenttestCase.log(Status.FAIL, "Invalid Code Validation Failed"); }

					Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINFeepopup.click();
					Thread.sleep(2000);
				 
					Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINCodepopup.clear();
					Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINCodepopup.sendKeys(getExcelData("cpsdetail", 1, 0));
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINFeepopup.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.SaveNewCLINpopup.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.SaveNewCLINpopup.click();
		Thread.sleep(2000);

		String FeeWarn = Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINFeeWarningspopup.getText();
	

		if(FeeWarn.contentEquals("Please enter Fee"))
		{
			extenttestCase.log(Status.PASS, "Fee Validation Done");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Fee Validation Not Done");
		}
		
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINFeepopup.sendKeys(getExcelData("cpsdetail", 1, 1));
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINPrintCodepopup.sendKeys(getExcelData("cpsdetail", 1, 2));
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINPrintDespopup.sendKeys(getExcelData("cpsdetail", 1, 3));
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.SaveNewCLINpopup.click();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void BillclinSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Added Billing Search");
		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.sendKeys(getExcelData("cpsdetail", 1, 2));
		Thread.sleep(2000);

		String ClinResult =	Client_PricingScheduleCLIN_Detail_Page_Objects.BillCLINSearchResult.getText();
		


		if(ClinResult.contentEquals(getExcelData("cpsdetail", 1, 2)))
		{
			extenttestCase.log(Status.PASS, "Got Added Billing Clin Record");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Added Billing Clin Record");
		}

	}

	@Test(priority = 6)
	public void  Editclinbill() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Edit Billing Search");
		Client_PricingScheduleCLIN_Detail_Page_Objects.EditBillCLIN.click();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINPrintCodepopup.clear();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.AddCLINPrintCodepopup.sendKeys(getExcelData("cpsdetail", 2, 2));
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.SaveNewCLINpopup.click();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.clear();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.sendKeys(getExcelData("cpsdetail", 2, 2));
		Thread.sleep(2000);

		String ClinResult =	Client_PricingScheduleCLIN_Detail_Page_Objects.BillCLINSearchResult.getText();
	

		if(ClinResult.contentEquals(getExcelData("cpsdetail", 2, 2)))
		{
			extenttestCase.log(Status.PASS, "Got Edited Billing Clin Record");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Edited Billing Clin Record");
		}

	}

	@Test(priority = 7)
	public void ValidateExcelImport() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Excel Import Functionality");

		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINImportBill.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CancelCLINImportBill.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINImportBill.click();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadImportBill.click();
		Thread.sleep(2000);

		String UploadWarn = Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadWarning.getText();

		Thread.sleep(2000);

		if(UploadWarn.contentEquals("Please select an excel file"))
		{
			extenttestCase.log(Status.PASS, "Upload Excel Got Validated");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Upload Excel Validation");
		}
	}

	@Test(priority = 8)
	public void VerifyDownload() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Download Template Functionality");
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDownloadTemplink.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "Clin Code File is Downloaded");

		/*
		 * File filelocation = new File("C:\\Users\\lokeshwaran_s\\Downloads"); File[]
		 * totalFiles = filelocation.listFiles();
		 * 
		 * for (File file : totalFiles) {
		 * if(file.getName().equalsIgnoreCase("ClinCodes.xlsx")) { Thread.sleep(2000);
		 * extenttestCase.log(Status.PASS, "Clin Code File is Downloaded"); break; }
		 * else { extenttestCase.log(Status.FAIL, "Clin Code File is Not Downloaded"); }
		 * }
		 */
	}


	@Test(priority = 9)
	public void VerifyInvalidUploadTemplate() throws InterruptedException, AWTException
	{
		extenttestCase.log(Status.INFO, "Verifying Invalid Upload Template Functionality");
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadBrowse.click();
		Thread.sleep(2000);
		String file = "D:\\InvalidUploadClinCodes.xlsx";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadImportBill.click();

		String Invalidfilevalidation = Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadValidation.getText();

		if(Invalidfilevalidation.contentEquals("File upload failed, please check if the file has valid data."))
		{
			extenttestCase.log(Status.PASS, "Clin Code File Upload Validation is Done");
		}
	}


	@Test(priority = 10)
	public void VerifyValidUploadTemplate() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Valid Upload Template Functionality");
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadBrowse.click();
		Thread.sleep(2000);

		String validfile = "D:\\ValidUploadClinCodes.xlsx";
		StringSelection validselection = new StringSelection(validfile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validselection, null);
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINUploadImportBill.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.clear();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.sendKeys(getExcelData("cpsdetail", 3, 2));
		Thread.sleep(2000);

		String ClinResult =	Client_PricingScheduleCLIN_Detail_Page_Objects.BillCLINSearchResult.getText();
		

		if(ClinResult.contentEquals(getExcelData("cpsdetail", 3, 2)))
		{
			extenttestCase.log(Status.PASS, "File Successfully Uploaded");
		}
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.clear();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destinationFile = new File("ClientPricingScheduleDetail.png"); 
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ClientPricingScheduleDetail.png");

	}

	@Test(priority = 11)
	public void SortBillingClinCode() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Billing CLIN Code Sorting Funcationality");
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinCode.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinCat.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinType.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinDes.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinPrintCode.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinPrintDes.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.SortClinFee.click();
		Thread.sleep(2000);

	}

	@Test(priority = 12)
	public void deleteuploadedClin() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Delete Billing Funcationality");

		Client_PricingScheduleCLIN_Detail_Page_Objects.DeleteUploadedCLIN.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.DeleteUploadedCLIN.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.AcceptDeleteUploadedCLIN.click();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.clear();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.sendKeys(getExcelData("cpsdetail", 3, 2));
		Thread.sleep(2000);

		String Deletevalidation = 	Client_PricingScheduleCLIN_Detail_Page_Objects.NoDataValidation.getText();

		if(Deletevalidation.contentEquals("No data found"))
		{
			extenttestCase.log(Status.PASS, "File Deleted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "File Deletion Failed");
		}
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.clear();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.SelectDeleteAll.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.Yes.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.BillingCLINSearch.clear();
		Thread.sleep(2000);
		
	}

	@Test(priority = 13)
	public void SaveSatus() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Client Pricing Schedule Details Status");
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailSave.click();
		Thread.sleep(2000);
		String CDetailsStatus = Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Draft"))
		{
			extenttestCase.log(Status.PASS, "Client Pricing Schedule Saved Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Client Pricing Schedule Not Saved Successfully");
		}
	}

	@Test(priority = 14)
	public void SubmitSatus() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Submitting Client Pricing Schedule Details");
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailSubmit.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailSubmit.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailAcceptSubmit.click();
		Thread.sleep(2000);
		String CDetailsStatus = Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Submitted"))
		{
			extenttestCase.log(Status.PASS, "Client Pricing Schedule Submitted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Client Not Submitted Successfully");
		}
	}

	@Test(priority = 15)
	public void RejectStatus() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Rejecting Client Pricing Schedule  Details");
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailReject.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.NoReject.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailReject.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailSaveRejectpop.click();
		Thread.sleep(2000);
		String CDRejectvalidation = Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailNoteWarnRejectpop.getText();
		if(CDRejectvalidation.contains("Please enter the notes"))
		{
			extenttestCase.log(Status.PASS, "Contract Rejection Notes Validated Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Contract Rejection Notes Not Validated Successfully");
		}

		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailNoteDesRejectpop.sendKeys(getExcelData("cpsdetail", 1, 4));
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailSaveRejectpop.click();
		Thread.sleep(2000);
		String CDetailsStatus = Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Rejected"))
		{
			extenttestCase.log(Status.PASS, "Contract Rejected Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Contract Not Rejected Successfully");
		}

		SaveSatus();
	}

	@Test(priority = 16)
	public void AuditHistory() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying View All Link in Audit History");
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);

		Client_PricingScheduleCLIN_Detail_Page_Objects.CDViewall.click(); 
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

	@Test(priority = 17)
	public void CancelStatus()
	{

		extenttestCase.log(Status.INFO, "Cancelling Client Pricing Schedule Details ");

		Client_PricingScheduleCLIN_Detail_Page_Objects.CLINDetailCancel.click();
	}

	@Test(priority = 18)
	public void CloneCreatedRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Cloning the Client Pricing Schedule Detail Record ");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		SearchRecord();

		PageFactory.initElements(driver, Client_PricingScheduleCLIN_Detail_Page_Objects.class);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSClone.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		
		Client_PricingSchedule_List_Page_Objects.SaveAddNew.click();
		Thread.sleep(2000);
		
		String CloneWarn = Client_PricingSchedule_List_Page_Objects.CloneWarn.getText();
		
		
		if(CloneWarn.contentEquals("Client Pricing schedule for the selected date range overlaps with an existing schedule."))
		{
			extenttestCase.log(Status.PASS, "Clone Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Clone Validation Failed");
		}
		
		Client_PricingSchedule_List_Page_Objects.AcceptError.click();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSSDate.clear();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSSDate.sendKeys(getExcelData("cpslist", 2, 7));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSEDate.clear();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSEDate.sendKeys(getExcelData("cpslist", 2, 8));
		Thread.sleep(2000);
		
PageFactory.initElements(driver, Client_PricingScheduleCLIN_Detail_Page_Objects.class);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSCloneCancel.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		SearchRecord();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, Client_PricingScheduleCLIN_Detail_Page_Objects.class);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSClone.click();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSSDate.clear();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSSDate.sendKeys(getExcelData("cpslist", 2, 7));
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSEDate.clear();
		Thread.sleep(2000);

		Client_PricingSchedule_List_Page_Objects.CPSEDate.sendKeys(getExcelData("cpslist", 2, 8));
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSCloneCancel.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.Yes.click();
		Thread.sleep(2000);
		
	}

	@Test(priority = 19)
	public void DeleteMasterRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Deleting Recently Created Client Pricing Schedule Record ");
		Thread.sleep(2000);
		SearchRecord();
		Thread.sleep(2000);
		PageFactory.initElements(driver, Client_PricingScheduleCLIN_Detail_Page_Objects.class);
		Thread.sleep(2000);
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSClinDelete.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSClinDelete.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCLIN_Detail_Page_Objects.CPSClinAcceptDelete.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Thread.sleep(2000);
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result");
		String actualresult  = Client_PricingSchedule_List_Page_Objects.CPSSearchResult.getText();
		Thread.sleep(2000);

		if(actualresult.contains("No data found"))
		{
			logger.info("Verification done. End of Client_Contract_List");

			extenttestCase.log(Status.PASS, "Record Deleted Successfully"); 
		} 
		else
		{ 

			extenttestCase.log(Status.FAIL, "Record Deletion Failed"); 
		}

		logger.info("Verified No Data Found Result"); 
		
		Client_PricingSchedule_List_Page_Objects.CPSClearSearch.click();
		Thread.sleep(2000);
	}

}
