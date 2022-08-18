package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.IEmpDao;
import com.app.pojo.Employee;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private IEmpDao dao;
	
	@GetMapping
	public String showEmp(Employee e) {
		System.out.println("in show method "+getClass().getName());
		return "/emp/register";
	}
	
	@PostMapping
	public String addEmp(Employee e,HttpSession hs) {
		dao.save(e);
		if(e.getRole().equals("admin"))
		{
			hs.setAttribute("list", dao.findAll());
			return "/emp/list";
		}
		hs.setAttribute("emp", dao.findByEid(e.getEid()));
		return "/emp/detail";
			
	}
}
