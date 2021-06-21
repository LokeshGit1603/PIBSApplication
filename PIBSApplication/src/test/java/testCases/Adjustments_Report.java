package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import pageObjects.AR_Aging_Summary_Report_Page_Objects;
import pageObjects.Adjustments_Report_Page_Objects;
import pageObjects.Unbilling_Services_Report_Page_Objects;

public class Adjustments_Report extends CommonFunctions{

	static Logger logger = Logger.getLogger(Adjustments_Report.class);

	@Test(priority = 0)
	public void clickReports() throws InterruptedException, IOException {
		extenttestCase = extentReport.createTest("Verifying Adjustments Report");
		logger.info("Navigating to Reports");
		PageFactory.initElements(driver, Adjustments_Report_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Adjustments Report Menu");
		/*
		 * Adjustments_Report_Page_Objects.ReportsClick.click(); Thread.sleep(2000);
		 */
	}

	@Test(priority = 1)
	public void AdjustReport() throws Throwable {

		extenttestCase.log(Status.INFO, "Navigating to Adjustments Report");
		Adjustments_Report_Page_Objects.AdjustMenu.click();
		Thread.sleep(3000);
		Adjustments_Report_Page_Objects.Execute.click();
		Thread.sleep(3000);
		String Warn1 = Adjustments_Report_Page_Objects.Warn1.getText();
		

		String Warn2 = Adjustments_Report_Page_Objects.Warn2.getText();
		

		if (Warn1.contentEquals("Please select Client") && Warn2.contentEquals("Please select LOB")) {
			extenttestCase.log(Status.PASS, "Mandatory Field validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "Mandatory Field validation Not Done Successfully");
		}

		Adjustments_Report_Page_Objects.AdjustAcceptError.click();
		Thread.sleep(2000);

		Adjustments_Report_Page_Objects.SearchClient.click();
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("adjustment", 1, 0));
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarClientresult1.click();
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.CloseSearchbarClient.click();
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarClient.sendKeys(getExcelData("adjustment", 1, 1));
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarClientresult2.click();
		Thread.sleep(2000);


		Adjustments_Report_Page_Objects.SearchLob.click();
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("adjustment", 1, 2));
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarLobresult1.click();
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.CloseSearchbarLOB.click();
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarLOB.sendKeys(getExcelData("adjustment", 1, 3));
		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.SearchbarLobresult2.click();
		Thread.sleep(2000);



		Adjustments_Report_Page_Objects.SearchUnique.click();
		Thread.sleep(2000);

		Adjustments_Report_Page_Objects.SearchUnique.sendKeys(getExcelData("adjustment", 1, 4));
		Thread.sleep(2000);

		Adjustments_Report_Page_Objects.SearchProvider.sendKeys(getExcelData("adjustment", 1, 5));
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);


		Adjustments_Report_Page_Objects.SearchFromDate.sendKeys(getExcelData("adjustment", 1, 6));
		Thread.sleep(2000);

		Adjustments_Report_Page_Objects.SearchToDate.sendKeys(getExcelData("adjustment", 1, 7));
		Thread.sleep(2000);


		Adjustments_Report_Page_Objects.SearchType.sendKeys(getExcelData("adjustment", 1, 8));
		Thread.sleep(2000);


		Adjustments_Report_Page_Objects.Execute.click();
		Thread.sleep(2000);


		String Warn3 = Adjustments_Report_Page_Objects.Warn3.getText();
		

		if (Warn3.contentEquals("Date range should be within 6 months")) {
			extenttestCase.log(Status.PASS, "6 Months Date Validation Done Successfully");
		} else {
			extenttestCase.log(Status.FAIL, "6 Months Date Validation Not Done Successfully");
		}

		Thread.sleep(2000);
		Adjustments_Report_Page_Objects.AcceptDateError.click();
		Thread.sleep(2000);

		Adjustments_Report_Page_Objects.SearchToDate.clear();
		Thread.sleep(2000);

		Adjustments_Report_Page_Objects.SearchToDate.sendKeys(getExcelData(
				"adjustment", 2, 7)); Thread.sleep(2000);
				
				Adjustments_Report_Page_Objects.Execute.click();
				Thread.sleep(2000);

				String Warn4 = Adjustments_Report_Page_Objects.Warn4.getText();
				

				if (Warn4.contentEquals("To date should be greater than From date")) {
					extenttestCase.log(Status.PASS, "Start and End Date Validation Done Successfully");
				} else {
					extenttestCase.log(Status.FAIL, "Start and End Date Validation Not Done Successfully");
				}	  
				
				Thread.sleep(2000);
				Adjustments_Report_Page_Objects.AcceptDateError.click();
				Thread.sleep(2000);

				Adjustments_Report_Page_Objects.SearchToDate.clear();
				Thread.sleep(2000);

				Adjustments_Report_Page_Objects.SearchToDate.sendKeys(getExcelData(
						"adjustment", 3, 7)); Thread.sleep(2000);


						Adjustments_Report_Page_Objects.Execute.click();
						Thread.sleep(2000);

						TakesScreenshot screenshot = (TakesScreenshot) driver;
						File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
						File destinationFile = new File("AdjustmentsReport.png");
						FileHandler.copy(sourceFile, destinationFile);
						extenttestCase.addScreenCaptureFromPath("AdjustmentsReport.png");

						String header = Adjustments_Report_Page_Objects.AdjustReportText.getText();
						
						Thread.sleep(2000);

						if(header.contentEquals("Report"))
						{
							extenttestCase.log(Status.PASS, "Adjustment Report Generated");
						}

						Thread.sleep(2000);
						driver.switchTo().frame("pibsReport");
						Thread.sleep(2000);

						Actions action = new Actions(driver);
						Thread.sleep(2000);
						action.moveToElement(Adjustments_Report_Page_Objects.DownloadLink).click().perform();
						Thread.sleep(2000);
						Actions action1 = new Actions(driver);
						Thread.sleep(2000);
						action1.moveToElement(Adjustments_Report_Page_Objects.CSVDownloadLink).click().perform();
						Thread.sleep(2000);

						extenttestCase.log(Status.PASS, "Adjustments CSV Report Downloaded");
						Thread.sleep(2000);


						action.moveToElement(Adjustments_Report_Page_Objects.DownloadLink).click().perform();
						Thread.sleep(2000);
						Actions action2 = new Actions(driver);
						Thread.sleep(2000);
						action2.moveToElement(Adjustments_Report_Page_Objects.PDFDownloadLink).click().perform();
						Thread.sleep(2000);
						extenttestCase.log(Status.PASS, "Adjustments PDF Report Downloaded");


						Thread.sleep(2000);
						driver.switchTo().defaultContent();
						Thread.sleep(2000);



						Adjustments_Report_Page_Objects.AdjustReportHeader.click();
						Thread.sleep(2000);
						Adjustments_Report_Page_Objects.AdjustReportHeader.click();
						Thread.sleep(2000);
						Adjustments_Report_Page_Objects.AdjustClearSearch.click();
						Thread.sleep(2000);
						Adjustments_Report_Page_Objects.AdjustSearchHeader.click();
						Thread.sleep(2000);

						Adjustments_Report_Page_Objects.AdjustSearchHeader.click();
						Thread.sleep(2000);

	}
}

