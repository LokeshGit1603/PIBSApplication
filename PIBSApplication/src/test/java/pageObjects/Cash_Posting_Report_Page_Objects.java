package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cash_Posting_Report_Page_Objects {
	
	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[8]/a")
	public static WebElement ReportsClick;
	
/////////////////////// Cash Posting Detail ////////////////////////////	

@FindBy(xpath="//*[@id='Reports']/div/a[5]")
public static WebElement CPDetailMenu;

@FindBy(xpath="//button[@title='Execute']")
public static WebElement Execute;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[1]")
public static WebElement Warn1;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[2]")
public static WebElement Warn2;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li")
public static WebElement Warn3;

@FindBy(xpath="//*[@id=\"validationMessageModal_ID\"]/div/div/div[2]/div/h6/ul/li")
public static WebElement Warn4;

@FindBy(xpath="//*[@id=\'btnOk_ID\']")
public static WebElement AcceptDateError;

@FindBy(xpath="//*[@id=\'btnOk_ID\']")
public static WebElement CPAcceptError;

//////////////////////////////////Search Client ////////////////////////////////////

@FindBy(xpath="//*[@id='reportSearch_ID']/div/div[1]/span[2]/div/button")
public static WebElement SearchClient;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[1]/div/input")
public static WebElement SearchbarClient;

@FindBy(xpath="//*[@id='reportSearch_ID']/div/div[1]/span[2]/div/ul/li[1]/div/span[2]/button/i")
public static WebElement CloseSearchbarClient;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[2]/a/label")
public static WebElement SearchbarClientresult1;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[3]/a/label")
public static WebElement SearchbarClientresult2;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[1]/span[2]/div/ul/li[4]/a/label")
public static WebElement SearchbarClientresult3;


/////////////////////////////////Search LOB////////////////////////////////////

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/button")
public static WebElement SearchLob;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[1]/div/input")
public static WebElement SearchbarLOB;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[1]/div/span[2]/button")
public static WebElement CloseSearchbarLOB;

@FindBy(xpath="//*[@id='reportSearch_ID']/div/div[2]/span[2]/div/ul/li[2]/a/label/input")
public static WebElement SearchbarLobresult1;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[21]/a/label/input")
public static WebElement SearchbarLobresult2;

@FindBy(xpath="//*[@id=\'reportSearch_ID\']/div/div[2]/span[2]/div/ul/li[4]/a/label")
public static WebElement SearchbarLobresult3;

////////////////////////////////Search Invoice Number /////////////////////////////////////

@FindBy(id="txtInvoiceNumber_ID")
public static WebElement SearchInvNum;

////////////////////////////////Search Invoice Status /////////////////////////////////////

@FindBy(id="slcInvoiceStatus_ID")
public static WebElement SearchInvStatus;

////////////////////////////////Search Posting From Date /////////////////////////////////////

@FindBy(id="datePostingDateFrom_ID")
public static WebElement SearchPostFromDate;

////////////////////////////////Search Posting To Date /////////////////////////////////////

@FindBy(id="datePostingDateTo_ID")
public static WebElement SearchPostToDate;

////////////////////////////////Search Posted By /////////////////////////////////////

@FindBy(id="txtPostedBy_ID")
public static WebElement SearchPostedBy;

////////////////////////////////Search Check /////////////////////////////////////

@FindBy(id="txtCheck_ID")
public static WebElement SearchCheck;

////////////////////////////////Search Deposited Date /////////////////////////////////////

@FindBy(id="dateDepositDate_ID")
public static WebElement SearchDDate;

@FindBy(xpath = "//a[@title='Export drop down menu']")
public static WebElement  DownloadLink;

@FindBy(xpath="//a[@title='CSV (comma delimited)']")
public static WebElement  CSVDownloadLink;

@FindBy(xpath="//a[@title='PDF']")
public static WebElement  PDFDownloadLink;

@FindBy(xpath="//button[@title='Clear']")
public static WebElement  CPClearSearch;

@FindBy(xpath="//*[@id='cardReportViewer_ID']/a")
public static WebElement  CPReportHeader;

@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/a")
public static WebElement  CPSearchHeader;	




}
