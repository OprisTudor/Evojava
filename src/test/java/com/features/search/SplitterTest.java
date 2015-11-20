package com.features.search;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.LoginAndEnterOnTheVacationTabSteps;
import com.steps.serenity.MyRequestSteps;
import com.tools.VacationResultModel;
import com.tools.VerifyNewRequestInRequests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SplitterTest {
    
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LoginAndEnterOnTheVacationTabSteps authentication;
	//TODO use full names for variables. Also use keywords like "Steps"
	@Steps
	public MyRequestSteps myRequestsSteps;
	@Steps
	public VerifyNewRequestInRequests verifyNewRequestInRequests;
	
	public VacationResultModel expectedData;
	
	@Before
	public void setData(){
		expectedData = new VacationResultModel();
		expectedData.setEndDate("18/11/2015");
		expectedData.setStartDate("18/11/2015");
		expectedData.setDaysNumber("1");
		expectedData.setLastUpdated("Roxana Bot");
		expectedData.setStatus("Withdrawn");
		expectedData.setType("Maternity");
	}
	
	@Test
	public void enterNewVacationRequest() {
		authentication.login("roxanabot1","automation");
		List<VacationResultModel> grabbedList = myRequestsSteps.verifyThatRowContainsTerms();
		verifyNewRequestInRequests.verifyListContainsEntry(grabbedList, expectedData);
	}
} 
