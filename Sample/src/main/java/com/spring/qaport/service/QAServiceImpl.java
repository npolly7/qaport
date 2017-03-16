package com.spring.qaport.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.qaport.dao.QADAO;

@Service("QAService")
public class QAServiceImpl implements QAService {
	
	@Resource(name="QADAO")
	private QADAO qaDAO;
	@Override
	public List<Map<String, String>> getProject() throws Exception {
		// TODO Auto-generated method stub
		return qaDAO.getProject();
	}
}
