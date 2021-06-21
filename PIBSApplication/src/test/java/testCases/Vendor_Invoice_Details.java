package testCases;

import java.awt.Robot;
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
import pageObjects.Cash_Postings_Details_Page_Objects;
import pageObjects.Vendor_Invoice_Details_Page_Objects;

public class Vendor_Invoice_Details extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Vendor_Invoice_Details.class);
	
	////////////////////////////////////// Shipping Type ///////////////////////////////////////
	
	@Test(priority = 0)
	public void clickVendorInvoice() throws InterruptedException, IOException
	{
		extenttestCase = extentReport.createTest("Verifying Vendor Invoice Details");
		PageFactory.initElements(driver, Vendor_Invoice_Details_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Vendor Invoice Menu");
		
		Vendor_Invoice_Details_Page_Objects.VendorInvoiceMenu.click(); Thread.sleep(2000);
		 
	}
	
	@Test(priority = 1)
	public void verifyShippingSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Searching Shipping Vendor Invoice Record");
		Vendor_Invoice_Details_Page_Objects.Searchheader.click();
		Thread.sleep(2000);

		Vendor_Invoice_Details_Page_Objects.SearchInvoice.sendKeys(getExcelData("videtail", 2, 0));
		Thread.sleep(2000);

		Vendor_Invoice_Details_Page_Objects.SearchType.sendKeys(getExcelData("videtail", 2, 1));
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchClient.sendKeys(getExcelData("videtail", 2, 2)); 
		Thread.sleep(2000);             


		Vendor_Invoice_Details_Page_Objects.SearchLOB.sendKeys(getExcelData("videtail", 2, 3)); 
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchProvider.sendKeys(getExcelData("videtail", 2, 4));
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);   
		Vendor_Invoice_Details_Page_Objects.SearchSDate.sendKeys(getExcelData("videtail", 2, 5));
		Thread.sleep(2000);
		
		
		Vendor_Invoice_Details_Page_Objects.SearchStatus.sendKeys(getExcelData("videtail", 2, 7));
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchClick.click();
		Thread.sleep(2000);


		String InvoiceResult = Vendor_Invoice_Details_Page_Objects.InvoiceResult.getText();
		System.out.println(InvoiceResult);
		

		String InvoiceDateResult = Vendor_Invoice_Details_Page_Objects.InvoiceDateResult.getText();
		System.out.println(InvoiceDateResult);

		String TypeResult = Vendor_Invoice_Details_Page_Objects.TypeResult.getText();
		System.out.println(TypeResult);

		String LOBResult = Vendor_Invoice_Details_Page_Objects.LOBResult.getText();
		System.out.println(LOBResult);
		
		String ProviderResult = Vendor_Invoice_Details_Page_Objects.ProviderResult.getText();
		System.out.println(ProviderResult);
		
		String StatusResult = Vendor_Invoice_Details_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);

		if(InvoiceResult.contentEquals(getExcelData("videtail", 2, 0))
				&& InvoiceDateResult.contentEquals(getExcelData("videtail", 2, 5))
				&& TypeResult.contentEquals(getExcelData("videtail", 2, 1))
				&& LOBResult.contentEquals(getExcelData("videtail", 2, 3))
				&& ProviderResult.contentEquals(getExcelData("videtail", 3, 4))
				&& StatusResult.contentEquals(getExcelData("videtail", 2, 7)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Vendor Invoice Listing");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Vendor Invoice Listing");
		}

	}
	
	@Test(priority = 2)
	public void cashpostingdetails() throws InterruptedException, IOException {
		extenttestCase.log(Status.INFO, "Navigating to Shipping Vendor Invoice details page");
		Vendor_Invoice_Details_Page_Objects.DetailAction.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("ShippingVendorInvoice.png"); FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("ShippingVendorInvoice.png");

	}
	
	@Test(priority = 3)
	public void VerifyExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
		Vendor_Invoice_Details_Page_Objects.DetailsHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DetailsHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.LineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.LineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.AUHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.AUHeader.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 4)
	public void SearchInvoiceField() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Search Functionality in Shipping Invoice Line Items Grid");
	    Vendor_Invoice_Details_Page_Objects.SearchField.sendKeys(getExcelData("videtail", 2, 9));
	    Thread.sleep(2000);
	    Vendor_Invoice_Details_Page_Objects.SearchField.clear();
	    Thread.sleep(2000);
	    
	}
	
	@Test(priority = 5)
	public void sortInvoiceGrid() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Shipping Invoice Line Item Grid");
		Vendor_Invoice_Details_Page_Objects.SortDOS.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortService.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortPrice.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortQTY.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortStatus.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortClientInvoice.click();
		Thread.sleep(2000);		
	}
	
	@Test(priority = 6)
	public void ViewAll() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Audit History in Shipping Vendor Invoice");
	  
	  Vendor_Invoice_Details_Page_Objects.VIDViewall.click(); 
	  String mainwindow = driver.getWindowHandle(); 
	  Thread.sleep(2000); 
	  Set<String> handles = driver.getWindowHandles(); 
	  for (String handle : handles) 
	  {
	  if(!handle.equals(mainwindow)) 
	  { 
		  driver.switchTo().window(handle);
		  Thread.sleep(2000); 
	  System.out.println(driver.getCurrentUrl().toString());
	  extenttestCase.log(Status.PASS, "View All Link Verified in Audit History");
	  driver.close(); 
	  } 
	  driver.switchTo().window(mainwindow); 
	  } 
	}
	
	@Test(priority = 7)
	public void VerifyReject() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Shipping Vendor Invoice Reject");
		Thread.sleep(2000); 
		Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.YesRejectbtn.click();
		 Thread.sleep(2000);
		 String RejectWarn = Vendor_Invoice_Details_Page_Objects.RejectWarn.getText();
		 System.out.println(RejectWarn);
		 Thread.sleep(2000);
		 
		 if(RejectWarn.contentEquals("Please enter the notes"))
		 {
			 extenttestCase.log(Status.PASS, "Rejection Validation Done Successfully in Shipping Type");
		 }
		 else
		 {
			 extenttestCase.log(Status.FAIL, "Rejection Validation Failed in Shipping Type");
		 }
		 
		 
		 Vendor_Invoice_Details_Page_Objects.RejectNote.sendKeys(getExcelData("videtail", 2, 8));
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
		 Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public void VerifyCancel() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Shipping Vendor Invoice Cancel");
		Vendor_Invoice_Details_Page_Objects.Cancel.click();
		 Thread.sleep(2000);
	}
	
    ////////////////////////////////////// Travel ///////////////////////////////////////
	
	@Test(priority = 9)
	public void verifyTravelSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Searching Travel Vendor Invoice Record");
		Vendor_Invoice_Details_Page_Objects.Searchheader.click();
		Thread.sleep(2000);

		Vendor_Invoice_Details_Page_Objects.SearchInvoice.sendKeys(getExcelData("videtail", 7, 0));
		Thread.sleep(2000);

		Vendor_Invoice_Details_Page_Objects.SearchType.sendKeys(getExcelData("videtail", 7, 1));
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchClient.sendKeys(getExcelData("videtail", 7, 2)); 
		Thread.sleep(2000);             


		Vendor_Invoice_Details_Page_Objects.SearchLOB.sendKeys(getExcelData("videtail", 7, 3)); 
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchProvider.sendKeys(getExcelData("videtail", 7, 4));
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);   
		Vendor_Invoice_Details_Page_Objects.SearchSDate.sendKeys(getExcelData("videtail", 7, 5));
		Thread.sleep(2000);
		
		
		Vendor_Invoice_Details_Page_Objects.SearchStatus.sendKeys(getExcelData("videtail", 7, 7));
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchClick.click();
		Thread.sleep(2000);


		String InvoiceResult = Vendor_Invoice_Details_Page_Objects.InvoiceResult.getText();
		System.out.println(InvoiceResult);
		

		String InvoiceDateResult = Vendor_Invoice_Details_Page_Objects.InvoiceDateResult.getText();
		System.out.println(InvoiceDateResult);

		String TypeResult = Vendor_Invoice_Details_Page_Objects.TypeResult.getText();
		System.out.println(TypeResult);

		String LOBResult = Vendor_Invoice_Details_Page_Objects.LOBResult.getText();
		System.out.println(LOBResult);
		
		String ProviderResult = Vendor_Invoice_Details_Page_Objects.ProviderResult.getText();
		System.out.println(ProviderResult);
		
		String StatusResult = Vendor_Invoice_Details_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);

		if(InvoiceResult.contentEquals(getExcelData("videtail", 7, 0))
				&& InvoiceDateResult.contentEquals(getExcelData("videtail", 7, 5))
				&& TypeResult.contentEquals(getExcelData("videtail", 7, 1))
				&& LOBResult.contentEquals(getExcelData("videtail", 7, 3))
				&& ProviderResult.contentEquals(getExcelData("videtail", 8, 4))
				&& StatusResult.contentEquals(getExcelData("videtail", 7, 7)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Travel Vendor Invoice Listing");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Travel Vendor Invoice Listing");
		}
	}
	
	@Test(priority = 10)
	public void Traveldetails() throws InterruptedException, IOException {
		extenttestCase.log(Status.INFO, "Navigating to Travel Type Vendor Invoice details page");
		Vendor_Invoice_Details_Page_Objects.DetailAction.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("TravelVendorInvoice.png"); FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("TravelVendorInvoice.png");

	}
	
	@Test(priority = 11)
	public void VerifyTravelExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
		Vendor_Invoice_Details_Page_Objects.DetailsHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DetailsHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.LineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.LineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.AUHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.AUHeader.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 12)
	public void SearchTravelInvoiceField() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Search Functionality in Travel Invoice Line Items Grid");
	    Vendor_Invoice_Details_Page_Objects.SearchField.sendKeys(getExcelData("videtail", 7, 9));
	    Thread.sleep(2000);
	    Vendor_Invoice_Details_Page_Objects.SearchField.clear();
	    Thread.sleep(2000);
	    
	}
	
	@Test(priority = 13)
	public void sortTravelInvoiceGrid() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Travel Invoice Line Item Grid");
		Vendor_Invoice_Details_Page_Objects.SortDOS.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortService.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortPrice.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortQTY.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortStatus.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortClientInvoice.click();
		Thread.sleep(2000);		
	}
	
	@Test(priority = 14)
	public void TravelViewAll() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Audit History in Travel Vendor Invoice");
	  
		Vendor_Invoice_Details_Page_Objects.VIDViewall.click(); 
	  String mainwindow = driver.getWindowHandle(); 
	  Thread.sleep(2000); 
	  Set<String> handles = driver.getWindowHandles(); 
	  for (String handle : handles) 
	  {
	  if(!handle.equals(mainwindow)) 
	  { 
		  driver.switchTo().window(handle);
		  Thread.sleep(2000); 
	  System.out.println(driver.getCurrentUrl().toString());
	  extenttestCase.log(Status.PASS, "View All Link Verified in Travel Audit History");
	  driver.close(); 
	  } 
	  driver.switchTo().window(mainwindow); 
	  } 
	}
	
	@Test(priority = 15)
	public void VerifyTravelReject() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Travel Vendor Invoice Reject");
		Thread.sleep(2000); 
		Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.YesRejectbtn.click();
		 Thread.sleep(2000);
		 String RejectWarn = Vendor_Invoice_Details_Page_Objects.RejectWarn.getText();
		 System.out.println(RejectWarn);
		 Thread.sleep(2000);
		 
		 if(RejectWarn.contentEquals("Please enter the notes"))
		 {
			 extenttestCase.log(Status.PASS, "Rejection Validation Done Successfully in Travel Type");
		 }
		 else
		 {
			 extenttestCase.log(Status.FAIL, "Rejection Validation Failed in Travel Type");
		 }
		 
		 
		 Vendor_Invoice_Details_Page_Objects.RejectNote.sendKeys(getExcelData("videtail", 7, 8));
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
		 Thread.sleep(2000);
	}
	
	@Test(priority = 16)
	public void VerifyTravelCancel() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Travel Vendor Invoice Cancel");
		 Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.Cancel.click();
		 Thread.sleep(2000);
	}
	
