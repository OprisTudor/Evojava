package com.steps.serenity;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.MyRequestPage;
import com.tools.VacationResultModel;

public class MyRequestSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5882515009397365249L;
	
	//TODO use access modifiers
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
			// myRequestPage.verifyThatTypeIsCorrect(terms);
			goToNextPage();
			myRequestPage.verifyThatTypeIsCorrect(terms, column);
		}
	}

	@Step
	public void selectSpecialVacation() {
		myRequestPage.clickSpecialVacationCheckbox();
	}

	@Step
	//TODO use correct verb for action 'check =/= grab'
	public List<VacationResultModel> checkThatRowContainsTerms() {
		// myRequestPage.checkThatRowContainsTerms(terms);
		return myRequestPage.grabResultsModelList();

	}

	@Step
	public void goToNextPage() {
		myRequestPage.clickNextPageButton();
	}

}