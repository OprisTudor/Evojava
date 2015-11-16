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
    	loginPage.enterCredentials(name, password);
    }

    @Step
    public void clickSignIn(){
    	loginPage.signIn();
    }
   
    @Step
    public void isTheHomePage() {
    	loginPage.open();
    }
    
    @Step
    public void clickSubmit() {
    	loginPage.logIn();
    }
    
    @Step
    public void enterVacationTab() {
    	loginPage.clickVacationTab();
    }

    @Step
    public void effectuateLogin(String name, String password) {
    	clickSignIn();
    	enters(name, password);
    	clickSubmit();
    	enterVacationTab();
    }
}