package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	Stddaoimpl stddetails = new Stddaoimpl();
	@RequestMapping("/")
	public ModelAndView listpage() {
		ModelAndView mav=new ModelAndView("Listofstudents");
		List<Stddtls> students=stddetails.alllist();
		System.out.println(students);
		mav.addObject("listofstudents", students);
	return mav ;

	}
	@RequestMapping("/login")
	public ModelAndView loginGetPage() {
		ModelAndView mav=new ModelAndView("loginPage");
		return mav;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView loginPage(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mav=null;
		String mbl=request.getParameter("mobile");
		String psw=request.getParameter("password");
		System.out.println("mobile no is:"+mbl);
		System.out.println(psw);
		Stddtls student =stddetails.login(mbl);
		if(student!=null) {
			if(student.getStdPswd().equals(psw)) {
				mav=new ModelAndView("homepage");

			}else {
				mav=new ModelAndView("loginPage");
				mav.addObject("errormsg", "please enter proper pswd");
			}
		}else {
			mav=new ModelAndView("loginPage");
			mav.addObject("errormsg", "please enter proper mobileno");		
		}

		return mav;

	}


}
