package com.steps.serenity;

import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	NewVacationRequestPage newVacationRequestPage;


	@Step
	public void selectStartDate(String date) {
		newVacationRequestPage.selectStartDate(date);;
	}

	@Step
	public void selectEndDate(String date) {
		newVacationRequestPage.selectEndDate(date);
	}

	@Step
	public void selectVacationHoliday() {
		newVacationRequestPage.selectCOButton();
	}

	@Step
	public void selectVacationWithoutPayment(String vacationReason, String institutionName ) {
		newVacationRequestPage.selectCFButton();
		newVacationRequestPage.inputDuration(vacationReason);
		newVacationRequestPage.inputInstitution(institutionName);
	}
	
	@Step
	public void selectVacationSickLeave() {
		newVacationRequestPage.selectCMButton();
	}
	
	@Step
	public void selectVacationSpecial(String optionVacation) {
		newVacationRequestPage.clickCSButton();
		newVacationRequestPage.selectVisibleText(optionVacation);
	}
	
	@Step
	public void selectVacationMaternityLeave() {
		newVacationRequestPage.selectMLButton();
	}
	
	@Step
	public void chooseComment() {
		newVacationRequestPage.selectComment();
	}
	
	@Step
	public void writeComment(String comm) {
		newVacationRequestPage.inputComment(comm);
	}

	@Step
	public void finishRequest() {
		newVacationRequestPage.submitRequest();
	}

	
	
}