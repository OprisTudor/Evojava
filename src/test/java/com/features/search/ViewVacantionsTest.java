package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.InboxSteps;
import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.ViewVacantionsSteps;
import com.steps.serenity.SideMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

@RunWith(SerenityRunner.class)
public class ViewVacantionsTest extends ScenarioSteps {
	//TODO test should not extend on scenario steps

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginAndEnterOnTheVacationTabSteps endUserSteps;
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
		endUserSteps.loginAsDM();
		sideMenuSteps.enterViewVacations();
		newVacantionsSteps.clickOnVacationType("Holiday");
		newVacantionsSteps.clickOnVacationType("Sick Leave");
		//TODO remove waitABit and use waitUntilVisible for element waits
		waitABit(3000);
		newVacantionsSteps.clickOnDaysNumber("6 - 10");
		waitABit(3000);
		newVacantionsSteps.clickOnVacationStatus("Pending");
		waitABit(3000);
		newVacantionsSteps.clickShowInactiveUsers();
		waitABit(3000);
		newVacantionsSteps.enterLastName("Opris");
		newVacantionsSteps.enterFirstName("Tudor");
		newVacantionsSteps.clickOnApply();
	}

}