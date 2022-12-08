package org.example;

import io.cucumber.java.en.And;

public class HotelStepdefs extends AbstractStepdefs {
    @And("Hotel link is clicked")
    public void hotelLinkIsClicked() {
        homePage.clickHotelLink();

    }

    @And("Islamadabad Marriott Hotel link is clicked")
    public void islamabadMarriottHotelsLinkIsClicked() {
        homePage.clickMarriottHotel();
    }

    @And("Book now button is clicked")
    public void bookNowButtonIsClicked() {
        homePage.clickBookNowButton();
    }

}
