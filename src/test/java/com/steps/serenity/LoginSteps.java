package com.steps.serenity;

import com.pages.LoginPage;
import com.tools.MaximizeBrowserWindow;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

//TODO rename Step class to more appropriate name like LoginSteps
public class LoginSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// TODO use access modifiers
	private LoginPage loginPage;
	private MaximizeBrowserWindow maximizeBrowserWindow;

	// TODO use more suggestive names for methods
	@Step
	private void enterCredentials(String name, String password) {
		loginPage.enterCredentialsInInputFields(name, password);
	}

	// TODO use the correct keyword describing the action
	@Step
	private void openTheHomePage() {
		loginPage.open();
	}

	@Step
	private void clickSubmit() {
		loginPage.logIn();
	}

	@Step
	private void maximizeWindow() {
		maximizeBrowserWindow.maximizeWindow();
	}

	@Step
	private void openTheVacationTab() {
		loginPage.enterOnVacationTab();
	}
	
	//TODO user credentials should be fed from the test level 
	//TODO refactor methods to only one login method
	
	@Step
	public void login(String userName, String userPassword) {
		openTheHomePage();
		
		enterCredentials(userName, userPassword);
		clickSubmit();
		maximizeWindow();
		openTheVacationTab();
	}

	
}