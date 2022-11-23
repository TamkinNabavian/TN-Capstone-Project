package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountButton);
		logger.info("user click on Accout option");

	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		sendText(factory.accountPage().nameInputA, name);
		sendText(factory.accountPage().phoneNumberA, phone);
		logger.info("user updated name and phone number");

	}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateBtn);
		logger.info("user click on Update button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdate() {

	}

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> changePasswordData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().perviousPasswordInput, changePasswordData.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, changePasswordData.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, changePasswordData.get(0).get("confirmPassword"));
		logger.info("user entered passwordChange information");

	}

	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("user click on Change Password button");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldDisplayed() {
		hardWait();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().textDisplayed));
		logger.info("The text, ‘Password Updated Successfully’ displayed");

	}

	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		hardWait();
		click(factory.accountPage().accountPayment);
		logger.info("user click on Add a payment methode link");

	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		hardWait();
		List<Map<String, String>> cardInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, cardInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, cardInfo.get(0).get("nameOnCard"));
		click(factory.accountPage().expirationMonthInput);
		click(factory.accountPage().expirationYearInput);
		sendText(factory.accountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));

		logger.info("user filled card information");

	}

	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		hardWait();
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user click on Add your card button");

	}
	
	@Then("message should be displayed ‘Payment Method added successfully’")
	public void paymentMethodAddedShouldDisplayed() {
		hardWait();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().textpayment));
		logger.info("'payment method added' displayed");
	}
	
	@And("User click on Card")
	public void userClickOnCards() {
		hardWait();
		click(factory.accountPage().cardsOption);
		logger.info("user click on card");
	}

	@And("User click on Edit option of card section")
	public void userClickOnEditOption() {
		hardWait();
		click(factory.accountPage().editCardInfo);
		logger.info("user click on Edit option of card section");

	}

	@And("user edit information with below data")
	public void userEditInfoWithBelowData(DataTable data) {
		hardWait();
		List<Map<String,String>> cardUpdateInfo = data.asMaps(String.class,String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput,cardUpdateInfo.get(0).get("cardNumber"));
		hardWait();
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput,cardUpdateInfo.get(0).get("nameOnCard"));
		hardWait();
		click(factory.accountPage().expirationMonthInput);
		click(factory.accountPage().expirationYearInput);
		hardWait();
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput,cardUpdateInfo.get(0).get("securityCode"));
		logger.info("user edited update information");
		
		

	}
	

	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		hardWait();
		click(factory.accountPage().paymentUpdateBtn);
		logger.info("user click on update your card button");

	}
	@Then("a message should displayed ‘Payment Method updated Successfully’")
	public void paymentMethodUpdateSuccessfully() {
		hardWait();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateCardText));
		logger.info("payment method displayed sucessfully");
		
		
		
	}
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().card1);
		click(factory.accountPage().removeOption);
		logger.info("User click on remove option of card section");
		
	}
	@And("payment detail should be removed")
	public void paymentDetailShouldBeRemove() {
		
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addCard));
		logger.info("payment details removed");
		
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addressOption);
		logger.info("User click on Add address option");
		
	}
	
	@And("user fill new address form with below information")
	public void wserFillNewAddress(DataTable data) {
		hardWait();
		List<Map<String,String>> addressInfo = data.asMaps(String.class,String.class);
		click(factory.accountPage().countryDropdown);
		hardWait();
		scrollPageDownWithJS();
		
    	selectByVisibleText(factory.accountPage().countryDropdown,addressInfo.get(0).get("country"));
		sendText(factory.accountPage().fullNameInput,addressInfo.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberInput,addressInfo.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput,addressInfo.get(0).get("streetAddress"));
		sendText(factory.accountPage().appartmentInput,addressInfo.get(0).get("apt"));
		sendText(factory.accountPage().cityInput,addressInfo.get(0).get("city"));
		
		hardWait();
		scrollPageDownWithJS();
		selectByVisibleText(factory.accountPage().stateInput,addressInfo.get(0).get("state"));
		sendText(factory.accountPage().zipCodeInput,addressInfo.get(0).get("zipCode"));
		hardWait();
		logger.info("user filled address information");
		
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressBtn() {
		click(factory.accountPage().addressBtn);
		logger.info("User click Add Your Address button");
		
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
     public void messageAddressAddedDisplayed() {
		hardWait();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressSuccessfullText));
		
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		scrollPageDownWithJS();
		
		click(factory.accountPage().editAddressBtn);
		logger.info("User click on edit address option");
		
	}
	@And("user should fill new address form with below information")
	public void userFillUpdateInfoAddress(DataTable data) {
		hardWait();
		List<Map<String,String>> updateAddressInfo = data.asMaps(String.class,String.class);
		click(factory.accountPage().countryDropdown);
		hardWait();
		scrollPageDownWithJS();
		

		sendText(factory.accountPage().fullNameInput,updateAddressInfo.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput,updateAddressInfo.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput,updateAddressInfo.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().appartmentInput);
		sendText(factory.accountPage().appartmentInput,updateAddressInfo.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput,updateAddressInfo.get(0).get("city"));
		
		hardWait();
		scrollPageDownWithJS();
		selectByVisibleText(factory.accountPage().stateInput,updateAddressInfo.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput,updateAddressInfo.get(0).get("zipCode"));
		hardWait();
		logger.info("user updated address information");
		
			
			
	}
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressBtn() {
		click(factory.accountPage().updateAddressBtn);
		logger.info("User click update Your Address button");
		
	}
	@Then("message should be displayed ‘Address Updated Successfully’")
	public void successUpdateAddressMessageDisplayed() {
		hardWait();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateAddressMessage));
		
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressBtn);
		logger.info("User click on remove option of Address section");
		
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().removeAddressBtn));
		logger.info("Address details removed");
		
		
	}
}
