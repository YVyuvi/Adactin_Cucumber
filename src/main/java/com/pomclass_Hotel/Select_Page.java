package com.pomclass_Hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy(id = "continue")
	private WebElement continue1;

	public Select_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue1() {
		return continue1;
	}
}
