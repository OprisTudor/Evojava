package com.steps.serenity;

import com.pages.LoginPage;
import static org.junit.Assert.*;
import com.pages.MyRequestPage;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

public class MyRequestSteps extends ScenarioSteps {

	MyRequestPage myRequestPage;

	@Step
	public void selectHolidayCheckbox() {
		myRequestPage.inputHoliday();
	}

	public void applyFilters() {
		myRequestPage.clickApplyButton();
	}

	@Step
	public void verifyThatTypeIsCorrect(String type) {
		// myRequestPage.verifyThatTypeIsCorrect(type);
		for (int i = 0; i < myRequestPage.getNumberOfPages(); i++) {
			myRequestPage.verifyThatTypeIsCorrect(type);
			goToNextPage();
			// myRequestPage.verifyThatTypeIsCorrect(type);
		}
	}

	@Step
	public void selectSpecialVacation() {
		myRequestPage.clickSpecialVacationCheckbox();
	}

	@Step
	public void checkThatRowContainsTerms(String... terms) {
		myRequestPage.checkThatRowContainsTerms(terms);
	}

	@Step
	public void goToNextPage() {
		myRequestPage.clickNextPageButton();
	}

}