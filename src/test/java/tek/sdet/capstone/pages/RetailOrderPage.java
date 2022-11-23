package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
        PageFactory.initElements(getDriver(), this);
    }
	
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
	 
	 @FindBy(id = "orderLink")
	 public WebElement orderLink;
	 
	 @FindBy(xpath = "//*[@alt = 'Amazon Fire TV ']")
	 public WebElement firstItem;
	 
	 
	 
	 @FindBy(id = "reasonInput")
		public WebElement reasonInput;
	 
	 @FindBy(xpath = "//*[@class = 'order__cancel-submit']")
		public WebElement orderSubmitBtn;
	 
	 @FindBy(xpath = "//*[text() = 'Bought wrong item']")
	 public WebElement wrongItem;
	 
	 @FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	 
	 @FindBy(xpath = "//*[text() = 'Return was successfull']")
	 public WebElement cancelationMsg;
	 
	 @FindBy(id = "backBtn")
	 public WebElement backBtn;
	 
	 @FindBy(id = "returnBtn")
	 public WebElement returnBtn;
	 
	 @FindBy(xpath = "//*[text() = 'Item damaged']")
	 public WebElement damagedreason;
	 
	 @FindBy(id = "dropOffInput")
	 public WebElement dropOffInput;
	 
	 @FindBy(xpath = "//*[text() = 'FedEx']")
	 public WebElement fedEx;
	 
	 @FindBy(id = "reviewBtn")
	 public WebElement reviewBtn;
	 
	 @FindBy(xpath = "//*[@name= 'headline']")
	 public WebElement headlineInput;
	 
	 @FindBy(xpath = "//*[@name= 'comment']")
	 public WebElement descriptionInput;
	 
	 @FindBy(id = "reviewSubmitBtn")
	 public WebElement reviewSubmitBtn;
	 
	 @FindBy(xpath = "//*[text() = 'Your review was added successfully']")
	 public WebElement reviewMsg;
	 
	 
	 
	 

}
