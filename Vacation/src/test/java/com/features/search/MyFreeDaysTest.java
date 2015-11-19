package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.InboxSteps;
import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.MyFreeDaysSteps;
import com.steps.serenity.ViewVacantionsSteps;
import com.steps.serenity.SideMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

@RunWith(SerenityRunner.class)
public class MyFreeDaysTest extends ScenarioSteps {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginAndEnterOnTheVacationTabSteps endUserSteps;
	@Steps
	public InboxSteps inboxSteps;

	@Steps
	MyFreeDaysSteps myFreeDaysSteps;

	@Steps
	public SideMenuSteps sideMenuSteps;

	@Test
	public void enterEveryTabOnSidePage() {
		endUserSteps.loginAsDM();
		sideMenuSteps.enterMyFreeDays();
		myFreeDaysSteps.clickOnYears("2016");
		waitABit(3000);
		myFreeDaysSteps.clickOnBack();
		waitABit(3000);
	}

}