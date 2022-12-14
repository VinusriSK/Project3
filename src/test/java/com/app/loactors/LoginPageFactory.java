package com.app.loactors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class LoginPageFactory extends BaseClass {

	public LoginPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy 
	
	@FindBy (id = "username")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
	
	

}
