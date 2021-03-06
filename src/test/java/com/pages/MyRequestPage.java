package com.pages;

import helpers.Constants;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.VacationResultModel;

@DefaultUrl(Constants.BASE_URL)
public class MyRequestPage extends PageObject {

	// TODO remove unused mappings
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

	// @FindBy(css = ".aui-searchcontainer")
	// private WebElement searchListContainer;

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

	public List<VacationResultModel> grabResultsModelList() {
		WebElement searchListContainer = getDriver().findElement(By.cssSelector("div.results-grid"));
		element(searchListContainer).waitUntilVisible();
		List<WebElement> entryList = searchListContainer
				.findElements(By.cssSelector("tr.results-row:not(.lfr-template)"));

		List<VacationResultModel> resultList = new ArrayList<VacationResultModel>();

		for (WebElement webElement : entryList) {
			VacationResultModel entryNow = new VacationResultModel();
			
			String startDate = webElement.findElement(By.cssSelector("td[class*='start.date']")).getText();

			String endDate = webElement.findElement(By.cssSelector("td[class*='end.date']")).getText();

			String daysNumber = webElement.findElement(By.cssSelector("td[class*='day.number']")).getText();

			String type = webElement.findElement(By.cssSelector("td[class*='type']")).getText();

			String lastUpdated = webElement.findElement(By.cssSelector("td[class*='last.update']")).getText();

			String status = webElement.findElement(By.cssSelector("td[class*='status']")).getText();

			entryNow.setStartDate(startDate);
			entryNow.setEndDate(endDate);
			entryNow.setDaysNumber(daysNumber);
			entryNow.setType(type);
			entryNow.setLastUpdated(lastUpdated);
			entryNow.setStatus(status);

			resultList.add(entryNow);

		}

		return resultList;
	}

}

