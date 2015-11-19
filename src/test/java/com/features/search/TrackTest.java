package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.SideMenuSteps;
import com.steps.serenity.TrackSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class TrackTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginAndEnterOnTheVacationTabSteps endUserVacationSteps;

	@Steps
	public SideMenuSteps sideMenuSteps;

	@Steps
	public TrackSteps trackSteps;

	@Test
	public void verifiyIfThetrackPageWorks() {
		endUserVacationSteps.loginAsPM();
		sideMenuSteps.enterVacatioTracker();
		// trackSteps.selectInitialDate();
		// trackSteps.selectSecondDate();
		// trackSteps.selectBuildingsDropDown();
		// trackSteps.checkAllBuildings();
		// trackSteps.waitABit(2000);
		// trackSteps.selectBuildingsDropDown();
		// trackSteps.selectDepartmentsDropDown();
		// trackSteps.checkAllDepartments();
		// trackSteps.selectDepartmentsDropDown();
		// trackSteps.clickOnApplyButton();
		// trackSteps.selectDepartmentsDropDown();

		trackSteps.selectFromBuildingsDropDown("MainBuilding");
		trackSteps.selectFromDepartmentsDropDown("Eboot");

	}
}
