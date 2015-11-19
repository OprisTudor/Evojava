package com.features.search.tudorAwesomeTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.MyRequestSteps;
import com.steps.serenity.SideMenuSteps;

@RunWith(SerenityRunner.class)
public class MyRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginAndEnterOnTheVacationTabSteps endUserSteps;
    
    @Steps
    public SideMenuSteps sideMenuSteps;
    
    @Steps
    public MyRequestSteps myRequestSteps;

    
    @Test
    public void loginAndEnterOnTheVacationTab() {
        endUserSteps.loginAsUser();
        sideMenuSteps.enterMyRequest();
        myRequestSteps.selectHolidayCheckbox();
        myRequestSteps.applyFilters();
//      myRequestSteps.checkThatRowContainsTerms("Withdrawn");
        myRequestSteps.verifyThatTypeIsCorrect("type", "Holiday");
//      myRequestSteps.goToNextPage();
//      myRequestSteps.verifyThatTypeIsCorrect("Holiday");
  
    }

} 