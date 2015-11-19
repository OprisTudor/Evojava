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


public class TrackPage extends PageObject {
	
	 @FindBy(id="a[href*='menuItem=vacation-tracker]")
	 private WebElementFacade track;
	 
	 public void clickOnTrack (){
		track.click();
		
	 }
	 
}

