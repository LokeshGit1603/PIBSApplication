package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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

import pageObjects.MedicareOWCP_List_Page_Objects;
import pageObjects.Medicare_Detail_Page_Objects;

public class Medicare_Detail extends CommonFunctions{

	static Logger logger = Logger.getLogger(Medicare_Detail.class);

	@Test(priority = 0)
	public void MedicareDetailTC()
	{
		extenttestCase = extentReport.createTest("Verifying Medicare Factor Schedule Details");
	}

	@Test(priority = 1)
	public void MedicareSearchRecord() throws Throwable {

		logger.info("Navigating to Medicare Factor Schedule Details page");


		extenttestCase.log(Status.INFO, "Navigating to Client Pricing Schedule list page");

		PageFactory.initElements(driver, MedicareOWCP_List_Page_Objects.class);

		MedicareOWCP_List_Page_Objects.MOSearchHeader.click();
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOPricingType.sendKeys(getExcelData("molist", 2, 0));
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOStartDate.sendKeys(getExcelData("molist", 2, 1));
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOEndDate.sendKeys(getExcelData("molist", 2, 2));
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOStatus.sendKeys(getExcelData("molist", 2, 3));
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOActiveDate.clear();
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOPricingType.click();
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOSearchClick.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, Medicare_Detail_Page_Objects.class);

		String TypeResult = Medicare_Detail_Page_Objects.MedicarePTypeResult.getText();

		

		String SDateResult = Medicare_Detail_Page_Objects.MedicareSDateResult.getText();

		

		String EDateResult = Medicare_Detail_Page_Objects.MedicareEDateResult.getText();

		

		String StatusResult = Medicare_Detail_Page_Objects.MedicareStatusResult.getText();

		

