package com.steps.serenity;

import com.pages.MyFreeDaysPage;

import net.thucydides.core.annotations.Step;

public class MyFreeDaysSteps {
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
