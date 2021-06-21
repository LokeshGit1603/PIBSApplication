package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.AP_Aging_Details_Report_Page_Objects;
import pageObjects.AR_Aging_Details_Report_Page_Objects;
import pageObjects.Unapplied_Cash_Posting_Details_Report_Page_Objects;
import pageObjects.Unapplied_Cash_Posting_Details_Report_Page_Objects;
import pageObjects.Unapplied_Cash_Posting_Details_Report_Page_Objects;
import pageObjects.Unapplied_Cash_Posting_Details_Report_Page_Objects;

public class Unapplied_Cash_Posting_Details_Report extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Unapplied_Cash_Posting_Details_Report.class);
	
	
	  @Test(priority = 0) public void clickReports() throws InterruptedException,
	  IOException { extenttestCase = extentReport.createTest("Verifying Unapplied Cash Posting Details Report");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, Unapplied_Cash_Posting_Details_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to napplied Cash Posting Details Report Menu");
		/*
		 * Unapplied_Cash_Posting_Details_Report_Page_Objects.ReportsClick.click();
		 * Thread.sleep(2000);
		 */
		}
	 
	
	@Test(priority = 1)
	public void clickunappliedcashpost() throws Throwable {
		
		extenttestCase.log(Status.INFO, "Navigating to Unapplied Cash Posting Details");
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedCPDetails.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.Execute.click();
		Thread.sleep(2000);
		String UCPCValidation = Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedClientValidation.getText();
		
		String UCPLValidation = Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedLobValidation.getText();
		
		
		if (UCPCValidation.contentEquals("Please select Client") && UCPLValidation.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Mandatory Field validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Mandatory Field validation Not Done Successfully");
		}
		
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedAcceptError.click();
		
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("Unapplied_Cash_Post", 1, 0));
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("Unapplied_Cash_Post", 1, 1));
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("Unapplied_Cash_Post", 1, 2));
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("Unapplied_Cash_Post", 1, 3));
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		
		Unapplied_Cash_Posting_Details_Report_Page_Objects.SearchType.sendKeys(getExcelData("Unapplied_Cash_Post", 1, 4));
		Thread.sleep(2000);
		
		Unapplied_Cash_Posting_Details_Report_Page_Objects.Execute.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destinationFile = new File("UnappliedCashPostingDetailsReport.png"); 
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("UnappliedCashPostingDetailsReport.png");
		
		
		String header = Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedReportHeader.getText();
		
		Thread.sleep(2000);
		
		if(header.contentEquals("Report"))
		{
			extenttestCase.log(Status.PASS, "Unapplied Cash Posting Report Generated");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Unapplied Cash Posting Report not Generated");
		}
		
		Thread.sleep(2000);
		driver.switchTo().frame("pibsReport");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(Unapplied_Cash_Posting_Details_Report_Page_Objects.DownloadLink).click().perform();
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		Thread.sleep(2000);
		action1.moveToElement(Unapplied_Cash_Posting_Details_Report_Page_Objects.CSVDownloadLink).click().perform();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "Unapplied Cash Posting CSV Report Downloaded");
		Thread.sleep(2000);


		action.moveToElement(Unapplied_Cash_Posting_Details_Report_Page_Objects.DownloadLink).click().perform();
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		Thread.sleep(2000);
		action2.moveToElement(Unapplied_Cash_Posting_Details_Report_Page_Objects.PDFDownloadLink).click().perform();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "Unapplied Cash Posting PDF Report Downloaded");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedReportHeader.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedReportHeader.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedClearSearch.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedSearchHeader.click();
		Thread.sleep(2000);
		Unapplied_Cash_Posting_Details_Report_Page_Objects.UnappliedSearchHeader.click();
		Thread.sleep(2000);
	}

}
