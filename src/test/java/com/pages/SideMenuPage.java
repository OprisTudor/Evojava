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

@DefaultUrl("http://172.22.4.88:9090/")
public class SideMenuPage extends PageObject {

	@FindBy(css = "a[href*='_menuItem=inbox']")
	private WebElementFacade inbox;

	@FindBy (css = "a[href*='_menuItem=new-request']")
	private WebElementFacade newRequest;
	
	@FindBy (css = "a[href*='_menuItem=my-request']")
	private WebElementFacade myRequest;
	
	@FindBy (css ="a[href*='_menuItem=my-free-days']")
	private WebElementFacade myFreeDays;
	
	@FindBy (css ="a[href*='_menuItem=free-days-history']")
	private WebElementFacade freeDaysHistory;
	
	@FindBy (css ="a[href*='menuItem=vacation-tracker']")
	private WebElementFacade vacationTracker;
	
	@FindBy (css="a[href*='menuItem=view-vacations']")
	private WebElementFacade viewVacations;
	
	@FindBy (css ="a[href*='menuItem=vacation-report']")
	private WebElementFacade vacationReport;
	
	
	
	
	public void clickOnInbox (){
		inbox.click();
	}
	public void clickOnNewRequest(){
		newRequest.click();
	}
	public void clickOnMyRequest(){
		myRequest.click();
	}

	public void clickOnMyFreeDays(){
		myFreeDays.click();
	}
	public void clickOnFreeDaysHistory(){
		freeDaysHistory.click();
	}
	public void clickOnVacationTracker(){
		vacationTracker.click();
	}
	public void clickOnViewVacations(){
		viewVacations.click();
	}
	public void clickOnVacationReport(){
		vacationReport.click();
	}
}

	