//////////////////////////////////////Vaccine ///////////////////////////////////////

@Test(priority = 17)
public void verifyVaccineSearch() throws Throwable
{
extenttestCase.log(Status.INFO, "Searching Vaccine Vendor Invoice Record");
Vendor_Invoice_Details_Page_Objects.Searchheader.click();
Thread.sleep(2000);

Vendor_Invoice_Details_Page_Objects.SearchInvoice.sendKeys(getExcelData("videtail", 12, 0));
Thread.sleep(2000);

Vendor_Invoice_Details_Page_Objects.SearchType.sendKeys(getExcelData("videtail", 12, 1));
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchClient.sendKeys(getExcelData("videtail", 12, 2)); 
Thread.sleep(2000);             


Vendor_Invoice_Details_Page_Objects.SearchLOB.sendKeys(getExcelData("videtail", 12, 3)); 
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchProvider.sendKeys(getExcelData("videtail", 12, 4));
Thread.sleep(2000);

Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(2000);   
Vendor_Invoice_Details_Page_Objects.SearchSDate.sendKeys(getExcelData("videtail", 12, 5));
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchStatus.sendKeys(getExcelData("videtail", 12, 7));
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchClick.click();
Thread.sleep(2000);


String InvoiceResult = Vendor_Invoice_Details_Page_Objects.InvoiceResult.getText();
System.out.println(InvoiceResult);


String InvoiceDateResult = Vendor_Invoice_Details_Page_Objects.InvoiceDateResult.getText();
System.out.println(InvoiceDateResult);

String TypeResult = Vendor_Invoice_Details_Page_Objects.TypeResult.getText();
System.out.println(TypeResult);

String LOBResult = Vendor_Invoice_Details_Page_Objects.LOBResult.getText();
System.out.println(LOBResult);

String ProviderResult = Vendor_Invoice_Details_Page_Objects.ProviderResult.getText();
System.out.println(ProviderResult);

String StatusResult = Vendor_Invoice_Details_Page_Objects.StatusResult.getText();
System.out.println(StatusResult);

if(InvoiceResult.contentEquals(getExcelData("videtail", 12, 0))
&& InvoiceDateResult.contentEquals(getExcelData("videtail", 12, 5))
&& TypeResult.contentEquals(getExcelData("videtail", 12, 1))
&& LOBResult.contentEquals(getExcelData("videtail", 12, 3))
&& ProviderResult.contentEquals(getExcelData("videtail", 13, 4))
&& StatusResult.contentEquals(getExcelData("videtail", 12, 7)))
{
extenttestCase.log(Status.PASS, "Got Expected Result in Vaccine Vendor Invoice Listing");
}

else
{
extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Vaccine Vendor Invoice Listing");
}
}

