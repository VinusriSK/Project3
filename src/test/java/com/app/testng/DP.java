package com.app.testng;

import org.testng.annotations.DataProvider;

public class DP {
	
	
	@DataProvider(name = "data")
	public Object[][] data() {
		return new Object[][] { { "Aiite", "12345" }, { "Tech", "12345" } };

	}

}
