package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class HotelStepdefs extends AbstractStepdefs {
    @And("Hotel link is clicked")
    public void hotelLinkIsClicked() {
        homePage.clickHotelLink();

    }

    @And("Hotel Name is clicked")
    public void islamabadMarriottHotelsLinkIsClicked() {

        homePage.clickHotelName();
    }

    @And("Book now button is clicked")
    public void bookNowButtonIsClicked() {
        homePage.clickBookNowButton();
    }

//    @Then("a {string} total price message is shown")
//    public void aTotalPriceMessageIsShown(String price) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//        assertEquals(price, driver.findElement(By.xpath("")).getText());
//    }
}
