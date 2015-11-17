package com.steps.serenity;

import com.pages.SideMenuPage;

public class SideMenuSteps {

	SideMenuPage sideMenuPage;
	
	public void enterInbox() {
		sideMenuPage.clickOnInbox();
	}
	public void enterNewRequest() {
		sideMenuPage.clickOnNewRequest();
	}
	public void enterMyRequest() {
		sideMenuPage.clickOnMyRequest();
	}
	public void enterMyFreeDays() {
		sideMenuPage.clickOnMyFreeDays();
	}
	public void enterFreeDaysHistory() {
		sideMenuPage.clickOnFreeDaysHistory();
	}
	public void enterVacatioTracker() {
		sideMenuPage.clickOnVacationTracker();
	}
	
	public void enterViewVacations() {
		sideMenuPage.clickOnViewVacations();
	}
	public void enterVacationReport() {
		sideMenuPage.clickOnVacationReport();
	}
	
	
	
	
}
