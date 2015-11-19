package com.steps.serenity;

import com.pages.InboxPage;
import com.pages.LoginPage;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class InboxSteps extends ScenarioSteps {

	InboxPage inboxPage;

	@Step
	public void enterFirstRow() {
		inboxPage.clickOnFirstRow();

	}

	@Step
	public void enterApprove() {
		inboxPage.clickOnApprove();
	}

	@Step
	public void enterAssignedToOthers() {
		inboxPage.clickOnAssignedToOthers();
	}

	@Step
	public void enterReject() {
		inboxPage.clickOnReject();
	}

}
