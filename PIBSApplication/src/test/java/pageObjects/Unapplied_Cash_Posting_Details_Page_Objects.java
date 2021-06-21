package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Unapplied_Cash_Posting_Details_Page_Objects {
////////////////////////////////////Detail Page Redirection ///////////////////

@FindBy(xpath ="//a[@title='Details']")
public static WebElement DetailAction;

/////////////////////////////////// Page Label /////////////////////////////////

@FindBy(xpath ="//*[@id=\"topbar\"]/nav/div/h1")
public static WebElement PageLabel;

/////////////////////////////////// Details Header //////////////////////////////

@FindBy(xpath ="//*[@id=\"cashCollectionDetailsEdit_ID\"]/div[1]/a")
public static WebElement detailsheader;

@FindBy(xpath ="//*[@id=\"cashCollectionDetailsEdit_ID\"]/div[2]/a")
public static WebElement invoiceheader;

@FindBy(xpath ="//*[@id=\"auditCollapsePanel_ID\"]")
public static WebElement AUheader;

///////////////////////////////// Details Header Fields ////////////////////////////////////

@FindBy(id ="txtNotes_ID")
public static WebElement Notes;

@FindBy(id ="btnConfirm_ID")
public static WebElement ConfirmPostingbtn;

@FindBy(id ="btnCancel_ID")
public static WebElement Canceldetail;

@FindBy(id ="btnYes_ID")
public static WebElement YesCancel;

@FindBy(id ="btnNo_ID")
public static WebElement NoCancel;

@FindBy(id ="btnRefundClose_ID")
public static WebElement RefundClosebtn;

@FindBy(id ="btnYes_ID")
public static WebElement YesRefund;

@FindBy(id ="btnNo_ID")
public static WebElement NoRefund;

@FindBy(id ="spnStatusName_ID")
public static WebElement RefundCloseStatus;

///////////////////////////////////// Invoice Confirm Posting Warning Message /////////////////

@FindBy(id ="lblNoInvoiceSelectedWarningMsg_ID")
public static WebElement ConfirmInvWarn;

@FindBy(id ="btnYes_ID")
public static WebElement YesConfirm;

@FindBy(id ="btnNo_ID")
public static WebElement NoConfirm;

//////////////////////////Add Invoice //////////////////////

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

@FindBy(xpath ="//button[@title='Close']")
public static WebElement InvoiceClosePopup;

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

@FindBy(xpath ="//a[@title='I-210211003']")
public static WebElement AddedInv;

@FindBy(xpath ="(//span[contains(text(),'I-210211003')])[1]")
public static WebElement InvoiceLink;

@FindBy(id ="spnInvoiceNumber_ID")
public static WebElement InvoiceLabel;

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
	
}
