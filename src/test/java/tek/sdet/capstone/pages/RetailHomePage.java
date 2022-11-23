package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;



public class RetailHomePage extends BaseSetup {
	
	 public RetailHomePage() {
	        PageFactory.initElements(getDriver(), this);
	    }
	 @FindBy(id ="signinLink")
	 public WebElement signIn;
	
	 @FindBy(id = "accountLink")
	 public WebElement accountButton;
	 
	 @FindBy(id = "search")
	 public WebElement allDepartment;
	 
	 @FindBy(xpath = "//*[@d='M32 96v64h448V96H32zm0 128v64h448v-64H32zm0 128v64h448v-64H32z']")
	 public WebElement allSection;
	 
	 @FindBy(xpath = "//*[@value = '1']")
	 public WebElement electronicsOption;
	 
	 @FindBy(xpath = "//*[@value = '2']")
	 public WebElement computerOption;
	 
	 @FindBy(xpath = "//*[@value = '3']")
	 public WebElement smartHomeOption;
	 
	 @FindBy(xpath = "//*[@value='4']")
	 public WebElement sportOption;
	 
	 @FindBy(xpath = "//*[@value='5']")
	 public WebElement automative;
	 
	 @FindBy(id = "searchInput")
	 public WebElement searchInput;
	 
	 @FindBy(xpath = "//*[text()='TV & Video']")
	 public WebElement presentTvAndVideo;
	 
	 @FindBy(id = "searchBtn")
	 public WebElement searchBtn;
	 
	 @FindBy(xpath = "//*[text()='Video Games']")
	 public WebElement presentVideoGames;
	 
	 @FindBy(xpath = "//*[@class ='sidebar_content-item'][1]")
	 public WebElement accesories;
	 
	 @FindBy(xpath = "//*[text() ='Networking']")
	 public WebElement networking;
	 
	 @FindBy(xpath = "//*[text() ='Smart Home Lightning']")
	 public WebElement smarthomeLighting;
	 
	 @FindBy(xpath = "//*[text() ='Plugs and Outlets']")
	 public WebElement plugsAndOutlets;
	 
	 @FindBy(xpath = "//*[text() ='Athletic Clothing']")
	 public WebElement athleticClothing;
	 
	 @FindBy(xpath = "//*[text() ='Exercise & Fitness']")
	 public WebElement exerciseAndFitness;
	 
	 @FindBy(xpath = "//*[text() ='Automative Parts & Accessories']")
	 public WebElement automativeParts;
	 
	 @FindBy(xpath = "//*[text() ='MotorCycle & Powersports']")
	 public WebElement motorcycleAndPowersport;
	 
	 @FindBy(xpath = "//*[text() = 'Kasa Outdoor Smart Plug']")
	 public WebElement kasaOutdoorSmartPlug;
	 
	 
	 
	 
	 
	 
	 
	 
	 @FindBy(id = "signinLink")
	 public WebElement signinLink;
	 
	 @FindBy(id ="email")
	 public WebElement email;
	 
	 @FindBy(id = "password")
	 public WebElement password;
	 
	 @FindBy(id = "loginBtn")
	 public WebElement loginBtn;
	 
	 @FindBy(id = "accountLink")
	 public WebElement accountLink;
	 
	 @FindBy(xpath = "//*[@alt='Kasa Outdoor Smart Plug']")
	 public WebElement smartPlugIcon;
	 
	 @FindBy(xpath = "//*[@class='product__select']")
	 public WebElement quantity;
	 
	 @FindBy(xpath = "//*[text()='2']")
	 public WebElement quantity2;
	 
	 @FindBy(xpath = "//*[text()='Add to Cart']")
	 public WebElement addToCart;
	 
	 
	 @FindBy(xpath = "//*[@class='product__cart-exists']")
	 public WebElement quantiyAdded;
	 
	 
	
	 @FindBy(xpath = "//*[@class = 'top-nav__cart-quantity']")
	 public WebElement added2ToQty;
	 
	 @FindBy(xpath = "//*[text() = 'Proceed to Checkout']")
	 public WebElement proceedBtn;
	 
	 @FindBy(id = "addAddressBtn")
	 public WebElement addAddressBtn;
	 
	 @FindBy(id = "countryDropdown")
	 public WebElement countryDropdown;
	 
	 @FindBy(id = "fullNameInput")
	 public WebElement fullNameInput;
	 
	 @FindBy(id = "phoneNumberInput")
	 public WebElement phoneNumberInput;
	 
	 @FindBy(id = "streetInput")
	 public WebElement streetInput;
	 
	 
	 @FindBy(xpath = "//*[@name='state']")
	 public WebElement stateInput;
	 
	 @FindBy(xpath = "//*[@name='apartment']")
	 public WebElement appartmentInput;
	 
	 @FindBy(id = "cityInput")
	 public WebElement cityInput;
	 
	 
	 
	 @FindBy(id = "zipCodeInput")
	 public WebElement zipCodeInput;
	 
	 @FindBy(id = "addressBtn")
	 public WebElement addressBtn;
	 
	 @FindBy(id = "addPaymentBtn")
	 public WebElement addPaymentBtn;
	 
	 @FindBy(id = "cardNumberInput")
	 public WebElement cardNumberInput;
	 
	 @FindBy(id = "nameOnCardInput")
	 public WebElement nameOnCardInput;
	 
	 @FindBy(id = "expirationMonthInput")
	 public WebElement expirationMonthInput;
	 
	 @FindBy(id = "expirationYearInput")
	 public WebElement expirationYearInput;
	 
	 @FindBy(id = "securityCodeInput")
	 public WebElement securityCodeInput;
	 
	 @FindBy(id = "paymentSubmitBtn")
	 public WebElement paymentSubmitBtn;
	 
	 @FindBy(id = "placeOrderBtn")
	 public WebElement placeOrderBtn;
	 
	 @FindBy(xpath = "//*[@class = 'text-xl  font-semibold flex items-center gap-2 text-teal-700']")
	 public WebElement messageOrder;
	 
	 @FindBy(xpath = "//*[@alt='Apex Legends - 1,000 Apex Coins']")
	 public WebElement apexLegends;
	 
	 @FindBy(xpath = "//*[text()='5']")
	 public WebElement quantity5;
	 
	 @FindBy(xpath = "//*[@class='cart__item-detail']")
	 public  WebElement addedQty;
	 
	 @FindBy(xpath = "//*[text()='Cart ']")
	 public WebElement cartOption;
	 
	 @FindBy(id = "cartBtn")
	 public WebElement cartBtn;
	 
	 @FindBy(xpath = "//*[text()='Order Placed, Thanks']")
	 public WebElement orderPlacedMsg;
	 
	 
	 @FindBy(id ="addToCartBtn")
	 public WebElement addToCartBtn;
	 
}

