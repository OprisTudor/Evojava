package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://172.22.4.88:9090/")
public class TrackPage extends PageObject {

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

	@FindBy(css = "_evovacation_WAR_EvoVacationportlet_buildingsALLCheckbox")
	private WebElementFacade checkAllBuildings;


	@FindBy(css = "#departments dl dt div.hida")
	private WebElementFacade departmentsDropDown;

	@FindBy(id = "aui_3_4_0_1_451")
	private WebElementFacade showBuildings;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_buildingsALLCheckbox")
	private WebElementFacade checkAll;
	
	@FindBy(id= "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyButton;
	
	@FindBy (id="#_evovacation_WAR_EvoVacationportlet_Main BuildingCheckbox")
	private WebElementFacade mainBuildingCheckbox;
	
	

	public void clickOnTrack() {
		track.click();
    
	}

	public void clickDropDownAll() {
		checkAll.click();
	}

	public void clickOnInitialDate() {
		initialDate.click();
	}

	public void clickOnSecondDate() {
		secondDate.click();
	}

	public void clickCheckAllBuildings() {
		checkAllBuildings.click();
	}

	public void clickOnBuildingsDropDown() {
		buildingsDropDown.click();
	}

	public void clickOnDepartmentsDropDown() {
		departmentsDropDown.click();

	}

	public void clickCheckAllDepartments() {
		checkAllDepartments.click();

	}
	public void clickOnApplyButton(){
		applyButton.click();
	}
	public void  buildingsDropDown(String name){
		buildingsDropDown.type(name);
	}
}



