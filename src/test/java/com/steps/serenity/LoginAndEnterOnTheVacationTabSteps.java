package com.steps.serenity;

import com.pages.LoginPage;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

//TODO rename Step class to more appropriate name like LoginSteps
public class LoginAndEnterOnTheVacationTabSteps extends ScenarioSteps {

	// TODO use access modifiers
	LoginPage loginPage;

	// TODO use more suggestive names for methods
	@Step
	private void enters(String name, String password) {
		loginPage.enterCredentials(name, password);
	}

	@Step
	private void clickSignIn() {
		loginPage.signIn();
	}

	// TODO use the correct keyword describing the action
	@Step
	private void isTheHomePage() {
		loginPage.open();
	}

	@Step
	private void clickSubmit() {
		loginPage.logIn();
	}

	@Step
	private void enterVacationTab() {
		loginPage.clickVacationTab();
	}

	@Step
	private void maximizeWindow() {
		loginPage.maximizeWindow();
	}

	//TODO user credentials should be fed from the test level 
	//TODO refactor methods to only one login method
	@Step
	public void loginAsUser() {
		isTheHomePage();
		clickSignIn();
		enters(Constants.USER_NAME, Constants.USER_PASSWORD);
		clickSubmit();
		maximizeWindow();
		enterVacationTab();
	}

	@Step
	public void login(String userName, String userPassword) {
		isTheHomePage();
		clickSignIn();
		enters(userName, userPassword);
		clickSubmit();
		maximizeWindow();
		enterVacationTab();
	}

	@Step
	public void loginAsPM() {
		isTheHomePage();
		clickSignIn();
		enters(Constants.PM_USERNAME, Constants.PM_PASSWORD);
		clickSubmit();
		enterVacationTab();
	}

	@Step
	public void loginAsDM() {
		isTheHomePage();
		clickSignIn();
		enters(Constants.DM_USERNAME, Constants.DM_PASSWORD);
		clickSubmit();
		enterVacationTab();
	}
}