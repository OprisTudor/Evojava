package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.EndUserSteps;

import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.SideMenuSteps;
import com.steps.serenity.TrackSteps;

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
        trackSteps.selectInitialDate();
        trackSteps.selectSecondDate();
        trackSteps.selectBuildingsDropDown();
       // trackSteps.checkAllBuildings();
        trackSteps.showDropDownAll();
        trackSteps.selectBuildingsDropDown();
        trackSteps.selectDepartmentsDropDown();
        trackSteps.checkAllDepartments();
        trackSteps.selectDepartmentsDropDown();
        trackSteps.clickOnApplyButton();
        trackSteps.clickOnBuildingsDropDown("mainBuilding");
        trackSteps.clickOnApplyButton();
    }
}

  