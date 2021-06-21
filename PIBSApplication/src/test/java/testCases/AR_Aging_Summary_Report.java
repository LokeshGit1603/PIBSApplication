package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.AR_Aging_Details_Report_Page_Objects;
import pageObjects.AR_Aging_Summary_Report_Page_Objects;

public class AR_Aging_Summary_Report extends CommonFunctions{

	static Logger logger = Logger.getLogger(AR_Aging_Summary_Report.class);

	@Test(priority = 0)
	public void clickReports() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying AR Aging Summary Reports");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, AR_Aging_Summary_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to AR Aging Summary Reports Menu");
		/*
		 * AR_Aging_Summary_Report_Page_Objects.ReportsClick.click();
		 * Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void ARAgingSummary() throws Throwable {

		extenttestCase.log(Status.INFO, "Navigating to AR Aging Summary");
		AR_Aging_Summary_Report_Page_Objects.ARSummary.click();
		Thread.sleep(3000);
		AR_Aging_Summary_Report_Page_Objects.Execute.click();
		Thread.sleep(3000);
		String ARSCValidation = AR_Aging_Summary_Report_Page_Objects.ARSummaryClientValidation.getText();
		

		String ARSLValidation = AR_Aging_Summary_Report_Page_Objects.ARSummaryLobValidation.getText();
		

		if (ARSCValidation.contentEquals("Please select Client") && ARSLValidation.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Validation Not Done Successfully");
		}

		AR_Aging_Summary_Report_Page_Objects.ARSummaryAcceptError.click();
		Thread.sleep(2000);

		AR_Aging_Summary_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("arsummary", 1, 0));
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("arsummary", 1, 1));
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);

		AR_Aging_Summary_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("arsummary", 1, 2));
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("arsummary", 1, 3));
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);
		AR_Aging_Summary_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);

		AR_Aging_Summary_Report_Page_Objects.SearchType.sendKeys(getExcelData("arsummary", 1, 4));
		Thread.sleep(2000);


		AR_Aging_Summary_Report_Page_Objects.Execute.click();
		Thread.sleep(5000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ARAgingSummaryReport.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ARAgingSummaryReport.png");
		
		String ARSReportlable = AR_Aging_Summary_Report_Page_Objects.ARSummaryReportText.getText();
		

		if(ARSReportlable.contentEquals("Report"))
		{
			extenttestCase.log(Status.PASS, "AR Aging  Summary Report Generated");
		}

		Thread.sleep(2000);
		driver.switchTo().frame("pibsReport");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(AR_Aging_Summary_Report_Page_Objects.DownloadLink).click().perform();
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		Thread.sleep(2000);
		action1.moveToElement(AR_Aging_Summary_Report_Page_Objects.CSVDownloadLink).click().perform();
		Thread.sleep(2000);

		extenttestCase.log(Status.PASS, "AR Aging Summary CSV Report Downloaded");
		Thread.sleep(2000);


		action.moveToElement(AR_Aging_Summary_Report_Page_Objects.DownloadLink).click().perform();
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		Thread.sleep(2000);
		action2.moveToElement(AR_Aging_Summary_Report_Page_Objects.PDFDownloadLink).click().perform();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "AR Aging Details PDF Report Downloaded");


			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);

			

			Thread.sleep(2000);
			AR_Aging_Summary_Report_Page_Objects.ARSummaryReportHeader.click();
			Thread.sleep(2000);
			AR_Aging_Summary_Report_Page_Objects.ARSummaryReportHeader.click();
			Thread.sleep(2000);
			AR_Aging_Summary_Report_Page_Objects.ARSummaryClearSearch.click();
			Thread.sleep(2000);
			AR_Aging_Summary_Report_Page_Objects.ARSummarySearchHeader.click();
			Thread.sleep(2000);

			AR_Aging_Summary_Report_Page_Objects.ARSummarySearchHeader.click();
			Thread.sleep(2000);

		}
	}



