package org.example;

import io.cucumber.java.en.And;

public class ToursStepDefs extends AbstractStepdefs {
    @And("Tours link is clicked")
    public void toursLinkIsClicked() {
        homePage.clickTourLink();
    }

    @And("Big Bus Tour link is clicked")
    public void bigBusTourLinkIsClicked() {
        homePage.clickTourChoice();
    }

    @And("Book the tour now button is clicked")
    public void bookTheTourNowButtonIsClicked() {
        homePage.clickBookTourNow();
    }
}
