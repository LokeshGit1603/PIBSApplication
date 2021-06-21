package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Client_PricingSchedule_List_Page_Objects {

	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[2]/a")
	public static WebElement SetUp;
	
	@FindBy(xpath="//*[@id=\'Setup\']/div/a[2]")
	public static WebElement CPSmenu;
	
	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[2]/a")
	public static WebElement CPSresultheader;
	
	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[1]/a")
	public static WebElement CPSSearchheader;
	
	@FindBy(id="slcClient_ID")
	public static WebElement CPSClientId;
	
	@FindBy(id="slcLob_ID")
	public static WebElement CPSClientLob;
	
	@FindBy(id="slcType_ID")
	public static WebElement CPSClientType;
	
	@FindBy(id="slcStatus_ID")
	public static WebElement CPSClientStatus;
	
	@FindBy(id="dateValidFrom_ID")
	public static WebElement CPSStartDate;

	@FindBy(id="dateValidTo_ID")
	public static WebElement CPSEndDate;
	
	@FindBy(id="dateActiveOnDate_ID")
	public static WebElement CPSActiveDate;
	
	@FindBy(xpath="//*[@id=\'pricingListSearch_ID\']/div[3]/div/button[1]")
	public static WebElement CPSSearchClick;
	
	@FindBy(id="spngrdClientPricing_ID")
	public static WebElement CPSSearchResult;
	
	@FindBy(id="btnClientPricingClear")
	public static WebElement CPSClearSearch;
	
	////////////////////////////////// List Sorting ///////////////////
	
	@FindBy(xpath="//select[@title='Records per Page']")
	public static WebElement PerPage;
	
	@FindBy(xpath="//input[@aria-label='Page No.']")
	public static WebElement PageField;
	
	@FindBy(id="errorPager_grdClientPricingPager_ID")
	public static WebElement PageWarn;
	
	@FindBy(id="jqgh_grdClientPricing_ID_ClientName")
	public static WebElement SortCPSClient;
	
	@FindBy(id="jqgh_grdClientPricing_ID_LOBCode")
	public static WebElement SortCPSLob;
	
	@FindBy(id="jqgh_grdClientPricing_ID_CodeType")
	public static WebElement SortCPSType;
	
	@FindBy(id="jqgh_grdClientPricing_ID_UTCStartDate")
	public static WebElement SortCPSStartDate;
	
	@FindBy(id="jqgh_grdClientPricing_ID_UTCEndDate")
	public static WebElement SortCPSEndDate;
	
	@FindBy(id="jqgh_grdClientPricing_ID_UTCUpdatedDate")
	public static WebElement SortCPSUpdatedDate;
	
	@FindBy(id="jqgh_grdClientPricing_ID_ClientPricingScheduleStatus")
	public static WebElement SortCPSStatus;
	
//////////////////////////////////List Pagination ///////////////////
	
	@FindBy(id="next_grdClientPricingPager_ID")
	public static WebElement NextPage;
	
	@FindBy(id="last_grdClientPricingPager_ID")
	public static WebElement LastPage;
	
	@FindBy(id="prev_grdClientPricingPager_ID")
	public static WebElement PreviousPage;
	
	@FindBy(id="first_grdClientPricingPager_ID")
	public static WebElement FirstPage;
	
	////////////////////////// Add New Pricing schedule //////////////////////////
	
	@FindBy(xpath="//button[@title='Add New']")
	public static WebElement AddNew;
	
	@FindBy(id="btnSave_ID")
	public static WebElement SaveAddNew;
	
	@FindBy(xpath="//*[@id=\"validationMessageModal_ID\"]/div/div/div[2]/div/h6")
	public static WebElement CloneWarn;
	
	@FindBy(id="slcPricingCodeType_ID")
	public static WebElement AddPriceType;
	
	@FindBy(id="slcClientId_ID")
	public static WebElement CPSClient;
	
	@FindBy(id="slcLob_ID")
	public static WebElement CPSlob;
	
	@FindBy(id="dtStartDate_ID")
	public static WebElement CPSSDate;
	
	@FindBy(id="dtEndDate_ID")
	public static WebElement CPSEDate;
	
	@FindBy(id="ntxtPercentageVariance_ID")
	public static WebElement CPSPercentVarience;
	
	@FindBy(id="formulaValue_ID")
	public static WebElement AddFormula;
	
	@FindBy(id="btnAdd_ID")
	public static WebElement AddFormulaPopup;
	
	@FindBy(id="checkFormulaWarning_ID")
	public static WebElement AddFormulaPopupWarning;
	
	@FindBy(id="textFormula_ID")
	public static WebElement AddFormulaContent;
	
	@FindBy(xpath="(//i[@alt='Delete'])[1]")
	public static WebElement DeleteFormulaContent;
	
	@FindBy(id="wfFactor_ID")
	public static WebElement AddWFFormula;
	
	@FindBy(id="pfFactor_ID")
	public static WebElement AddPFFormula;
	
	@FindBy(id="mpfFactor_ID")
	public static WebElement AddMPFFormula;
	
	@FindBy(id="cfFactor_ID")
	public static WebElement AddCFFormula;
	
	@FindBy(xpath="(//i[@alt='Delete'])[2]")
	public static WebElement DeleteFormulaValues;
	
	@FindBy(id="btnTest_ID")
	public static WebElement TestFormula;
	
	@FindBy(id="testValue_ID")
	public static WebElement TestFormulaResult;

	@FindBy(id="spnClearFormula_ID")
	public static WebElement ClearFormula;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[1]")
	public static WebElement Validationmsg1;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[2]")
	public static WebElement Validationmsg2;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[3]")
	public static WebElement Validationmsg3;
	
	@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[3]")
	public static WebElement Validationmsg4;
	
	@FindBy(id="btnOk_ID")
	public static WebElement AcceptError;
	
	@FindBy(id="btnCancel_ID")
	public static WebElement CPSCancel;
	
	
	
}
