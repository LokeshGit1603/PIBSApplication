package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Client_Contract_Details_Page_Objects {

	@FindBy(xpath = "//a[@href='/clientcontract/ContractDetails?clientContractId=120']")
	public static WebElement Action;
	
	@FindBy(id = "lblContractStatus_ID")
	public static WebElement CDStatus;
	
	@FindBy(xpath = "//*[@id=\'formClientContractEdit_ID\']/div[1]/a")
	public static WebElement CDHeader;
	
	@FindBy(id = "btnSave_ID")
	public static WebElement CDSave;
	
	@FindBy(xpath = "//button[@name='btnSubmit']")
	public static WebElement CDSubmit;
	
	@FindBy(id = "btnYes_ID")
	public static WebElement CDSubmitpopup;
	
	@FindBy(id = "btnNo_ID")
	public static WebElement No;
	
	@FindBy(id = "btnReject_ID")
	public static WebElement CDReject;
	
	@FindBy(id = "btnRejectNo_ID")
	public static WebElement NoCDReject;
	
	@FindBy(id = "txtRejectNotes_ID")
	public static WebElement CDRejectPopup;
	
	@FindBy(id = "rejectNotesWarning_ID")
	public static WebElement CDRejectWarning;
	
	@FindBy(id = "btnRejectYes_ID")
	public static WebElement CDRejectNotes;
	
	@FindBy(id = "btnCancel_ID")
	public static WebElement CDCancel;
	
	@FindBy(id = "btnYes_ID")
	public static WebElement CDYesCancel;
	
	@FindBy(id = "btnNo_ID")
	public static WebElement CDNoCancel;
	
	@FindBy(id = "slcSubmissionDueDays_ID")
	public static WebElement CDSubmissionDue;
	
	@FindBy(id = "slcPaymentDueDays_ID")
	public static WebElement CDPaymentDue;
	
	@FindBy(id = "slcPricingType_ID")
	public static WebElement CDPricingType;
	
	@FindBy(id = "ntxtAwardedAmount_ID")
	public static WebElement CDAwardedAmount;
	
	@FindBy(id = "ntxtFirstDiscountPercentage_ID")
	public static WebElement CDFirstDiscount;
	
	@FindBy(id = "slcFirstPayWithInDays_ID")
	public static WebElement CDFirstPay;
	
	/////////////////////////////////////// Batch Invoice ///////////////////////////////
	
	@FindBy(id = "slcInvoiceType_ID")
	public static WebElement CDInvoiceType;
	
	@FindBy(id = "slcInvoiceCadence_ID")
	public static WebElement CDInvoiceCadence;
	
	
	///////////////////////Purchase Order section ////////////////////
	
	@FindBy(id = "searchPurchaseOrderGrid")
	public static WebElement POSearch;
	
	@FindBy(xpath = "//td[@title='11/12/2020']")
	public static WebElement POSearchresult;
	
	@FindBy(xpath = "//td[@title='12/12/2020']")
	public static WebElement POEditSearchresult;
	
	/*
	 * @FindBy(xpath = "//*[@id=\"PurschaseOrderGrid_10382\"]/td[7]") public static
	 * WebElement POSearchresult;
	 */
	
	@FindBy(id = "jqgh_PurchaseOrderGrid_DisplayName")
	public static WebElement SortOptionYear;
	
	@FindBy(id = "jqgh_PurchaseOrderGrid_ServiceCategory")
	public static WebElement SortServicecat;
	
	@FindBy(id = "jqgh_PurchaseOrderGrid_PONumber")
	public static WebElement SortPONumber;
	
	@FindBy(id = "jqgh_PurchaseOrderGrid_POAmount")
	public static WebElement SortPOAmount;
	
	@FindBy(id = "jqgh_PurchaseOrderGrid_BalanceAmount")
	public static WebElement SortBalance;
	
	@FindBy(id = "jqgh_PurchaseOrderGrid_UTCAwardedDate")
	public static WebElement SortAwardeddate;
	
	@FindBy(xpath = "//*[@id=\'formClientContractEdit_ID\']/div[2]/a")
	public static WebElement POHeader;
	
	@FindBy(id = "addPurchaseOrder_ID")
	public static WebElement AddPurchaseOrder;
	
	@FindBy(id = "btnPOCancel_ID")
	public static WebElement CancelPurchaseOrder;
	
	@FindBy(id = "slcServiceCategory_ID")
	public static WebElement SelectServiceCat;
	
	@FindBy(id = "txtPONumber_ID")
	public static WebElement EnterPONum;
	
	@FindBy(id = "txtPOAmount_ID")
	public static WebElement EnterPOAmount;
	
	@FindBy(id = "dateAwardedDate_ID")
	public static WebElement EnterPOAwardedDate;
	
	@FindBy(xpath = "//*[@id=\'addPOModal_ID\']/div/div/div[1]/button")
	public static WebElement CloseAddPOpopup;
	
	@FindBy(xpath = "//a[@title='Edit']")
	public static WebElement POEdit;
	
	@FindBy(xpath = "//a[@title='Delete']")
	public static WebElement PODelete;
	
	@FindBy(xpath = "//button[@title='No']")
	public static WebElement PONoDelete;
	
	@FindBy(xpath = "//button[@title='Yes']")
	public static WebElement POAcceptDelete;
	
	@FindBy(id = "btnPOCancel_ID")
	public static WebElement CancelPO;
	
	@FindBy(id = "btnPOSave_ID")
	public static WebElement SaveAddedPO;
	
	@FindBy(xpath = "//*[@id=\'purchaseOrderWarning_ID\']/ul/li[1]")
	public static WebElement ServiceCatValidation;
	
	@FindBy(xpath = "//*[@id=\'purchaseOrderWarning_ID\']/ul/li[2]")
	public static WebElement PONumValidation;
	
	@FindBy(xpath = "//*[@id=\'purchaseOrderWarning_ID\']/ul/li[3]")
	public static WebElement POAmountValidation;
	
	@FindBy(xpath = "//*[@id=\'purchaseOrderWarning_ID\']/ul/li[4]")
	public static WebElement AwardDateValidation;
	
	@FindBy(xpath = "//*[@id='spnPurchaseOrderGrid']")
	public static WebElement POGrid;
	
	
	
	
	
	///////////////////////////////// Option Year ///////////////////////////
	
	@FindBy(id = "jqgh_optionsGrid_Name")
	public static WebElement SortName;
	
	@FindBy(id = "jqgh_optionsGrid_DisplayName")
	public static WebElement SortDName;
	
	@FindBy(id = "jqgh_optionsGrid_UTCStartDate")
	public static WebElement SortUTCSDate;
	
	@FindBy(id = "jqgh_optionsGrid_UTCEndDate")
	public static WebElement SortUTCEDate;
	
	@FindBy(xpath = "//*[@id=\'formClientContractEdit_ID\']/div[3]/a")
	public static WebElement OYHeader;
	
	/////////////////////////////////// Audit History ///////////////////////////
	
	@FindBy(id = "auditCollapsePanel_ID")
	public static WebElement AHHeader;
	
	@FindBy(id = "trackAll_ID")
	public static WebElement CDViewall;
	
	
	
	
	
	
}
