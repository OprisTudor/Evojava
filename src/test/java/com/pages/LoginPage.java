package com.pages;

import helpers.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.BASE_URL)
public class LoginPage extends PageObject {

	@FindBy(id = "sign-in")
	private WebElementFacade signInButton;

	@FindBy(id = "_58_login")
	private WebElementFacade nameInput;

	@FindBy(id = "_58_password")
	private WebElementFacade passwordInput;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade logInButton;

	@FindBy(css = "a[href*='vacation']")
	private WebElementFacade vacationTab;

	//TODO move general method to a more general class
//	public void maximizeWindow() {
//		getDriver().manage().window().maximize();
//	}

	public void enterCredentialsInInputFields(String name, String password) {
		
		nameInput.type(name);
		passwordInput.type(password);
	}

	public void logIn() {
		logInButton.click();
	}
	
	public void enterOnVacationTab() {
		vacationTab.click();
	}

}