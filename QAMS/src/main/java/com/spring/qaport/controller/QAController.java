package com.spring.qaport.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.qaport.service.QAService;

/**
 * Handles requests for the application home page.
 */

/* 동작 순서 --> Controller > service > dao > sql > jsp */
@Controller
public class QAController {
	
	private static final Logger logger = LoggerFactory.getLogger(QAController.class);
	
	@Resource(name="QAService")
	private QAService qaService	;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView("/views/main.jsp");
		
		List<Map<String,String>> list = qaService.getProject();
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value = "/getProject")
	public ModelAndView getProject(Map<String,Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/views/main.jsp");
		
		List<Map<String,String>> list = qaService.getProject();
		mv.addObject("list",list);
		return mv;
	}
	
	
}
