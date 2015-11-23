package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginSteps;
import com.steps.serenity.SideMenuSteps;

import helpers.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SideMenuTest{
	//TODO the test class does not extend ScenarioSteps. remove unused extends
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps endUserSteps;
    @Steps
    public SideMenuSteps sideMenuSteps;
    
    @Test
    //TODO change to meaningful test name
    public void enterEveryTabOnSidePage() {
    	endUserSteps.login(Constants.DM_USERNAME, Constants.DM_PASSWORD);
       sideMenuSteps.enterInbox();
       sideMenuSteps.enterNewRequest();
       sideMenuSteps.enterMyRequest();
       sideMenuSteps.enterMyFreeDays();
       sideMenuSteps.enterFreeDaysHistory();
       sideMenuSteps.enterVacatioTracker();
       sideMenuSteps.enterViewVacations();
       sideMenuSteps.enterVacationReport();
    }

   
} 