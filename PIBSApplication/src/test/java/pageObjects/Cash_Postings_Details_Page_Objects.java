package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cash_Postings_Details_Page_Objects {
	
////////////////////////////////////Detail Page Redirection ///////////////////

@FindBy(xpath ="//a[@title='Details']")
public static WebElement DetailAction;

//////////////////////////////////// Unsaved Check ///////////////////

@FindBy(id ="slcLobCode_ID")
public static WebElement LOBDetail;

@FindBy(id ="slcBank_ID")
public static WebElement BankDetail;

@FindBy(xpath ="//*[@id=\"slcBank_ID\"]/option[2]")
public static WebElement BankCDetail;

@FindBy(xpath ="//*[@id=\"slcBank_ID\"]/option[3]")
public static WebElement BankBDetail;

@FindBy(id ="slcPaymentMethod_ID")
public static WebElement PaymentDetail;

@FindBy(id ="dtDepositeDate_ID")
public static WebElement DDateDetail;

@FindBy(id ="txtCheckNumber_ID")
public static WebElement CheckDetail;

@FindBy(id ="txtAmountReceived_ID")
public static WebElement AmountDetail;

@FindBy(id ="txtNotes_ID")
public static WebElement NotesDetail;

@FindBy(id ="btnCancel_ID")
public static WebElement CancelDetail;

@FindBy(id ="btnYes_ID")
public static WebElement YesSaveDetail;

@FindBy(id ="btnNo_ID")
public static WebElement NoSaveDetail;

@FindBy(id ="btnSave_ID")
public static WebElement SaveDetail;

@FindBy(id ="btnConfirm_ID")
public static WebElement ConfirmPostDetail;

@FindBy(xpath="//*[@id=\"topbar\"]/nav/div/h1")
public static WebElement ListLabel;

@FindBy(id="cashStatus_ID")
public static WebElement CashStatusLabel;

@FindBy(id="btnReverse_ID")
public static WebElement ReversePostbtn;

@FindBy(id="btnYes_ID")
public static WebElement YesReverse;

@FindBy(id="btnNo_ID")
public static WebElement NoReverse;

////////////////////////// Add Invoice //////////////////////

@FindBy(id ="btnAddInvoice_ID")
public static WebElement AddInvoicebtn;

@FindBy(id ="btnInvoiceAdd_ID")
public static WebElement InvoiceAddbtn;

@FindBy(id ="spnErrorInvoiceSelection_ID")
public static WebElement InvoiceSelectWarn;

@FindBy(xpath ="//button[@title='Search']")
public static WebElement InvoiceSearch;

@FindBy(xpath ="//button[@title='Clear']")
public static WebElement InvoiceClear;

@FindBy(id ="txtcashPostingsInvoiceNumber_ID")
public static WebElement InvoiceNum;

@FindBy(id ="txtInvoiceAmount_ID")
public static WebElement InvoiceAmount;

@FindBy(id ="slcInvoiceStatus_ID")
public static WebElement InvoiceSatus;

@FindBy(id ="txtUnique_ID")
public static WebElement InvoiceUnique;

@FindBy(id ="txtTypeaheadExaminee_ID")
public static WebElement InvoiceExaminee;

@FindBy(id ="dateDOS_ID")
public static WebElement InvoiceDOS;

@FindBy(id ="spngrdInvoiceAdd_ID")
public static WebElement InvoiceNoData;

@FindBy(xpath ="//td[@aria-describedby='grdInvoiceAdd_ID_CashPostingsInvoiceNumber']")
public static WebElement ResultInvNum;

@FindBy(xpath ="//td[@aria-describedby='grdInvoiceAdd_ID_InvoiceStatusName']")
public static WebElement ResultStatus;

@FindBy(xpath ="//td[@aria-describedby='grdInvoiceAdd_ID_cb']")
public static WebElement SelectCheckbox;

@FindBy(xpath ="//input[@id='cb_grdInvoiceAdd_ID']")
public static WebElement SelectAllCheckbox;

///////////////////////////////// Popup Sort /////////////////////////////

@FindBy(id ="grdInvoiceAdd_ID_CashPostingsInvoiceNumber")
public static WebElement SortInvoice;

@FindBy(id ="grdInvoiceAdd_ID_LOBCode")
public static WebElement SortLOB;

@FindBy(id ="grdInvoiceAdd_ID_UTCApprovedDate")
public static WebElement SortSDate;

@FindBy(id ="grdInvoiceAdd_ID_UTCPaymentDueDate")
public static WebElement SortPaymentDue;

@FindBy(id ="grdInvoiceAdd_ID_InvoiceAmount")
public static WebElement SortInvoiceAmount;

@FindBy(id ="grdInvoiceAdd_ID_InvoiceStatusName")
public static WebElement SortInvoiceStatus;

///////////////////////////////////// After Add //////////////////////////////////

@FindBy(xpath ="//*[@id='divCardParent_ID_388_0']/a")
public static WebElement AddedInv;

@FindBy(xpath ="//*[@id=\"validationMessageModal_ID\"]/div/div/div[2]/div/h6/div")
public static WebElement EnterAmountWarn;

@FindBy(id ="btnOk_ID")
public static WebElement AcceptEnterAmountWarn;

@FindBy(id ="txtAmountPosting_ID_388_0")
public static WebElement AmtPostNow;

/////////////////////////////// Remove ///////////////////////////////////

@FindBy(xpath ="//button[@data-cpsea-action='remove']")
public static WebElement Remove;

@FindBy(xpath ="(//button[@data-cpsea-action='remove'])[1]")
public static WebElement RemoveAll;

@FindBy(id ="btnYes_ID")
public static WebElement RemoveYes;

@FindBy(id ="btnNo_ID")
public static WebElement RemoveNo;

///////////////////////////////// Confirm Posting /////////////////////////////

@FindBy(xpath ="//*[@id=\"validationMessageModal_ID\"]/div/div/div[2]/div/h6/div")
public static WebElement ConfirmPostwarn;

@FindBy(id ="btnOk_ID")
public static WebElement AcceptConfirmPost;

@FindBy(xpath ="//*[@id=\"cardCashCollectionInvoice_ID\"]/div[3]/div[1]")
public static WebElement CheckApplyPending;

@FindBy(id ="btnYes_ID")
public static WebElement YesConfirm;

@FindBy(id ="btnNo_ID")
public static WebElement NoConfirm;

/////////////////////// Lists Header /////////////////////////////////////
	
@FindBy(xpath="//*[@id=\'cashCollectionDetailsEdit_ID\']/div[1]/a")
public static WebElement Detailsheader;

@FindBy(xpath="//*[@id=\'cashCollectionDetailsEdit_ID\']/div[2]/a")
public static WebElement Invoicesheader;

@FindBy(xpath="//*[@id=\'auditCollapsePanel_ID\']")
public static WebElement AUheader;

/////////////////////////////////// Audit History ///////////////////////////

@FindBy(id = "trackAll_ID")
public static WebElement CPDViewall;

}
