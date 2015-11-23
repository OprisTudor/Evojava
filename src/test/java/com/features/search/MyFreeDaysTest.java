package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.InboxSteps;
import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.MyFreeDaysSteps;
import com.steps.serenity.ViewVacantionsSteps;

import helpers.Constants;

import com.steps.serenity.SideMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest extends ScenarioSteps {
	// TODO the test class does not extend ScenarioSteps. remove unused extends
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginAndEnterOnTheVacationTabSteps endUserSteps;
	@Steps
	public InboxSteps inboxSteps;

	//TODO add access modifiers to all members
	@Steps
	MyFreeDaysSteps myFreeDaysSteps;
	@Steps
	public SideMenuSteps sideMenuSteps;

	@Test
	//TODO change to meaningful test name
	public void enterEveryTabOnSidePage() {
		endUserSteps.login(Constants.DM_USERNAME, Constants.DM_PASSWORD);
		sideMenuSteps.enterMyFreeDays();
		myFreeDaysSteps.clickOnYears("2016");
		//TODO remove waitABit - use waitUntilVisible for methods that need wait
		waitABit(3000);
		myFreeDaysSteps.clickOnBack();
		waitABit(3000);
	}

}