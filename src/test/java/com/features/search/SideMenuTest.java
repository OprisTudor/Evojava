package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.SideMenuSteps;

@RunWith(SerenityRunner.class)
public class SideMenuTest extends ScenarioSteps{
	//TODO the test class does not extend ScenarioSteps. remove unused extends
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginAndEnterOnTheVacationTabSteps endUserSteps;
    @Steps
    public SideMenuSteps sideMenuSteps;
    
    @Test
    //TODO change to meaningful test name
    public void enterEveryTabOnSidePage() {
       endUserSteps.loginAsDM();
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