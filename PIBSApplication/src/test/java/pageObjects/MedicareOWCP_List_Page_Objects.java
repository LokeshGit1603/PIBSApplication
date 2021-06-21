package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedicareOWCP_List_Page_Objects {

	@FindBy(xpath="//*[@id='Setup']/div/a[5]")
	public static WebElement MOmenu;

	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[1]/a")
	public static WebElement MOSearchHeader;

	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[2]/a")
	public static WebElement MOResultHeader;

	@FindBy(id="slcPricingType_ID")
	public static WebElement MOPricingType;

	@FindBy(id="dateValidFrom_ID")
	public static WebElement MOStartDate;

	@FindBy(id="dateValidTo_ID")
	public static WebElement MOEndDate;

	@FindBy(id="slcStatus_ID")
	public static WebElement MOStatus;

	@FindBy(id="dateActiveOnDate_ID")
	public static WebElement MOActiveDate;

	@FindBy(xpath="//button[@title='Search']")
	public static WebElement MOSearchClick;

	@FindBy(id="spngrdMedicareOWCPFactorSchedule_ID")
	public static WebElement MOSearchResult;

	@FindBy(xpath="//button[@title='Clear']")
	public static WebElement MOClearSearch;

	//////////////////////////////////List Sorting ///////////////////
	
	@FindBy(xpath="//select[@title='Records per Page']")
	public static WebElement PerPage;
	
	@FindBy(xpath="//input[@aria-label='Page No.']")
	public static WebElement PageField;
	
	@FindBy(id="errorPager_grdMedicareOWCPFactorSchedulePager_ID")
	public static WebElement PageWarn;

	@FindBy(id="grdMedicareOWCPFactorSchedule_ID_PricingType")
	public static WebElement SortMOPriceType;

	@FindBy(id="grdMedicareOWCPFactorSchedule_ID_UTCStartDate")
	public static WebElement SortMOStartDate;

	@FindBy(id="grdMedicareOWCPFactorSchedule_ID_UTCEndDate")
	public static WebElement SortMOEndDate;

	@FindBy(id="grdMedicareOWCPFactorSchedule_ID_UTCUpdatedDate")
	public static WebElement SortMOUpdateDate;

	@FindBy(id="grdMedicareOWCPFactorSchedule_ID_MedicareOWCPFactorScheduleStatusName")
	public static WebElement SortMOStatus;


	//////////////////////////////////List Pagination ///////////////////

	@FindBy(id="next_grdMedicareOWCPFactorSchedulePager_ID")
	public static WebElement MONextPage;

	@FindBy(id="last_grdMedicareOWCPFactorSchedulePager_ID")
	public static WebElement MOLastPage;

	@FindBy(id="prev_grdMedicareOWCPFactorSchedulePager_ID")
	public static WebElement MOPreviousPage;

	@FindBy(id="first_grdMedicareOWCPFactorSchedulePager_ID")
	public static WebElement MOFirstPage;
	
//////////////////////////Add New Medicare Factor schedule //////////////////////////
	
@FindBy(xpath="//button[@title='Add New']")
public static WebElement AddNewMedicare;

@FindBy(id="btnSave_ID")
public static WebElement SaveNewMedicare;

@FindBy(xpath="//*[@id=\"validationMessageModal_ID\"]/div/div/div[2]/div/h6")
public static WebElement CloneWarn;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[1]")
public static WebElement MedicareValidation1;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[2]")
public static WebElement MedicareValidation2;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[3]")
public static WebElement MedicareValidation3;

@FindBy(id="btnOk_ID")
public static WebElement AcceptError;

@FindBy(id="btnCancel_ID")
public static WebElement MedicareCancel;

@FindBy(id="btnYes_ID")
public static WebElement Yes;

@FindBy(id="btnNo_ID")
public static WebElement No;



}
