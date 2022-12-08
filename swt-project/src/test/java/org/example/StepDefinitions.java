package org.example;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions extends AbstractStepdefs{


    @Given("the email is filled with {string}")
    public void theEmailAddressIsFilledWith(String email) {
        homePage.fillField(HomePage.EMAIL, email);
    }
    @And("the password is filled with {string}")
    public void thePasswordIsFilledWith(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }
    @When("the Login button is clicked")
    public void theLoginButtonIsClicked() {
        homePage.clickSignInButton();
    }

    @Then("a {string} message is shown")
    public void aMessageIsShown(String welcome) {
        Assert.assertEquals(welcome, homePage.msgShown());
    }

}
