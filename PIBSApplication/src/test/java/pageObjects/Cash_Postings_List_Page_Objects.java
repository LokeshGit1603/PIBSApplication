package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cash_Postings_List_Page_Objects {
	
	@FindBy(xpath="//*[@id=\'accordionSidebar\']/li[7]/a")
	public static WebElement CashPostingsMenu;
	
/////////////////////// Lists Header /////////////////////////////////////
	
@FindBy(xpath="//*[@id=\'content\']/div[2]/div[1]/a")
public static WebElement Searchheader;

@FindBy(xpath="//*[@id=\'content\']/div[2]/div[2]/a")
public static WebElement SearchResultheader;

@FindBy(xpath="//button[@title='Search']")
public static WebElement SearchClick;

@FindBy(xpath="//button[@title='Clear']")
public static WebElement ClearClick;

@FindBy(xpath="//button[@title='Add New']")
public static WebElement addnewClick;

/////////////////////// No Result ///////////////////////////////////////

@FindBy(id="slcLob_ID")
public static WebElement SearchLOB;

@FindBy(id="txtInvoiceNumber_ID")
public static WebElement SearchInvoice;

@FindBy(id="txtAmount_ID")
public static WebElement SearchAmount;

@FindBy(id="slcStatus_ID")
public static WebElement SearchStatus;

@FindBy(id="dateDepositDate_ID")
public static WebElement SearchDDate;

@FindBy(id="datePostedDate_ID")
public static WebElement SearchPDate;

@FindBy(id="txtCheck_ID")
public static WebElement SearchCheck;

@FindBy(id="spngrdCashCollection_ID")
public static WebElement SearchResult;

////////////////////////////Sort Listing Grid  ///////////////////////////////

@FindBy(id="grdCashCollection_ID_LOBCode")
public static WebElement SortLOB;

@FindBy(id="grdCashCollection_ID_InvoiceNumber")
public static WebElement SortInvoice;

@FindBy(id="grdCashCollection_ID_UTCDepositedDate")
public static WebElement SortDDate;

@FindBy(id="grdCashCollection_ID_UTCCashPostedDate")
public static WebElement SortPDate;

@FindBy(id="grdCashCollection_ID_UTCCreatedDate")
public static WebElement SortCDate;

@FindBy(id="grdCashCollection_ID_Amount")
public static WebElement SortAmount;

@FindBy(id="grdCashCollection_ID_CheckNumber")
public static WebElement SortCheck;

//////////////////////////// Pagination Listing Grid /////////////////////////////

@FindBy(xpath="//select[@title='Records per Page']")
public static WebElement PerPage;

@FindBy(xpath="//input[@aria-label='Page No.']")
public static WebElement PageField;

@FindBy(id="errorPager_grdCashCollectionPager_ID")
public static WebElement PageWarn;

@FindBy(id="next_grdCashCollectionPager_ID")
public static WebElement NextPage;

@FindBy(id="last_grdCashCollectionPager_ID")
public static WebElement LastPage;

@FindBy(id="prev_grdCashCollectionPager_ID")
public static WebElement PreviousPage;

@FindBy(id="first_grdCashCollectionPager_ID")
public static WebElement FirstPage;

//////////////////////////Search Record ///////////////////////////////

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_LOBCode']")
public static WebElement LOBResult;

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_InvoiceNumber']")
public static WebElement InvoiceResult;

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_UTCDepositedDate']")
public static WebElement DDateResult;

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_UTCCashPostedDate']")
public static WebElement PDateResult;

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_Amount']")
public static WebElement AmountResult;

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_CashCollectionStatusName']")
public static WebElement StatusResult;

@FindBy(xpath ="//td[@aria-describedby='grdCashCollection_ID_CheckNumber']")
public static WebElement CheckResult;

////////////////////////////////////Detail Page Redirection ///////////////////

@FindBy(xpath ="//a[@title='Details']")
public static WebElement DetailAction;

@FindBy(xpath ="//a[@title='Assign & Open Details']")
public static WebElement AssignAction;

@FindBy(xpath ="//*[@id=\'topbar\']/nav")
public static WebElement DetailLabel;

@FindBy(id ="spnAssignedTo_ID")
public static WebElement AssignToLabel;

@FindBy(id ="btnCancel_ID")
public static WebElement CancelDetail;


//////////////////////////Add New Cash Posting Validation //////////////////////////

@FindBy(id="btnSave_ID")
public static WebElement SaveNewCash;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[1]")
public static WebElement Warn1;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[2]")
public static WebElement Warn2;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[3]")
public static WebElement Warn3;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[4]")
public static WebElement Warn4;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[5]")
public static WebElement Warn5;

@FindBy(xpath="//*[@id=\'validationMessageModal_ID\']/div/div/div[2]/div/h6/ul/li[6]")
public static WebElement Warn6;

@FindBy(id="btnOk_ID")
public static WebElement AcceptError;

@FindBy(id="btnCancel_ID")
public static WebElement NewCashCancel;

@FindBy(id="slcLobCode_ID")
public static WebElement NewLOB;

@FindBy(id="slcBank_ID")
public static WebElement NewBank;

@FindBy(id="slcPaymentMethod_ID")
public static WebElement NewPaymentModel;

@FindBy(id="dtDepositeDate_ID")
public static WebElement NewDDate;

@FindBy(id="txtCheckNumber_ID")
public static WebElement NewCheck;

@FindBy(id="txtAmountReceived_ID")
public static WebElement NewAmount;

@FindBy(id="txtNotes_ID")
public static WebElement NewNotes;

@FindBy(id="btnYes_ID")
public static WebElement YesUnsave;

@FindBy(id="btnNo_ID")
public static WebElement NoUnsave;

@FindBy(xpath="//*[@id=\"topbar\"]/nav/div/h1")
public static WebElement ListLabel;

}
