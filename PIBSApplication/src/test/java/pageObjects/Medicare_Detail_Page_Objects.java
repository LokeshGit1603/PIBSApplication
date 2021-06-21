package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Medicare_Detail_Page_Objects {
	
	@FindBy(xpath = "//td[@aria-describedby='grdMedicareOWCPFactorSchedule_ID_PricingType']")
	public static WebElement MedicarePTypeResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdMedicareOWCPFactorSchedule_ID_UTCStartDate']")
	public static WebElement MedicareSDateResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdMedicareOWCPFactorSchedule_ID_UTCEndDate']")
	public static WebElement MedicareEDateResult;
	
	@FindBy(xpath = "//td[@aria-describedby='grdMedicareOWCPFactorSchedule_ID_MedicareOWCPFactorScheduleStatusName']")
	public static WebElement MedicareStatusResult;
	
	@FindBy(xpath = "//a[@title='Details']")
	public static WebElement MedicareAction;
	
	/////////////////// Header /////////////////////////////////////////
	
	@FindBy(xpath = "//*[@id='formMedicareOwcpFactorScheduleEdit_ID']/div[1]/a")
	public static WebElement Medicareheader;
	
	@FindBy(xpath = "//*[@id='formMedicareOwcpFactorScheduleEdit_ID']/div[2]/a")
	public static WebElement MedicareCPTFactorheader;
	
	//*[@id='formMedicareOwcpFactorScheduleEdit_ID']/div[2]/a
	
/////////////////// Add CPT Factor Value  /////////////////////////////////////////
	
	@FindBy(id = "btnMedicareAddNew_ID")
	public static WebElement AddNewCode;
	
	@FindBy(id = "btnSaveMedicareCpt_ID")
	public static WebElement SaveAddNewPopup;
	
	@FindBy(id = "btnSaveMedicareCptCancel_ID")
	public static WebElement CancelSaveNewPopup;
	
	@FindBy(id = "txtMedicareCptCode_ID")
	public static WebElement MedicareCPTCode;
	
	@FindBy(id = "cptMedicareWarning_ID")
	public static WebElement MedicareCPTInvalidWarn;
	
	@FindBy(xpath = "//*[@id=\'cptMedicareWarning_ID\']/ul/li[1]")
	public static WebElement Warning1;
	
	@FindBy(xpath = "//*[@id=\'cptMedicareWarning_ID\']/ul/li[2]")
	public static WebElement Warning2;
	
	@FindBy(xpath = "//*[@id=\'cptMedicareWarning_ID\']/ul/li[3]")
	public static WebElement Warning3;
	
	@FindBy(xpath = "//*[@id=\'cptMedicareWarning_ID\']/ul/li[4]")
	public static WebElement Warning4;
	
	@FindBy(id = "txtCptWF_ID")
	public static WebElement WFCode;
	
	@FindBy(id = "txtCptPF_ID")
	public static WebElement PFCode;

	@FindBy(id = "txtCptMPF_ID")
	public static WebElement MPFCode;
	
	@FindBy(id = "txtCptCF_ID")
	public static WebElement CFCode;
	
	/////////////////////////// Search Added Code Factor  //////////////////////
	
	@FindBy(id = "searchcptMedicareGrid_ID")
	public static WebElement SearchCode;
	
	@FindBy(xpath = "//td[@aria-describedby='cptMedicareGrid_ID_WorkFactor']")
	public static WebElement WFCodeSearchResult;
	
	///////////////////////////// Edit Code Factor ////////////////////////
	
	@FindBy(xpath = "//a[@title='Edit']")
	public static WebElement EditCode;
	
	////////////////////////// Excel Import Validation /////////////////////////
	
	@FindBy(id = "btnMedicareImport_ID")
	public static WebElement ExcelimportClick;
	
	@FindBy(id = "btnUploadCancel_ID")
	public static WebElement CancelExcelimport;
	
	@FindBy(id = "btnUpload_ID")
	public static WebElement uploadimportClick;
	
	@FindBy(id = "codeWarning_ID")
	public static WebElement uploadimportwarning;
	
	//////////////////////// Download Excel ////////////////////////////////
	
	@FindBy(id = "btnDownloadTemplate_ID")
	public static WebElement Downloadlink;
	
	//////////////////////// Upload Excel //////////////////////////
	
	@FindBy(xpath = "//label[@for='file_ID']")
	public static WebElement UploadBrowse;
	
	@FindBy(id = "codeWarning_ID")
	public static WebElement UploadBrowseValidation;
	
///////////////////////// Sort CPT Code Factor Column //////////////////////////
	
@FindBy(id = "cptMedicareGrid_ID_cb")
public static WebElement SortCPTCode;

@FindBy(id = "cptMedicareGrid_ID_WorkFactor")
public static WebElement SortWFCode;

@FindBy(id = "cptMedicareGrid_ID_PracticeFactor")
public static WebElement SortPFCode;

@FindBy(id = "cptMedicareGrid_ID_MalPracticeFactor")
public static WebElement SortMPFCode;

@FindBy(id = "cptMedicareGrid_ID_ConversionFactor")
public static WebElement SortCFCode;

///////////////////// Delete CPT Code Factor ///////////////////////////////

@FindBy(xpath = "(//a[@title='Delete'])[2]")
public static WebElement DeleteUploadedCPTFactor;

@FindBy(id = "cb_cptMedicareGrid_ID")
public static WebElement SelectDeleteAll;

@FindBy(xpath = "//i[@title='Delete']")
public static WebElement DeleteAll;

@FindBy(id = "btnYes_ID")
public static WebElement Yes;

@FindBy(id = "btnNo_ID")
public static WebElement No;

@FindBy(id = "btnYes_ID")
public static WebElement AcceptDeleteUploadedCPTFactor;

@FindBy(id = "spncptMedicareGrid_ID")
public static WebElement NoDataValidation;

/////////////////////////////////////// Medicare CPT Detail Status Update ///////////////////


@FindBy(id = "lblMedicareOWCPFactorScheduleStatus_ID")
public static WebElement MedicareDetailStatus;

@FindBy(id = "btnSave_ID")
public static WebElement MedicareDetailSave;

@FindBy(id = "btnYes_ID")
public static WebElement MedicareDetailAcceptSubmit;;

@FindBy(id = "btnSubmit_ID")
public static WebElement MedicareDetailSubmit;

@FindBy(id = "btnReject_ID")
public static WebElement MedicareDetailReject;

@FindBy(id = "btnRejectYes_ID")
public static WebElement MedicareDetailSaveRejectpop;

@FindBy(id = "btnRejectNo_ID")
public static WebElement CancelMedicareDetailRejectpop;

@FindBy(id = "rejectNotesWarning_ID")
public static WebElement MedicareDetailNoteWarnRejectpop;

@FindBy(id = "txtRejectNotes_ID")
public static WebElement MedicareDetailNoteDesRejectpop;

@FindBy(id = "btnCancel_ID")
public static WebElement MedicareDetailCancel;

////////////////////////////Audit History /////////////////////////

@FindBy(id = "auditCollapsePanel_ID")
public static WebElement AHHeader;

@FindBy(id = "trackAll_ID")
public static WebElement CDViewall;

///////////////////////////// Clone /////////////////////////////////////////////

@FindBy(xpath = "//a[@title='Clone']")
public static WebElement MedicareClone;

@FindBy(id = "btnCancel_ID")
public static WebElement MedicareCloneCancel;

///////////////////////////// Delete ///////////////////////////////////////////

@FindBy(xpath = "(//a[@title='Delete'])[1]")
public static WebElement MedicareCPTDelete;

@FindBy(id = "btnYes_ID")
public static WebElement MedicareCPTAcceptDelete;


	
	
	
	
	
	
}