@Test(priority = 18)
public void Vaccinedetails() throws InterruptedException, IOException {
extenttestCase.log(Status.INFO, "Navigating to Vaccine Type Vendor Invoice details page");
Vendor_Invoice_Details_Page_Objects.DetailAction.click();
Thread.sleep(2000);

TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
File("VaccineVendorInvoice.png"); FileHandler.copy(sourceFile, destinationFile);
extenttestCase.addScreenCaptureFromPath("VaccineVendorInvoice.png");

}

@Test(priority = 19)
public void VerifyVaccineExpand() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
Vendor_Invoice_Details_Page_Objects.DetailsHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DetailsHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.LineItemHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.LineItemHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.AUHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.AUHeader.click();
Thread.sleep(2000);
}

@Test(priority = 20)
public void SearchVaccineInvoiceField() throws Throwable
{
extenttestCase.log(Status.INFO, "Verifying Search Functionality in Vaccine Invoice Line Items Grid");
Vendor_Invoice_Details_Page_Objects.SearchField.sendKeys(getExcelData("videtail", 12, 9));
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SearchField.clear();
Thread.sleep(2000);

}

@Test(priority = 21)
public void sortVaccineInvoiceGrid() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Vaccine Invoice Line Item Grid");
Vendor_Invoice_Details_Page_Objects.SortDOS.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortService.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortPrice.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortQTY.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortStatus.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortClientInvoice.click();
Thread.sleep(2000);		
}

