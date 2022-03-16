package de.silvia.selenium_two;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://www.flaschenpost.de/");
    }

    @Test
    public void addToCart() throws InterruptedException {
        Thread.sleep(10000); //time to enter zip code
        //go to waterCategorie
        mainPage.waterLink.click();
        //choose medium
        mainPage.mediumLink.click();
        //type Vilsa in field Markenauswahl
        mainPage.fieldMarkenauswahl.sendKeys("Vilsa");
        //check the checkbox named Vilsa
        mainPage.vilsaCheckbox.click();
        //add one Article to the cart
        mainPage.vilsaLink.click();
        mainPage.addToCartButton.click();
        //choose category Bier
        mainPage.linkToHomepage.click();
        mainPage.beerLink.click();
        //choose Radler
        mainPage.radlerLink.click();
        //add two Glucks Radler Naturtrüb in the cart
        mainPage.glucksNaturtruebLink.click();
        mainPage.addToCartButton.doubleClick();
        //click jetzt bestellen
        mainPage.zurKasseButton.click();
        //reduce one beer
        mainPage.reduceBeerButton.click();
        Thread.sleep(10000); //visual check cart
    }
}