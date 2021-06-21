package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Services_AppPayment_Detail_Page_Objects {
	
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

/////////////////////////////////// Payment Live Items elements ///////////////////////////////////////

@FindBy(id="searchpaymentLineItemsGrid_ID")
public static WebElement SearchPaymentItemCode;

@FindBy(id="spnpaymentLineItemsGrid_ID")
public static WebElement SearchResultPaymentItemCode;

@FindBy(xpath="(//td[@aria-describedby='paymentLineItemsGrid_ID_Code'])[1]")
public static WebElement SearchValueResultPaymentItemCode;

@FindBy(id="paymentLineItemsGrid_ID_Provider")
public static WebElement SortProvider;

@FindBy(id="paymentLineItemsGrid_ID_ProviderSpecialty")
public static WebElement SortSpeciality;

@FindBy(id="paymentLineItemsGrid_ID_Type")
public static WebElement SortType;

@FindBy(id="paymentLineItemsGrid_ID_Code")
public static WebElement SortCode;

@FindBy(id="paymentLineItemsGrid_ID_Description")
public static WebElement SortDescription;

@FindBy(id="paymentLineItemsGrid_ID_Qty")
public static WebElement SortQTY;

@FindBy(id="paymentLineItemsGrid_ID_UnitPrice")
public static WebElement SortUnitPrice;

@FindBy(id="paymentLineItemsGrid_ID_TotalPrice")
public static WebElement SortTotalPrice;

@FindBy(id="paymentLineItemsGrid_ID_ReferenceID")
public static WebElement SortEOPVendorInvoice;

@FindBy(xpath="(//*[@aria-describedby='paymentLineItemsGrid_ID_Action'])[1]")
public static WebElement AdjustAction;

@FindBy(id="btnPaymentAdjCancel_ID")
public static WebElement CancelAdjustAction;

@FindBy(id="flatAdjustmentRadioOption_ID")
public static WebElement FlatAdjust;

@FindBy(id="quantityAdjustmentRadioOption_ID")
public static WebElement QuantityAdjust;

@FindBy(id="slcPaymentCodeType_ID")
public static WebElement Typepopup;

@FindBy(id="txtPaymentCptCode_ID")
public static WebElement Codepopup;

@FindBy(id="txtPaymentFlatFee_ID")
public static WebElement AdjustAmountpopup;

@FindBy(id="txtPaymentQty_ID")
public static WebElement AdjustQTY;

@FindBy(id="slcPaymentAjustmentCode_ID")
public static WebElement AdjustCodepopup;

@FindBy(id="btnYes_ID")
public static WebElement Accepttwo;

@FindBy(id="paymentAdjWarning_ID")
public static WebElement InvalidCode;

@FindBy(xpath="//*[@id='paymentAdjWarning_ID']/ul/li[1]")
public static WebElement Warn1;

@FindBy(xpath="//*[@id='paymentAdjWarning_ID']/ul/li[2]")
public static WebElement Warn2;

@FindBy(id="btnSavePaymentAdj_ID")
public static WebElement SavePopup;

/////////////////////////////////////////////// Adjustment Payment Live Items elements /////////////////////////////////

@FindBy(id="searchadjustmentPaymentLineItemsGrid_ID")
public static WebElement AdjustSearchPaymentItemCode;

@FindBy(id="spnadjustmentPaymentLineItemsGrid_ID")
public static WebElement AdjustSearchResultPaymentItemCode;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_Provider'])[1]")
public static WebElement AdjustSearchValueResultProvider;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_Type'])[1]")
public static WebElement AdjustSearchValueResultType;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_Code'])[1]")
public static WebElement AdjustSearchValueResultCode;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_Qty'])[1]")
public static WebElement AdjustSearchValueResultQTY;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_UnitPrice'])[1]")
public static WebElement AdjustSearchValueResultUnitPrice;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_TotalPrice'])[1]")
public static WebElement AdjustSearchValueResultTotalPrice;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_AdjustmentCodeName'])[1]")
public static WebElement AdjustSearchValueResultAdjCode;

@FindBy(xpath="(//td[@aria-describedby='adjustmentPaymentLineItemsGrid_ID_Reason']))[1]")
public static WebElement AdjustSearchValueResultReason;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_ReferenceID")
public static WebElement AdjustSearchValueResultEOPVendor;

@FindBy(id="addPaymentAdjustment_ID")
public static WebElement AddAdjustAction;

@FindBy(xpath="(//a[@title='Edit'])[1]")
public static WebElement EditAction;

@FindBy(xpath="(//a[@title='Delete'])[1]")
public static WebElement DeleteAction;

@FindBy(id="btnYes_ID")
public static WebElement AcceptDeleteAction;

@FindBy(id="btnNo_ID")
public static WebElement No;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_cb")
public static WebElement DeleteAllAction;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_Provider")
public static WebElement SortAdjustProvider;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_Type")
public static WebElement SortAdjustType;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_Code")
public static WebElement SortAdjustCode;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_Qty")
public static WebElement SortAdjustQTY;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_UnitPrice")
public static WebElement SortAdjustUnitPrice;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_TotalPrice")
public static WebElement SortAdjustTotalPrice;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_AdjustmentCodeName")
public static WebElement SortAdjustCodeName;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_Reason")
public static WebElement SortAdjustReason;

@FindBy(id="adjustmentPaymentLineItemsGrid_ID_ReferenceID")
public static WebElement SortAdjustEOP;

////////////////////////////////View All ///////////////////////////////

@FindBy(id = "trackAll_ID")
public static WebElement CDViewall;

////////////////// Assign ///////////////////////

@FindBy(id="btnAssign_ID")
public static WebElement Assign;

//////////////////Pending ///////////////////////

@FindBy(id="btnPending_ID")
public static WebElement Pending;

////////////////////Approve ///////////////////////////

@FindBy(id="btnApprove_ID")
public static WebElement Approve;

//////////////////////////Cancel ///////////////////////////////

@FindBy(xpath="//*[@id='btnCancel_ID']")
public static WebElement Cancel;

}
