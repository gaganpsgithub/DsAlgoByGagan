package com.json.object;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class json {

	static void pasreJson(JSONObject json, String key) {
		System.out.println(json.get(key));
	}
	
	static void getKey(JSONObject json, String key) {
		
		boolean exist = json.has(key);
		Iterator<?> keys;
		String nextKeys;
		
		if(!exist) {
			keys=json.keys();
			while(keys.hasNext()) {
				nextKeys=(String) keys.next();
				try {
					if(json.get(nextKeys) instanceof JSONObject) {
						getKey(json.getJSONObject(nextKeys), key);
					} else if(json.get(nextKeys) instanceof JSONArray) {
						
						JSONArray jsonArray = json.getJSONArray(nextKeys);
						for(int i=0;i<jsonArray.length();i++) {
							String innerJSON = jsonArray.get(i).toString();
							JSONObject innerJSONObject = new JSONObject(innerJSON);
							getKey(innerJSONObject, key);
						}
						
					}
				}catch (Exception e) {
					
				}
			}
		}
		else {
			pasreJson(json,key);
		}
		
	}
	
	public static void main(String[] args) {
		
		String inputJson = "{\n" + 
				"	\"claim_loss_type_cd\":\"TEL\",\n" + 
				"	\"claim_type\": \"002\",\n" + 
				"	\"claim_reason\": \"001\",\n" + 
				"	\"policy_number\": \"1242345345\",\n" + 
				"	\"info\": [\n" + 
				"	{\n" + 
				"	\"ApplicationContext\": {\n" + 
				"		\"country\":\"US\"\n" + 
				"		}\n" + 
				"	},\n" + 
				"	{\n" + 
				"	\"ApplicationContext1\": {\n" + 
				"		\"country\":\"INDIA\"\n" + 
				"		}\n" + 
				"	}\n" + 
				"	]\n" + 
				"}";
		
		JSONObject inputJsonObject = new JSONObject(inputJson);
		
		getKey(inputJsonObject, "country");
	}

}
