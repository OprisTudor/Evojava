package com.steps.serenity;

import com.pages.SideMenuPage;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class SideMenuSteps extends ScenarioSteps {
	
	//TODO use access modifiers
	SideMenuPage sideMenuPage;

	@Step
	public void enterInbox() {
		sideMenuPage.clickOnInbox();
	}

	@Step
	public void enterNewRequest() {
		sideMenuPage.clickOnNewRequest();
	}

	@Step
	public void enterMyRequest() {
		sideMenuPage.clickOnMyRequest();
	}

	@Step
	public void enterMyFreeDays() {
		sideMenuPage.clickOnMyFreeDays();
	}

	@Step
	public void enterFreeDaysHistory() {
		sideMenuPage.clickOnFreeDaysHistory();
	}

	@Step
	public void enterVacatioTracker() {
		sideMenuPage.clickOnVacationTracker();
	}

	@Step
	public void enterViewVacations() {
		sideMenuPage.clickOnViewVacations();
	}

	@Step
	public void enterVacationReport() {
		sideMenuPage.clickOnVacationReport();
	}

}
