package com.aring.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aring.pojo.User;
import com.aring.service.UserService;

@Controller
public class InfoController {

	@Resource
	private UserService iservice;

	@RequestMapping("index")
	public String index(HttpServletRequest request) {
		List<User> user = iservice.show();
		request.setAttribute("user", user);
		return "index";
	}

	@RequestMapping("delete")
	public String index(String id) {
		System.out.println(id);
		int res = iservice.delete(id);
		if (res > 0) {
			return "redirect:index";
		}
		return "index";
	}

	@RequestMapping("add")
	public String add(User user) {
		int res = 0;
		if (user.getId() == 0) {
			res = iservice.add(user);
		} else {
			res = iservice.upd(user);
		}
		if (res > 0) {
			return "redirect:index";
		}
		return "index";
	}

	@RequestMapping("showadd")
	public String showadd(User user, HttpServletRequest request, Model model) {
		User info = iservice.getUserById(user.getId());
		System.out.println(info.getUname());
		model.addAttribute("user", info);
		return "add";
	}

	@RequestMapping("bbb")
	public String bbb(User user, HttpServletRequest request, Model model) {
		return "add";
	}

}
