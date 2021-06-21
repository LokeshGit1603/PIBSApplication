package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Services_EventInvoice_Detail_Page_Objects {
	
////////////////////////////////////Detail Page Redirection ///////////////////
	
@FindBy(xpath ="//a[@title='Details']")
public static WebElement DetailAction;

@FindBy(xpath ="//*[@id=\'topbar\']/nav/div/h1")
public static WebElement DetailLabel;

////////////////////////////////Details Page Header //////////////////////

@FindBy(xpath="//*[@id=\'serviceDetailsEdit_ID\']/div[1]/a")
public static WebElement Detailsheader;

@FindBy(xpath="//*[@id=\'serviceDetailsEdit_ID\']/div[2]/a")
public static WebElement InvoiceLineItemheader;

@FindBy(xpath="//*[@id=\'invoiceLineItemsCardBody_ID\']/div[5]/a")
public static WebElement InvoiceAdjustheader;

@FindBy(xpath="//*[@id=\'serviceDetailsEdit_ID\']/div[3]/a")
public static WebElement PaymentLineItemheader;

@FindBy(xpath="//*[@id=\'paymentLineItemsCardBody_ID\']/div[5]/a")
public static WebElement PaymentAdjustheader;

@FindBy(id="auditCollapsePanel_ID")
public static WebElement AuditHistoryheader;

/////////////////////////////////// Invoice Live Items elements ///////////////////////////////////////

@FindBy(id="searchinvoiceLineItemsGrid_ID")
public static WebElement SearchInvoiceItemCode;

@FindBy(id="spninvoiceLineItemsGrid_ID")
public static WebElement SearchResultInvoiceItemCode;

@FindBy(xpath="(//td[@aria-describedby='invoiceLineItemsGrid_ID_Code'])[2]")
public static WebElement SearchValueResultInvoiceItemCode;

@FindBy(id="invoiceLineItemsGrid_ID_Type")
public static WebElement SortType;

@FindBy(id="invoiceLineItemsGrid_ID_Code")
public static WebElement SortCode;

@FindBy(id="invoiceLineItemsGrid_ID_Description")
public static WebElement SortDescription;

@FindBy(id="invoiceLineItemsGrid_ID_Qty")
public static WebElement SortQTY;

@FindBy(id="invoiceLineItemsGrid_ID_UnitPrice")
public static WebElement SortUnitPrice;

@FindBy(id="invoiceLineItemsGrid_ID_TotalPrice")
public static WebElement SortTotalPrice;

@FindBy(id="invoiceLineItemsGrid_ID_ReferenceID")
public static WebElement SortClientInvoice;

@FindBy(xpath="(//td[@aria-describedby=\'invoiceLineItemsGrid_ID_Action\'])[1]")
public static WebElement AdjustAction;

@FindBy(id="btnCancelInvoiceLineAdjustment_ID")
public static WebElement CancelAdjustAction;

@FindBy(id="invoiceAdjWarning_ID")
public static WebElement InvalidWarn;

@FindBy(id="slcCodeType_ID")
public static WebElement Typepopup;

@FindBy(id="txtCptCodes_ID")
public static WebElement Codepopup;

@FindBy(id="txtQty_ID")
public static WebElement QTYpopup;

@FindBy(id="slcAjustmentCode_ID")
public static WebElement AdjustCodepopup;

@FindBy(id="btnYes_ID")
public static WebElement Accepttwo;

@FindBy(id="btnNo_ID")
public static WebElement No;

@FindBy(xpath="//*[@id=\'invoiceAdjWarning_ID\']/ul/li[1]")
public static WebElement Warn1;

@FindBy(xpath="//*[@id=\'invoiceAdjWarning_ID\']/ul/li[2]")
public static WebElement Warn2;

@FindBy(id="btnSaveInvoiceAdj_ID")
public static WebElement SavePopup;

/////////////////////////////////////////////// Adjustment Invoice Live Items elements /////////////////////////////////

@FindBy(id="searchadjustmentInvoiceLineItemsGrid_ID")
public static WebElement AdjustSearchInvoiceItemCode;

@FindBy(id="spnadjustmentInvoiceLineItemsGrid_ID")
public static WebElement AdjustSearchResultInvoiceItemCode;

@FindBy(xpath="//td[@aria-describedby='adjustmentInvoiceLineItemsGrid_ID_Type']")
public static WebElement AdjustSearchValueResultType;

@FindBy(xpath="//td[@aria-describedby='adjustmentInvoiceLineItemsGrid_ID_Code']")
public static WebElement AdjustSearchValueResultCode;

@FindBy(xpath="//td[@aria-describedby='adjustmentInvoiceLineItemsGrid_ID_Qty']")
public static WebElement AdjustSearchValueResultQTY;

@FindBy(xpath="//td[@aria-describedby='adjustmentInvoiceLineItemsGrid_ID_AdjustmentCodeName']")
public static WebElement AdjustSearchValueResultAdjCode;

@FindBy(id="addInvoiceAdjustment_ID")
public static WebElement AddAdjustAction;

@FindBy(id="btnCancelInvoiceLineAdjustment_ID")
public static WebElement CancelAddAdjustAction;

@FindBy(xpath="(//a[@title='Edit'])[1]")
public static WebElement EditAction;

@FindBy(xpath="(//a[@title='Delete'])[1]")
public static WebElement DeleteAction;

@FindBy(id="btnYes_ID")
public static WebElement AcceptDeleteAction;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_Type")
public static WebElement SortAdjustType;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_Code")
public static WebElement SortAdjustCode;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_Qty")
public static WebElement SortAdjustQTY;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_UnitPrice")
public static WebElement SortAdjustUnitPrice;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_TotalPrice")
public static WebElement SortAdjustTotalPrice;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_AdjustmentCodeName")
public static WebElement SortAdjustCodeName;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_Reason")
public static WebElement SortAdjustReason;

@FindBy(id="adjustmentInvoiceLineItemsGrid_ID_ReferenceID")
public static WebElement SortAdjustClient;

//////////////////Pending ///////////////////////

@FindBy(id="btnPending_ID")
public static WebElement Pending;

////////////////////Approve ///////////////////////////

@FindBy(id="btnApprove_ID")
public static WebElement Approve;

//////////////////////////Cancel ///////////////////////////////

@FindBy(id="btnCancel_ID")
public static WebElement Cancel;

////////////////////////////////View All ///////////////////////////////

@FindBy(id = "trackAll_ID")
public static WebElement CDViewall;




}
