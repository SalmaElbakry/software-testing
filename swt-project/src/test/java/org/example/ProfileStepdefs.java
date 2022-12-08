package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProfileStepdefs extends AbstractStepdefs{

    @And("my profile link clicked")
    public void myProfileLinkClicked() {
        homePage.clickProfileLink();
    }

    @And("First name is filled with {string}")
    public void firstNameIsFilledWithSalma(String Name) {
        homePage.fillField(HomePage.Firstname, Name);
    }

    @And("Last name is filled with {string}")
    public void lastNameIsFilledWithElbakry(String Lname) {
        homePage.fillField(HomePage.Lastname, Lname);
    }

    @And("Phone is filled with {string}")
    public void phoneIsFilledWith(String Num) {
        homePage.fillField(HomePage.Phone_number,Num);
    }

    @And("update profile button is clicked")
    public void updateProfileButtonIsClicked() {
        homePage.clickUpdateProfile();
    }

    @Then("{string} is shown")
    public void profileUpdatedSuccessfullyIsShown(String message) {
        Assert.assertEquals(message, homePage.getProfileMsg());
    }
}
