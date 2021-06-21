package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Client_PricingScheduleCLIN_Detail_Page_Objects {

	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_ClientName']")
	public static WebElement CPSClientResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_LOBCode']")
	public static WebElement CPSLobResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_CodeType']")
	public static WebElement CPSTypeResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_UTCStartDate']")
	public static WebElement CPSSDateResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_UTCEndDate']")
	public static WebElement CPSEDateResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_ClientPricingScheduleStatus']")
	public static WebElement CPSStatusResult;
	
	@FindBy(xpath = "//a[@title='Details']")
	public static WebElement CPSAction;
	
	///////////////////////////// Clone /////////////////////////////////////////////
	
	@FindBy(xpath = "//a[@title='Clone']")
	public static WebElement CPSClone;
	
	@FindBy(id = "btnCancel_ID")
	public static WebElement CPSCloneCancel;
	
	@FindBy(id = "btnYes_ID")
	public static WebElement Yes;

	
	///////////////////////////// Delete ///////////////////////////////////////////
	
	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	public static WebElement CPSClinDelete;
	
	@FindBy(id = "btnYes_ID")
	public static WebElement CPSClinAcceptDelete;
	
	@FindBy(id = "clinGrid_ID_cb")
	public static WebElement SelectDeleteAll;

	@FindBy(xpath = "//i[@title='Delete']")
	public static WebElement DeleteAll;
	
	///////////////////////////////// CPS CLIN Details //////////////////////////////
	
	@FindBy(xpath = "//*[@id=\'formClientPricingtEdit_ID\']/div[1]/a")
	public static WebElement CPSCLINheader;
	
	@FindBy(xpath = "//*[@id=\'formClientPricingtEdit_ID\']/div[2]/a")
	public static WebElement CPSCLINBillingheader;
	
	@FindBy(id = "btnAddNew_ID")
	public static WebElement CLINAddBill;
	
	@FindBy(id = "btnSaveClin_ID")
	public static WebElement SaveNewCLINpopup;
	
	@FindBy(id = "btnSaveClinCancel_ID")
	public static WebElement CancelNewCLINpopup;
	
	@FindBy(id = "lblPricingStatus_ID")
	public static WebElement CLINDetailStatus;
	
	@FindBy(id = "btnSave_ID")
	public static WebElement CLINDetailSave;
	
	@FindBy(id = "btnYes_ID")
	public static WebElement CLINDetailAcceptSubmit;
	
	@FindBy(id = "btnSubmit_ID")
	public static WebElement CLINDetailSubmit;
	
	@FindBy(id = "btnReject_ID")
	public static WebElement CLINDetailReject;
	
	@FindBy(id = "btnRejectYes_ID")
	public static WebElement CLINDetailSaveRejectpop;
	
	@FindBy(id = "btnRejectNo_ID")
	public static WebElement NoReject;
	
	@FindBy(id = "rejectNotesWarning_ID")
	public static WebElement CLINDetailNoteWarnRejectpop;
	
	@FindBy(id = "txtRejectNotes_ID")
	public static WebElement CLINDetailNoteDesRejectpop;
	
	@FindBy(id = "btnCancel_ID")
	public static WebElement CLINDetailCancel;
	
	@FindBy(id = "txtClinCode_ID")
	public static WebElement AddCLINCodepopup;
	
	@FindBy(id = "clinWarning_ID")
	public static WebElement InvalidCLINCodeWarn;
	
	@FindBy(id = "txtClinFee_ID")
	public static WebElement AddCLINFeepopup;
	
	@FindBy(id = "txtClinPrintCode_ID")
	public static WebElement AddCLINPrintCodepopup;
	
	@FindBy(id = "txtClinPrintDesc_ID")
	public static WebElement AddCLINPrintDespopup;
	
	@FindBy(id = "clinWarning_ID")
	public static WebElement AddCLINFeeWarningspopup;
	
	@FindBy(id = "clinWarning_ID")
	public static WebElement AddCLINCodeWarningspopup;
	
	@FindBy(id = "searchclinGrid_ID")
	public static WebElement BillingCLINSearch;
	
	@FindBy(xpath = "//td[@aria-describedby='clinGrid_ID_PrintCode']")
	public static WebElement BillCLINSearchResult;
	
	////////////////////////////////////////// Edit Billing Clin ///////////////////////////////
	
	@FindBy(xpath = "//a[@title='Edit']")
	public static WebElement EditBillCLIN;
	
	
	///////////////////// Download Excel Template //////////////////////////
	
	@FindBy(id = "btnImport_ID")
	public static WebElement CLINImportBill;
	
	@FindBy(id = "btnUploadCancel_ID")
	public static WebElement CancelCLINImportBill;
	
	@FindBy(id = "btnUpload_ID")
	public static WebElement CLINUploadImportBill;
	
	@FindBy(id = "codeWarning_ID")
	public static WebElement CLINUploadWarning;
	
	@FindBy(id = "btnDownloadTemplate_ID")
	public static WebElement CLINDownloadTemplink;
	
	//////////////////////////// Upload Excel Template ////////////////////////
	
	@FindBy(xpath = "//label[@for='file_ID']")
	public static WebElement CLINUploadBrowse;
	
	@FindBy(id = "codeWarning_ID")
	public static WebElement CLINUploadValidation;
	
	///////////////////////// Sort Billing Clin Column //////////////////////////
	
	@FindBy(id = "jqgh_clinGrid_ID_Code")
	public static WebElement SortClinCode;
	
	@FindBy(id = "clinGrid_ID_Category")
	public static WebElement SortClinCat;
	
	@FindBy(id = "clinGrid_ID_Type")
	public static WebElement SortClinType;
	
	@FindBy(id = "clinGrid_ID_Description")
	public static WebElement SortClinDes;
	
	@FindBy(id = "jqgh_clinGrid_ID_PrintCode")
	public static WebElement SortClinPrintCode;
	
	@FindBy(id = "clinGrid_ID_PrintDescription")
	public static WebElement SortClinPrintDes;
	
	@FindBy(id = "clinGrid_ID_Fee")
	public static WebElement SortClinFee;
	
	
	///////////////////// Delete CLIN Bill ///////////////////////////////
	
	@FindBy(xpath = "(//a[@title='Delete'])[2]")
	public static WebElement DeleteUploadedCLIN;
	
	@FindBy(id = "btnYes_ID")
	public static WebElement AcceptDeleteUploadedCLIN;
	
	@FindBy(id = "btnNo_ID")
	public static WebElement No;
	
	@FindBy(id = "spnclinGrid_ID")
	public static WebElement NoDataValidation;
	
	
//////////////////////////// Audit History /////////////////////////
	
	@FindBy(id = "auditCollapsePanel_ID")
	public static WebElement AHHeader;
	
	@FindBy(id = "trackAll_ID")
	public static WebElement CDViewall;
	
 
	
	
}
