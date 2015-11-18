package com.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.junit.Assert;
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

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElementFacade holiday;

	@FindBy(css = "input[value='VACATION_WITHOUT_PAYMENT']")
	private WebElementFacade vacationWithoutPayment;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElementFacade specialVacation;

	@FindBy(css = "input[value='SICK_LEAVE']")
	private WebElementFacade sickLeave;

	@FindBy(css = "input[value='MATERNITY_LEAVE']")
	private WebElementFacade maternityLeave;

	@FindBy(css = "input[id='futureVacationsCheckbox']")
	private WebElementFacade futureVacations;

	@FindBy(css = "input[id*='applyButton']")
	private WebElementFacade applyButton;

	@FindBy(css = ".aui-paginator-next-link")
	private WebElementFacade nextPage;

	public void inputHoliday() {
		holiday.click();
	}

	public void clickSpecialVacationCheckbox() {
		specialVacation.click();
	}

	public void clickApplyButton() {
		applyButton.click();
	}

	public void clickNextPageButton() {
		nextPage.click();
	}

	/*
	 * public List<String> getFilterData() { List<WebElement> results =
	 * getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(4)"
	 * )); return convert(results, toStrings()); }
	 * 
	 * private Converter<WebElement, String> toStrings() { return new
	 * Converter<WebElement, String>() { public String convert(WebElement from)
	 * { return from.getText(); } };
	 * 
	 * }
	 */

	public void verifyThatTypeIsCorrect(String type) {
		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr td:nth-child(4) a"));
		for (WebElement row : rows) {
			Assert.assertTrue("The row does not contains the expected type", row.getText().contentEquals(type));
		}
	}

	public int getNumberOfPages() {
		String number;
		int pages = 0;
		List<WebElement> rows = getDriver().findElements(By.cssSelector(".aui-paginator-total"));
		for (WebElement row : rows) {
			number = row.getText().toString().split("of ")[1].replace(')', ' ').split(" ")[0];
			pages = Integer.parseInt(number);

		}
		return pages;
	}

	public void checkThatRowContainsTerms(String... terms) {

		boolean found = false;

		List<WebElement> rows = getDriver().findElements(By.cssSelector("table tbody tr"));
		System.out.println(rows.size());
		rows = rows.subList(2, rows.size());
		System.out.println(rows.size());
		firstFor: for (WebElement row : rows) {
			System.out.println(row.getText());
			boolean containsAllTerms = true;
			theSecondFor: for (String term : terms) {
				if (!row.getText().contains(term)) {
					containsAllTerms = false;
					break theSecondFor;
				}
			}
			if (containsAllTerms) {
				found = true;
				break firstFor;
			}
		}

		Assert.assertTrue("The row does not contain all the terms !!!", found);
	}

}
