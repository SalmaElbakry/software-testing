package org.example;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/span")));
        assertEquals(welcome, driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/span")).getText());    }

}
