package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrackPage extends PageObject {

	// TODO remove unused mappings - done
	// TODO rename mappings with more suggestive names - done
	@FindBy(css = "a[href*='menuItem=vacation-tracker']")
	private WebElementFacade trackButton;

	@FindBy(name = "trackerStartDate")
	private WebElementFacade startDate;

	@FindBy(name = "trackerEndDate")
	private WebElementFacade endDate;

	@FindBy(css = "#buildings dl dt div.hida")
	private WebElementFacade buildingsDropDown;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_departmentsALLCheckbox")
	private WebElementFacade allDepartmentsCheckbox;

	@FindBy(css = "#buildings div.mutliSelect ul li")
	private WebElementFacade allBuildingsCheckbox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;

	@FindBy(css = "div#departments div.hida")
	private WebElementFacade departmentsDropdown;

	@FindBy(css = "div#departments div.mutliSelect")
	private WebElementFacade departmentContainer;

	@FindBy(css = "div#buildings div.mutliSelect")
	private WebElementFacade buildingContainer;
	@FindBy(css = "[style*='display: block'] .dp_caption")
	private WebElementFacade title;
	
	@FindBy(css = "[style*='display: block'] .dp_yearpicker td")
	private List<WebElementFacade> datePickerYearList;

	@FindBy(css = "[style*='display: block'] .dp_monthpicker td")
	private List<WebElementFacade> datePickerMonthList;

	@FindBy(css = "[style*='display: block'] .dp_daypicker td:not([class*='disabled'])")
	private List<WebElementFacade> datePickerDayList;

	public void clickTrackButton() {
		trackButton.click();

	}

	public void setDate(int day, String month, int year) {
		// click twice on title to open year view
		title.click();
		waitABit(2000);
		title.click();
		waitABit(2000);
		

		// select year
		for (WebElementFacade i : datePickerYearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}

		// select month
		for (WebElementFacade i : datePickerMonthList)
			if (i.getText().contentEquals(month)) {
				i.click();
				break;
			}

		// select day
		for (WebElementFacade i : datePickerDayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}
		waitABit(3000);
	}

	public void clickStartDate() {
		startDate.click();
	}

	public void clickEndDate() {
		endDate.click();
	}

	public void clickAllBuildingsCheckbox() {
		allBuildingsCheckbox.selectByVisibleText("ALL");
	}

	public void clickBuildingsDropDown() {
		buildingsDropDown.click();
		buildingsDropDown.selectByValue("ALL");
	}

	public void clickDepartmentsDropDown() {
		departmentsDropdown.click();

	}

	public void clickAllDepartmentsCheckbox() {
		allDepartmentsCheckbox.click();

	}

	public void clickApplyButton() {
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
