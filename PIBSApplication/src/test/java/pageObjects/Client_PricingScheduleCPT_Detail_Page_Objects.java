package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Client_PricingScheduleCPT_Detail_Page_Objects {

	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_ClientName']")
	public static WebElement CPSCPTClientResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_LOBCode']")
	public static WebElement CPSCPTLobResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_CodeType']")
	public static WebElement CPSCPTTypeResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_UTCStartDate']")
	public static WebElement CPSCPTSDateResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_UTCEndDate']")
	public static WebElement CPSCPTEDateResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdClientPricing_ID_ClientPricingScheduleStatus']")
	public static WebElement CPSStatusResult;
	
	@FindBy(xpath = "//a[@title='Details']")
	public static WebElement CPSCPTAction;
	
	/////////////////////////// Expand and Collapse Functionality /////////////////////////
	
	@FindBy(xpath = "//*[@id='formClientPricingtEdit_ID']/div[1]/a")
	public static WebElement CPSCPTheader;
	
	@FindBy(xpath = "//*[@id='formClientPricingtEdit_ID']/div[2]/a")
	public static WebElement CPSCPTBillingheader;
	
	/////////////////////// Add Billing CPT Codes ////////////////////////////////////
	
	@FindBy(id = "btnAddNew_ID")
	public static WebElement CPTAddBill;
	
	@FindBy(id = "btnSaveCptClinCancel_ID")
	public static WebElement CancelCPTAddBill;
	
	@FindBy(id = "btnSaveCptClin_ID")
	public static WebElement SaveNewCPTpopup;
	
	@FindBy(id = "txtCptCode_ID")
	public static WebElement AddCPTCodepopup;
	
	@FindBy(id = "cptWarning_ID")
	public static WebElement InvalidCPTCodeWarn;
	
	@FindBy(id = "txtCptFee_ID")
	public static WebElement AddCPTFeepopup;
	
	@FindBy(id = "txtCptPrintCode_ID")
	public static WebElement AddCPTPrintCodepopup;
	
	@FindBy(id = "txtCptPrintDesc_ID")
	public static WebElement AddCPTPrintDespopup;
	
	@FindBy(id = "searchcptGrid_ID")
	public static WebElement BillingCPTSearch;
	
	@FindBy(xpath = "//td[@aria-describedby='cptGrid_ID_PrintCode']")
	public static WebElement BillCPTSearchResult;
	
	////////////////////////////////// Edit Billing CPT Codes ////////////////////////////
	
	@FindBy(xpath = "//a[@title='Edit']")
	public static WebElement EditBillCPT;
	
///////////////////// Download Excel Template //////////////////////////
	
@FindBy(id = "btnImport_ID")
public static WebElement CPTImportBill;

@FindBy(id = "btnUpload_ID")
public static WebElement CPTUploadImportBill;

@FindBy(id = "btnUploadCancel_ID")
public static WebElement CancelCPTUploadImportBill;

@FindBy(id = "codeWarning_ID")
public static WebElement CPTUploadWarning;

@FindBy(id = "btnDownloadTemplate_ID")
public static WebElement CPTDownloadTemplink;

////////////////////////////Upload Excel Template ////////////////////////

@FindBy(xpath = "//label[@for='file_ID']")
public static WebElement CPTUploadBrowse;

@FindBy(id = "codeWarning_ID")
public static WebElement CPTUploadValidation;

///////////////////////// Sort Billing Clin Column //////////////////////////

@FindBy(id = "cptGrid_ID_Code")
public static WebElement SortCptCode;

@FindBy(id = "cptGrid_ID_Category")
public static WebElement SortCptCat;

@FindBy(id = "cptGrid_ID_Type")
public static WebElement SortCptType;

@FindBy(id = "cptGrid_ID_Description")
public static WebElement SortCptDes;

@FindBy(id = "cptGrid_ID_PrintCode")
public static WebElement SortCptPrintCode;

@FindBy(id = "cptGrid_ID_PrintDescription")
public static WebElement SortCptPrintDes;

@FindBy(id = "cptGrid_ID_Fee")
public static WebElement SortCptFlatFee;

///////////////////// Delete CPT Bill ///////////////////////////////

@FindBy(xpath = "(//a[@title='Delete'])[2]")
public static WebElement DeleteUploadedCPT;

@FindBy(id = "btnYes_ID")
public static WebElement AcceptDeleteUploadedCPT;

@FindBy(id = "btnNo_ID")
public static WebElement No;

@FindBy(id = "btnYes_ID")
public static WebElement Yes;

@FindBy(id = "spncptGrid_ID")
public static WebElement NoDataValidation;

@FindBy(id = "cptGrid_ID_cb")
public static WebElement SelectDeleteAll;

@FindBy(xpath = "//i[@title='Delete']")
public static WebElement DeleteAll;

////////////////////// Update CPT Details Status //////////////////////////

@FindBy(id = "lblPricingStatus_ID")
public static WebElement CPTDetailsStatus;

@FindBy(id = "btnSave_ID")
public static WebElement SaveCPTDetails;

@FindBy(id = "btnSubmit_ID")
public static WebElement SubmitCPTDetails;

@FindBy(id = "btnYes_ID")
public static WebElement AcceptSubmitCPTDetails;

@FindBy(id = "btnReject_ID")
public static WebElement RejectCPTDetails;

@FindBy(id = "btnRejectYes_ID")
public static WebElement AcceptRejectCPTDetails;

@FindBy(id = "btnRejectNo_ID")
public static WebElement CancelReject;

@FindBy(id = "rejectNotesWarning_ID")
public static WebElement RejectNoteValidationCPTDetails;

@FindBy(id = "txtRejectNotes_ID")
public static WebElement RejectNotesCPTDetails;

@FindBy(id = "btnCancel_ID")
public static WebElement CancelCPTDetails;

////////////////////////////Audit History /////////////////////////

@FindBy(id = "auditCollapsePanel_ID")
public static WebElement AHHeader;

@FindBy(id = "trackAll_ID")
public static WebElement CDViewall;

///////////////////////////// Delete ///////////////////////////////////////////

@FindBy(xpath = "(//a[@title='Delete'])[1]")
public static WebElement CPSCPTDelete;

@FindBy(id = "btnYes_ID")
public static WebElement CPSCPTAcceptDelete;
	
}