@Test(priority = 22)
public void VaccineViewAll() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Audit History in Vaccine Vendor Invoice");

Vendor_Invoice_Details_Page_Objects.VIDViewall.click(); 
String mainwindow = driver.getWindowHandle(); 
Thread.sleep(2000); 
Set<String> handles = driver.getWindowHandles(); 
for (String handle : handles) 
{
if(!handle.equals(mainwindow)) 
{ 
driver.switchTo().window(handle);
Thread.sleep(2000); 
System.out.println(driver.getCurrentUrl().toString());
extenttestCase.log(Status.PASS, "View All Link Verified in Vaccine Audit History");
driver.close(); 
} 
driver.switchTo().window(mainwindow); 
} 
}

@Test(priority = 23)
public void VerifyVaccineReject() throws Throwable
{
extenttestCase.log(Status.INFO, "Verifying Vaccine Vendor Invoice Reject");
Thread.sleep(2000); 
Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.YesRejectbtn.click();
Thread.sleep(2000);
String RejectWarn = Vendor_Invoice_Details_Page_Objects.RejectWarn.getText();
System.out.println(RejectWarn);
Thread.sleep(2000);

if(RejectWarn.contentEquals("Please enter the notes"))
{
extenttestCase.log(Status.PASS, "Rejection Validation Done Successfully in Vaccine Type");
}
else
{
extenttestCase.log(Status.FAIL, "Rejection Validation Failed in Vaccine Type");
}


Vendor_Invoice_Details_Page_Objects.RejectNote.sendKeys(getExcelData("videtail", 12, 8));
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
Thread.sleep(2000);
}

