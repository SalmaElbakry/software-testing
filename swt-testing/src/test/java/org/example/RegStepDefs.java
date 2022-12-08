package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RegStepDefs extends StepDefinitions{

    @Given("the homepage is open")
    public void theHomepageIsOpen() {
        homePage.openPage();
    }

    @Given("Name filled in {string}")
    public void name_filled_in(String name) {
        homePage.fillField(HomePage.NAME, name);
    }

    @And("Phone filled in with {string}")
    public void phoneFilledIn(String phone) {
        homePage.fillField(HomePage.PHONE, phone);
    }

    @And("Email filled in {string}")
    public void emailFilledIn(String email) {
        homePage.fillField(HomePage.EMAIL, email);

    }

    @And("City filled in {string}")
    public void cityFilledIn(String city) {
        homePage.fillField(HomePage.CITY, city);

    }

    @And("Username filled in {string}")
    public void usernameFilledIn(String user) {
        homePage.fillField(HomePage.USERNAME, user);

    }

    @And("Password filled in {string}")
    public void passwordFilledIn(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @And("Submit button clicked")
    public void submitButtonClicked() {
        homePage.submitButtonClick();
    }

    @Then("{string} is shown")
    public void isShown(String string) {
        Assert.assertEquals(string, homePage.getProfileMsg());
    }



}
