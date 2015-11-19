package com.steps.serenity;

import com.pages.ViewVacantionsPage;

import net.thucydides.core.annotations.Step;

public class ViewVacantionsSteps {
	//TODO use access modifiers
	ViewVacantionsPage viewVacationsPage;

	@Step
	public void clickOnVacationType(String name) {
		viewVacationsPage.clickOnVacationType(name);
	}

	@Step
	public void clickOnDaysNumber(String name) {
		viewVacationsPage.clickOnDaysNumber(name);
	}

	@Step
	public void clickOnVacationStatus(String name) {
		viewVacationsPage.clickVacationStatus(name);
	}

	@Step
	public void clickShowInactiveUsers() {
		viewVacationsPage.clickOnShowInactiveUsers();
	}

	@Step
	public void enterLastName(String name) {
		viewVacationsPage.enterOnLastName(name);
	}

	@Step
	public void enterFirstName(String name) {
		viewVacationsPage.enterOnFirstName(name);
	}

	@Step
	public void clickOnApply() {
		viewVacationsPage.clickOnApply();
	}
}
