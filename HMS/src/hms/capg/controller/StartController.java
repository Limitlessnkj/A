package hms.capg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hms.capg.bean.HotelBean;
import hms.capg.bean.UserBean;
import hms.capg.exception.EMSException;
import hms.capg.service.LoginAuthentication;
import hms.capg.service.UserService;
import hms.capg.service.UserServiceImpl;

@Controller
public class StartController {
	@Autowired
	private LoginAuthentication loginAuthentication;

	@RequestMapping("/displayLogin")
	public String displayLogin(Model model) {
		model.addAttribute("loginDetails", new UserBean());
		return "Login";
	}

	@RequestMapping("/displaySignup")
	public String displaySignUp(Model model) {
		model.addAttribute("signUpDetails", new UserBean());
		return "SignUp";
	}

	@RequestMapping("/userHome")
	public String userHome(@Valid @ModelAttribute("loginDetails") UserBean user, BindingResult bindingResult,
			Model model) {
		System.out.println("Displaying next page for user");
		String page = "";
		if (bindingResult.hasErrors())
			return "SignUp";
		try {
			user = loginAuthentication.getUser(user.getUserId(), user.getUserPassword());
			model.addAttribute("logindetails", user);
			if (user == null)
				page = "LoginAgain";
			else {
				page = "SearchHotel";
			}
		} catch (EMSException e) {
			System.out.println(e.getMessage());
		}

		return page;
	}

	@RequestMapping("/SearchHotel")
	public String getHotel(@Valid @RequestParam("city") String city, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors())
			return "LoginAgain";
		UserService userService = new UserServiceImpl();
		List<HotelBean> list = userService.getHotelList(city);
		model.addAttribute("hotelList", list);
		if (list.isEmpty())
			return "SearchHotel";
		else
			return "HotelList";

	}
}
