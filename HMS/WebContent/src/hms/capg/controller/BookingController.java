package hms.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hms.capg.bean.BookingBean;

@Controller
public class BookingController {
	@RequestMapping("/bookHotel")
	public String confirmBooking(@RequestParam("name") String name, Model model) {
		BookingBean bookingDetails=new BookingBean();
		bookingDetails.setName(name);
		System.out.println(name);
		model.addAttribute("bookingDetails",bookingDetails);
		return "HotelBooking";
	}
	

}
