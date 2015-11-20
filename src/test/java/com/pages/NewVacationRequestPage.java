package com.pages;

import java.util.List;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class NewVacationRequestPage extends PageObject {
	
	//TODO remove unused mappings

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade initialDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade secondDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CO")
	private WebElementFacade requestCO;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade requestCF;

	@FindBy(css = "input[name='duration']")
	private WebElementFacade durationInput;

	@FindBy(css = "input[name='institution']")
	private WebElementFacade institutionInput;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElementFacade requestCM;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade requestCS;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade dropdownList;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_ML")
	private WebElementFacade requestML;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_maternityLeave")
	private WebElementFacade dropListMaternity;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_newVacationComment")
	private WebElementFacade addComment;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade commentInput;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade submitButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TabsBack")
	private WebElementFacade backButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_cancelButton")
	private WebElementFacade cancelButton;

	@FindBy(css = ".portlet-msg-success")
	private WebElementFacade shownMessage;

	@FindBy(css = "[style*='display: block'] .dp_caption")
	private WebElementFacade title;

	@FindBy(css = "[style*='display: block'] .dp_yearpicker td")
	private List<WebElementFacade> yearList;

	@FindBy(css = "[style*='display: block'] .dp_monthpicker td")
	private List<WebElementFacade> monthList;

	@FindBy(css = "[style*='display: block'] .dp_daypicker td:not([class*='disabled'])")
	private List<WebElementFacade> dayList;

	
	public void setNewRequestDates(int day, String month, int year) {
		title.click();
		title.click();
		selectYear(year);
		selectMonth(month);
		selectDay(day);
	}

	public void selectYear(int year){
		for (WebElementFacade i : yearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}
	}

	public void selectMonth(String month){
		for (WebElementFacade i : monthList)
			if (i.getText().contentEquals(month)) {
				i.click();
				break;
			}
	}

	public void selectDay(int day){
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}
	}
		
		
	//TODO add waitUntilVisible for all element actions (methods)
	public void selectStartDate() {
		initialDate.click();
	}

	public void selectEndDate() {
		secondDate.click();
	}

	public void clickCOButton() {
		requestCO.click();
	}

	public void clickCFButton() {
		requestCF.click();
	}

	public void inputDuration(String vacationReason) {
		durationInput.sendKeys(vacationReason);
	}

	public void inputInstitution(String institutionName) {
		institutionInput.sendKeys(institutionName);
	}

	public void clickCMButton() {
		requestCM.click();
	}

	public void clickCSButton() {
		requestCS.click();

	}

	public void selectVisibleText(String optionVacation) {
		dropdownList.selectByValue(optionVacation);

	}

	public void clickMLButton() {
		requestML.click();
	}

	public void selectVisibleTextMaternity(String optionMaternity) {
		dropListMaternity.selectByValue(optionMaternity);

	}

	public void clickComment() {
		addComment.click();
	}

	public void inputComment(String generalComment) {
		commentInput.type(generalComment);
	}

	public void submitRequest() {
		submitButton.click();
	}

	public void verifyMessage(String message) {
		Assert.assertTrue("not the expected message", shownMessage.getText().contains(message));
	}

	public void clickBackButton() {
		backButton.click();
	}

	public void clickCancelButton() {
		cancelButton.click();
	}
}