package com.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.InboxPage;

public class InboxSteps extends ScenarioSteps {
	private static final long serialVersionUID = 3186676210915195108L;
	//TODO use access modifiers
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
