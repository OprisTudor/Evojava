package com.features.search.tudorAwesomeTests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.MyRequestSteps;
import com.steps.serenity.SideMenuSteps;
import com.steps.serenity.ViewVacantionsSteps;
import com.tools.CheckIfAColumnContainsASpecificValueSteps;
import com.tools.VacationResultModel;

import com.tools.VerifyNewRequestInRequests;

import helpers.Constants;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)

public class VacationTypeColumnShouldContainOnlyAvailableValuesTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
	// TODO use full names for variables. Also use keywords like "Steps"
	@Steps
	public MyRequestSteps myRequestsSteps;
	@Steps
	public VerifyNewRequestInRequests verifyNewRequestInRequests;

	@Steps
	public SideMenuSteps sideMenuSteps;

	@Steps
	public ViewVacantionsSteps vacantionsSteps;

	@Steps
	public CheckIfAColumnContainsASpecificValueSteps checkIfTypeColumnHasASpecificValueSteps;

	public String vacationTypes = "Holiday,Vacation Without Payment,Special Vacation,Sick Leave,Maternity Leave";

	@Test
	public void filteringByVacationTypeOnlyTheSelectedTypeShouldAppear() {
		loginSteps.login(Constants.USER_NAME, Constants.USER_PASSWORD);
		List<VacationResultModel> grabbedList = myRequestsSteps.grabResultModelListOfAllPages();
		checkIfTypeColumnHasASpecificValueSteps.checkIfTypeColumnHasValidData(grabbedList, vacationTypes);

	}
}
