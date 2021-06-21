package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Services_List_Page_Objects {
	
	@FindBy(xpath="//*[@id='accordionSidebar']/li[3]/a")
	public static WebElement ServiceMenu;
	
	/////////////////////// Lists Header /////////////////////////////////////
	
	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[1]/a")
	public static WebElement Searchheader;
	
	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[2]/a")
	public static WebElement SearchResultheader;
	
	@FindBy(xpath="//button[@title='Search']")
	public static WebElement SearchClick;
	
	@FindBy(xpath="//button[@title='Clear']")
	public static WebElement ClearClick;
	
	/////////////////////// No Result ///////////////////////////////////////
	
	@FindBy(id="txtUnique_ID")
	public static WebElement UniqueId;
	
	@FindBy(id="slcLob_ID")
	public static WebElement SearchLOB;
	
	@FindBy(id="dateDOR_ID")
	public static WebElement SearchDOR;
	
	@FindBy(id="dateDOA_ID")
	public static WebElement SearchDOS;
	
	@FindBy(id="txtTypeaheadFeeSearchProvider_ID")
	public static WebElement SearchProvider;
	
	@FindBy(id="txtLocation_ID")
	public static WebElement SearchLocation;
	
	@FindBy(id="slcSpeciality_ID")
	public static WebElement SearchSpeciality;
	
	@FindBy(id="slcStatus_ID")
	public static WebElement SearchStatus;
	
	@FindBy(id="txtTypeaheadExaminee_ID")
	public static WebElement SearchExaminee;
	
	@FindBy(id="slcAssignedTo_ID")
	public static WebElement SearchAssignUsers;
	
	@FindBy(id="spngrdService_ID")
	public static WebElement SearchResult;
	
	////////////////////////// Search Record ///////////////////////////////
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_UniqueID']")
	public static WebElement UniqueResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_LOBCode']")
	public static WebElement LOBResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_DateOfReferral']")
	public static WebElement DORResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_DateOfAppointment']")
	public static WebElement DOAResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_Providers']")
	public static WebElement ProviderResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_Location']")
	public static WebElement LocationResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_ProviderSpecialty']")
	public static WebElement SpecialityResult;
	
	@FindBy(xpath ="//td[@aria-describedby='grdService_ID_ServiceStatusName']")
	public static WebElement StatusResult;
	
	//////////////////////////////////// Detail Page Redirection ///////////////////
	
	@FindBy(xpath ="//a[@title='Details']")
	public static WebElement DetailAction;
	
	@FindBy(xpath ="//a[@title='Assign & Open Details']")
	public static WebElement AssignAction;
	
	@FindBy(xpath ="//*[@id=\'topbar\']/nav/div/h1")
	public static WebElement DetailLabel;
	
	@FindBy(id ="spnAssignedTo_ID")
	public static WebElement AssignToLabel;
	
	@FindBy(id ="btnCancel_ID")
	public static WebElement CancelDetail;
	
	
	//////////////////////////// Sort Listing Grid  ///////////////////////////////
	
	@FindBy(id="grdService_ID_UniqueID")
	public static WebElement SortUnique;

	@FindBy(id="grdService_ID_LOBCode")
	public static WebElement SortLOB;
	
	@FindBy(id="grdService_ID_DateOfReferral")
	public static WebElement SortDOR;
	
	@FindBy(id="grdService_ID_DateOfAppointment")
	public static WebElement SortDOA;
	
	@FindBy(id="grdService_ID_Providers")
	public static WebElement SortProvider;
	
	@FindBy(id="grdService_ID_Location")
	public static WebElement SortLocation;
	
	@FindBy(id="grdService_ID_ProviderSpecialty")
	public static WebElement SortSpeciality;
	
	@FindBy(id="grdService_ID_ServiceStatusName")
	public static WebElement SortStatus;
	
	//////////////////////////// Pagination Listing Grid /////////////////////////////
	
	@FindBy(xpath="//*[@id=\'grdServicePager_ID_center\']/table/tbody/tr/td[8]/select")
	public static WebElement PerPage;
	
	@FindBy(xpath="//input[@aria-label='Page No.']")
	public static WebElement PageField;
	
	@FindBy(id="errorPager_grdServicePager_ID")
	public static WebElement PageWarn;
	
	@FindBy(id="next_grdServicePager_ID")
	public static WebElement NextPage;
	
	@FindBy(id="last_grdServicePager_ID")
	public static WebElement LastPage;
	
	@FindBy(id="prev_grdServicePager_ID")
	public static WebElement PreviousPage;
	
	@FindBy(id="first_grdServicePager_ID")
	public static WebElement FirstPage;
}
