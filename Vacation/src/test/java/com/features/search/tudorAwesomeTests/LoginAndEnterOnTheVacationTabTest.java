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

@RunWith(SerenityRunner.class)
public class LoginAndEnterOnTheVacationTabTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginAndEnterOnTheVacationTabSteps endUserSteps;

    
    @Test
    public void loginAndEnterOnTheVacationTab() {
        endUserSteps.loginAsUser();
        

    }

} 