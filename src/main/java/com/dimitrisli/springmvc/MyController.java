package com.dimitrisli.springmvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/something.do")
@Controller
public class MyController {

	private static final Logger logger = Logger.getLogger(MyController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String method(ModelMap modelMap){
		modelMap.addAttribute("msg","Hello world");
		return "test";
	}
}
