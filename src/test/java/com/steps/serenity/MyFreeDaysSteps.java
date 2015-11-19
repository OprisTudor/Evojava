package com.steps.serenity;

import com.pages.MyFreeDaysPage;

import net.thucydides.core.annotations.Step;

//TODO class should extend scenarioSteps
public class MyFreeDaysSteps {
	//TODO use access modifiers
	MyFreeDaysPage myFreeDaysPage;

	@Step
	public void clickMyFreeDays() {
		myFreeDaysPage.clickOnMyFreeDays();
	}

	@Step
	public void clickOnYears(String name) {
		myFreeDaysPage.clickOnYears(name);
	}

	@Step
	public void clickOnBack() {
		myFreeDaysPage.clickOnBack();
	}
}
