package com.spring.qaport.service;

import java.util.List;
import java.util.Map;

public interface qaService {
	List<Map<String , Object>> getProject(Map<String,Object> commandMap) throws Exception;
}
