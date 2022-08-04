package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.loactors.LoginPageLocators;

public class LoginPageExe extends LoginPageLocators {
	
	public static void username() {
		BaseClass.typeData(BaseClass.findElementById(LoginPageLocators.username), "niazniaz");
	}
	
	public static void password() {
		BaseClass.typeData(BaseClass.findElementById(LoginPageLocators.password), "niaz06");
	}
	
	public static void clickLoginButton() {
		BaseClass.press(BaseClass.findElementBy(LoginPageLocators.click));
	}

}
