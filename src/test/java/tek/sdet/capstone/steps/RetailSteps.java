package tek.sdet.capstone.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;


public class RetailSteps extends CommonUtility {
	
    private POMFactory factory = new POMFactory();

    @Given("login as tek user to retail app with username {string} and password {string}")
    public void loginAsTekUserToRetailAppWithUsernameAndPassword(String userNameValue, String passwordValue)
            throws InterruptedException {

    }

    @Then("assert application title {string}")
    public void assertApplicationTitle(String expectedTitle) {

    }
}
