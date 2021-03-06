package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.InboxSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.SideMenuSteps;
import com.steps.serenity.ViewVacantionsSteps;

import helpers.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ViewVacantionsTest {
	//TODO test should not extend on scenario steps

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps endUserSteps;
	@Steps
	public InboxSteps inboxSteps;
	//TODO use access modifiers to all members
	@Steps
	ViewVacantionsSteps newVacantionsSteps;

	@Steps
	public SideMenuSteps sideMenuSteps;

	@Test
	//TODO provide test with a more meaningful name
	public void enterEveryTabOnSidePage() {
		endUserSteps.login(Constants.DM_USERNAME, Constants.DM_PASSWORD);
		sideMenuSteps.enterViewVacations();
		newVacantionsSteps.clickOnVacationType("Holiday");
		newVacantionsSteps.clickOnVacationType("Sick Leave");
		//TODO remove waitABit and use waitUntilVisible for element waits
		newVacantionsSteps.clickOnDaysNumber("6 - 10");
		newVacantionsSteps.clickOnVacationStatus("Pending");
		newVacantionsSteps.clickShowInactiveUsers();
		newVacantionsSteps.enterLastName("Opris");
		newVacantionsSteps.enterFirstName("Tudor");
		newVacantionsSteps.clickOnApply();
	}

}