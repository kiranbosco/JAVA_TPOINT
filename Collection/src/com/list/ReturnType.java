package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReturnType {
	
	  public static List<Map<String, Object>> convert(String response) {
		  List<Map<String ,Object>> list = new ArrayList<>();
	      if (response.isEmpty()) {
		return new ArrayList<>();
         
	}
		return list;

	  }
}
