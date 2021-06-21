package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Unapplied_Cash_Posting_Details_Report_Page_Objects {
	
	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[8]/a")
	public static WebElement ReportsClick;
	
	@FindBy(xpath="//*[@id='Reports']/div/a[8]")
	public static WebElement UnappliedCPDetails;

	@FindBy(xpath="//*[@id=\"reportSearch_ID\"]/div/div[5]/div/button[1]")
	public static WebElement Execute;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[1]")
	public static WebElement UnappliedClientValidation;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[2]")
	public static WebElement UnappliedLobValidation;
	
	@FindBy(xpath="//*[@id=\'btnOk_ID\']")
	public static WebElement UnappliedAcceptError;
	
//////////////////////////////////Search Client ////////////////////////////////////
	
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

/////////////////////////////////Search Type///////////////////////////////////////////

@FindBy(xpath="//*[@id=\'slcCashCollectionType_ID\']")
public static WebElement SearchType;



@FindBy(xpath="//*[@id=\"reportSearch_ID\"]/div/div[5]/div/button[2]")
public static WebElement  UnappliedClearSearch;

@FindBy(xpath="//*[@id='cardReportViewer_ID']/a")
public static WebElement  UnappliedReportHeader;

@FindBy(xpath="//*[@id='content']/form/div/div[1]/a")
public static WebElement  UnappliedSearchHeader;

@FindBy(xpath = "//a[@title='Export drop down menu']")
public static WebElement  DownloadLink;

@FindBy(xpath="//a[@title='CSV (comma delimited)']")
public static WebElement  CSVDownloadLink;

@FindBy(xpath="//a[@title='PDF']")
public static WebElement  PDFDownloadLink;


}
