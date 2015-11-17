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
public class LoginPage extends PageObject {

    @FindBy(id = "sign-in")
    private WebElementFacade signIn;
    
    @FindBy(id = "_58_login")
    private WebElementFacade nameInput;
    
    @FindBy(id = "_58_password")
    private WebElementFacade passwordInput;
    
    @FindBy(css = "input[type='submit']")
    private WebElementFacade logInButton;
    
    @FindBy(css = "a[href*='vacation']")
    private WebElementFacade vacationTab;
   
    
    
        
    public void clickVacationTab() {
    	vacationTab.click();
    }

    public void enterCredentials(String name, String password) {
        nameInput.type(name);
        passwordInput.type(password);
    }
    
    public void signIn() {
        signIn.click();
    }
    public void logIn() {
    	logInButton.click();
    }
    
    
}