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
import pageObjects.AR_Aging_Details_Report_Page_Objects;
import pageObjects.AR_Aging_Summary_Report_Page_Objects;
import pageObjects.Adjustments_Report_Page_Objects;
import pageObjects.Unbilling_Services_Report_Page_Objects;

public class Unbilling_Services_Report extends CommonFunctions {

	static Logger logger = Logger.getLogger(Unbilling_Services_Report.class);

	@Test(priority = 0)
	public void clickReports() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying Unbilling Services Report");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, Unbilling_Services_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Unbilling Services Report Menu");
		/*
		 * Unbilling_Services_Report_Page_Objects.ReportsClick.click();
		 * Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void UnbillingServices() throws Throwable {

		extenttestCase.log(Status.INFO, "Navigating to AR Aging Summary");
		Unbilling_Services_Report_Page_Objects.UnbillingServices.click();
		Thread.sleep(3000);
		Unbilling_Services_Report_Page_Objects.Execute.click();
		Thread.sleep(3000);
		String Warn1 = Unbilling_Services_Report_Page_Objects.Warn1.getText();
		

		String Warn2 = Unbilling_Services_Report_Page_Objects.Warn2.getText();
		

		if (Warn1.contentEquals("Please select Client") && Warn2.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Validation Not Done Successfully");
		}

		Unbilling_Services_Report_Page_Objects.UnbillingAcceptError.click();
		Thread.sleep(2000);

		Unbilling_Services_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("unbillingservices", 1, 0));
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("unbillingservices", 1, 1));
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);

		Unbilling_Services_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("unbillingservices", 1, 2));
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("unbillingservices", 1, 3));
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);
		Unbilling_Services_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);

		Unbilling_Services_Report_Page_Objects.SearchUnique.click();
		Thread.sleep(2000);

		Unbilling_Services_Report_Page_Objects.SearchUnique.sendKeys(getExcelData("unbillingservices", 1, 4));
		Thread.sleep(2000);

		Unbilling_Services_Report_Page_Objects.Execute.click();
		Thread.sleep(5000);


		TakesScreenshot screenshot = (TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("UnbilledServicesReport.png"); FileHandler.copy(sourceFile,
						destinationFile);
				extenttestCase.addScreenCaptureFromPath("UnbilledServicesReport.png");
				
				String header = Unbilling_Services_Report_Page_Objects.UnbillingServicesReportHeader.getText();
				
				Thread.sleep(2000);

				if(header.contentEquals("Report"))
				{
					extenttestCase.log(Status.PASS, "Unbilling Services Report Generated");
				}


				Thread.sleep(2000);
				driver.switchTo().frame("pibsReport");
				Thread.sleep(2000);

				Actions action = new Actions(driver);
				Thread.sleep(2000);
				action.moveToElement(Unbilling_Services_Report_Page_Objects.DownloadLink).click().perform();
				Thread.sleep(2000);
				Actions action1 = new Actions(driver);
				Thread.sleep(2000);
				action1.moveToElement(Unbilling_Services_Report_Page_Objects.CSVDownloadLink).click().perform();
				Thread.sleep(2000);
				extenttestCase.log(Status.PASS, "Unbilling Services CSV Report Downloaded");
				Thread.sleep(2000);


					action.moveToElement(Unbilling_Services_Report_Page_Objects.DownloadLink).click().perform();
					Thread.sleep(2000);
					Actions action2 = new Actions(driver);
					Thread.sleep(2000);
					action2.moveToElement(Unbilling_Services_Report_Page_Objects.PDFDownloadLink).click().perform();
					Thread.sleep(2000);
					extenttestCase.log(Status.PASS, "Unbilling Services PDF Report Downloaded");

						
						driver.switchTo().defaultContent();
						Thread.sleep(2000);

						Unbilling_Services_Report_Page_Objects.UnbillingServicesReportHeader.click();
						Thread.sleep(2000);
						Unbilling_Services_Report_Page_Objects.UnbillingServicesReportHeader.click();
						Thread.sleep(2000);
						Unbilling_Services_Report_Page_Objects.UnbillServiceClearSearch.click();
						Thread.sleep(2000);
						Unbilling_Services_Report_Page_Objects.UnbillServiceSearchHeader.click();
						Thread.sleep(2000);

						Unbilling_Services_Report_Page_Objects.UnbillServiceSearchHeader.click();
						Thread.sleep(2000);

					}

}
