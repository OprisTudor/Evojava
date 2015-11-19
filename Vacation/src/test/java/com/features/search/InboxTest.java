package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.EndUserSteps;

import com.steps.serenity.InboxSteps;
import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.SideMenuSteps;


@RunWith(SerenityRunner.class)
public class InboxTest extends ScenarioSteps{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    public LoginAndEnterOnTheVacationTabSteps endUserSteps;
    @Steps
    public InboxSteps inboxSteps;
    
    @Steps
    public SideMenuSteps sideMenuSteps;


    
    @Test
    public void enterEveryTabOnSidePage() {
    	endUserSteps.loginAsDM();;
    	sideMenuSteps.enterInbox();
    	inboxSteps.enterFirstRow();
    	inboxSteps.enterApprove();
    	sideMenuSteps.enterInbox();
    	inboxSteps.enterFirstRow();
    	inboxSteps.enterReject();
    	inboxSteps.enterAssignedToOthers();
    	
    
      
      
      
      
    }
   
} 