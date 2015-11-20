package com.tools;

import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VerifyIfAColumnContainsASpecificValue extends ScenarioSteps{

	private static final long serialVersionUID = 5882515009397365249L;
	
	@Step
	public void verifyIfTypeColumnHasASpecificValue(List<VacationResultModel> actualList, String columnData){
		
		for (VacationResultModel vacationResultModel : actualList) {
			Assert.assertTrue("The row does not contains the expected type", vacationResultModel.getType().contentEquals(columnData));
		}
		
	}
	
}
