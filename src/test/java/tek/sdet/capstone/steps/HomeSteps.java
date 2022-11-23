package tek.sdet.capstone.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;



public class HomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedtitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedtitle, actualTitle);
		logger.info(actualTitle + " is equal to "+expectedtitle);
	
		
	}
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allDepartment);
		logger.info("User click on All section");
		
	}
	@Then("below options are present in Shop by Department sidebar")
	public void optionsArePresentInShopByDepartment(DataTable data) {
		List<Map<String,String>> optionsOfAllDep = data.asMaps(String.class,String.class);
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computerOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sportOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
		logger.info("options of All Department is present");
		
	}
	@When("User can click on All section")
	public void userClickOnAllSections() {
		hardWait();
		click(factory.homePage().allSection);
		
		logger.info("user click on All section");
		
	}
	String department;
	@And("User is on {string}")
	public String userClickOnElectronics(String department) {
		hardWait();
		
		switch(department) {
		case "Electronics":
			Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsOption));
			logger.info("user is on Electronics option");
			break;
		case "Computers":
			Assert.assertTrue(isElementDisplayed(factory.homePage().computerOption));
			logger.info("user is on Computers option");
			break;
		case "Smart Home":
			Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeOption));
			logger.info("user is on Smart Home option");
			break;	
		case "Sports":
			Assert.assertTrue(isElementDisplayed(factory.homePage().sportOption));
			logger.info("user is on Sports option");
			break;
		case "Automotive":
			Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
			logger.info("user is on Automotive option");
			break;
			default:
			
		}
		return this.department = department;
	}
	
	@Then("below option are present in department")
	public void optionsShouldPresent(DataTable data) {
		hardWait();
	
		List<List<String>> department = data.asLists();
		
		switch(this.department){
			case "Electronics":
				click(factory.homePage().electronicsOption);
				String tvAndVideos = getText(factory.homePage().presentTvAndVideo);
				String videoGames = getText(factory.homePage().presentVideoGames);
				Assert.assertEquals(tvAndVideos, department.get(0).get(0));
				Assert.assertEquals(videoGames, department.get(0).get(1));
				logger.info(tvAndVideos + videoGames + " are present in All Department");
				break;
			case "Computers":
				click(factory.homePage().electronicsOption);
				String accessories = getText(factory.homePage().accesories);
				String Networking = getText(factory.homePage().networking);
				Assert.assertEquals(accessories, department.get(0).get(0));
				Assert.assertEquals(Networking, department.get(0).get(1));
				logger.info(accessories + Networking + " are present in All Department");
				break;
			case "Smart Home":
				click(factory.homePage().smartHomeOption);
				String smartHomeLightning = getText(factory.homePage().smarthomeLighting);
				String plugsAndOutlets = getText(factory.homePage().plugsAndOutlets);
				Assert.assertEquals(smartHomeLightning, department.get(0).get(0));
				Assert.assertEquals(plugsAndOutlets, department.get(0).get(1));
				logger.info(smartHomeLightning + plugsAndOutlets + " are present in All Department");
				break;
			case "Sports":
				click(factory.homePage().sportOption);
				String athleticClothing = getText(factory.homePage().athleticClothing);
				String exerciseAndFitness = getText(factory.homePage().exerciseAndFitness);
				Assert.assertEquals(athleticClothing, department.get(0).get(0));
				Assert.assertEquals(exerciseAndFitness, department.get(0).get(1));
				logger.info(athleticClothing + exerciseAndFitness + " are present in All Department");
				break;
			case "Automotive":
				click(factory.homePage().automative);
				String automativeParts = getText(factory.homePage().automativeParts);
				String motorCycleAndPowersports = getText(factory.homePage().motorcycleAndPowersport);
				Assert.assertEquals(automativeParts, department.get(0).get(0));
				Assert.assertEquals(motorCycleAndPowersports, department.get(0).get(1));
				logger.info(automativeParts + motorCycleAndPowersports + " are present in All Department");
				break;
				
		}
		
		
	}
	
	
	
	
	
	@When("User click on Sign In option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signinLink);
		logger.info("User click on Sign in option");
		
		
	}
	@And("User can enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.homePage().email,email);
		sendText(factory.homePage().password,password);
		logger.info("user etered email and password");
		
	}
	@And("user click on login button")
	public void userClickOnLoginButton(){
		
		click(factory.homePage().loginBtn);
		logger.info("User click on login button");
		
	}
	@And("User logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountLink));
		logger.info("User logged in into Account");
		
	}
	@And("User change the category to 'Smart Home'")
	public void userChangeTheCategoryToSmartHome() {
		hardWait();
		click(factory.homePage().allDepartment);
		click(factory.homePage().smartHomeOption);
		logger.info("User changed the category to 'Smart Home'");
		
		
	}
	@And("User search for an item {string}")
	public void userSearchAnItemKasaOutdoorSmartPlug(String value) {
		click(factory.homePage().searchInput);
		sendText(factory.homePage().searchInput,value);
		logger.info("User searched for an item 'kasa outdoor smart plug'");
		
		
	}
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("User clicke on Search icon");
		
	}
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().kasaOutdoorSmartPlug);
		logger.info("User clicked on item");
		
	}
	@And("User select quantity ‘2’")
	public void userSelectQuantity2() {
		click(factory.homePage().quantity);
		click(factory.homePage().quantity2);
		logger.info("User selected quantity ‘2’");
		
	}
	@And("User click on add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCart);
		logger.info("User clicked on add to Cart button");
	}
	@Then("the cart icon quantity should change to ‘2’")
	public void theCartIconQuantityShouldChange() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().added2ToQty));
		logger.info("the cart icon quantity should change to ‘2’");
		
	}
	@And("User click on Proceed to Checkout button")
	public void userClickedOnProceedToCheckoutBtn() {
		
		click(factory.homePage().proceedBtn);
		logger.info("User click on Proceed to Checkout button");
		
	}
	@And("User click Add a new address link for shipping address")
	public void userClickedAddNewAddressLink() {
		click(factory.homePage().addAddressBtn);
		logger.info("User click Add a new address link for shipping address");
		
	}
	@And("User fill new address form with below information")
	public void userFilledNewAddress(DataTable data) {
		hardWait();
		List<Map<String,String>> cardUpdateInfo = data.asMaps(String.class,String.class);
		sendText(factory.homePage().cardNumberInput,cardUpdateInfo.get(0).get("cardNumber"));
		hardWait();
		sendText(factory.homePage().nameOnCardInput,cardUpdateInfo.get(0).get("nameOnCard"));
		hardWait();
		click(factory.homePage().expirationMonthInput);
		click(factory.homePage().expirationYearInput);
		hardWait();
		sendText(factory.homePage().securityCodeInput,cardUpdateInfo.get(0).get("securityCode"));
		logger.info("user edited update information");
		
		
		
	}
	@And("User Click Add Your Address button")
	public void userClickedAddYourAddressBtn() {
		click(factory.homePage().addAddressBtn);
		logger.info("User click Add Your Address button");
		
	}
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickedAddACreditCard() {
		click(factory.homePage().addToCart);
		logger.info("User click Add a credit card or Debit Card for Payment method");
		
	}
	@And("user fill Debit or credit card information")
	public void uSerFilledDebitOrCredit(DataTable data) {
		hardWait();
		List<Map<String, String>> cardInfo = data.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberInput, cardInfo.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInput, cardInfo.get(0).get("nameOnCard"));
		click(factory.homePage().expirationMonthInput);
		click(factory.homePage().expirationYearInput);
		sendText(factory.homePage().securityCodeInput, cardInfo.get(0).get("securityCode"));

		logger.info("user filled card information");
		
		
	}
	@And("User Click on Add your card button")
	public void userClickedOnAddYourCardbtn() {
		click(factory.homePage().addPaymentBtn);
		logger.info("User click on Add your card button");
		
	}
    @And("User click on Place Your Order")
    public void userClickedOnPlaceYourOrder() {
    	click(factory.homePage().placeOrderBtn);
    	logger.info("User click on Place Your Order");
    	
    }
   @Then("  message should be displayed ‘Order Placed, Thanks’")
   public void msgShouldDisplayed() {
	   Assert.assertTrue(isElementDisplayed(factory.homePage().messageOrder));
	   logger.info("message displayed ‘Order Placed, Thanks’");
	
}
   
   @And("User Change the category to 'Electronics'")
	public void userChangeTheCategoryToElectronics() {
		hardWait();
		click(factory.homePage().allDepartment);
		click(factory.homePage().electronicsOption);
		logger.info("User changed the category to 'Electronics'");
		
		
	}
	@And("User Search for an item {string}")
	public void userSearchAnItemApexLegends(String value) {
		click(factory.homePage().searchInput);
		hardWait();
		sendText(factory.homePage().searchInput,value);
		logger.info("User searched for an item 'Apex Legends'");
		
		
	}
	@And("user click on Search icon")
	public void userClickOnSearchIconn() {
		click(factory.homePage().searchBtn);
		logger.info("User clicke on Search icon");
		
	}
	@And("user click on item")
	public void userClickOnItemm() {
		click(factory.homePage().apexLegends);
		logger.info("User clicked on item");
		
	}
	@And("User select quantity ‘5’")
	public void userSelectQuantity5() {
		click(factory.homePage().quantity);
		click(factory.homePage().quantity5);
		logger.info("User selected quantity ‘5’");
		
	}
	@And("User click add to Cart Btn")
	public void userClickAddToCartButtonn() {
		click(factory.homePage().addToCart);
		logger.info("User clicked on add to Cart button");
	}
	@Then("the cart icon quantity should change to ‘5’")
	public void theCartIconQuantityShouldChangeTo5() {
		click(factory.homePage().cartOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().addedQty));
		logger.info("the cart icon quantity should change to ‘5’");
		
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartOption);
		logger.info("User click on Cart option");
	}
	@And("User click On Proceed to Checkout button")
	public void userClickedOnProceedToCheckoutBtnn() {
		
		click(factory.homePage().proceedBtn);
		logger.info("User click on Proceed to Checkout button");
		
	}
   @And("User can click on Place Your Order")
   public void userClickOnPlaceYourOrder() {
	   click(factory.homePage().cartBtn);
	   click(factory.homePage().proceedBtn);
	   click(factory.homePage().placeOrderBtn);
	   logger.info("User click on Place Your Order");
	   
   }
   @Then("a Message should be displayed ‘Order Placed, Thanks’")
   public void orderPlacedMsgDisplayed() {
	   hardWait();
	   Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMsg));
	   logger.info("a Message displayed ‘Order Placed, Thanks’");
	   
   }
   
   
   
   }
   
   
   
   
   
   
   
   
