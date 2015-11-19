package com.pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.BASE_URL)
public class LoginPage extends PageObject {

	@FindBy(id = "sign-in")
	private WebElementFacade signIn;

	@FindBy(id = "_58_login")
	private WebElementFacade nameInput;

	@FindBy(id = "_58_password")
	private WebElementFacade passwordInput;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade logInButton;

	@FindBy(css = "a[href*='vacation']")
	private WebElementFacade vacationTab;

	//TODO move general method to a more general class
	public void maximizeWindow() {
		getDriver().manage().window().maximize();
	}

	//TODO move element mapping and action to a separate class. 
	public void clickVacationTab() {
		vacationTab.click();
	}

	public void enterCredentials(String name, String password) {
		nameInput.type(name);
		passwordInput.type(password);
	}

	public void signIn() {
		signIn.click();
	}

	public void logIn() {
		logInButton.click();
	}

}