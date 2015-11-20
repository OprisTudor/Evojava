package com.features.search.tudorAwesomeTests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.SideMenuPage;
import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.MyRequestSteps;
import com.steps.serenity.SideMenuSteps;
import com.steps.serenity.ViewVacantionsSteps;
import com.tools.VacationResultModel;
import com.tools.VerifyNewRequestInRequests;

import helpers.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MyRequestTest {
    
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginAndEnterOnTheVacationTabSteps loginAndEnterOnTheVacationTabSteps;
	//TODO use full names for variables. Also use keywords like "Steps"
	@Steps
	public MyRequestSteps myRequestsSteps;
	@Steps
	public VerifyNewRequestInRequests verifyNewRequestInRequests;
	
	@Steps
	public SideMenuSteps sideMenuSteps;
	
	@Steps
	public ViewVacantionsSteps vacantionsSteps;
	
	
	public VacationResultModel expectedData;
	
	@Before
	public void setData(){
		expectedData = new VacationResultModel();
		expectedData.setEndDate("18/11/2015");
		expectedData.setStartDate("18/11/2015");
		expectedData.setDaysNumber("1");
		expectedData.setLastUpdated("Opris Tudor");
		expectedData.setStatus("Withdrawn");
		expectedData.setType("Maternity");
	}
	
	@Test
	public void enterNewVacationRequest() {
		loginAndEnterOnTheVacationTabSteps.login(Constants.USER_NAME, Constants.USER_PASSWORD);
		sideMenuSteps.enterMyRequest();
		vacantionsSteps.clickOnVacationType("Holiday");
		vacantionsSteps.clickOnApply();
		myRequestsSteps.verifyThatASpecificColumnContainsTerms("Holiday");
		//verifyNewRequestInRequests.verifyListContainsEntry(grabbedList, expectedData);
	}
} 
