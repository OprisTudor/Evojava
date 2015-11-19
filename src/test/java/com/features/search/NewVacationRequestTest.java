package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.NewVacationRequestSteps;
import com.steps.serenity.SideMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewVacationRequestTest {
    
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginAndEnterOnTheVacationTabSteps authentication;
	//TODO use full names. Also use key words like Steps for each
	@Steps
	public SideMenuSteps sideMenuSteps;
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;
	
	@Test
	//TODO change to meaningful test name
	public void enterNewVacationRequest() {
		authentication.login("roxanabot1","automation");
		sideMenuSteps.enterNewRequest();
		newVacationRequestSteps.selectStartDate();
		newVacationRequestSteps.setDate(7,"Aug",2017);
		newVacationRequestSteps.selectEndDate();
		newVacationRequestSteps.setDate(25,"Aug",2017);
		newVacationRequestSteps.selectVacationMaternityLeave("CIC", "4 months", "Kindergarden");
		newVacationRequestSteps.chooseComment();
		newVacationRequestSteps.writeComment("Please check my request ASAP");
		newVacationRequestSteps.finishRequest();
		newVacationRequestSteps.verifyMessage("Your request completed successfully.");
		sideMenuSteps.enterMyRequest();
	}
} 
