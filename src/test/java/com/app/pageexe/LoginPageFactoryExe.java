package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.loactors.LoginPageFactory;

public class LoginPageFactoryExe extends LoginPageFactory {
	
	public static  void username() {
		/*LoginPageFactory l=	new LoginPageFactory();
		l.getUsername();*/
		BaseClass.typeData(new LoginPageFactory().getUsername(), "");
	}
	
	public static  void password() {
		BaseClass.typeData(new LoginPageFactory().getPassword(), "");
	}

}
