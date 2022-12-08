package org.example;

import io.cucumber.java.en.And;

public class FlightStepdefs extends AbstractStepdefs{

    @And("Flight link is clicked")
    public void flightLinkIsClicked() {
        homePage.clickFlightLink();
    }

    @And("Etihad Airways link is clicked")
    public void etihadAirwaysLinkIsClicked() {
        homePage.clickAirlineLink();
    }

    @And("Book Now button is clicked")
    public void bookNowButtonIsClicked() {
        homePage.clickBookFlightNow();
    }
}
