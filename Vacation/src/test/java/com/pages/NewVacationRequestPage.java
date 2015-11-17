package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

public class NewVacationRequestPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade initialDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade secondDate;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CO")
	private WebElementFacade requestCO;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade requestCF;

	@FindBy(id = "")
	private WebElementFacade durationInput;

	@FindBy(id = "")
	private WebElementFacade institutionInput;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElementFacade requestCM;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade requestCS;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_type_ML")
	private WebElementFacade requestML;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_newVacationComment")
	private WebElementFacade addComment;
	
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade commentInput;

	@FindBy(css = "input[type='submit']")
	private WebElementFacade submitButton;



	
	


	public void selectStartDate(String date) {
		element(initialDate).sendKeys(date);
	}
	public void selectEndDate(String date) {
		element(secondDate).sendKeys(date);
	}

	public void selectCOButton() {
		requestCO.click();
	}

	public void selectCFButton() {
		requestCF.click();
	}
	
	public void selectCMButton() {
		requestCM.click();
	}
	
	public void selectCSButton() {
		requestCS.click();
	}
	
	public void selectMLButton() {
		requestML.click();
	}
	
	public void selectComment() {
		addComment.click();
	}
	
	public void inputComment(String comm) {
		commentInput.type(comm);
	}

	public void submitRequest() {
		submitButton.click();
	}

	
}