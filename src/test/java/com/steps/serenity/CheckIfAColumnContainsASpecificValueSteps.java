package com.steps.serenity;

import java.util.List;

import org.jruby.RubyProcess.Sys;
import org.junit.Assert;

import com.tools.VacationResultModel;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckIfAColumnContainsASpecificValueSteps extends ScenarioSteps {

	private static final long serialVersionUID = 5882515009397365249L;

	@Step
	public void checkIfTypeColumnHasASpecificValue(List<VacationResultModel> actualList, String expectedData) {

		for (VacationResultModel vacationResultModel : actualList) {
			Assert.assertTrue("The row does not contains the expected type",
					vacationResultModel.getType().contains(expectedData));

		}

	}

	@Step
	public void checkIfTypeColumnHasValidData(List<VacationResultModel> actualList, String expectedData) {

		for (VacationResultModel vacationResultModel : actualList) {
			Assert.assertTrue("The row does not contains the expected type",
					expectedData.contains(vacationResultModel.getType()));

		}

	}

	@Step
	public void checkIfDaysNumberColumnHasValidData(List<VacationResultModel> actualList, String... expectedData) {
			
		for (VacationResultModel vacationResultModel : actualList) {
			int dayNumber = Integer.parseInt(vacationResultModel.getDaysNumber());
			Assert.assertTrue("Not all numbers are in the selected interval", checkNumber(dayNumber, expectedData));
		}

	}

	public boolean checkNumber(int number, String... intervals) {
		boolean valid = false;

		for (String interval : intervals) {

			if (interval.contains("ALL")) {
				valid = true;
				break;
			}

			int low = Integer.parseInt(interval.trim().replace("+", "-").split(" ")[0]);

			if (low > 50) {

				if (number > 50) {

					valid = true;
				}
			} else {

				int high = Integer.parseInt(interval.trim().split("-")[1].trim());
				System.out.println("String split high: " + high);
				if (number >= low && number <= high) {

					valid = true;
				}
			}
		}

		return valid;
	}
	
}
