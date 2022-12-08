package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class BackgroundStep extends AbstractStepdefs  {

    @Given("the login page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }


}
