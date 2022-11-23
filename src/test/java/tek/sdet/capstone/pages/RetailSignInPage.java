package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;



public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "accountLink")
	 public WebElement accountButton;
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
	
	@FindBy(id = "newAccountBtn")
    public WebElement newAccountButton;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	@FindBy(id = "passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id = "signupBtn")
	public WebElement signupButton;
	
	@FindBy(xpath = "//div[@class = 'account__address-new']")
	public WebElement address;
	
	
	
	
	
	
	
}
