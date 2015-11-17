package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.BASE_URL)
public class MyRequestPage extends PageObject {

	@FindBy(css = "input[value='ALL']")
	private WebElementFacade all;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holiday;

	@FindBy(css = "input[value='VACATION_WITHOUT_PAYMENT']")
	private WebElementFacade vacationWithoutPayment;

	@FindBy(css = "input[value='SPECIAL_VACATION']")
	private WebElementFacade specialVacantion;

	@FindBy(css = "input[value='SICK_LEAVE']")
	private WebElementFacade sickLeave;

	@FindBy(css = "input[value='MATERNITY_LEAVE']")
	private WebElementFacade maternityLeave;

	@FindBy(css = "input[id='futureVacationsCheckbox']")
	private WebElementFacade futureVacations;

	@FindBy(css = "input[id*='applyButton']")
	private WebElementFacade applyButton;

	public void inputHoliday() {
		holiday.click();
	}

	public void clickApplyButton() {
		applyButton.click();
	}

	public List<String> getFilterData() {
		List<WebElement> results = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(4)"));
		return convert(results, toStrings());
	}

	private Converter<WebElement, String> toStrings() {
		return new Converter<WebElement, String>() {
			public String convert(WebElement from) {
				return from.getText();
			}
		};

	}
}
