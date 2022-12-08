package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class FlightStepdefs extends AbstractStepdefs{

    @And("Flight link is clicked")
    public void flightLinkIsClicked() {
        homePage.clickFlightLink();
    }

    @And("Airways link is clicked")
    public void etihadAirwaysLinkIsClicked() {
        homePage.clickAirlineLink();
    }

    @And("Book Now button is clicked")
    public void bookNowButtonIsClicked() {
        homePage.clickBookFlightNow();
    }

//    @Then("a {string} flight ticket message is shown")
//    public void aFlightTicketMessageIsShown(String price) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//        assertEquals(price, driver.findElement(By.xpath("")).getText());
//    }
}
