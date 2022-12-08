package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

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

    @Then("a {string} price message is shown")
    public void aPriceMessageIsShown(String price) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/form/section/div/div/div[2]/div/div[2]/div/div[2]/ul[3]/li[3]/strong")));
        assertEquals(price, driver.findElement(By.xpath("/html/body/div[5]/form/section/div/div/div[2]/div/div[2]/div/div[2]/ul[3]/li[3]/strong")).getText());
    }
}
