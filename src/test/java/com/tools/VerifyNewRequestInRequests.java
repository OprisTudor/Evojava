package com.tools;

import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

//TODO rename to a more appropriate name
public class VerifyNewRequestInRequests extends ScenarioSteps{

	@Step
	public void verifyListContainsEntry(List<VacationResultModel> actualList, VacationResultModel expectedData){
		boolean isPresent = false;
		
		theFor:
		for (VacationResultModel vacationResultModel : actualList) {
			boolean vallidEndDate = vacationResultModel.getEndDate().contains(expectedData.getEndDate());
			boolean vallidStartDate = vacationResultModel.getStartDate().contains(expectedData.getStartDate());
			boolean vallidDaysNumber = vacationResultModel.getDaysNumber().contains(expectedData.getDaysNumber());
			boolean vallidType = vacationResultModel.getType().contains(expectedData.getType());
			boolean vallidStatus = vacationResultModel.getStatus().contains(expectedData.getStatus());
			boolean vallidLastUpdated = vacationResultModel.getLastUpdated().contains(expectedData.getLastUpdated());
			if(vallidEndDate && vallidStartDate && vallidDaysNumber && vallidType && vallidStatus && vallidLastUpdated){
				isPresent = true;
				break theFor;
			}
		}
		
		Assert.assertTrue("Failure: did not find element in list", isPresent);
	}
	
}
