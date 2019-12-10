package com.automation.mercuryTours.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mongodb.util.JSON;

public class ReadConfig {

	public ReadConfig() {
	}

	public static String getConfig(String key) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONObject config = (JSONObject) parser
				.parse(new FileReader("C:\\Projects\\webFramework\\src\\main\\java\\resources\\config\\configTemplate.json"));
		return (String) config.get(key);
	}

}
