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
import pageObjects.Client_PricingScheduleCLIN_Detail_Page_Objects;
import pageObjects.Client_PricingScheduleCPT_Detail_Page_Objects;
import pageObjects.Client_PricingSchedule_List_Page_Objects;

public class Client_PricingScheduleCPT_Detail extends CommonFunctions{

	static Logger logger = Logger.getLogger(Client_PricingScheduleCPT_Detail.class);
	
	@Test (priority = 0)
	public void GoToAddCPT() throws Throwable
	{
		extenttestCase = extentReport.createTest("Verifying Client Pricing Schedule CPT Details");
		extenttestCase.log(Status.INFO, "Verifying Add New CPT Pricing Schedule");
		Thread.sleep(2000);
		
		logger.info("Logging in to the application");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);

		Client_PricingSchedule_List_Page_Objects.AddNew.click();
		Thread.sleep(2000);
		
		
		Client_PricingSchedule_List_Page_Objects.AddPriceType.sendKeys(getExcelData("cpslist", 5, 2));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSClient.sendKeys(getExcelData("cpslist", 5, 0));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSlob.sendKeys(getExcelData("cpslist", 5, 1));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSDate.clear();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSSDate.sendKeys(getExcelData("cpslist", 5, 4));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSEDate.sendKeys(getExcelData("cpslist", 5, 5));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSPercentVarience.sendKeys(getExcelData("cpslist", 5, 6));
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 1)
	public void GoToFormula() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Add New CPT Pricing Schedule Formula");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Client_PricingSchedule_List_Page_Objects.AddFormula.click();	
		Thread.sleep(2000);
	}
	
	@Test (priority = 2)
	public void BothEmptyValidation() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Both Empty Formula validations");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Client_PricingSchedule_List_Page_Objects.AddFormulaPopup.click();
		Thread.sleep(2000);
		String emptyvalue = Client_PricingSchedule_List_Page_Objects.AddFormulaPopupWarning.getText();
		
		if(emptyvalue.contentEquals("Please enter the formula."))
		{
			extenttestCase.log(Status.PASS, "Formula validated with empty fields");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Formula validated Failed with empty fields");
		}
	}
	
	@Test (priority = 3)
	public void ValueEmptyValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Both Empty Formula validations");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Client_PricingSchedule_List_Page_Objects.AddFormulaContent.sendKeys(getExcelData("cpslist", 5, 9));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.DeleteFormulaContent.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.AddFormulaContent.sendKeys(getExcelData("cpslist", 5, 9));
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.TestFormula.click();
		Thread.sleep(2000);
		
		
		String emptyvalue = Client_PricingSchedule_List_Page_Objects.AddFormulaPopupWarning.getText();
		
		if(emptyvalue.contentEquals("Please enter the factor value."))
		{
			extenttestCase.log(Status.PASS, "Formula validated with Formula fields");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Formula validated Failed with Formula fields");
		}
	}
	
	@Test (priority = 4)
	public void FormulaEmptyValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Both Empty Formula validations");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Client_PricingSchedule_List_Page_Objects.AddFormulaContent.clear();
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddWFFormula.sendKeys(getExcelData("cpslist", 5, 10));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddPFFormula.sendKeys(getExcelData("cpslist", 5, 11));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddMPFFormula.sendKeys(getExcelData("cpslist", 5, 12));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddCFFormula.sendKeys(getExcelData("cpslist", 5, 13));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.DeleteFormulaValues.click();
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddWFFormula.sendKeys(getExcelData("cpslist", 5, 10));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddPFFormula.sendKeys(getExcelData("cpslist", 5, 11));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddMPFFormula.sendKeys(getExcelData("cpslist", 5, 12));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.AddCFFormula.sendKeys(getExcelData("cpslist", 5, 13));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.TestFormula.click();
		Thread.sleep(2000);
		
		
		String emptyvalue = Client_PricingSchedule_List_Page_Objects.AddFormulaPopupWarning.getText();
		
		if(emptyvalue.contains("Invalid Formula:"))
		{
			extenttestCase.log(Status.PASS, "Formula validated with Value fields");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Formula validated Failed with Value fields");
		}
	}
	
	@Test (priority = 5)
	public void FormulaResultValidation() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Both Empty Formula validations");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Client_PricingSchedule_List_Page_Objects.AddFormulaContent.sendKeys(getExcelData("cpslist", 5, 9));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.TestFormula.click();
		Thread.sleep(2000);
		
		String FormulaResult = Client_PricingSchedule_List_Page_Objects.TestFormulaResult.getText();
		
		if(FormulaResult.contentEquals(getExcelData("cpslist", 5, 14)))
				{
			extenttestCase.log(Status.PASS, "Formula Result validated Successfully");
				}
		else
		{
			extenttestCase.log(Status.FAIL, "Formula Result validation Failed");
		}
	}
	
	@Test (priority = 6)
	public void AddFormulaToDetails() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Adding Formula to CPT Details");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.AddFormulaPopup.click();
		
		String AddedFormula = Client_PricingSchedule_List_Page_Objects.AddFormula.getText();
		
		if(AddedFormula.contentEquals(getExcelData("cpslist", 5, 9)))
		{
			extenttestCase.log(Status.PASS, "Formula Added Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Formula Addition Failed");
		}
		
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.ClearFormula.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "Formula Deleted Successfully");
	}
	
	@Test (priority = 7)
	public void SaveCPT() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Adding CPT Record");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.SaveAddNew.click();
		Thread.sleep(2000);
		Client_PricingSchedule_List_Page_Objects.CPSCancel.click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 8)
	public void SearchCPTRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Searching Added CPT Record in Listing");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Client_PricingSchedule_List_Page_Objects.CPSSearchheader.click();
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSClientId.sendKeys(getExcelData("cpslist", 5, 0));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSClientLob.sendKeys(getExcelData("cpslist", 5, 1));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSClientType.sendKeys(getExcelData("cpslist", 5, 2));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSClientStatus.sendKeys(getExcelData("cpslist", 5, 3));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSStartDate.sendKeys(getExcelData("cpslist", 5, 4));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSEndDate.sendKeys(getExcelData("cpslist", 5, 5));
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSActiveDate.clear();
		Thread.sleep(2000);
		
		Client_PricingSchedule_List_Page_Objects.CPSSearchClick.click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 9)
	public void GetRecord()
	{
		extenttestCase.log(Status.INFO, "Verfying Added CPT Record in Listing");
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
	}
	
	@Test (priority = 10)
	public void GoCPTDetails() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTAction.click();
		extenttestCase.log(Status.INFO, "Navigating to Client Pricing Schedule CPT Details page");
	}
	
	@Test (priority =11)
	public void CPTExpand() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Expand Collapse Funcationality");
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTheader.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTheader.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTBillingheader.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTBillingheader.click();
		Thread.sleep(2000);

		extenttestCase.log(Status.INFO, "Expand Collapse Funcationality Verified");
	}
	
	@Test (priority = 12)
	public void ADDCPTBill() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Add CPT Bill Funcationality");
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTAddBill.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CancelCPTAddBill.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTAddBill.click();
		Thread.sleep(2000);
		

		boolean savepopup = Client_PricingScheduleCPT_Detail_Page_Objects.SaveNewCPTpopup.isEnabled();

		if(savepopup=true)
		{
			extenttestCase.log(Status.PASS, "Save Button disabled and Got Expected Result");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Save Button enabled and Not Getting Expected Result");
		}
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTCodepopup.sendKeys(getExcelData("cpsdetail", 6, 5));
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTFeepopup.click();
		Thread.sleep(2000);
		
		String InvalidCPTCodeWarn = Client_PricingScheduleCPT_Detail_Page_Objects.InvalidCPTCodeWarn.getText();
	
		
		if(InvalidCPTCodeWarn.contentEquals("Please enter a valid code"))
		{
			extenttestCase.log(Status.PASS, "Invalid Code Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Invalid Code Validation Failed");
		}
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTCodepopup.clear();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTCodepopup.sendKeys(getExcelData("cpsdetail", 6, 0));
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTFeepopup.sendKeys(getExcelData("cpsdetail", 6, 1));
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTPrintCodepopup.sendKeys(getExcelData("cpsdetail", 6, 2));
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTPrintDespopup.sendKeys(getExcelData("cpsdetail", 6, 3));
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.SaveNewCPTpopup.click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 13)
	public void BillcptSearch() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Added CPT Bill By Search");
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.sendKeys(getExcelData("cpsdetail", 6, 2));
		Thread.sleep(2000);
		
		String CPTResult =	Client_PricingScheduleCPT_Detail_Page_Objects.BillCPTSearchResult.getText();
		
		
		if(CPTResult.contentEquals(getExcelData("cpsdetail", 6, 2)))
		{
			extenttestCase.log(Status.PASS, "Got Added Billing CPT Record");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Added Billing CPT Record");
		}

	}
	
	@Test (priority = 14)
	public void EditBillcpt() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Edit CPT Bill");
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.EditBillCPT.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTPrintCodepopup.clear();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AddCPTPrintCodepopup.sendKeys(getExcelData("cpsdetail", 7, 2));
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.SaveNewCPTpopup.click();
		Thread.sleep(2000);

	}
	
	@Test (priority = 15)
	public void VerfiyEditBillcpt() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Edited CPT Bill by Search");
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.sendKeys(getExcelData("cpsdetail", 7, 2));
		Thread.sleep(2000);
		
		String CPTResult =	Client_PricingScheduleCPT_Detail_Page_Objects.BillCPTSearchResult.getText();
		
		
		if(CPTResult.contentEquals(getExcelData("cpsdetail", 7, 2)))
		{
			extenttestCase.log(Status.PASS, "Got Edited Billing CPT Record");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Edited Billing CPT Record");
		}
		
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);

	}
	
	@Test (priority = 16)
	public void ValidateExcel() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Excel Import Functionality");

		Client_PricingScheduleCPT_Detail_Page_Objects.CPTImportBill.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CancelCPTUploadImportBill.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTImportBill.click();
		Thread.sleep(2000);

		Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadImportBill.click();
		Thread.sleep(2000);

		String UploadWarn = Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadWarning.getText();
		
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
	
	@Test (priority = 17)
	public void VerifyDownload() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Download Template Functionality");
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTDownloadTemplink.click();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "CPT Code File is Downloaded");

		/*
		 * File filelocation = new File("C:\\Users\\lokeshwaran_s\\Downloads"); File[]
		 * totalFiles = filelocation.listFiles();
		 * 
		 * for (File file : totalFiles) {
		 * if(file.getName().equalsIgnoreCase("CptCodes.xlsx")) { Thread.sleep(2000);
		 * extenttestCase.log(Status.PASS, "CPT Code File is Downloaded"); break; } else
		 * { extenttestCase.log(Status.FAIL, "CPT Code File is Not Downloaded"); } }
		 */
	
	}
	
	@Test (priority = 18)
	public void VerifyInvalidUploadTemplate() throws InterruptedException, AWTException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Invalid Upload Template Functionality");
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadBrowse.click();
		Thread.sleep(2000);
		String cptfile = "D:\\CPTCodes\\InvalidCptCodes.xlsx";
		StringSelection cptselection = new StringSelection(cptfile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cptselection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadImportBill.click();

		String Invalidfilevalidation = Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadValidation.getText();

		if(Invalidfilevalidation.contentEquals("File upload failed, please check if the file has valid data."))
		{
			extenttestCase.log(Status.PASS, "CPT Code File Upload Validation is Done");
		}
		
	}
	
	@Test (priority = 19)
	public void VerifyValidUploadTemplate() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Valid Upload Template Functionality");
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadBrowse.click();
		Thread.sleep(2000);

		String validcptfile = "D:\\CPTCodes\\ValidCptCodes.xlsx";
		StringSelection validcptselection = new StringSelection(validcptfile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(validcptselection, null);
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CPTUploadImportBill.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);

		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.sendKeys(getExcelData("cpsdetail", 8, 2));
		Thread.sleep(2000);

		String CPTResult =	Client_PricingScheduleCPT_Detail_Page_Objects.BillCPTSearchResult.getText();
	

		if(CPTResult.contentEquals(getExcelData("cpsdetail", 8, 2)))
		{
			extenttestCase.log(Status.PASS, "File Successfully Uploaded");
		}

		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destinationFile = new File("ClientPricingScheduleCPTDetail.png"); 
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ClientPricingScheduleCPTDetail.png");

	}
	
	@Test (priority = 20)
	public void SortBillingCptCode() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Billing CPT Code Sorting Funcationality");
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptCode.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptCat.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptType.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptDes.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptPrintCode.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptPrintDes.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SortCptFlatFee.click();
		Thread.sleep(2000);

	}

	@Test (priority = 21)
	public void deleteuploadedCPT() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying CPT Delete Billing Funcationality");
		
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);
		

		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.sendKeys(getExcelData("cpsdetail", 8, 2));
		Thread.sleep(2000);

		String CPTResult =	Client_PricingScheduleCPT_Detail_Page_Objects.BillCPTSearchResult.getText();
		


		Client_PricingScheduleCPT_Detail_Page_Objects.DeleteUploadedCPT.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.DeleteUploadedCPT.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.AcceptDeleteUploadedCPT.click();
		Thread.sleep(2000);

		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);

		Client_PricingScheduleCPT_Detail_Page_Objects.BillCPTSearchResult.sendKeys(getExcelData("cpsdetail", 8, 2));
		Thread.sleep(2000);

		String DeleteCPTvalidation = 	Client_PricingScheduleCPT_Detail_Page_Objects.NoDataValidation.getText();

		if(DeleteCPTvalidation.contentEquals("No data found"))
		{
			extenttestCase.log(Status.PASS, "File Deleted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "File Deletion Failed");
		}
		
		Client_PricingScheduleCPT_Detail_Page_Objects.SelectDeleteAll.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.DeleteAll.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.Yes.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.BillingCPTSearch.clear();
		Thread.sleep(2000);
	}
	
	@Test (priority = 22)
	public void SaveCPTSatus() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying Client Pricing Schedule CPT Details Status");
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SaveCPTDetails.click();
		Thread.sleep(2000);
		String CPTDetailsStatus = Client_PricingScheduleCPT_Detail_Page_Objects.CPTDetailsStatus.getText();
		

		if(CPTDetailsStatus.contentEquals("Draft"))
		{
			extenttestCase.log(Status.PASS, "CPT Client Pricing Schedule Saved Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "CPT Client Pricing Schedule Not Saved Successfully");
		}
	}

	@Test (priority = 23)
	public void SubmitCPTSatus() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Submitting Client Pricing Schedule CPT Details");
		Client_PricingScheduleCPT_Detail_Page_Objects.SubmitCPTDetails.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.SubmitCPTDetails.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.AcceptSubmitCPTDetails.click();
		Thread.sleep(2000);
		String CPTDetailsStatus = Client_PricingScheduleCPT_Detail_Page_Objects.CPTDetailsStatus.getText();
	

		if(CPTDetailsStatus.contentEquals("Submitted"))
		{
			extenttestCase.log(Status.PASS, "CPT Client Pricing Schedule Submitted Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "CPT Client Not Submitted Successfully");
		}
	}
	
	@Test (priority = 24)
	public void RejectCPTStatus() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Rejecting CPT Client Pricing Schedule  Details");
		Client_PricingScheduleCPT_Detail_Page_Objects.RejectCPTDetails.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CancelReject.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.RejectCPTDetails.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.AcceptRejectCPTDetails.click();
		Thread.sleep(2000);
		String CPTRejectvalidation = Client_PricingScheduleCPT_Detail_Page_Objects.RejectNoteValidationCPTDetails.getText();
		if(CPTRejectvalidation.contains("Please enter the notes"))
		{
			extenttestCase.log(Status.PASS, "CPT Contract Rejection Notes Validated Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "CPT Contract Rejection Notes Not Validated Successfully");
		}

		Client_PricingScheduleCPT_Detail_Page_Objects.RejectNotesCPTDetails.sendKeys(getExcelData("cpsdetail", 6, 4));
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.AcceptRejectCPTDetails.click();
		Thread.sleep(2000);
		String CPTDetailsStatus = Client_PricingScheduleCPT_Detail_Page_Objects.CPTDetailsStatus.getText();
		

		if(CPTDetailsStatus.contentEquals("Rejected"))
		{
			extenttestCase.log(Status.PASS, "CPT Contract Rejected Successfully");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "CPT Contract Not Rejected Successfully");
		}

		SaveCPTSatus();
	}
	
	@Test (priority = 25)
	public void CPTAuditHistory() throws InterruptedException
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Verifying CPT View All Link in Audit History");
		Thread.sleep(2000);

		Client_PricingScheduleCPT_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.AHHeader.click();
		Thread.sleep(2000);

		Client_PricingScheduleCPT_Detail_Page_Objects.CDViewall.click(); 
		String mainwindow = driver.getWindowHandle(); 
		Thread.sleep(2000); 
		Set<String> handles = driver.getWindowHandles(); 
		for (String handle : handles) 
		{
			if(!handle.equals(mainwindow)) 
			{ 
				driver.switchTo().window(handle);
				System.out.println(driver.getCurrentUrl().toString());
				extenttestCase.log(Status.PASS, "CPT View All Link Verified in Audit History");
				driver.close(); 
			} 
			driver.switchTo().window(mainwindow); 
		} 
	}
	
	@Test (priority = 26)
	public void CPTCancelStatus()
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Cancelling CPT Client Pricing Schedule Details ");

		Client_PricingScheduleCPT_Detail_Page_Objects.CancelCPTDetails.click();
	}
	
	@Test (priority = 27)
	public void DeleteCPTMasterRecord() throws Throwable
	{
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Deleting Recently Created CPT Client Pricing Schedule Record ");
		Thread.sleep(2000);
		SearchCPTRecord();
		Thread.sleep(2000);
		PageFactory.initElements(driver, Client_PricingScheduleCPT_Detail_Page_Objects.class);
		Thread.sleep(2000);
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTDelete.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.No.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTDelete.click();
		Thread.sleep(2000);
		
		Client_PricingScheduleCPT_Detail_Page_Objects.CPSCPTAcceptDelete.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		Thread.sleep(2000);
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result");
		String actualresult  = Client_PricingSchedule_List_Page_Objects.CPSSearchResult.getText();
		Thread.sleep(2000);

		if(actualresult.contains("No data found"))
		{
			logger.info("Verification done. End of Client_Contract_List");

			extenttestCase.log(Status.PASS, "CPT Record Deleted Successfully"); 
		} 
		else
		{ 

			extenttestCase.log(Status.FAIL, "CPT Record Deletion Failed"); 
		}

		logger.info("Verified No Data Found Result"); 
		
		Client_PricingSchedule_List_Page_Objects.CPSClearSearch.click();
		Thread.sleep(2000);
	}
}
