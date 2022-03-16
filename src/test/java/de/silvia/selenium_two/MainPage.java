package de.silvia.selenium_two;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// https://www.flaschenpost.de/
public class MainPage {

    public SelenideElement waterLink = $("a[href*='/wasser']");

    public SelenideElement mediumLink = $("a[href*='/wasser/medium']");

    public SelenideElement fieldMarkenauswahl = $("#brandSearch");

    public SelenideElement vilsaCheckbox = $("div[class='brand_filter_item']");

    public SelenideElement vilsaLink = $("a[href='/vilsa/vilsa-leichtperlig']");

    public SelenideElement addToCartButton = $("button[type='button']");

    public SelenideElement linkToHomepage = $("svg[class='brand_logo']");

    public SelenideElement beerLink = $("a[href*='/bier']");

    public SelenideElement radlerLink = $("a[href*='/bier/radler']");

    public SelenideElement glucksNaturtruebLink = $("a[href='/glucks/glucks-radler-naturtrueb']");

    public SelenideElement zurKasseButton = $("a[class='fp-button fp-button--primary']");

    public SelenideElement reduceBeerButton =$x("//div[contains(@class, 'fp-count_minus')] [contains(@data-article, '6329')]");
}
