package com.hotel.capgemini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
			
	@RequestMapping(value="Login", method=RequestMethod.GET)
	public ModelAndView userLoginToHotels(@RequestParam("userName")String userName,@RequestParam("password")String password) {
		List<UserDto> listofUsers = new ArrayList<UserDto>();
		if(userName != null && password !=null){		
		UserDto user1 = new UserDto();
		user1.setHotelId(1000);
		user1.setPassword("hotel");
		user1.setUserName("ooha");
		listofUsers.add(user1);
		}
		if(userName.equals("admin")&& password.equals("admin")){
			return new ModelAndView("Login");
		}
		else{
			return new ModelAndView("loginfail");
		}
		
		
	}
	@RequestMapping(value="searchhotels", method=RequestMethod.GET)
	public ModelAndView searchinghotels(@RequestParam("cities")String search)
	{
		Map hotels=new HashMap();
		System.out.println("hotels"+hotels);
		System.out.println(search);
		if(search.equals("Bangalore"))
		{
			hotels.put("PrideHotel","https://www.pridehotel.com/bengaluru/the-pride-hotel-bengaluru/overview");
			
			/*hotels.add("https://www.pridehotel.com/bengaluru/the-pride-hotel-bengaluru/overview/");
			hotels.add("Kritunga");
			hotels.add("ibis");*/
			hotels.put("Mangomist Resorts","https://www.mangomist.com/mangomist-reviews/");
			hotels.put("Marriott","https://www.marriott.com/hotels/travel/blrjw-jw-marriott-hotel-bengaluru/?scid=45f93f1b-bd77-45c9-8dab-83b6a417f6fe");

			System.out.println("hotels"+hotels);
		System.out.println("Entered into bangalore"+hotels);
			return new ModelAndView("SearchHotels","listofHotels",hotels);
		}
		else if(search.equalsIgnoreCase("Hyderabad"))
		{
			hotels.put("Park Hotel","http://www.theparkhotels.com/hyderabad.html");
			hotels.put("Trident Hotel","https://www.tridenthotels.com/hotels-in-hyderabad");
			hotels.put("Taj Falaknuma Hotel","https://www.tajhotels.com/");
			return new ModelAndView("SearchHotels","listofHotels",hotels);
		}
		else if(search.equalsIgnoreCase("Chennai"))
		{
			hotels.put("Le Royal Meridien Chennai","http://www.starwoodhotels.com/lemeridien/property/overview/index.html?propertyID=1834");
			hotels.put("Hotel Ambassador Pallava","https://www.ambassadorindia.com/ambassador/ambassador-pallava");
			hotels.put("Regenta Central Deccan","http://www.royalorchidhotels.com/regenta-central-deccan-chennai/overview?utm_source=google&utm_medium=organic&utm_campaign=Regenta-Central-Deccan-Chennai-GMB");
			return new ModelAndView("SearchHotels","listofHotels",hotels);
		}
		else if(search.equalsIgnoreCase("Mumbai"))
		{
			hotels.put("Ginger Hotels","https://www.gingerhotels.com/");
			hotels.put("Sarovar Hotels","http://www.sarovarhotels.com/grand-hometel-mumbai/");
			hotels.put("Avion Hotels","http://avionhotel.com/");
			return new ModelAndView("SearchHotels","listofHotels",hotels);
		}
		else {
		
			return new ModelAndView("failed","listofHotels",hotels);
		}
		}
	@RequestMapping(value="goback", method=RequestMethod.GET)
	public String backMethod()
	{
		System.out.println("back");
	return "SearchHotels";
	}

}