		if(TypeResult.contentEquals(getExcelData("molist", 2, 0)) && SDateResult.contentEquals(getExcelData("molist", 2, 1)) 
				&& EDateResult.contentEquals(getExcelData("molist", 2, 2)) && StatusResult.contentEquals(getExcelData("molist", 2, 3)))
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
		Medicare_Detail_Page_Objects.MedicareAction.click();
		extenttestCase.log(Status.INFO, "Navigating to Medicare Factor Schedule Details page");
	}

	@Test(priority = 3)
	public void MedicareExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand Collapse Funcationality");
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.Medicareheader.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.Medicareheader.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareCPTFactorheader.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareCPTFactorheader.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareCPTFactorheader.click();
		Thread.sleep(2000);

		extenttestCase.log(Status.INFO, "Expand Collapse Funcationality Verified");

	}

	@Test(priority = 4)
	public void AddCPTFactorValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Add CPT Factor Validation Message");

		Medicare_Detail_Page_Objects.AddNewCode.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.CancelSaveNewPopup.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.AddNewCode.click();
		Thread.sleep(2000);

		boolean savepopup = Medicare_Detail_Page_Objects.SaveAddNewPopup.isEnabled();

		if(savepopup=true)
		{
			extenttestCase.log(Status.PASS, "Save Button disabled and Got Expected Result");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Save Button enabled and Not Getting Expected Result");
		}

		Medicare_Detail_Page_Objects.MedicareCPTCode.sendKeys(getExcelData("modetail", 1, 6));
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.WFCode.click();
		Thread.sleep(2000);
		
		String MedicareCPTInvalidWarn = Medicare_Detail_Page_Objects.MedicareCPTInvalidWarn.getText();
		
		
		if(MedicareCPTInvalidWarn.contentEquals("Please enter a valid code"))
		{
			extenttestCase.log(Status.PASS, "Invalid Code Validation Done");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Invalid Code Validation Failed");
		}
		
		Medicare_Detail_Page_Objects.MedicareCPTCode.clear();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareCPTCode.sendKeys(getExcelData("modetail", 1, 0));
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
		String validation1 = Medicare_Detail_Page_Objects.Warning1.getText();

		String validation2 = Medicare_Detail_Page_Objects.Warning2.getText();

		String validation3 = Medicare_Detail_Page_Objects.Warning3.getText();

		String validation4 = Medicare_Detail_Page_Objects.Warning4.getText();

		if(validation1.contentEquals("Please enter WF") && validation2.contentEquals("Please enter PF") 
				&& validation3.contentEquals("Please enter MPF") && validation4.contentEquals("Please enter CF"))
		{
			extenttestCase.log(Status.PASS, "Added CPT Factor Validated");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Added CPT Factor Not Validated");
		}

		Medicare_Detail_Page_Objects.WFCode.sendKeys(getExcelData("modetail", 1, 1));
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.PFCode.sendKeys(getExcelData("modetail", 1, 2));
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.MPFCode.sendKeys(getExcelData("modetail", 1, 3));
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.CFCode.sendKeys(getExcelData("modetail", 1, 4));
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void SearchAddedCode() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Added CPT Factor");

		Medicare_Detail_Page_Objects.SearchCode.sendKeys(getExcelData("modetail", 1, 1));
		Thread.sleep(2000);
		
		String actualresult = Medicare_Detail_Page_Objects.WFCodeSearchResult.getText();
		
		if(actualresult.contentEquals(getExcelData("modetail", 1, 1)))
		{
			extenttestCase.log(Status.PASS, "Added CPT Factor Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Added CPT Factor Failed");
		}
		
		/* Medicare_Detail_Page_Objects.SearchCode.clear(); */
	}
	
	@Test(priority = 6)
	public void EditCode() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Edit  CPT Factor");

		Medicare_Detail_Page_Objects.EditCode.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.WFCode.clear();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.WFCode.sendKeys(getExcelData("modetail", 2, 1));
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
		
		 Medicare_Detail_Page_Objects.SearchCode.clear();
		 
		 Medicare_Detail_Page_Objects.SearchCode.sendKeys(getExcelData("modetail", 2, 1));
			Thread.sleep(2000);
		
		String actualresult = Medicare_Detail_Page_Objects.WFCodeSearchResult.getText();
		
		if(actualresult.contentEquals(getExcelData("modetail", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Edit CPT Factor Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Edit CPT Factor Failed");
		}
		
		Medicare_Detail_Page_Objects.SearchCode.clear();
	}
	
	@Test(priority = 7)
	public void ExcelImportValidation() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Excel Validation");
		
		Medicare_Detail_Page_Objects.ExcelimportClick.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.CancelExcelimport.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.ExcelimportClick.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.uploadimportClick.click();
		Thread.sleep(2000);
		
		String ImportWarning = Medicare_Detail_Page_Objects.uploadimportwarning.getText();
		
		if(ImportWarning.contentEquals("Please select an excel file"))
		{
			extenttestCase.log(Status.PASS, "Import Excel Validated");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Import Excel Not Validated");
		}
	}
	
	@Test(priority = 8)
	public void Download() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Download Excel Validation");
		Medicare_Detail_Page_Objects.Downloadlink.click();
		Thread.sleep(2000);
		
		File filelocation = new File("C:\\Users\\lokeshwaran_s\\Downloads");
		File[] totalFiles = filelocation.listFiles();

		for (File file : totalFiles) {
			if(file.getName().equalsIgnoreCase("MedicareCptCodes.xlsx"))
			{
				extenttestCase.log(Status.PASS, "Medicare CPT Code File is Downloaded");
				break;
			}
		}
	}
	
	@Test(priority = 9)
	public void VerifyInvalidUploadTemplate() throws InterruptedException, AWTException
	{
		extenttestCase.log(Status.INFO, "Verifying Medicare Invalid Upload Template Functionality");
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.UploadBrowse.click();
		Thread.sleep(2000);
		String file = "D:\\MedicareCPTCodes\\InvalidMedicareCptCodes.xlsx";
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
		Medicare_Detail_Page_Objects.uploadimportClick.click();

		String Invalidfilevalidation = Medicare_Detail_Page_Objects.UploadBrowseValidation.getText();

		if(Invalidfilevalidation.contentEquals("File upload failed, please check if the file has valid data."))
		{
			extenttestCase.log(Status.PASS, "Medicare CPT Code Upload Validation is Done");
		}
		/*
		 * else { extenttestCase.log(Status.FAIL,
		 * "Medicare CPT Code Upload Validation is Not Done"); }
		 */
	}
	
	@Test(priority = 10)
	public void VerifyValidUploadTemplate() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Medicare Valid Upload Template Functionality");
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.UploadBrowse.click();
		Thread.sleep(2000);

		String validfile = "D:\\MedicareCPTCodes\\ValidMedicareCptCodes.xlsx";
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
		Medicare_Detail_Page_Objects.uploadimportClick.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.SearchCode.sendKeys(getExcelData("modetail", 3, 1));
		Thread.sleep(2000);

		String SearchResult =	Medicare_Detail_Page_Objects.WFCodeSearchResult.getText();
		

		if(SearchResult.contentEquals(getExcelData("modetail", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "File Successfully Uploaded");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "File Upload Failed");
		}
		
		Medicare_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);
			
	}
	
	@Test(priority = 11)
	public void deleteuploadedCPTFactor() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying CPT Factor Delete Billing Funcationality");
		
		Medicare_Detail_Page_Objects.DeleteUploadedCPTFactor.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.DeleteUploadedCPTFactor.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.AcceptDeleteUploadedCPTFactor.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.SelectDeleteAll.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.Yes.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority = 12)
	public void multipleUpload() throws InterruptedException, IOException, AWTException
	{
		extenttestCase.log(Status.INFO, "Verifying Medicare Multiple CPT Factor Upload");
		
		Medicare_Detail_Page_Objects.ExcelimportClick.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.UploadBrowse.click();
		Thread.sleep(2000);

		String validmultifile = "D:\\MedicareCPTCodes\\MultipleValidMedicareCptCodes.xlsx";
		StringSelection validmultiselection = new StringSelection(validmultifile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validmultiselection, null);
		Thread.sleep(2000);
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.uploadimportClick.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Multiple Medicare CPT Code Uploaded Successfully");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destinationFile = new File("CPTFactorScheduleDetail.png"); 
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("CPTFactorScheduleDetail.png");

	}
	
	@Test(priority = 13)
	public void SortBillingMedicareCode() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying CPT Code Factor Code Sorting Funcationality");
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.SortCPTCode.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SortWFCode.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SortPFCode.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SortMPFCode.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.SortCFCode.click();
		Thread.sleep(2000);

	}
	

	@Test(priority = 14)
	public void SaveSatus() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Save Medicare CPT Factor Schedule Details Status");
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareDetailSave.click();
		Thread.sleep(2000);
		String CDetailsStatus = Medicare_Detail_Page_Objects.MedicareDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Draft"))
		{
			extenttestCase.log(Status.PASS, "Medicare Factor Schedule Saved Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Medicare Factor Schedule Not Saved Successfully");
		}
	}
	
	@Test(priority = 15)
	public void SubmitSatus() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Submitting Medicare Factor Schedule Details");
		Medicare_Detail_Page_Objects.MedicareDetailSubmit.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareDetailSubmit.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareDetailAcceptSubmit.click();
		Thread.sleep(2000);
		String CDetailsStatus = Medicare_Detail_Page_Objects.MedicareDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Submitted"))
		{
			extenttestCase.log(Status.PASS, "Medicare Factor Submitted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Medicare Factor Not Submitted Successfully");
		}
	}

	@Test(priority = 16)
	public void RejectStatus() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Rejecting Medicare Factor Schedule  Details");
		Medicare_Detail_Page_Objects.MedicareDetailReject.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.CancelMedicareDetailRejectpop.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareDetailReject.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareDetailSaveRejectpop.click();
		Thread.sleep(2000);
		String CDRejectvalidation = Medicare_Detail_Page_Objects.MedicareDetailNoteWarnRejectpop.getText();
		if(CDRejectvalidation.contains("Please enter the notes"))
		{
			extenttestCase.log(Status.PASS, "Medicare Factor Rejection Notes Validated Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Medicare Factor Rejection Notes Not Validated Successfully");
		}

		Medicare_Detail_Page_Objects.MedicareDetailNoteDesRejectpop.sendKeys(getExcelData("cpsdetail", 1, 4));
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareDetailSaveRejectpop.click();
		Thread.sleep(2000);
		String CDetailsStatus = Medicare_Detail_Page_Objects.MedicareDetailStatus.getText();
		

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
	
	@Test(priority = 17)
	public void AuditHistory() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying CPT Factor View All Link in Audit History");
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);

		Medicare_Detail_Page_Objects.CDViewall.click(); 
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
	
	@Test(priority = 18)
	public void CancelStatus()
	{

		extenttestCase.log(Status.INFO, "Cancelling Medicare CPT Factor Schedule Details ");

		Medicare_Detail_Page_Objects.MedicareDetailCancel.click();
	}
	
	@Test(priority = 19)
	public void CloneCreatedRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Cloning the Medicare CPT Factor Schedule Detail Record ");
		MedicareSearchRecord();

		Medicare_Detail_Page_Objects.MedicareClone.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, MedicareOWCP_List_Page_Objects.class);
		
		MedicareOWCP_List_Page_Objects.SaveNewMedicare.click();
		Thread.sleep(2000);
		
		String CloneWarn = MedicareOWCP_List_Page_Objects.CloneWarn.getText();
		
		
		if(CloneWarn.contentEquals("Medicare / OWCP Factor Schedule for the selected date range overlaps with an existing schedule"))
		{
			extenttestCase.log(Status.PASS, "Clone Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Clone Validation Failed");
		}
		
		MedicareOWCP_List_Page_Objects.AcceptError.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOEndDate.clear();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MedicareCancel.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.No.click();
		Thread.sleep(2000);
		
		MedicareSearchRecord();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.MedicareClone.click();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, MedicareOWCP_List_Page_Objects.class);
		
		MedicareOWCP_List_Page_Objects.MOStartDate.clear();
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOStartDate.sendKeys(getExcelData("molist", 2, 4));
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOEndDate.clear();
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MOEndDate.sendKeys(getExcelData("molist", 2, 5));
		Thread.sleep(2000);

		MedicareOWCP_List_Page_Objects.MedicareCancel.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.Yes.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 20)
	public void DeleteMasterRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Deleting Recently Created Client Pricing Schedule Record ");
		Thread.sleep(2000);
		MedicareSearchRecord();
		Thread.sleep(2000);
		PageFactory.initElements(driver, Medicare_Detail_Page_Objects.class);
		Thread.sleep(2000);
		Medicare_Detail_Page_Objects.MedicareCPTDelete.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.MedicareCPTDelete.click();
		Thread.sleep(2000);
		
		Medicare_Detail_Page_Objects.MedicareCPTAcceptDelete.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, MedicareOWCP_List_Page_Objects.class);
		Thread.sleep(2000);
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result");
		String actualresult  = MedicareOWCP_List_Page_Objects.MOSearchResult.getText();
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
		
		MedicareOWCP_List_Page_Objects.MOClearSearch.click();
		Thread.sleep(2000);
	}

}
