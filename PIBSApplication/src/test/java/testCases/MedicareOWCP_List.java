package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.Client_Contract_List_Page_Objects;
import pageObjects.Client_PricingSchedule_List_Page_Objects;
import pageObjects.MedicareOWCP_List_Page_Objects;

public class MedicareOWCP_List extends CommonFunctions {

	static Logger logger = Logger.getLogger(MedicareOWCP_List.class);

	@Test(priority = 0)
	public void GoToMedicaremenu() throws InterruptedException {
		extenttestCase = extentReport.createTest("Verifying Medicare OWCP Listing");
		extenttestCase.log(Status.INFO, "Verifying Medicare OWCP Listing");
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void GoToMOListmenu() throws InterruptedException {
		PageFactory.initElements(driver, Client_PricingSchedule_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Setup Menu");
		
		/*
		 * Client_PricingSchedule_List_Page_Objects.SetUp.click(); Thread.sleep(2000);
		 */
		 
		PageFactory.initElements(driver, MedicareOWCP_List_Page_Objects.class);
		extenttestCase.log(Status.INFO, "Navigating to Medicare/OWCP Factor Schedule Menu");
		MedicareOWCP_List_Page_Objects.MOmenu.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void ExpandCollapse() throws InterruptedException {
		extenttestCase.log(Status.INFO, "Verifying Expand and Collapse Functionality");
		MedicareOWCP_List_Page_Objects.MOResultHeader.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOResultHeader.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOSearchHeader.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void SelectType() throws Throwable {
		extenttestCase.log(Status.INFO, "Selecting Pricing Type");
		MedicareOWCP_List_Page_Objects.MOPricingType.sendKeys(getExcelData("molist", 1, 0));
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void SelectStartDate() throws Throwable {
		extenttestCase.log(Status.INFO, "Selecting Start Date");
		MedicareOWCP_List_Page_Objects.MOStartDate.sendKeys(getExcelData("molist", 1, 1));
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void SelectEndDate() throws Throwable {
		extenttestCase.log(Status.INFO, "Selecting End Date");
		MedicareOWCP_List_Page_Objects.MOEndDate.sendKeys(getExcelData("molist", 1, 2));
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void SelectStatus() throws Throwable {
		extenttestCase.log(Status.INFO, "Selecting Status");
		MedicareOWCP_List_Page_Objects.MOStatus.sendKeys(getExcelData("molist", 1, 3));
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void ClickSearch() throws Throwable {
		extenttestCase.log(Status.INFO, "Search Submit");
		MedicareOWCP_List_Page_Objects.MOSearchClick.click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void Searchresult() throws Throwable {
		extenttestCase.log(Status.INFO, "Verifying No Data Found Result");
		String actualresult = MedicareOWCP_List_Page_Objects.MOSearchResult.getText();
		Thread.sleep(2000);

		if (actualresult.contains("No data found")) {
			logger.info("Verification done. End of Medicare_OWCP_Factor_Schedule_List");

			extenttestCase.log(Status.PASS, "Got Expected No Data Found Result");
		} else {

			extenttestCase.log(Status.FAIL, "Not Getting Expected Result");
		}

		logger.info("Verified No Data Found Result");
	}

	@Test(priority = 9)
	public void ClearSearch() throws Throwable {
		extenttestCase.log(Status.INFO, "Clear Search");
		MedicareOWCP_List_Page_Objects.MOClearSearch.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOActiveDate.clear();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOPricingType.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOSearchClick.click();
		Thread.sleep(2000);
	}

	@Test(priority = 10)
	public void SortColumn() throws Throwable {
		extenttestCase.log(Status.INFO, "Verifying Listing Grid Sorting");
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.PerPage.sendKeys(getExcelData("molist", 1, 6));
		Thread.sleep(2000);
		
		MedicareOWCP_List_Page_Objects.SortMOPriceType.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.SortMOStartDate.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.SortMOEndDate.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.SortMOUpdateDate.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.SortMOStatus.click();
		
		MedicareOWCP_List_Page_Objects.PerPage.sendKeys(getExcelData("molist", 1, 7));
		Thread.sleep(2000);
		
		 MedicareOWCP_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); MedicareOWCP_List_Page_Objects.PageField.sendKeys(getExcelData("molist", 1, 8));
		  Thread.sleep(2000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  String PageWarn = MedicareOWCP_List_Page_Objects.PageWarn.getText();
		  
		  if(PageWarn.contentEquals("Please enter a valid page number!"))
		  {
			  extenttestCase.log(Status.PASS, "Invalid Page Validation Done");
		  }
		  else
		  {
			  extenttestCase.log(Status.FAIL, "Invalid Page Validation Failed");
		  }
		  Thread.sleep(2000); 
		  MedicareOWCP_List_Page_Objects.PageField.clear();
		  Thread.sleep(2000); 
		  MedicareOWCP_List_Page_Objects.PageField.sendKeys(getExcelData("molist", 1, 9));
		  Thread.sleep(2000);
		  Robot robot1 = new Robot();
		  robot1.keyPress(KeyEvent.VK_ENTER);
		  robot1.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
	}

	@Test(priority = 11)
	public void PaginationColumn() throws InterruptedException {
		extenttestCase.log(Status.INFO, "Verifying Listing Grid Pagination");
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MONextPage.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOLastPage.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOPreviousPage.click();
		Thread.sleep(2000);
		MedicareOWCP_List_Page_Objects.MOFirstPage.click();
		Thread.sleep(2000);
	}

	
	  @Test(priority = 12) 
	  public void VerifyAddNewvalidation() throws Throwable {
	  extenttestCase.log(Status.INFO,
	  "Verifying Medicate Add New Pricing Schedule"); 
	  Thread.sleep(2000);
	  MedicareOWCP_List_Page_Objects.AddNewMedicare.click(); 
	  Thread.sleep(2000);
	  MedicareOWCP_List_Page_Objects.SaveNewMedicare.click(); 
	  Thread.sleep(2000);
	  String Validation1 = MedicareOWCP_List_Page_Objects.MedicareValidation1.getText();
	
	  
	  String Validation2 =
	  MedicareOWCP_List_Page_Objects.MedicareValidation2.getText();
	   String Validation3 =
	  MedicareOWCP_List_Page_Objects.MedicareValidation3.getText();
	   
	  Thread.sleep(2000);
	  
	  if(Validation1.contains("Please select Pricing Type") &&
	  Validation2.contains("Please select Start Date") &&
	  Validation3.contains("Please select End Date"))
	  {
	  extenttestCase.log(Status.PASS, "Validation Done Successfully"); 
	  } 
	  else 
	  {
	  extenttestCase.log(Status.FAIL, "Validation Not Done Successfully"); 
	  }
	  Thread.sleep(2000);
	  MedicareOWCP_List_Page_Objects.AcceptError.click();
	  Thread.sleep(2000);
	  
	  }
	  
	  @Test(priority = 13) 
	  public void AddNew() throws Throwable {
	  MedicareOWCP_List_Page_Objects.MOPricingType.sendKeys(getExcelData("molist",
	  2, 0)); 
	  Thread.sleep(2000);
	  MedicareOWCP_List_Page_Objects.MOStartDate.sendKeys(getExcelData("molist", 2,
	  1)); 
	  Thread.sleep(2000);
	  MedicareOWCP_List_Page_Objects.MOEndDate.sendKeys(getExcelData("molist", 2,
	  2)); 
	  Thread.sleep(2000);
	  
	  MedicareOWCP_List_Page_Objects.SaveNewMedicare.click(); 
	  Thread.sleep(2000);
	  
	  
	  MedicareOWCP_List_Page_Objects.MedicareCancel.click(); 
	  Thread.sleep(2000);
	  
	  }
	 

}