@Test(priority = 24)
public void VerifyVaccineCancel() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Vaccine Vendor Invoice Cancel");
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.Cancel.click();
Thread.sleep(2000);
}
	
////////////////////////////////////// Diagnostic - Matched ///////////////////////////////////////

	@Test(priority = 25)
	public void verifyDiagnosticSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Searching Diagnostic Matched Vendor Invoice Record");
		Vendor_Invoice_Details_Page_Objects.Searchheader.click();
		Thread.sleep(2000);

		Vendor_Invoice_Details_Page_Objects.SearchInvoice.sendKeys(getExcelData("videtail", 17, 0));
		Thread.sleep(2000);

		Vendor_Invoice_Details_Page_Objects.SearchType.sendKeys(getExcelData("videtail", 17, 1));
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchClient.sendKeys(getExcelData("videtail", 17, 2)); 
		Thread.sleep(2000);             


		Vendor_Invoice_Details_Page_Objects.SearchLOB.sendKeys(getExcelData("videtail", 17, 3)); 
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchProvider.sendKeys(getExcelData("videtail", 17, 4));
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);   
		Vendor_Invoice_Details_Page_Objects.SearchSDate.sendKeys(getExcelData("videtail", 17, 5));
		Thread.sleep(2000);
		
		
		Vendor_Invoice_Details_Page_Objects.SearchStatus.sendKeys(getExcelData("videtail", 17, 7));
		Thread.sleep(2000);


		Vendor_Invoice_Details_Page_Objects.SearchClick.click();
		Thread.sleep(2000);


		String InvoiceResult = Vendor_Invoice_Details_Page_Objects.InvoiceResult.getText();
		System.out.println(InvoiceResult);
		

		String InvoiceDateResult = Vendor_Invoice_Details_Page_Objects.InvoiceDateResult.getText();
		System.out.println(InvoiceDateResult);

		String TypeResult = Vendor_Invoice_Details_Page_Objects.TypeResult.getText();
		System.out.println(TypeResult);

		String LOBResult = Vendor_Invoice_Details_Page_Objects.LOBResult.getText();
		System.out.println(LOBResult);
		
		String ProviderResult = Vendor_Invoice_Details_Page_Objects.ProviderResult.getText();
		System.out.println(ProviderResult);
		
		String StatusResult = Vendor_Invoice_Details_Page_Objects.StatusResult.getText();
		System.out.println(StatusResult);

		if(InvoiceResult.contentEquals(getExcelData("videtail", 17, 0))
				&& InvoiceDateResult.contentEquals(getExcelData("videtail", 17, 5))
				&& TypeResult.contentEquals(getExcelData("videtail", 17, 1))
				&& LOBResult.contentEquals(getExcelData("videtail", 17, 3))
				&& ProviderResult.contentEquals(getExcelData("videtail", 18, 4))
				&& StatusResult.contentEquals(getExcelData("videtail", 17, 7)))
		{
			extenttestCase.log(Status.PASS, "Got Expected Result in Diagnostic Matched Vendor Invoice Listing");
		}

		else
		{
			extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Diagnostic Matched Vendor Invoice Listing");
		}
	}
	
	@Test(priority = 26)
	public void Diagnosticdetails() throws InterruptedException, IOException {
		extenttestCase.log(Status.INFO, "Navigating to Diagnostic Matched Type Vendor Invoice details page");
		Vendor_Invoice_Details_Page_Objects.DetailAction.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
				screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
				File("DiagnosticMatchedVendorInvoice.png"); FileHandler.copy(sourceFile, destinationFile);
				extenttestCase.addScreenCaptureFromPath("DiagnosticMatchedVendorInvoice.png");

	}
	
	@Test(priority = 27)
	public void VerifyDiagnosticMatchedExpand() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
		Vendor_Invoice_Details_Page_Objects.DDetailsHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DDetailsHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DMatchLineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DMatchLineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DMisMatchLineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DMisMatchLineItemHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DAUHeader.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.DAUHeader.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 28)
	public void SearchDiagnosticMatchedInvoiceField() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Search Functionality in Diagnostic Matched Invoice Line Items Grid");
	    Vendor_Invoice_Details_Page_Objects.SearchMatchField.sendKeys(getExcelData("videtail", 17, 9));
	    Thread.sleep(2000);
	    Vendor_Invoice_Details_Page_Objects.SearchMatchField.clear();
	    Thread.sleep(2000);
	    
	}
	
	@Test(priority = 29)
	public void VerifyLink() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Unique ID Link in Diagnostic Matched Vendor Invoice");
		  
		Vendor_Invoice_Details_Page_Objects.UniqueLink.click(); 
	  String mainwindow = driver.getWindowHandle(); 
	  Thread.sleep(2000); 
	  Set<String> handles = driver.getWindowHandles(); 
	  for (String handle : handles) 
	  {
	  if(!handle.equals(mainwindow)) 
	  { 
		  driver.switchTo().window(handle);
		  Thread.sleep(2000);
		  String UniqueIDLable = Vendor_Invoice_Details_Page_Objects.UniqueIDLable.getText();

	  if(UniqueIDLable.contentEquals(getExcelData("videtail", 17, 9)))
	  {
	  extenttestCase.log(Status.PASS, "Unique ID Link Verified in Diagnostic Matched Line Items");
	  driver.close(); 
	  } 
	  } 
	  driver.switchTo().window(mainwindow); 
	  }
	}
	
	@Test(priority = 30)
	public void sortDiagnosticMatchedInvoiceGrid() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Diagnostic Matched Invoice Line Item Grid");
		Thread.sleep(2000); 
		Vendor_Invoice_Details_Page_Objects.SortMatchUnique.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMatchDOS.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMatchCPTCode.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMatchServiceCode.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMatchServiceDes.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMatchQTY.click();
		Thread.sleep(2000);	
		Vendor_Invoice_Details_Page_Objects.SortMatchPriceStatus.click();
		Thread.sleep(2000);	
		Vendor_Invoice_Details_Page_Objects.SortMatchStatus.click();
		Thread.sleep(2000);	
	}
	
	@Test(priority = 31)
	public void SearchMisMatchedInvoiceField() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Search Functionality in Diagnostic MisMatched Invoice Line Items Grid");
	    Vendor_Invoice_Details_Page_Objects.SearchMisMatchField.sendKeys(getExcelData("videtail", 17, 9));
	    Thread.sleep(2000);
	    Vendor_Invoice_Details_Page_Objects.SearchMisMatchField.clear();
	    Thread.sleep(2000);
	    
	}
	
	@Test(priority = 32)
	public void sortMisMatchedInvoiceGrid() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Diagnostic MisMatched Invoice Line Item Grid");
		Vendor_Invoice_Details_Page_Objects.SortMisMatchUnique.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMisMatchDOS.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMismatchCPTCode.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMismatchServiceCode.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMisMatchServiceDes.click();
		Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.SortMisMatchQTY.click();
		Thread.sleep(2000);	
		Vendor_Invoice_Details_Page_Objects.SortMisMatchPriceStatus.click();
		Thread.sleep(2000);	
		Vendor_Invoice_Details_Page_Objects.SortMisMatchStatus.click();
		Thread.sleep(2000);	
	}
	
	@Test(priority = 33)
	public void DiagnosticMatchedViewAll() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Audit History in Diagnostic Matched Vendor Invoice");
	  
		Vendor_Invoice_Details_Page_Objects.VIDViewall.click(); 
	  String mainwindow = driver.getWindowHandle(); 
	  Thread.sleep(2000); 
	  Set<String> handles = driver.getWindowHandles(); 
	  for (String handle : handles) 
	  {
	  if(!handle.equals(mainwindow)) 
	  { 
		  driver.switchTo().window(handle);
		  Thread.sleep(2000); 
	  System.out.println(driver.getCurrentUrl().toString());
	  extenttestCase.log(Status.PASS, "View All Link Verified in Diagnostic Matched Audit History");
	  driver.close(); 
	  } 
	  driver.switchTo().window(mainwindow); 
	  } 
	}
	
	@Test(priority = 34)
	public void VerifyDiagnosticMatchedReject() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Diagnostic Matched Vendor Invoice Reject");
		Thread.sleep(2000); 
		Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.Rejectbtn.click();
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.YesRejectbtn.click();
		 Thread.sleep(2000);
		 String RejectWarn = Vendor_Invoice_Details_Page_Objects.RejectWarn.getText();
		 System.out.println(RejectWarn);
		 Thread.sleep(2000);
		 
		 if(RejectWarn.contentEquals("Please enter the notes"))
		 {
			 extenttestCase.log(Status.PASS, "Rejection Validation Done Successfully in Diagnostic Matched Type");
		 }
		 else
		 {
			 extenttestCase.log(Status.FAIL, "Rejection Validation Failed in Diagnostic Matched Type");
		 }
		 
		 
		 Vendor_Invoice_Details_Page_Objects.RejectNote.sendKeys(getExcelData("videtail", 17, 8));
		 Thread.sleep(2000);
		 Vendor_Invoice_Details_Page_Objects.NoRejectbtn.click();
		 Thread.sleep(2000);
	}
	
	@Test(priority = 35)
	public void VerifyDiagnosticMatchedCancel() throws InterruptedException
	{
		extenttestCase.log(Status.INFO, "Verifying Diagnostic Matched Vendor Invoice Cancel");
		 Thread.sleep(2000);
		Vendor_Invoice_Details_Page_Objects.Cancel.click();
		 Thread.sleep(2000);
	}
	
