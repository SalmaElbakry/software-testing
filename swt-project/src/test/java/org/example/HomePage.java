package org.example;

import okhttp3.Cache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static final String PAGE_URL = "https://phptravels.net/login";

    public static final By EMAIL = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input");
    public static final By PASSWORD = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input");

    public static final By Firstname = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/input[1]");
    public static final By Lastname = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[2]/td[3]/div/input");
    public static final By Phone_number = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input");




    //login
    @FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input")
    private WebElement email;
    @FindBy (xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
    private WebElement password;
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
    private WebElement signInButton;
    @FindBy (className="breadcrumb-content")
    private WebElement welcome;
//hotel
    @FindBy (xpath = "/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[1]/a")
    private WebElement hotel_hyper;
    @FindBy (xpath = "//*[@id=\"fadein\"]/section[2]/div/div/div[2]/div/div/div/div[1]/div/div[8]/div/div[2]/h6/a")
    private WebElement hotel_choice;
    @FindBy (xpath = "/html/body/section[1]/div[3]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div[5]/div/button")
    private WebElement book_hotel;

//flight
    @FindBy (xpath = "/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[2]/a")
    private WebElement flight_hyper;
    @FindBy (xpath = "//*[@id=\"new-york\"]/div/div[4]/a/div/div/div[2]")
    private WebElement flight_choice;
    @FindBy (xpath = "/html/body/main/div/div[2]/section/ul/li[1]/div/form/div/div[2]/div/button")
    private WebElement flight_book;

//tours
    @FindBy (xpath = "/html/body/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[3]/a")
    private WebElement tour_hyper;
    @FindBy (xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div/div[1]/a[1]")
    private WebElement tour_choice;
    @FindBy (xpath = "/html/body/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")
    private WebElement tour_book;

//profile edit
    @FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")
    private WebElement profile_hyper;

    @FindBy (xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/input[1]")
    private WebElement firstname;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[2]/td[3]/div/input")
    private WebElement lastname;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input")
    private WebElement number;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
    private WebElement update;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div")
    private WebElement profile_msg;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }
    public String msgShown(){
        return welcome.getText();
    }

    public void clickHotelLink(){
        hotel_hyper.click();
    }

    public void clickMarriottHotel(){
       hotel_choice.click();
    }

    public void clickBookNowButton(){
        book_hotel.click();
    }


    public void clickFlightLink(){
        tour_hyper.click();
    }

    public void clickAirlineLink(){
        flight_choice.click();
    }
    public void clickBookFlightNow(){
        flight_book.click();
    }

    public void clickTourLink(){tour_hyper.click();}
    public void clickTourChoice(){tour_choice.click();}
    public void clickBookTourNow(){
        tour_book.click();
    }
    public void clickProfileLink(){profile_hyper.click();}
    public void clickUpdateProfile(){ update.click();}
    public String getProfileMsg() {
        return profile_msg.getText();
    }
}

