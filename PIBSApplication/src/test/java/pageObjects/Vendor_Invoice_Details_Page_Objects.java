package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vendor_Invoice_Details_Page_Objects {

	@FindBy(xpath="//*[@id='accordionSidebar']/li[6]/a")
	public static WebElement VendorInvoiceMenu;
	
/////////////////////// Lists Header /////////////////////////////////////
	
@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/a")
public static WebElement Searchheader;

@FindBy(xpath="//button[@title='Search']")
public static WebElement SearchClick;

@FindBy(xpath="//button[@title='Clear']")
public static WebElement ClearClick;

/////////////////////// Expected sResult ///////////////////////////////////////

@FindBy(id="txtInvoiceNumber_ID")
public static WebElement SearchInvoice;

@FindBy(id="slcType_ID")
public static WebElement SearchType;

@FindBy(id="slcClient_ID")
public static WebElement SearchClient;

@FindBy(id="slcLob_ID")
public static WebElement SearchLOB;

@FindBy(id="txtTypeaheadInvoiceProvider_ID")
public static WebElement SearchProvider;

@FindBy(id="dateStart_ID")
public static WebElement SearchSDate;

@FindBy(id="dateEnd_ID")
public static WebElement SearchEDate;

@FindBy(id="slcStatus_ID")
public static WebElement SearchStatus;

//////////////////////////Search Record ///////////////////////////////

@FindBy(xpath ="//td[@aria-describedby='grdVendorInvoice_ID_InvoiceNumber']")
public static WebElement InvoiceResult;

@FindBy(xpath ="//td[@aria-describedby='grdVendorInvoice_ID_UTCDate']")
public static WebElement InvoiceDateResult;

@FindBy(xpath ="//td[@aria-describedby='grdVendorInvoice_ID_VendorInvoiceTypeName']")
public static WebElement TypeResult;

@FindBy(xpath ="//td[@aria-describedby='grdVendorInvoice_ID_LOBCode']")
public static WebElement LOBResult;

@FindBy(xpath ="//td[@aria-describedby='grdVendorInvoice_ID_Provider']")
public static WebElement ProviderResult;

@FindBy(xpath ="//td[@aria-describedby='grdVendorInvoice_ID_VendorInvoiceStatusName']")
public static WebElement StatusResult;

/////////////////////////////////// Action Details ///////////////////////////////////

@FindBy(xpath ="//a[@title='Details']")
public static WebElement DetailAction;

/////////////////////////////// Expand Collapse //////////////////////////////////

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[1]/a")
public static WebElement DetailsHeader;

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[2]/a")
public static WebElement LineItemHeader;

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[3]/a")
public static WebElement AUHeader;

/////////////////////////////// Search Invoice Field //////////////////////////////////

@FindBy(id ="searchvendorInvoiceGenericLineItemsGrid_ID")
public static WebElement SearchField;

///////////////////////////////////// Sorting Grid //////////////////////////////////

@FindBy(id ="jqgh_vendorInvoiceGenericLineItemsGrid_ID_UTCDateOfService")
public static WebElement SortDOS;

@FindBy(id ="jqgh_vendorInvoiceGenericLineItemsGrid_ID_ServiceDescription")
public static WebElement SortService;

@FindBy(id ="jqgh_vendorInvoiceGenericLineItemsGrid_ID_ServicePrice")
public static WebElement SortPrice;

@FindBy(id ="jqgh_vendorInvoiceGenericLineItemsGrid_ID_Quantity")
public static WebElement SortQTY;

@FindBy(id ="jqgh_vendorInvoiceGenericLineItemsGrid_ID_VendorInvoiceStatusName")
public static WebElement SortStatus;

@FindBy(id ="jqgh_vendorInvoiceGenericLineItemsGrid_ID_ClientInvoiceNumber")
public static WebElement SortClientInvoice;

/////////////////////////////////// Audit History ///////////////////////////

@FindBy(id = "trackAll_ID")
public static WebElement VIDViewall;

/////////////////////////////////// Reject ///////////////////////////

@FindBy(id = "btnReject_ID")
public static WebElement Rejectbtn;

@FindBy(id = "btnRejectNo_ID")
public static WebElement NoRejectbtn;

@FindBy(id = "btnRejectYes_ID")
public static WebElement YesRejectbtn;

@FindBy(id = "rejectNotesWarning_ID")
public static WebElement RejectWarn;

@FindBy(id = "txtRejectNotes_ID")
public static WebElement RejectNote;

//////////////////////////////// Cancel ////////////////////////////////

@FindBy(id = "btnCancel_ID")
public static WebElement Cancel;


///////////////////////////////////////////////////Diagnostic Matched/////////////////////////////////////////////////////

/////////////////////////////// Expand Collapse //////////////////////////////////

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[1]/a")
public static WebElement DDetailsHeader;

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[2]/a")
public static WebElement DMatchLineItemHeader;

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[3]/a")
public static WebElement DMisMatchLineItemHeader;

@FindBy(xpath ="//*[@id='vendorInvoiceDetailsEdit_ID']/div[4]/a")
public static WebElement DAUHeader;

/////////////////////////////////// Diagnostic Matched Sort Grid ///////////////////////////////////

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_UniqueId")
public static WebElement SortMatchUnique;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_UTCDateOfService")
public static WebElement SortMatchDOS;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_CPTCode")
public static WebElement SortMatchCPTCode;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_ServiceCode")
public static WebElement SortMatchServiceCode;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_ServiceDescription")
public static WebElement SortMatchServiceDes;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_Quantity")
public static WebElement SortMatchQTY;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_ServicePrice")
public static WebElement SortMatchPriceStatus;

@FindBy(id ="jqgh_vendorInvoiceMatchedLineItemsGrid_ID_VendorInvoiceStatusName")
public static WebElement SortMatchStatus;

/////////////////////////////// Search Matched Invoice Field //////////////////////////////////

@FindBy(id ="searchvendorInvoiceMatchedLineItemsGrid_ID")
public static WebElement SearchMatchField;

//////////////////////////////// Unique Id Link /////////////////////////////////////////////

@FindBy(xpath ="//*[@id='vendorInvoiceMatchedLineItemID_jqg1']/td[2]/a")
public static WebElement UniqueLink;

@FindBy(id ="spnUniqueId_ID")
public static WebElement UniqueIDLable;

/////////////////////////////////// Diagnostic MisMatched Sort Grid ///////////////////////////////////

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_UniqueId")
public static WebElement SortMisMatchUnique;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_UTCDateOfService")
public static WebElement SortMisMatchDOS;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_CPTCode")
public static WebElement SortMismatchCPTCode;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_ServiceCode")
public static WebElement SortMismatchServiceCode;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_ServiceDescription")
public static WebElement SortMisMatchServiceDes;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_Quantity")
public static WebElement SortMisMatchQTY;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_ServicePrice")
public static WebElement SortMisMatchPriceStatus;

@FindBy(id ="jqgh_vendorInvoiceMismatchedLineItemsGrid_ID_VendorInvoiceStatusName")
public static WebElement SortMisMatchStatus;

/////////////////////////////// Search Matched Invoice Field //////////////////////////////////

@FindBy(id ="searchvendorInvoiceMismatchedLineItemsGrid_ID")
public static WebElement SearchMisMatchField;

//////////////////////////////// Mismatched Unique Id Link /////////////////////////////////////////////

@FindBy(xpath ="//*[@id='vendorInvoiceMismatchedLineItemID_jqg1']/td[2]/a")
public static WebElement UniqueMismatchLink;
	
}
