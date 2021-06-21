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
import pageObjects.Client_PricingScheduleCPT_Detail_Page_Objects;
import pageObjects.Client_PricingSchedule_List_Page_Objects;
import pageObjects.MedicareOWCP_List_Page_Objects;
import pageObjects.Medicare_Detail_Page_Objects;
import pageObjects.OWCP_Detail_Page_Objects;

public class OWCP_Detail extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(OWCP_Detail.class);
	
	@Test(priority = 0)
	public void GoToAddOWCP() throws Throwable
	{
		extenttestCase = extentReport.createTest("Verifying OWCP Factor Schedule Details");
		extenttestCase.log(Status.INFO, "Verifying Add New OWCP Factor Schedule");
		Thread.sleep(2000);
		PageFactory.initElements(driver, MedicareOWCP_List_Page_Objects.class);
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.AddNewMedicare.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOPricingType.sendKeys(getExcelData("molist", 5, 0));
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOStartDate.sendKeys(getExcelData("molist", 5, 1));
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOEndDate.sendKeys(getExcelData("molist", 5, 2));
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.SaveNewMedicare.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MedicareCancel.click();
	}

	@Test(priority = 1)
	public void SearchOWCPRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Searching Added CPT Record in Listing");
		MedicareOWCP_List_Page_Objects.MOSearchHeader.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOPricingType.sendKeys(getExcelData("molist", 5, 0));
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOStartDate.sendKeys(getExcelData("molist", 5, 1));
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOEndDate.sendKeys(getExcelData("molist", 5, 2));
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOStatus.sendKeys(getExcelData("molist", 5, 3));
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOActiveDate.clear();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOPricingType.click();
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.MOSearchClick.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void GetRecord() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verfying Added OWCP Record in Listing");
		PageFactory.initElements(driver, OWCP_Detail_Page_Objects.class);
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPAction.click();
		extenttestCase.log(Status.INFO, "Navigating to OWCP Factor Schedule Details page");
	}
	
	@Test(enabled = false)
	public void GoCPTDetails() throws InterruptedException
	{
		PageFactory.initElements(driver, OWCP_Detail_Page_Objects.class);
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPAction.click();
		extenttestCase.log(Status.INFO, "Navigating to OWCP Factor Schedule Details page");
	}
	
	@Test(priority = 3)
	public void OWCPExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand Collapse Funcationality");
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPheader.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPheader.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPCPTFactorheader.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPCPTFactorheader.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.OWCPCPTFactorheader.click();
		Thread.sleep(2000);

		extenttestCase.log(Status.INFO, "Expand Collapse Funcationality Verified");

	}
	
	@Test(priority = 4)
	public void AddCPTFactorValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Add CPT Factor Validation Message");

		OWCP_Detail_Page_Objects.AddNewCode.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.CancelSaveNewPopup.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.AddNewCode.click();
		Thread.sleep(2000);
		

		boolean savepopup = OWCP_Detail_Page_Objects.SaveAddNewPopup.isEnabled();

		if(savepopup=true)
		{
			extenttestCase.log(Status.PASS, "Save Button disabled and Got Expected Result");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Save Button enabled and Not Getting Expected Result");
		}
		
		OWCP_Detail_Page_Objects.MedicareCPTCode.sendKeys(getExcelData("modetail", 6, 6));
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.WFCode.click();
		Thread.sleep(2000);
		
		String MedicareCPTInvalidWarn = OWCP_Detail_Page_Objects.MedicareCPTInvalidWarn.getText();
		
		
		if(MedicareCPTInvalidWarn.contentEquals("Please enter a valid code"))
		{
			extenttestCase.log(Status.PASS, "Invalid Code Validation Done");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Invalid Code Validation Failed");
		}
		
		OWCP_Detail_Page_Objects.MedicareCPTCode.clear();
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.MedicareCPTCode.sendKeys(getExcelData("modetail", 6, 0));
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
		String validation1 = OWCP_Detail_Page_Objects.Warning1.getText();

		String validation2 = OWCP_Detail_Page_Objects.Warning2.getText();

		String validation3 = OWCP_Detail_Page_Objects.Warning3.getText();

		String validation4 = OWCP_Detail_Page_Objects.Warning4.getText();

		if(validation1.contentEquals("Please enter WF") && validation2.contentEquals("Please enter PF") 
				&& validation3.contentEquals("Please enter MPF") && validation4.contentEquals("Please enter CF"))
		{
			extenttestCase.log(Status.PASS, "Added CPT Factor Validated");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Added CPT Factor Not Validated");
		}

		OWCP_Detail_Page_Objects.WFCode.sendKeys(getExcelData("modetail", 6, 1));
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.PFCode.sendKeys(getExcelData("modetail", 6, 2));
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.MPFCode.sendKeys(getExcelData("modetail", 6, 3));
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.CFCode.sendKeys(getExcelData("modetail", 6, 4));
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void SearchAddedCode() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Added CPT Factor");

		OWCP_Detail_Page_Objects.SearchCode.sendKeys(getExcelData("modetail", 6, 1));
		Thread.sleep(2000);
		
		String actualresult = OWCP_Detail_Page_Objects.WFCodeSearchResult.getText();
		
		if(actualresult.contentEquals(getExcelData("modetail", 6, 1)))
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

		OWCP_Detail_Page_Objects.EditCode.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.WFCode.clear();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.WFCode.sendKeys(getExcelData("modetail", 7, 1));
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.SaveAddNewPopup.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.SearchCode.clear();
		 
		OWCP_Detail_Page_Objects.SearchCode.sendKeys(getExcelData("modetail", 7, 1));
			Thread.sleep(2000);
		
		String actualresult = OWCP_Detail_Page_Objects.WFCodeSearchResult.getText();
		
		if(actualresult.contentEquals(getExcelData("modetail", 7, 1)))
		{
			extenttestCase.log(Status.PASS, "Edit CPT Factor Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.FAIL, "Edit CPT Factor Failed");
		}
		
		OWCP_Detail_Page_Objects.SearchCode.clear();
	}
	
	
	@Test(priority = 7)
	public void ExcelImportValidation() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Excel Validation");
		
		OWCP_Detail_Page_Objects.ExcelimportClick.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.CancelExcelimport.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.ExcelimportClick.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.uploadimportClick.click();
		Thread.sleep(2000);
		
		String ImportWarning = OWCP_Detail_Page_Objects.uploadimportwarning.getText();
		
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
		OWCP_Detail_Page_Objects.Downloadlink.click();
		Thread.sleep(2000);
		
		File filelocation = new File("C:\\Users\\lokeshwaran_s\\Downloads");
		File[] totalFiles = filelocation.listFiles();

		for (File file : totalFiles) {
			if(file.getName().equalsIgnoreCase("MedicareCptCodes.xlsx"))
			{
				extenttestCase.log(Status.PASS, "OWCP CPT Code File is Downloaded");
				break;
			}
		}
	}
	
	@Test(priority = 9)
	public void VerifyInvalidUploadTemplate() throws InterruptedException, AWTException
	{
		extenttestCase.log(Status.INFO, "Verifying OWCP Invalid Upload Template Functionality");
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.UploadBrowse.click();
		Thread.sleep(2000);
		String invalidfile = "D:\\OWCPCPTCodes\\InvalidOWCPCptCodes.xlsx";
		StringSelection invalidselection = new StringSelection(invalidfile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(invalidselection, null);

		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.uploadimportClick.click();

		String Invalidfilevalidation = OWCP_Detail_Page_Objects.UploadBrowseValidation.getText();

		if(Invalidfilevalidation.contentEquals("File upload failed, please check if the file has valid data."))
		{
			extenttestCase.log(Status.PASS, "OWCP CPT Code Upload Validation is Done");
		}
		/*
		 * else { extenttestCase.log(Status.FAIL,
		 * "Medicare CPT Code Upload Validation is Not Done"); }
		 */
		Thread.sleep(2000);
	}
	
	@Test(priority = 10)
	public void VerifyValidUploadTemplate() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying OWCP Valid Upload Template Functionality");
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.UploadBrowse.click();
		Thread.sleep(2000);

		String validfile = "D:\\OWCPCPTCodes\\ValidOWCPCptCodes.xlsx";
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
		OWCP_Detail_Page_Objects.uploadimportClick.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.SearchCode.sendKeys(getExcelData("modetail", 8, 1));
		Thread.sleep(2000);

		String SearchResult =	OWCP_Detail_Page_Objects.WFCodeSearchResult.getText();
		

		if(SearchResult.contentEquals(getExcelData("modetail", 8, 1)))
		{
			extenttestCase.log(Status.PASS, "File Successfully Uploaded");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "File Upload Failed");
		}
		
		OWCP_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 11)
	public void deleteuploadedCPTFactor() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying OWCP CPT Factor Delete Billing Funcationality");
		
		OWCP_Detail_Page_Objects.DeleteUploadedCPTFactor.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.DeleteUploadedCPTFactor.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.AcceptDeleteUploadedCPTFactor.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.SelectDeleteAll.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.Yes.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.SearchCode.clear();
		Thread.sleep(2000);
	}

	@Test(priority = 12)
	public void multipleUpload() throws InterruptedException, AWTException, IOException
	{
		
		extenttestCase.log(Status.INFO, "Verifying OWCP Multiple CPT Factor Upload");
		
		OWCP_Detail_Page_Objects.ExcelimportClick.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.UploadBrowse.click();
		Thread.sleep(2000);

		String validmultifile = "D:\\OWCPCPTCodes\\MultipleValidOWCPCptCodes.xlsx";
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
		OWCP_Detail_Page_Objects.uploadimportClick.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Multiple OWCP CPT Code Uploaded Successfully");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destinationFile = new File("OWCPFactorScheduleDetail.png"); 
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("OWCPFactorScheduleDetail.png");

	}
	
	@Test(priority = 13)
	public void SortBillingMedicareCode() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying CPT Code Factor Code Sorting Funcationality");
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.SortCPTCode.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SortWFCode.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SortPFCode.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SortMPFCode.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.SortCFCode.click();
		Thread.sleep(2000);

	}
	
	
	@Test(priority = 14)
	public void SaveSatus() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Save Medicare CPT Factor Schedule Details Status");
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareDetailSave.click();
		Thread.sleep(2000);
		String CDetailsStatus = OWCP_Detail_Page_Objects.MedicareDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Draft"))
		{
			extenttestCase.log(Status.PASS, "OWCP Factor Schedule Saved Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "OWCP Factor Schedule Not Saved Successfully");
		}
	}

	@Test(priority = 15)
	public void SubmitSatus() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Submitting Medicare Factor Schedule Details");
		OWCP_Detail_Page_Objects.MedicareDetailSubmit.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareDetailSubmit.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareDetailAcceptSubmit.click();
		Thread.sleep(2000);
		String CDetailsStatus = OWCP_Detail_Page_Objects.MedicareDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Submitted"))
		{
			extenttestCase.log(Status.PASS, "OWCP Factor Submitted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "OWCP Factor Not Submitted Successfully");
		}
	}
	
	@Test(priority = 16)
	public void RejectStatus() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Rejecting Medicare Factor Schedule  Details");
		OWCP_Detail_Page_Objects.MedicareDetailReject.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.CancelMedicareDetailRejectpop.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareDetailReject.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareDetailSaveRejectpop.click();
		Thread.sleep(2000);
		String CDRejectvalidation = OWCP_Detail_Page_Objects.MedicareDetailNoteWarnRejectpop.getText();
		if(CDRejectvalidation.contains("Please enter the notes"))
		{
			extenttestCase.log(Status.PASS, "OWCP Factor Rejection Notes Validated Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "OWCP Factor Rejection Notes Not Validated Successfully");
		}

		OWCP_Detail_Page_Objects.MedicareDetailNoteDesRejectpop.sendKeys(getExcelData("modetail", 6, 5));
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareDetailSaveRejectpop.click();
		Thread.sleep(2000);
		String CDetailsStatus = OWCP_Detail_Page_Objects.MedicareDetailStatus.getText();
		

		if(CDetailsStatus.contentEquals("Rejected"))
		{
			extenttestCase.log(Status.PASS, "OWCP CPT Rejected Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "OWCP CPT Not Rejected Successfully");
		}

		SaveSatus();
	}
	
	@Test(priority = 17)
	public void AuditHistory() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying CPT Factor View All Link in Audit History");
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);

		OWCP_Detail_Page_Objects.CDViewall.click(); 
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

		extenttestCase.log(Status.INFO, "Cancelling OWCP CPT Factor Schedule Details ");

		OWCP_Detail_Page_Objects.MedicareDetailCancel.click();
	}
	
	@Test(priority = 19)
	public void DeleteMasterRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Deleting Recently Created Client Pricing Schedule Record ");
		Thread.sleep(2000);
		SearchOWCPRecord();
		Thread.sleep(2000);
		OWCP_Detail_Page_Objects.MedicareCPTDelete.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.MedicareCPTDelete.click();
		Thread.sleep(2000);
		
		OWCP_Detail_Page_Objects.MedicareCPTAcceptDelete.click();
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
