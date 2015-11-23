package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.InboxSteps;
import com.steps.serenity.LoginSteps;
import com.steps.serenity.MyFreeDaysSteps;
import com.steps.serenity.SideMenuSteps;

import helpers.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest {
	// TODO the test class does not extend ScenarioSteps. remove unused extends
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps endUserSteps;
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
		myFreeDaysSteps.clickOnBack();
	}

}