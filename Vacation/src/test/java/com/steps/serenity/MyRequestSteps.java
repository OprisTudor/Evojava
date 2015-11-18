package com.steps.serenity;

import com.pages.LoginPage;
import com.pages.MyRequestPage;

import helpers.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class MyRequestSteps extends ScenarioSteps {

    MyRequestPage myRequestPage;

    @Step
    public void selectHolidayCheckbox() {
    	myRequestPage.inputHoliday();
    }
    
    public void applyFilters(){
    	myRequestPage.clickApplyButton();
    }
    
    @Step
    public void shouldMatchFilterData(String definition) {
        assertThat(myRequestPage.getFilterData(), hasItem(containsString(definition)));
    }
    
}