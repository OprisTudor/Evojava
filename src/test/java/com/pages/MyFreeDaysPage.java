package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/")
public class MyFreeDaysPage extends PageObject {

	@FindBy(css = "a[href*='_menuItem=my-free-days']")
	private WebElementFacade myFreeDays;

	@FindBy(css = "ul[class='nav nav-tabs'] li")
	private List<WebElementFacade> years;
	//TODO use a more descriptive name for the list

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_TabsBack")
	private WebElementFacade back;
	//TODO use a more descriptive name for the element

	public void clickOnMyFreeDays() {
		myFreeDays.click();
	}

	//TODO clean syso
	public void clickOnYears(String name) {
		for (WebElementFacade item : years) {
			if (item.getText().contains(name)) {
				item.click();
			}
		}

	}

	public void clickOnBack() {
		back.click();
	}
}
