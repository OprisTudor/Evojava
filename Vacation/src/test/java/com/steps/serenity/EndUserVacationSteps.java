package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserVacationSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step
    public void enters(String name, String password) {
    	loginPage.enter_credentials(name, password);
    }

    
    @Step
    public void should_see_definition(String definition) {
        assertThat(loginPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
    	loginPage.open();
    }

    @Step
    public void looks_for(String name, String password) {
    	enters(name, password);
    }
}