//////////////////////////////////////Diagnostic - Mismatched ///////////////////////////////////////

@Test(priority = 36)
public void verifyDiagnosticMismatchSearch() throws Throwable
{
extenttestCase.log(Status.INFO, "Searching Diagnostic Mismatched Vendor Invoice Record");
Vendor_Invoice_Details_Page_Objects.Searchheader.click();
Thread.sleep(2000);

Vendor_Invoice_Details_Page_Objects.SearchInvoice.sendKeys(getExcelData("videtail", 22, 0));
Thread.sleep(2000);

Vendor_Invoice_Details_Page_Objects.SearchType.sendKeys(getExcelData("videtail", 22, 1));
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchClient.sendKeys(getExcelData("videtail", 22, 2)); 
Thread.sleep(2000);             


Vendor_Invoice_Details_Page_Objects.SearchLOB.sendKeys(getExcelData("videtail", 22, 3)); 
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchProvider.sendKeys(getExcelData("videtail", 22, 4));
Thread.sleep(2000);

Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(2000);   
Vendor_Invoice_Details_Page_Objects.SearchSDate.sendKeys(getExcelData("videtail", 22, 5));
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchStatus.sendKeys(getExcelData("videtail", 22, 7));
Thread.sleep(2000);


Vendor_Invoice_Details_Page_Objects.SearchClick.click();
Thread.sleep(2000);


String InvoiceResult = Vendor_Invoice_Details_Page_Objects.InvoiceResult.getText();
System.out.println(InvoiceResult);


String InvoiceDateResult = Vendor_Invoice_Details_Page_Objects.InvoiceDateResult.getText();
System.out.println(InvoiceDateResult);

String TypeResult = Vendor_Invoice_Details_Page_Objects.TypeResult.getText();
System.out.println(TypeResult);

String LOBResult = Vendor_Invoice_Details_Page_Objects.LOBResult.getText();
System.out.println(LOBResult);

String ProviderResult = Vendor_Invoice_Details_Page_Objects.ProviderResult.getText();
System.out.println(ProviderResult);

String StatusResult = Vendor_Invoice_Details_Page_Objects.StatusResult.getText();
System.out.println(StatusResult);

if(InvoiceResult.contentEquals(getExcelData("videtail", 22, 0))
&& InvoiceDateResult.contentEquals(getExcelData("videtail", 22, 5))
&& TypeResult.contentEquals(getExcelData("videtail", 22, 1))
&& LOBResult.contentEquals(getExcelData("videtail", 22, 3))
&& ProviderResult.contentEquals(getExcelData("videtail", 23, 4))
&& StatusResult.contentEquals(getExcelData("videtail", 22, 7)))
{
extenttestCase.log(Status.PASS, "Got Expected Result in Diagnostic Mismatched Vendor Invoice Listing");
}

else
{
extenttestCase.log(Status.FAIL, "Not Getting Expected Result in Diagnostic Mismatched Vendor Invoice Listing");
}
}

