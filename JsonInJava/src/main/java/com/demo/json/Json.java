package com.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
	
	private static ObjectMapper objMapper = getDefaultObjectMapper();
	
	private static ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjMapper = new ObjectMapper();
		return defaultObjMapper;
	}
	
	public static JsonNode parse(String src) throws JsonMappingException, JsonProcessingException {
		return objMapper.readTree(src);
	}
	
	public static <A> A fromJson(JsonNode node, Class<A> cls) throws JsonProcessingException, IllegalArgumentException {
		return objMapper.treeToValue(node, cls);
	}
	
}
