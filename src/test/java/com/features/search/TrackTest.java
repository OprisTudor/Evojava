package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.SideMenuSteps;
import com.steps.serenity.TrackSteps;

import helpers.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TrackTest {

	@Managed(uniqueSession = true)
	private WebDriver webdriver;

	@Steps
	private LoginSteps endUserVacationSteps;
	
	@Steps
	private SideMenuSteps sideMenuSteps;
	
	@Steps
	private TrackSteps trackSteps;

	@Test
	// TODO change test name to a more meaningful test name
	public void verifiyIfThetrackPageWorks() {
		endUserVacationSteps.login(Constants.PM_USERNAME, Constants.PM_PASSWORD);
		sideMenuSteps.enterVacatioTracker();
	    trackSteps.selectStartDate();
	    trackSteps.setDate(16, "Nov", 2015);
		trackSteps.selectEndDate();
		trackSteps.setDate(18, "Nov", 2015);
		trackSteps.clickApplyButton();
	/*
		trackSteps.selectStartDate();
		trackSteps.selectEndDate();
		trackSteps.selectBuildingsDropDown();
		trackSteps.clickAllBuildingsCheckbox();
		trackSteps.waitABit(2000);
		trackSteps.selectBuildingsDropDown();
		trackSteps.selectDepartmentsDropDown();
		trackSteps.clickAllDepartmentsCheckbox();
		trackSteps.selectDepartmentsDropDown();
		trackSteps.clickApplyButton();
		trackSteps.selectDepartmentsDropDown();
    */
		trackSteps.selectFromBuildingsDropDown("MainBuilding");
		trackSteps.selectFromDepartmentsDropDown("Eboot");

	}
}