@Test(priority = 37)
public void DiagnosticMismatchdetails() throws InterruptedException, IOException {
extenttestCase.log(Status.INFO, "Navigating to Diagnostic Mismatched Type Vendor Invoice details page");
Vendor_Invoice_Details_Page_Objects.DetailAction.click();
Thread.sleep(2000);

TakesScreenshot screenshot=(TakesScreenshot) driver; File sourceFile =
screenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
File("DiagnosticMismatchedVendorInvoice.png"); FileHandler.copy(sourceFile, destinationFile);
extenttestCase.addScreenCaptureFromPath("DiagnosticMismatchedVendorInvoice.png");

}

@Test(priority = 38)
public void VerifyDiagnosticMismatchedExpand() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
Vendor_Invoice_Details_Page_Objects.DDetailsHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DDetailsHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DMatchLineItemHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DMatchLineItemHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DMisMatchLineItemHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DMisMatchLineItemHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DAUHeader.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.DAUHeader.click();
Thread.sleep(2000);
}

@Test(priority = 39)
public void SearchDiagnosticMismatchedInvoiceField() throws Throwable
{
extenttestCase.log(Status.INFO, "Verifying Search Functionality in Diagnostic Mismatched Invoice Line Items Grid");
Vendor_Invoice_Details_Page_Objects.SearchMatchField.sendKeys(getExcelData("videtail", 22, 9));
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SearchMatchField.clear();
Thread.sleep(2000);

}

