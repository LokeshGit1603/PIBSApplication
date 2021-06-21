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
import pageObjects.AR_Aging_Details_Report_Page_Objects;
import pageObjects.Adjustments_Report_Page_Objects;
import pageObjects.Cash_Posting_Report_Page_Objects;

public class Cash_Posting_Report extends CommonFunctions{

	static Logger logger = Logger.getLogger(Cash_Posting_Report.class);
	
	JavascriptExecutor js;

	@Test(priority = 0)
	public void clickReports() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying Cash Posting Details Report");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, Cash_Posting_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Cash Posting Details Report Menu");
		/*
		 * Cash_Posting_Report_Page_Objects.ReportsClick.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void CashPostingDetailsReport() throws Throwable {

		extenttestCase.log(Status.INFO, "Navigating to Cash Posting Details Report");
		Cash_Posting_Report_Page_Objects.CPDetailMenu.click();
		Thread.sleep(3000);
		Cash_Posting_Report_Page_Objects.Execute.click();
		Thread.sleep(3000);
		String Warn1 = Cash_Posting_Report_Page_Objects.Warn1.getText();
		System.out.println(Warn1);

		String Warn2 = Cash_Posting_Report_Page_Objects.Warn2.getText();
		System.out.println(Warn2);

		if (Warn1.contentEquals("Please select Client") && Warn2.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Mandatory Field validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Mandatory Field validation Not Done Successfully");
		}

		Cash_Posting_Report_Page_Objects.CPAcceptError.click();
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("CPDetailsReport", 1, 0));
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("CPDetailsReport", 1, 1));
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);
		/*
		 * Adjustments_Report_Page_Objects.CloseSearchbarClient.click();
		 * Thread.sleep(2000);
		 */

		Cash_Posting_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("CPDetailsReport", 1, 2));
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("CPDetailsReport", 1, 3));
		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);

		/*
		 * Adjustments_Report_Page_Objects.CloseSearchbarLOB.click();
		 * Thread.sleep(2000);
		 */

		Cash_Posting_Report_Page_Objects.SearchInvNum.click();
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchInvNum.sendKeys(getExcelData("CPDetailsReport", 1, 4));
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchInvStatus.sendKeys(getExcelData("CPDetailsReport", 1, 5));
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchPostFromDate.sendKeys(getExcelData("CPDetailsReport", 1, 6));
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchPostToDate.sendKeys(getExcelData("CPDetailsReport", 1, 7));
		Thread.sleep(2000);


		Cash_Posting_Report_Page_Objects.SearchPostedBy.sendKeys(getExcelData("CPDetailsReport", 1, 8));
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchCheck.sendKeys(getExcelData("CPDetailsReport", 1, 9));
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchDDate.sendKeys(getExcelData("CPDetailsReport", 1, 10));
		Thread.sleep(2000);


		Cash_Posting_Report_Page_Objects.Execute.click();
		Thread.sleep(5000);


		String Warn3 = Cash_Posting_Report_Page_Objects.Warn3.getText();
		System.out.println(Warn3);

		if (Warn3.contentEquals("Date range should be within 14 months")) {
			extenttestCase.log(Status.PASS, "14 Months Date Validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "14 Months Date Validation Not Done Successfully");
		}

		Thread.sleep(2000);
		Cash_Posting_Report_Page_Objects.AcceptDateError.click();
		Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchPostToDate.clear();
		Thread.sleep(2000);
		
		Cash_Posting_Report_Page_Objects.SearchPostToDate.sendKeys(getExcelData(
				"CPDetailsReport", 2, 7)); Thread.sleep(2000);
				
				Cash_Posting_Report_Page_Objects.Execute.click();
				Thread.sleep(2000);

				String Warn4 = Cash_Posting_Report_Page_Objects.Warn4.getText();
				System.out.println(Warn4);

				if (Warn4.contentEquals("To date should be greater than From date")) {
					extenttestCase.log(Status.PASS, "Start and End Date Validation Done Successfully");
				} else {
					extenttestCase.log(Status.FAIL, "Start and End Date Validation Not Done Successfully");
				}	  
				
				Thread.sleep(2000);
				Cash_Posting_Report_Page_Objects.AcceptDateError.click();
				Thread.sleep(2000);

				Cash_Posting_Report_Page_Objects.SearchPostToDate.clear();
				Thread.sleep(2000);

		Cash_Posting_Report_Page_Objects.SearchPostToDate.sendKeys(getExcelData(
				"CPDetailsReport", 3, 7)); Thread.sleep(2000);


				Cash_Posting_Report_Page_Objects.Execute.click();
				Thread.sleep(5000);

				TakesScreenshot screenshot=(TakesScreenshot) driver; 
				File sourceFile = screenshot.getScreenshotAs(OutputType.FILE); 
				File destinationFile = new File("CashPostingDetailsReport.png"); 
				FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("CashPostingDetailsReport.png");

				String header = Cash_Posting_Report_Page_Objects.CPReportHeader.getText();
				System.out.println(header);
				Thread.sleep(2000);

				if(header.contentEquals("Report"))
				{
					extenttestCase.log(Status.PASS, "Cash Posting Details Report Generated");
				}
				
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");

				Thread.sleep(2000);
				driver.switchTo().frame("pibsReport");
				Thread.sleep(2000);

				Actions action = new Actions(driver);
				Thread.sleep(2000);
				action.moveToElement(Cash_Posting_Report_Page_Objects.DownloadLink).click().perform();
				Thread.sleep(2000);
				Actions action1 = new Actions(driver);
				Thread.sleep(2000);
				action1.moveToElement(Cash_Posting_Report_Page_Objects.CSVDownloadLink).click().perform();
				Thread.sleep(2000);
				extenttestCase.log(Status.PASS, "Cash Posting Details CSV Report Downloaded");
				Thread.sleep(2000);

				
				/*
				 * JavascriptExecutor js = (JavascriptExecutor)driver;
				 * 
				 * js.executeScript("window.scroll(0,450)", ""); Thread.sleep(2000);
				 */

				action.moveToElement(Cash_Posting_Report_Page_Objects.DownloadLink).click().perform();
				Thread.sleep(2000);
				Actions action2 = new Actions(driver);
				Thread.sleep(2000);
				
				action2.moveToElement(Cash_Posting_Report_Page_Objects.PDFDownloadLink).click().perform();
				Thread.sleep(2000);
				extenttestCase.log(Status.PASS, "Cash Posting Details PDF Report Downloaded");
				
				/* js.executeScript("window.scroll(0,-450)", ""); */

				Thread.sleep(2000);
				driver.switchTo().defaultContent();
				Thread.sleep(2000);



				Cash_Posting_Report_Page_Objects.CPReportHeader.click();
				Thread.sleep(2000);
				Cash_Posting_Report_Page_Objects.CPReportHeader.click();
				Thread.sleep(2000);
				
				executor.executeScript("window.scrollTo(0, 0)", "");
				Thread.sleep(2000);
				
				Cash_Posting_Report_Page_Objects.CPClearSearch.click();
				Thread.sleep(2000);
				Cash_Posting_Report_Page_Objects.CPSearchHeader.click();
				Thread.sleep(2000);

				Cash_Posting_Report_Page_Objects.CPSearchHeader.click();
				Thread.sleep(2000);

	}


}
