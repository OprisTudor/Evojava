package com.steps.serenity;

import java.util.ArrayList;
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

	public MyRequestPage myRequestPage;

	@Step
	public void selectHolidayCheckbox() {
		myRequestPage.inputHoliday();
	}

	public void applyFilters() {
		myRequestPage.clickApplyButton();
	}

	@Step
	public void selectSpecialVacation() {
		myRequestPage.clickSpecialVacationCheckbox();
	}

	@Step
	// TODO use correct verb for action 'check =/= grab'
	public List<VacationResultModel> grabResultModelListOfOnePage() {
		return myRequestPage.grabResultsModelList();

	}

	@Step
	public void goToNextPage() {
		myRequestPage.clickNextPageButton();
	}

	public List<VacationResultModel> grabResultModelListOfAllPages() {
		List<VacationResultModel> finalResultList = new ArrayList<VacationResultModel>();
		List<VacationResultModel> partialList = myRequestPage.grabResultsModelList();
		for (int i = 1; i < myRequestPage.getNumberOfPages(); i++) {
			goToNextPage();
			partialList = myRequestPage.grabResultsModelList();
			finalResultList.addAll(partialList);
		}
		return finalResultList;
	}
}