@Test(priority = 40)
public void sortDiagnosticMismatchedInvoiceGrid() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Diagnostic Mismatched Invoice Line Item Grid");
Vendor_Invoice_Details_Page_Objects.SortMatchUnique.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMatchDOS.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMatchCPTCode.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMatchServiceCode.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMatchServiceDes.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMatchQTY.click();
Thread.sleep(2000);	
Vendor_Invoice_Details_Page_Objects.SortMatchPriceStatus.click();
Thread.sleep(2000);	
Vendor_Invoice_Details_Page_Objects.SortMatchStatus.click();
Thread.sleep(2000);	
}

@Test(priority = 41)
public void SearchDiagnosticMisMatchedInvoiceField() throws Throwable
{
extenttestCase.log(Status.INFO, "Verifying Search Functionality in Diagnostic MisMatched Invoice Line Items Grid");
Vendor_Invoice_Details_Page_Objects.SearchMisMatchField.sendKeys(getExcelData("videtail", 22, 9));
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SearchMisMatchField.clear();
Thread.sleep(2000);

}


@Test(priority = 42)
public void VerifyMismatchLink() throws Throwable
{
	extenttestCase.log(Status.INFO, "Verifying Unique ID Link in Diagnostic Matched Vendor Invoice");
	  
	Vendor_Invoice_Details_Page_Objects.UniqueMismatchLink.click(); 
  String mainwindow = driver.getWindowHandle(); 
  Thread.sleep(2000); 
  Set<String> handles = driver.getWindowHandles(); 
  for (String handle : handles) 
  {
  if(!handle.equals(mainwindow)) 
  { 
	  driver.switchTo().window(handle);
	  Thread.sleep(2000);
	  String UniqueIDLable = Vendor_Invoice_Details_Page_Objects.UniqueIDLable.getText();
  System.out.println(UniqueIDLable);
  if(UniqueIDLable.contentEquals(getExcelData("videtail", 22, 9)))
  {
  extenttestCase.log(Status.PASS, "Unique ID Link Verified in Diagnostic Mismatched Line Items");
  driver.close(); 
  } 
  } 
  driver.switchTo().window(mainwindow); 
  }
}

@Test(priority = 43)
public void sortDiagnosticMisMatchedInvoiceGrid() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Sorting Functionality in Diagnostic MisMatched Invoice Line Item Grid");
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMisMatchUnique.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMisMatchDOS.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMismatchCPTCode.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMismatchServiceCode.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMisMatchServiceDes.click();
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.SortMisMatchQTY.click();
Thread.sleep(2000);	
Vendor_Invoice_Details_Page_Objects.SortMisMatchPriceStatus.click();
Thread.sleep(2000);	
Vendor_Invoice_Details_Page_Objects.SortMisMatchStatus.click();
Thread.sleep(2000);	
}

@Test(priority = 44)
public void DiagnosticMismatchedViewAll() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Audit History in Diagnostic Mismatched Vendor Invoice");

Vendor_Invoice_Details_Page_Objects.VIDViewall.click(); 
String mainwindow = driver.getWindowHandle(); 
Thread.sleep(2000); 
Set<String> handles = driver.getWindowHandles(); 
for (String handle : handles) 
{
if(!handle.equals(mainwindow)) 
{ 
driver.switchTo().window(handle);
Thread.sleep(2000); 
System.out.println(driver.getCurrentUrl().toString());
extenttestCase.log(Status.PASS, "View All Link Verified in Diagnostic Mismatched Audit History");
driver.close(); 
} 
driver.switchTo().window(mainwindow); 
} 
}


@Test(priority = 45)
public void VerifyDiagnosticMismatchedCancel() throws InterruptedException
{
extenttestCase.log(Status.INFO, "Verifying Diagnostic Mismatched Vendor Invoice Cancel");
Thread.sleep(2000);
Vendor_Invoice_Details_Page_Objects.Cancel.click();
Thread.sleep(2000);
}


}
	
