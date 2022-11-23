package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@Given("user is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedtitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedtitle, actualTitle);
		logger.info(actualTitle + " is equal to "+expectedtitle);
		
	}
	
	@When("user click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.orderPage().signinLink);
		logger.info("user click on sign in option");
		
	}
	
	@And("user enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.orderPage().email,email);
		sendText(factory.orderPage().password,password);
		logger.info("user enter email and password");
		
	}
	
	@And("user click on Login button")
	public void usserClickOnLoginButton() {
		click(factory.orderPage().loginBtn);
		logger.info("user click on login button");
		
	}
	
	@And("user should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().accountLink));
		logger.info("user logged in into Account");
		
	}
	@And("user click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("User click on Orders section");
		
	}
	@And("user click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstItem);
		logger.info("User click on first order in list");
		
	}
	@And("user click on Cancel The Order button")
	public void userClickOnCancelOrderBtn() {
		click(factory.orderPage().cancelBtn);
		logger.info("User click on Cancel The Order button");
		
	}
	@And("user select the cancelation Reason ‘Bought wrong item’")
	public void userSelectCancelationReason() {
		click(factory.orderPage().wrongItem);
		logger.info("User select the cancelation Reason");
		
		
	}
	@And("user click on Cancel Order button")
	public void userCanClickOnCancelOrderBtn() {
		click(factory.orderPage().orderSubmitBtn);
		logger.info("User click on Cancel Order button");
		
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aConcelationMsgDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelationMsg));
		logger.info("a cancelation message should be displayed");
		
	}
	@And("User click on Return Items button")
	public void userClickOnReturnItemBtn() {
		click(factory.orderPage().returnBtn);
		logger.info("User click on Return Items button");
		
	}
	
	@And("User select the Return Reason ‘Item damaged’")
	public void userSelectReturnReason() {
		click(factory.orderPage().reasonInput);
		click(factory.orderPage().damagedreason);
		logger.info("User select the Return Reason ‘Item damaged’");
		
	}
	@And("User select the drop off service ‘FedEx’")
	public void userSelectDropOffServiceFedEx() {
		click(factory.orderPage().dropOffInput);
		click(factory.orderPage().fedEx);
		logger.info("User select the drop off service ‘FedEx’");
		
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderBtn() {
		click(factory.orderPage().orderSubmitBtn);
		logger.info("User click on Return Order button");
		
		
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void cancelMsg() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelationMsg));
		logger.info("a cancelation message should be displayed");
		
	}
	@And("User click on Review button")
	public void userClickOnReviewBtn() {
		click(factory.orderPage().reviewBtn);
		logger.info("User click on Review button");
		
	}
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadline(String headline, String description) {
		hardWait();
		sendText(factory.orderPage().headlineInput,headline);
		sendText(factory.orderPage().descriptionInput,description);
		logger.info("User write Review headline and review text");
		
		
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewBtn() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("User click Add your Review button");
		
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void reviewMsgShouldDisplayed() {
		hardWait();
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMsg));
		logger.info("a review message should be displayed");
		
	}
	
}
