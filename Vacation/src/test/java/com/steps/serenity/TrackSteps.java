package com.steps.serenity;

import com.pages.TrackPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class TrackSteps extends ScenarioSteps {

	TrackPage trackPage;

	@Step
	public void enters() {
		trackPage.clickOnTrack();

	}

	@Step
	public void showDropDownAll() {
		trackPage.clickDropDownAll();
	}

	@Step
	public void selectInitialDate() {
		trackPage.clickOnInitialDate();
	}

	@Step
	public void selectSecondDate() {
		trackPage.clickOnSecondDate();
	}

	@Step
	public void selectBuildingsDropDown() {
		trackPage.clickOnBuildingsDropDown();
	}

	@Step
	public void selectDepartmentsDropDown() {
		trackPage.clickOnDepartmentsDropDown();
	}

	@Step
	public void checkAllBuildings() {
		trackPage.clickCheckAllBuildings();
		}
	@Step
	public void checkAllDepartments() {
		trackPage.clickCheckAllDepartments();
	}
	
	@Step
	public void clickOnApplyButton(){
		trackPage.clickOnApplyButton();
	
	}
	@Step
	public void clickOnBuildingsDropDown(String name){
		trackPage.clickOnBuildingsDropDown();
	}
}

