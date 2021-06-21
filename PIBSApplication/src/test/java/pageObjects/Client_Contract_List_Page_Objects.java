package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Client_Contract_List_Page_Objects {

	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[2]/a")
	public static WebElement SetUp;

	@FindBy(xpath="//*[@id=\'Setup\']/div/a[1]")
	public static WebElement CCmenu;

	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[1]/a")
	public static WebElement CCSearchCriteria;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/a")
	public static WebElement CCresultheader;

	@FindBy(id="slcClient_ID")
	public static WebElement CCClientId;

	@FindBy(id="slcLob_ID")
	public static WebElement CClob;

	@FindBy(id="dateValidFrom_ID")
	public static WebElement CCStartDate;

	@FindBy(id="dateValidTo_ID")
	public static WebElement CCEndDate;

	@FindBy(id="slcStatus_ID")
	public static WebElement CCStatus;
	
	@FindBy(xpath="//*[@id=\'btnClientContractSearch\']/span[2]")
	public static WebElement CCSearchbtn;

	@FindBy(xpath="//*[@id=\'spngrdClientContract_ID\']")
	public static WebElement CCSearchResult;
	
	@FindBy(id="btnClientContractClear")
	public static WebElement CCClearSearch;
	
	@FindBy(id="jqgh_grdClientContract_ID_ClientName")
	public static WebElement SortClient;
	
	@FindBy(id="jqgh_grdClientContract_ID_LobName")
	public static WebElement Sortlob;
	
	@FindBy(id="jqgh_grdClientContract_ID_UTCValidFrom")
	public static WebElement SortSdate;
	
	@FindBy(id="jqgh_grdClientContract_ID_UTCValidTo")
	public static WebElement SortEdate;
	
	@FindBy(id="jqgh_grdClientContract_ID_Status")
	public static WebElement Sortstatus;
	
	@FindBy(id="jqgh_grdClientContract_ID_UTCCreatedDate")
	public static WebElement SortCdate;
	
	@FindBy(id="jqgh_grdClientContract_ID_UTCUpdatedDate")
	public static WebElement SortUdate;
	
	@FindBy(xpath="//select[@title='Records per Page']")
	public static WebElement PerPage;
	
	@FindBy(xpath="//input[@aria-label='Page No.']")
	public static WebElement PageField;
	
	@FindBy(id="errorPager_grdClientContractPager_ID")
	public static WebElement PageWarn;

	@FindBy(xpath="//*[@id=\'next_grdClientContractPager_ID\']/span")
	public static WebElement Nextpage;
	
	@FindBy(xpath="//*[@id=\'last_grdClientContractPager_ID\']/span")
	public static WebElement Lastpage;
	
	@FindBy(xpath="//*[@id=\'prev_grdClientContractPager_ID\']/span")
	public static WebElement Previouspage;
	
	@FindBy(xpath="//*[@id=\'first_grdClientContractPager_ID\']/span")
	public static WebElement Firstpage;
	
	@FindBy(xpath="//td[@aria-describedby='grdClientContract_ID_ClientName']")
	public static WebElement Clientvalue;
	
	@FindBy(xpath="//td[@aria-describedby='grdClientContract_ID_LobName']")
	public static WebElement Lobvalue;
	
	@FindBy(xpath="//td[@aria-describedby='grdClientContract_ID_UTCValidFrom']")
	public static WebElement SDatevalue;
	
	@FindBy(xpath="//td[@aria-describedby='grdClientContract_ID_UTCValidTo']")
	public static WebElement EDatevalue;
	
	@FindBy(xpath="//td[@aria-describedby='grdClientContract_ID_Status']")
	public static WebElement Statusvalue;
	

}
