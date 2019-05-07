package com.wipro.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.hospital.dao.HospitalDAO;
import com.wipro.hospital.model.Login;

@Controller
public class HospitalController {

	@Autowired
	private HospitalDAO hospitalDao;
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String start(Model model) {
		model.addAttribute("ms", "Please Enter Your Choise");
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerform(Model model) {
		model.addAttribute("ms", "Please Enter Your Choise");
		return "newregister";
	}
	
	@RequestMapping(value = "/newregister", method = RequestMethod.POST)
	public String register(Model model,@ModelAttribute("loginBean") Login login) {
		
		
		if (login != null && login.getId() != null && login.getPw() != null
				&& login.getAge() != 0 && login.getDes() != null && login.getPlace() != null) {
			model.addAttribute("ms", "SUCCESSFULLY REGISTERED");
			System.out.print("hello");
			return hospitalDao.doRegister(login);
		} else {
			model.addAttribute("ms", "Error Occured Please fill the form Once Again");
			return "login";
		}

	}
	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public String listAllpatient(Model model) {
		model.addAttribute("ms",hospitalDao.getAllpatient());
		return "show";
	}
	
	
}
