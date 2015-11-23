package com.steps.serenity;

import com.pages.TrackPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class TrackSteps extends ScenarioSteps {
	// TODO use access modifiers - done
	private TrackPage trackPage;

	// TODO use more suggestive names for method naming - done
	@Step
	public void openTrackPage() {
		trackPage.clickTrackButton();
	}

	@Step
	public void selectStartDate() {
		trackPage.clickStartDate();
	}

	@Step
	public void selectEndDate() {
		trackPage.clickEndDate();
	}

	@Step
	public void selectBuildingsDropDown() {
		trackPage.clickBuildingsDropDown();
	}

	@Step
	public void selectDepartmentsDropDown() {
		trackPage.clickDepartmentsDropDown();
	}

	@Step
	public void clickAllBuildingsCheckbox() {
		trackPage.clickAllBuildingsCheckbox();
	}

	@Step
	public void clickAllDepartmentsCheckbox() {
		trackPage.clickAllDepartmentsCheckbox();
	}

	@Step
	public void clickApplyButton() {
		trackPage.clickApplyButton();
	}

	@Step
	public void selectFromDepartmentsDropDown(String departmentName) {
		trackPage.selectFromDepartmentsDropDown(departmentName);
	}

	@Step
	public void selectFromBuildingsDropDown(String buildingName) {
		trackPage.selectFromBuildingsDropDown(buildingName);
	}
		
	@Step
    public void setDate (int day, String month, int year) {
        trackPage.setDate(day, month, year);
		
        

}
}
