package com.steps.serenity;

import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	//TODO use access modifiers
	NewVacationRequestPage newVacationRequestPage;

	@Step
	public void selectStartDate() {
		newVacationRequestPage.selectStartDate();
	}

	@Step
	public void selectEndDate() {
		newVacationRequestPage.selectEndDate();
	}

	@Step
	public void setDate(int day, String month, int year) {
		newVacationRequestPage.setDate(day, month, year);
	}

	@Step
	public void selectVacationHoliday() {
		newVacationRequestPage.clickCOButton();
	}

	@Step
	public void selectVacationWithoutPayment(String vacationReason, String institutionName) {
		newVacationRequestPage.clickCFButton();
		newVacationRequestPage.inputDuration(vacationReason);
		newVacationRequestPage.inputInstitution(institutionName);
	}

	@Step
	public void selectVacationSickLeave() {
		newVacationRequestPage.clickCFButton();
	}

	@Step
	public void selectVacationSpecial(String optionVacation) {
		newVacationRequestPage.clickCSButton();
		newVacationRequestPage.selectVisibleText(optionVacation);
	}

	@Step
	public void selectVacationMaternityLeave(String optionMaternity, String vacationReason, String institutionName) {
		newVacationRequestPage.clickMLButton();
		newVacationRequestPage.selectVisibleTextMaternity(optionMaternity);
		newVacationRequestPage.inputDuration(vacationReason);
		newVacationRequestPage.inputInstitution(institutionName);
	}

	@Step
	public void chooseComment() {
		newVacationRequestPage.clickComment();
	}

	@Step
	public void writeComment(String generalComment) {
		newVacationRequestPage.inputComment(generalComment);
	}

	@Step
	public void finishRequest() {
		newVacationRequestPage.submitRequest();
	}

	@Step
	public void clickBack() {
		newVacationRequestPage.clickBackButton();
	}

	@Step
	public void clickCancel() {
		newVacationRequestPage.clickCancelButton();
	}

	@Step
	public void verifyMessage(String message) {
		newVacationRequestPage.verifyMessage(message);
	}
}