package com.mavenTest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mavenTest.entity.User;
import com.mavenTest.service.ExcelService;
import com.mavenTest.service.UserService;

import net.sf.json.JSONObject;

@Controller
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ExcelService excelService;

	@Autowired
	private TestBean testBean;
	
	@RequestMapping(value = "testController.do")
	public ModelAndView testController(String name){
		System.out.println("name = " + name);
		ModelAndView mav = new ModelAndView("hello");
		User user = userService.getUser("larry");
		System.out.println("user = " + user);
		return mav;
	}
	
	@RequestMapping(value = "testJson.do")
	@ResponseBody
	public TestBean testJson(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("user", testBean.getUser());
		jsonObject.put("password", testBean.getPassword());
		return testBean;
	}
	
	@RequestMapping(value = "excelController.do")
	public void testExcelDownloadController(HttpServletResponse response){
		excelService.writeToExcel(response);
	}
	
	@RequestMapping(value = "jspTestController.do")
	public void jspTestController(HttpServletResponse response){
		
		
	}
}
