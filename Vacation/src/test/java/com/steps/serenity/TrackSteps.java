package com.steps.serenity;

import com.pages.TrackPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class TrackSteps extends ScenarioSteps {

    TrackPage trackPage;

    @Step
    public void enters() {
    	trackPage.clickOnTrack();
    }

    
}