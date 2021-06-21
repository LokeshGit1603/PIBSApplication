package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import pageObjects.Client_Contract_List_Page_Objects;
import pageObjects.Services_AppPayment_Detail_Page_Objects;
import pageObjects.Unapplied_Cash_Posting_Details_Report_Page_Objects;
import pageObjects.Unbilling_Services_Report_Page_Objects;
import pageObjects.AR_Aging_Details_Report_Page_Objects;

public class AR_Aging_Details_Report extends CommonFunctions {

	static Logger logger = Logger.getLogger(AR_Aging_Details_Report.class);


	@Test(priority = 0)
	public void clickReports() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying AR Aging Details Reports");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, AR_Aging_Details_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to AR Aging Details Reports Menu");
		AR_Aging_Details_Report_Page_Objects.ReportsClick.click();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void ARAgingdetails() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		extenttestCase.log(Status.INFO, "Navigating to AR Aging Details");
		AR_Aging_Details_Report_Page_Objects.ARAgingdetails.click();
		Thread.sleep(2000);

		AR_Aging_Details_Report_Page_Objects.Execute.click();
		Thread.sleep(2000);

		String ARACValidation = AR_Aging_Details_Report_Page_Objects.ARAgingClientValidation.getText();

		String ARALValidation = AR_Aging_Details_Report_Page_Objects.ARAgingLobValidation.getText();
		
		Thread.sleep(2000);

		if (ARACValidation.contentEquals("Please select Client") && ARALValidation.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Validation Not Done Successfully");
		}

		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.ARAgingAcceptError.click();

		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("ARAgingDetailsReport", 1, 0));
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("ARAgingDetailsReport", 1, 1));
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("ARAgingDetailsReport", 1, 3));
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("ARAgingDetailsReport", 1, 4));
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.Execute.click();
		Thread.sleep(2000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ARAgingDetailsReport.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ARAgingDetailsReport.png");

		String header =
				AR_Aging_Details_Report_Page_Objects.ARAgingReportText.getText();
		 
		Thread.sleep(2000);

		if(header.contentEquals("Report")) 
		{ 
			extenttestCase.log(Status.PASS,
					"AR Aging Report Generated"); 
		} 

		Thread.sleep(2000);
		driver.switchTo().frame("pibsReport");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(AR_Aging_Details_Report_Page_Objects.DownloadLink).click().perform();
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		Thread.sleep(2000);
		action1.moveToElement(AR_Aging_Details_Report_Page_Objects.CSVDownloadLink).click().perform();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "AR Aging Details CSV Report Downloaded");
		Thread.sleep(2000);


		action.moveToElement(AR_Aging_Details_Report_Page_Objects.DownloadLink).click().perform();
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		Thread.sleep(2000);
		action2.moveToElement(AR_Aging_Details_Report_Page_Objects.PDFDownloadLink).click().perform();
		Thread.sleep(2000);
		extenttestCase.log(Status.PASS, "AR Aging Details PDF Report Downloaded");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);


		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.ARAgingReportHeader.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.ARAgingReportHeader.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.ARAgingClearSearch.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.ARAgingSearchHeader.click();
		Thread.sleep(2000);
		AR_Aging_Details_Report_Page_Objects.ARAgingSearchHeader.click();


	}
}
