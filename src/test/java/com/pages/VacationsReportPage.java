package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/")
public class VacationsReportPage extends PageObject {

	@FindBy(css = "css=a[href*='_menuItem=vacations-report']")
	private WebElementFacade vacationsReport;

	@FindBy(css = "div[div[class=vacations-report'] label")
	private List<WebElementFacade> exportVacationsFor;

	@FindBy(css = "[class=aui-datepicker-month'] select")
	private List<WebElementFacade> Month;

	@FindBy(css = "[class='aui-datepicker-year'] select")
	private List<WebElementFacade> Years;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_approved")
	private WebElementFacade approved;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_pending")
	private WebElementFacade pending;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_CIM")
	private WebElementFacade cim;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_other")
	private WebElementFacade other;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_exportButton")
	private WebElementFacade export;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportLastName")
	private WebElementFacade lastName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_reportFirstName")
	private WebElementFacade firstName;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_searchButton")
	private WebElementFacade search;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_inactiveUsersCheckbox")
	private WebElementFacade showinactiveUsers;

	@FindBy(css = "a[class='aui-paginator-link aui-paginator-page-link']")
	private WebElementFacade pageLink;

	@FindBy(css = "span[class*='aui-paginator-page-container']")
	private  List<WebElementFacade> pageContainer;

	@FindBy(css = "span[class='aui-paginator-link aui-paginator-next-link']")
	private WebElementFacade nextLink;
	
	@FindBy(css = ".lfr-search-container")
	private WebElement resultContainer;
	
	@FindBy(css = ".results-grid")
	private WebElement resultListContainer;

	
	public void clickOnVacationsReport() {
		vacationsReport.click();
	}

	public void clickOnExportVacationsFor1(String name) {
		for (WebElementFacade item : Month) {
			if (item.getText().contains(name)) {
				item.click();
			}
		}
	}

	public void clickOnExportVacationsFor(String name) {
		for (WebElementFacade item : Years) {
			if (item.getText().contains(name)) {
				item.click();
			}

		}
	}

	public void clickOnApproved() {
		approved.click();
	}

	public void clickOnPending() {
		pending.click();
	}

	public void clickOnCim() {
		cim.click();
	}

	public void clickOnOther() {
		other.click();
	}

	public void clickOnExport() {
		export.click();
	}

	public void enterOnLastName(String name) {
		lastName.type(name);
	}

	public void enterOnFirstName(String name) {
		firstName.type(name);
	}

	public void clickOnSearch() {
		search.click();
	}

	public void clickOnShowInactiveUsers() {
		showinactiveUsers.click();
		showinactiveUsers.isEnabled();
	}
//
//	public void clickOnpageLink(String number) {
//		for (WebElementFacade item : pageContainer) {
//			if (item.getText().contains(number)) {
//				item.click();
//			}
//			
//			 public static void main(String[] args){
//			        int count = 1;
//			        while (count < 11) {
//			            System.out.println("Count is: " + count);
//			            count++;	
//		}
//	}
	
	public List<String> grabVacationReportResultList(){
		List<String> result = new ArrayList<String>();
		element(resultListContainer).waitUntilVisible();
		
		List<WebElement> entryList = resultListContainer.findElements(By.cssSelector(".results-row:not(.portlet-section-body)"));
		
		for (WebElement entryNow : entryList) {
			result.add(entryNow.getText());
		}
		
		return result;
	}
	
	public boolean isNextButton(){
		boolean result = false;
		
		element(resultContainer).waitUntilVisible();
		
		WebElement nextButton = resultContainer.findElement(By.cssSelector(".aui-paginator-next-link"));
		if(nextButton.getTagName().contains("a")){
			nextButton.click();
			result = true;
		}
		
		return result;
	}
}