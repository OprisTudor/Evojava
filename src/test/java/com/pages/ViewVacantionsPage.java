package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class ViewVacantionsPage extends PageObject {

	//TODO use more suggestive names for element mappings
	@FindBy(css = "a[href*='_menuItem=view-vacations']")
	private WebElementFacade viewVacations;

	@FindBy(css = "div[class*='aui-column column-three aui-column-first '] label")
	private List<WebElementFacade> vacationTypeColumn;

	@FindBy(css = "div[class*='aui-column column-three column-center '] label")
	private List<WebElementFacade> daysNumberColumn;

	@FindBy(css = "div[class*='aui-column column-three column-center aui-column-last'] label")
	private List<WebElementFacade> vacationStatusColumn;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_inactiveUsersCheckbox")
	private WebElementFacade showInactiveUsers;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade lastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade firstName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade apply;

	public void clickOnViewVacations() {
		viewVacations.click();
	}

	public void clickOnVacationType(String name) {
		for (WebElementFacade item : vacationTypeColumn) {
			if (item.getText().contains(name)) {
				System.out.println("Am dat click");
				item.click();
			}
		}
	}

	public void clickOnDaysNumber(String name) {
		for (WebElementFacade item : daysNumberColumn) {
			System.out.println(item.getText());
			if (name.contains(item.getText())) {
				System.out.println("Am dat click");
				item.click();
			}
		}
	}

	public void clickVacationStatus(String name) {
		for (WebElementFacade item : vacationStatusColumn) {
			System.out.println(item.getText());
			if (item.getText().contains(name)) {
				System.out.println("Am dat click");
				item.click();
			}
		}

	}

	public void clickOnShowInactiveUsers() {
		showInactiveUsers.click();
	}

	public void enterOnLastName(String name) {
		lastName.type(name);
	}

	public void enterOnFirstName(String name) {
		firstName.type(name);
	}

	public void clickOnApply() {
		apply.click();
	}
}
