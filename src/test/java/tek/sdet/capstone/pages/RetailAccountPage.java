package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import tek.sdet.capstone.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
	
	 
	 @FindBy(id = "nameInput")
	 public WebElement nameInputA;
	 
	 @FindBy(id = "phoneNumberInput")
	 public WebElement phoneNumberA;
	 
	 @FindBy(id = "personalUpdateBtn")
	 public WebElement personalUpdateBtn;
	 
	 @FindBy(id = "previousPasswordInput")
	 public WebElement perviousPasswordInput;
	 
	 @FindBy(id = "newPasswordInput")
	 public WebElement newPasswordInput;
	 
	 @FindBy(id = "confirmPasswordInput")
	 public WebElement confirmPasswordInput;
	 
	 @FindBy(id = "credentialsSubmitBtn")
	 public WebElement changePasswordBtn;
	 
	 @FindBy(xpath ="//div[text()='Password Updated Successfully']")
	 public WebElement textDisplayed;
	 
	 @FindBy(xpath = "//h1[@class='account__payment-new-title']")
	 public WebElement accountPayment;
	 
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
	 
	 @FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	 public WebElement textpayment;
	 
	 @FindBy(xpath = "//*[@class='account__payment-sub']")
	 public WebElement cardsOption;
	 
	 @FindBy(xpath = "//*[text()='Edit']")
	 public WebElement editCardInfo;
	 
	 
	 @FindBy(id = "paymentSubmitBtn")
	 public WebElement paymentUpdateBtn;
	 
	 
	 
	 @FindBy(xpath = "//*[text()='Payment Method updated Successfully']")
	 public WebElement updateCardText;
	 
	 @FindBy(id="accountLink")
	 public WebElement accountLink;
	 
	 @FindBy(xpath= "//*[@class='account__payment-sub-title']")
	 public WebElement card1;
	 
	 @FindBy(xpath = "//*[text()='remove']")
	 public WebElement removeOption;
	 
	 @FindBy(id = "paymentSubmitBtn")
	 public WebElement addCard;
	 
	 @FindBy(xpath = "//*[@class='account__address-new']")
	 public WebElement addressOption;
	 
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
	 
	 @FindBy(xpath = "//*[text()='Address Added Successfully']")
	 public WebElement addressSuccessfullText;
	 
	 @FindBy(xpath= "//*[@class='account__address-btn'][1]")
	 public WebElement editAddressBtn;
	 
	 @FindBy(xpath = "//*[text()='Update Your Address']")
	 public WebElement updateAddressBtn;
	 
	 @FindBy(xpath = "//*[text()='Address Updated Successfully']")
	 public WebElement updateAddressMessage;
	 
	 @FindBy(xpath = "//*[text()='Remove']")
	 public WebElement removeAddressBtn;
	 
	 
	 
	 
	 
	 
	 }



