package com.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj =new JSONObject();
		try {
			obj.put("category", "self help");
			obj.put("title", "atomic habits");
			obj.put("publisher", "random house book business");
			obj.put("author", "james clear");
			obj.put("year", "2018");
			obj.put("price", "471");
			
			try {
				FileWriter file=new FileWriter("myJSON.json");
				file.write(obj.toString());
				file.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
