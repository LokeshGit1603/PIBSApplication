package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import pageObjects.AP_Aging_Details_Report_Page_Objects;
import pageObjects.AP_Aging_Summary_Report_Page_Objects;

public class AP_Aging_Summary_Report extends CommonFunctions {


	static Logger logger = Logger.getLogger(AP_Aging_Summary_Report.class);

	@Test(priority = 0)
	public void clickReports() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying AP Aging Summary Report");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, AP_Aging_Summary_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to AP Aging Summary Report Menu");
		/*
		 * AP_Aging_Summary_Report_Page_Objects.ReportsClick.click();
		 * Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void APAgingSummaryReport() throws Throwable {

		extenttestCase.log(Status.INFO, "Navigating to AP Aging Summary Report");
		AP_Aging_Summary_Report_Page_Objects.APAgingSummaryMenu.click();
		Thread.sleep(3000);
		AP_Aging_Summary_Report_Page_Objects.Execute.click();
		Thread.sleep(3000);
		String Warn1 = AP_Aging_Summary_Report_Page_Objects.Warn1.getText();
		

		String Warn2 = AP_Aging_Summary_Report_Page_Objects.Warn2.getText();
		

		if (Warn1.contentEquals("Please select Client") && Warn2.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Mandatory Field validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Mandatory Field validation Not Done Successfully");
		}

		AP_Aging_Summary_Report_Page_Objects.APAgingAcceptError.click();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("APAgingSummaryReport", 1, 0));
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("APAgingSummaryReport", 1, 1));
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);
		/*
		 * Adjustments_Report_Page_Objects.CloseSearchbarClient.click();
		 * Thread.sleep(2000);
		 */

		AP_Aging_Summary_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("APAgingSummaryReport", 1, 2));
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("APAgingSummaryReport", 1, 3));
		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);

		/*
		 * Adjustments_Report_Page_Objects.CloseSearchbarLOB.click();
		 * Thread.sleep(2000);
		 */

		AP_Aging_Summary_Report_Page_Objects.SearchAsofDate.click();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchAsofDate.clear();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchAsofDate.sendKeys(getExcelData("APAgingSummaryReport", 1, 4));
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchPayTo.click();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchPayTo.sendKeys(getExcelData("APAgingSummaryReport", 1, 5));
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchStartDOR.sendKeys(getExcelData("APAgingSummaryReport", 1, 6));
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchEndDOR.click();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchEndDOR.sendKeys(getExcelData("APAgingSummaryReport", 1, 7));
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchStartPIBS.click();
		Thread.sleep(2000);


		AP_Aging_Summary_Report_Page_Objects.SearchStartPIBS.sendKeys(getExcelData("APAgingSummaryReport", 1, 8));
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchEndPIBS.click();
		Thread.sleep(2000);


		AP_Aging_Summary_Report_Page_Objects.SearchEndPIBS.sendKeys(getExcelData("APAgingSummaryReport", 1, 9));
		Thread.sleep(2000);


		AP_Aging_Summary_Report_Page_Objects.SearchProvider.click();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchProvider.sendKeys(getExcelData("APAgingSummaryReport", 1, 10));
		Thread.sleep(2000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);


		AP_Aging_Summary_Report_Page_Objects.Execute.click();
		Thread.sleep(5000);


		String Warn3 = AP_Aging_Summary_Report_Page_Objects.Warn3.getText();
		

		if (Warn3.contentEquals("Date range should be within 4 months")) {
			extenttestCase.log(Status.PASS, "4 Months Date Validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "4 Months Date Validation Not Done Successfully");
		}

		Thread.sleep(2000);
		AP_Aging_Summary_Report_Page_Objects.AcceptDateError.click();
		Thread.sleep(2000);

		AP_Aging_Summary_Report_Page_Objects.SearchEndPIBS.clear();
		Thread.sleep(2000);
		
		AP_Aging_Summary_Report_Page_Objects.SearchEndPIBS.sendKeys(getExcelData(
				"APAgingSummaryReport", 2, 9)); Thread.sleep(2000);


				AP_Aging_Summary_Report_Page_Objects.Execute.click();
				Thread.sleep(2000);

				String Warn4 = AP_Aging_Summary_Report_Page_Objects.Warn4.getText();
				

				if (Warn4.contentEquals("To date should be greater than From date")) {
					extenttestCase.log(Status.PASS, "Start and End Date Validation for PIBS Done Successfully");
				} else {
					extenttestCase.log(Status.FAIL, "Start and End Date Validation for PIBS Not Done Successfully");
				}	  

				Thread.sleep(2000);
				AP_Aging_Summary_Report_Page_Objects.AcceptDateError.click();
				Thread.sleep(2000);

				AP_Aging_Summary_Report_Page_Objects.SearchEndPIBS.clear();
				Thread.sleep(2000);

				AP_Aging_Summary_Report_Page_Objects.SearchEndPIBS.sendKeys(getExcelData(
						"APAgingSummaryReport", 3, 9)); Thread.sleep(2000);


						AP_Aging_Summary_Report_Page_Objects.SearchEndDOR.clear();
						Thread.sleep(2000);

						AP_Aging_Summary_Report_Page_Objects.SearchEndDOR.sendKeys(getExcelData(
								"APAgingSummaryReport", 2, 7)); Thread.sleep(2000);


								AP_Aging_Summary_Report_Page_Objects.Execute.click();
								Thread.sleep(2000);

								String Warn5 = AP_Aging_Summary_Report_Page_Objects.Warn5.getText();
								

								if (Warn5.contentEquals("Start date should be greater than End date")) {
									extenttestCase.log(Status.PASS, "Start and End Date Validation for DOR Done Successfully");
								} else {
									extenttestCase.log(Status.FAIL, "Start and End Date Validation for DOR Not Done Successfully");
								}	  

								Thread.sleep(2000);
								AP_Aging_Summary_Report_Page_Objects.AcceptDateError.click();
								Thread.sleep(2000);

								AP_Aging_Summary_Report_Page_Objects.SearchEndDOR.clear();
								Thread.sleep(2000);

								AP_Aging_Summary_Report_Page_Objects.SearchEndDOR.sendKeys(getExcelData(
										"APAgingSummaryReport", 1, 7)); Thread.sleep(2000);

										AP_Aging_Summary_Report_Page_Objects.Execute.click();
										Thread.sleep(5000);

				TakesScreenshot screenshot=(TakesScreenshot) driver; 
				File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
				File destinationFile = new File("APAgingSummaryReport.png"); 
				FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("APAgingSummaryReport.png");

				String header = AP_Aging_Summary_Report_Page_Objects.APSReportHeader.getText();
				
				Thread.sleep(2000);

				if(header.contentEquals("Report"))
				{
					extenttestCase.log(Status.PASS, "AP Aging Summary Report Generated");
				}
				
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("window.scroll(0,450)", "");


				Thread.sleep(2000);
				driver.switchTo().frame("pibsReport");
				Thread.sleep(2000);

				Actions action = new Actions(driver);
				Thread.sleep(2000);
				action.moveToElement(AP_Aging_Summary_Report_Page_Objects.DownloadLink).click().perform();
				Thread.sleep(2000);
				Actions action1 = new Actions(driver);
				Thread.sleep(2000);
				action1.moveToElement(AP_Aging_Summary_Report_Page_Objects.CSVDownloadLink).click().perform();
				Thread.sleep(2000);
				extenttestCase.log(Status.PASS, "AP Aging Summary CSV Report Downloaded");
				Thread.sleep(2000);


				action.moveToElement(AP_Aging_Summary_Report_Page_Objects.DownloadLink).click().perform();
				Thread.sleep(2000);
				Actions action2 = new Actions(driver);
				Thread.sleep(2000);
				action2.moveToElement(AP_Aging_Summary_Report_Page_Objects.PDFDownloadLink).click().perform();
				Thread.sleep(2000);
				extenttestCase.log(Status.PASS, "AP Aging Summary PDF Report Downloaded");

				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);


				AP_Aging_Summary_Report_Page_Objects.APSReportHeader.click();
				Thread.sleep(2000);
				AP_Aging_Summary_Report_Page_Objects.APSReportHeader.click();
				Thread.sleep(2000);
				

				executor.executeScript("window.scroll(0,-450)", "");
				Thread.sleep(2000);
				
				AP_Aging_Summary_Report_Page_Objects.APSClearSearch.click();
				Thread.sleep(2000);

				AP_Aging_Summary_Report_Page_Objects.APSSearchHeader.click();
				Thread.sleep(2000);

				AP_Aging_Summary_Report_Page_Objects.APSSearchHeader.click();
				Thread.sleep(2000);

	}

}
