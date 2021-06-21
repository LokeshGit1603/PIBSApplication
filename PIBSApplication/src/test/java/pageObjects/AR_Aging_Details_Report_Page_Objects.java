package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AR_Aging_Details_Report_Page_Objects {

	
	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[8]/a")
	public static WebElement ReportsClick;
	
	/////////////////////// AR Aging - Details ////////////////////////////
	
	
	@FindBy(xpath="//*[@id='Reports']/div/a[1]")
	public static WebElement ARAgingdetails;
	
	@FindBy(id="dateAsOfDate_ID")
	public static WebElement AsofDate;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[4]/div/button[1]")
	public static WebElement Execute;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[1]")
	public static WebElement ARAgingClientValidation;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[2]")
	public static WebElement ARAgingLobValidation;
	
	@FindBy(xpath="//*[@id=\'btnOk_ID\']")
	public static WebElement ARAgingAcceptError;
	
	////////////////////////////////// Search Client ////////////////////////////////////
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/button")
	public static WebElement SearchClient;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[1]/div/input")
	public static WebElement SearchbarClient;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[1]/div/span[2]/button/i")
	public static WebElement CloseSearchbarClient;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[2]/a/label")
	public static WebElement SearchbarClientresult1;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[3]/a/label")
	public static WebElement SearchbarClientresult2;
	
	@FindBy(xpath="//*[@id=\"reportSearch_ID\"]/div/div[1]/span[2]/div/ul/li[4]/a/label")
	public static WebElement SearchbarClientresult3;
	
	
	/////////////////////////////////Search LOB////////////////////////////////////
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/button")
	public static WebElement SearchLob;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[1]/div/input")
	public static WebElement SearchbarLOB;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[1]/div/span[2]/button/i")
	public static WebElement CloseSearchbarLOB;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[2]/a/label")
	public static WebElement SearchbarLobresult1;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[3]/a/label")
	public static WebElement SearchbarLobresult2;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[4]/a/label")
	public static WebElement SearchbarLobresult3;
	
	
	@FindBy(xpath = "//a[@title='Export drop down menu']")
	public static WebElement  DownloadLink;
	
	@FindBy(xpath="//a[@title='CSV (comma delimited)']")
	public static WebElement  CSVDownloadLink;
	
	@FindBy(xpath="//a[@title='PDF']")
	public static WebElement  PDFDownloadLink;
	
	@FindBy(xpath="//*[@id=\"P4e3fd096b4d8449480452b087018f355_1_oReportCell\"]/table/tbody/tr[1]/td/div/table/tbody/tr/td[3]/table/tbody/tr/td/div/div/span[1]")
	public static WebElement  ARAgingReportLabel;
	
	@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[4]/div/button[2]")
	public static WebElement  ARAgingClearSearch;
	
	@FindBy(xpath="//*[@id=\'cardReportViewer_ID\']/a")
	public static WebElement  ARAgingReportHeader;
	
	@FindBy(xpath="//*[@id=\"cardReportViewer_ID\"]/a/h6")
	public static WebElement  ARAgingReportText;

	@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/a/h6")
	public static WebElement  ARAgingSearchHeader;	
	
/////////////////////// AR Aging - Summary ////////////////////////////
	
	@FindBy(xpath="//*[@id=\'Reports\']/div/a[2]")
	public static WebElement ARAgingSummary;
	
/////////////////////// Adjustments  ////////////////////////////
	
	@FindBy(xpath="//*[@id=\'Reports\']/div/a[3]")
	public static WebElement Adjustments;
	
	///////////////////////////////// Unbilled Services ///////////////////
	
	@FindBy(xpath="//*[@id=\'Reports\']/div/a[4]")
	public static WebElement UnbillService;
	
///////////////////////////////// Cash Posting Details ///////////////////
	
@FindBy(xpath="//*[@id=\'Reports\']/div/a[5]")
public static WebElement CashPost;


///////////////////////////////// AR Aging - Details ///////////////////

@FindBy(xpath="//*[@id=\'Reports\']/div/a[6]")
public static WebElement APAgingdetails;
	
///////////////////////////////// AR Aging - Summary ///////////////////

@FindBy(xpath="//*[@id=\'Reports\']/div/a[7]")
public static WebElement APAgingSummary;

}
