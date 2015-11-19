package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrackPage extends PageObject {

	// TODO remove unused mappings
	// TODO rename mappings with more suggestive names
	@FindBy(css = "a[href*='menuItem=vacation-tracker']")
	private WebElementFacade track;

	@FindBy(name = "trackerStartDate")
	private WebElementFacade initialDate;

	@FindBy(name = "trackerEndDate")
	private WebElementFacade secondDate;

	@FindBy(css = "#buildings dl dt div.hida")
	private WebElementFacade buildingsDropDown;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox")
	private WebElementFacade checkAllDepartments;

	@FindBy(css = "#buildings div.mutliSelect ul li")
	private WebElementFacade checkAllBuildings;

	// @FindBy(css = "#departments dl dt div.hida")
	// private WebElementFacade departmentsDropDown;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(id = "#_evovacation_WAR_EvoVacationportlet_Main BuildingCheckbox")
	private WebElementFacade mainBuildingCheckbox;

	@FindBy(css = "div#departments div.hida")
	private WebElementFacade departmentsDropdown;

	@FindBy(css = "div#departments input[value='ALL']")
	private WebElementFacade departmentAllValue;

	@FindBy(css = "div#departments div.mutliSelect")
	private WebElementFacade departmentContainer;

	@FindBy(css = "div#buildings div.mutliSelect")
	private WebElementFacade buildingContainer;

	public void clickOnTrack() {
		track.click();
	}

	public void clickOnInitialDate() {
		initialDate.click();
	}

	public void clickOnSecondDate() {
		secondDate.click();
	}

	public void clickCheckAllBuildings() {
		checkAllBuildings.selectByVisibleText("ALL");
	}

	public void clickOnBuildingsDropDown() {
		buildingsDropDown.click();
		buildingsDropDown.selectByValue("ALL");
	}

	public void clickOnDepartmentsDropDown() {
		departmentsDropdown.click();

	}

	public void clickCheckAllDepartments() {
		checkAllDepartments.click();

	}

	public void clickOnApplyButton() {
		applyButton.click();
	}

	public void selectFromDepartmentsDropDown(String departmentName) {
		element(departmentsDropdown).waitUntilVisible();
		departmentsDropdown.click();
		departmentsDropdown.click();

		List<WebElement> departmentsList = departmentContainer.findElements(By
				.cssSelector("label"));
		for (WebElement departmentElement : departmentsList) {
			// System.out.println("el: " +departmentElement.getText());
			if (departmentElement.getText().contains(departmentName)) {
				departmentElement.click();
				// TODO clean waitABit and use waitUntilVisible
				waitABit(3000);
				break;
			}
		}

	}

	public void selectFromBuildingsDropDown(String buildingName) {
		element(buildingsDropDown).waitUntilVisible();
		buildingsDropDown.click();
		buildingsDropDown.click();

		List<WebElement> buildingsList = buildingContainer.findElements(By
				.cssSelector("label"));
		for (WebElement buildingElement : buildingsList) {
			// System.out.println("el: " +buildingElement.getText());
			if (buildingElement.getText().contains(buildingName)) {
				buildingElement.click();
				// TODO clean waitABit and use waitUntilVisible
				waitABit(4000);
				break;

			}

		}
	}
}
