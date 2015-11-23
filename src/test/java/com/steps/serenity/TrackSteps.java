package com.steps.serenity;

import com.pages.TrackPage;
import com.tools.VacationResultModel;
import com.tools.VacationTrackerResultModel;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

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
	public void setDate(int day, String month, int year) {
		trackPage.setDate(day, month, year);
	}

	@Step
	public void clickNextPageButton() {
		trackPage.clickNextPageButton();
	}

	@Step
	public List<VacationTrackerResultModel> grabResultModelList() {
		List<VacationTrackerResultModel> finalResultList = new ArrayList<VacationTrackerResultModel>();

		for (int i = 1; i < trackPage.getNumberOfPages(); i++) {
			List<VacationTrackerResultModel> partialList = trackPage.grabResultsModelList();
			finalResultList.addAll(partialList);
			clickNextPageButton();
		}
		return finalResultList;
	}

	@Step
	public void checkIfTheBuildingColumnMatchesTheExpectedColumn(List<VacationTrackerResultModel> grabbedList,
			String string)

	{
		for (VacationTrackerResultModel vacationTrackerResultModel : grabbedList) {
			Assert.assertTrue("building is not the expected result",
					vacationTrackerResultModel.getBuilding().contains(string));
		}
	}

}
