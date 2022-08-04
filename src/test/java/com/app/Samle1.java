package com.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Samle1 {

	public static void main(String[] args) {
		try {
			FileReader read = new FileReader("C:\\Users\\Yuvaraj\\"
					+ "eclipse-workspace\\Proect_Class_Apr\\src\\test\\resources\\TestData\\sample.json");
			JSONParser parse = new JSONParser();
			Object obj = parse.parse(read);
			JSONObject job= (JSONObject)obj;
			String name = (String)job.get("name");
			System.out.println(name);
			String age = (String)job.get("age");
			System.out.println(age);
			JSONArray jarr = (JSONArray)job.get("bike");
			for (Object object : jarr) {
				System.out.println(object);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
