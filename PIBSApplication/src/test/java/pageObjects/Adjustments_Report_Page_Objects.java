package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adjustments_Report_Page_Objects {
	
	
	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[8]/a")
	public static WebElement ReportsClick;
	
/////////////////////// Adjustment ////////////////////////////	

@FindBy(xpath="//*[@id='Reports']/div/a[3]")
public static WebElement AdjustMenu;

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
public static WebElement AdjustAcceptError;

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

////////////////////////////////Search Unique /////////////////////////////////////

@FindBy(id="txtUnique_ID")
public static WebElement SearchUnique;

////////////////////////////////Search Provider /////////////////////////////////////

@FindBy(id="txtTypeaheadFeeSearchProvider_ID")
public static WebElement SearchProvider;

////////////////////////////////Search From Date /////////////////////////////////////

@FindBy(id="dateDateOfAdjustmentFrom_ID")
public static WebElement SearchFromDate;

////////////////////////////////Search To Date /////////////////////////////////////

@FindBy(id="dateDateOfAdjustmentTo_ID")
public static WebElement SearchToDate;

////////////////////////////////Search Type /////////////////////////////////////

@FindBy(id="slcAdjustmentType_ID")
public static WebElement SearchType;


@FindBy(xpath = "//a[@title='Export drop down menu']")
public static WebElement  DownloadLink;

@FindBy(xpath="//a[@title='CSV (comma delimited)']")
public static WebElement  CSVDownloadLink;

@FindBy(xpath="//a[@title='PDF']")
public static WebElement  PDFDownloadLink;

@FindBy(xpath="//button[@title='Clear']")
public static WebElement  AdjustClearSearch;

@FindBy(xpath="//*[@id=\"cardReportViewer_ID\"]/a/h6")
public static WebElement  AdjustReportText;

@FindBy(xpath="//*[@id='cardReportViewer_ID']/a")
public static WebElement  AdjustReportHeader;

@FindBy(xpath="//*[@id=\'content\']/form/div/div[1]/a")
public static WebElement  AdjustSearchHeader;	



}
