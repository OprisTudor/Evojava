package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/")
public class InboxPage extends PageObject {

	@FindBy(css = "a[href*='_menuItem=inbox']")
	private WebElementFacade inbox;

	@FindBy(css = "table.taglib-search-iterator tr:nth-child(3) input")
	private WebElementFacade firstRow;

	@FindBy(css = "input[value='Approve']")
	private WebElementFacade approve;

	@FindBy(css = "input[value='Reject']")
	private WebElementFacade reject;

	@FindBy(css = "a[href*='assignedToOthers']")
	private WebElementFacade assignedToOthers;

	public void clickOnFirstRow() {
		firstRow.click();
	}

	public void clickOnApprove() {
		approve.click();
	}

	public void clickOnReject() {
		reject.click();
	}

	public void clickOnAssignedToOthers() {
		assignedToOthers.click();
	}

}
