package com.demo.test;

import com.demo.beans.JsonBean;
import com.demo.json.Json;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonTest {

	public static void main(String[] args) {
		
		String jsonSource = "{\"title\": \"Shubham Diddi\" }";
		
		
		try {
			JsonNode node = Json.parse(jsonSource);
			System.out.println(node.get("title").asText());
			
			JsonBean pojo = Json.fromJson(node, JsonBean.class);
			pojo.setTitle("Shubham");
			System.out.println("POJO Title: "+ pojo.getTitle());
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
