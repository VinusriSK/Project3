package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.loactors.Search_Hotel_Locators;

public class SearchHotel_PageExe extends LoginPageExe {
	
	public static void location() {
		BaseClass.dropDownvalue(BaseClass.findElementById(Search_Hotel_Locators.location), "Sydney");
	}

}
