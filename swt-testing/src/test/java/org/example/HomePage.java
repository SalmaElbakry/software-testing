package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Optional;

public class HomePage {
    private static final String PAGE_URL = "https://way2automation.com/way2auto_jquery/index.php";
    public static final By NAME = By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input");
    public static final By PHONE = By.xpath("//*[@id=\"load_form\"]/fieldset[2]/input");
    public static final By EMAIL = By.xpath("//*[@id=\"load_form\"]/fieldset[3]/input");
    public static final By CITY = By.xpath("//*[@id=\"load_form\"]/fieldset[5]/input");

    public static final By USERNAME = By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input");
    public static final By PASSWORD  = By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input");
    private WebDriver driver;

    @FindBy (xpath = "/html/body/div[4]/div/div/div/div/div/form/p")
    private WebElement shownMsg;

    @FindBy (xpath = "/html/body/div[4]/div/div/div/div/div/form/div[1]/div[2]/input")
    private WebElement submit;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }
    public String getProfileMsg() {
        return shownMsg.getText();
    }
    public void submitButtonClick(){
        submit.click();
    }
}