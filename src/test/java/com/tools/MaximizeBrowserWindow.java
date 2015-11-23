package com.tools;


import net.serenitybdd.core.pages.PageObject;
public class MaximizeBrowserWindow extends PageObject{

	public void maximizeWindow() {
		getDriver().manage().window().maximize();
	}
}
