package com.highluck.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.highluck.biz.ListBiz;

import com.highluck.dto.ListDTO;
import com.highluck.library.Json;


@Controller
public class HighLuckController {

	Logger log = Logger.getLogger(this.getClass());

	
	
		@RequestMapping(value="/goods.do")
	    public ModelAndView ListPage() throws Exception{
	    	ModelAndView mv = new ModelAndView("/BoardList");	    	
	  
	    
	    	return mv;    	
	    }
	   	    
	    @RequestMapping(value="/goodlist.do")
	    public void ListJson(HttpServletResponse response) throws Exception{	    		    	
	    	
	
	    }
	   
}
