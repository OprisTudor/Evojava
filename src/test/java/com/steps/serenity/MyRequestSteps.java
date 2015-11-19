package com.steps.serenity;

import com.pages.LoginPage;
import static org.junit.Assert.*;
import com.pages.MyRequestPage;
import com.tools.VacationResultModel;

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
	public void verifyThatTypeIsCorrect(String terms, String column) {
		myRequestPage.verifyThatTypeIsCorrect(terms, column);
		for (int i = 1; i < myRequestPage.getNumberOfPages(); i++) {
			//myRequestPage.verifyThatTypeIsCorrect(terms);
			goToNextPage();
			myRequestPage.verifyThatTypeIsCorrect(terms, column);
		}
	}

	@Step
	public void selectSpecialVacation() {
		myRequestPage.clickSpecialVacationCheckbox();
	}

	@Step

	public List<VacationResultModel> checkThatRowContainsTerms() {
//		myRequestPage.checkThatRowContainsTerms(terms);
		return myRequestPage.grabResultsModelList();

	}

	@Step
	public void goToNextPage() {
		myRequestPage.clickNextPageButton();
	}

}