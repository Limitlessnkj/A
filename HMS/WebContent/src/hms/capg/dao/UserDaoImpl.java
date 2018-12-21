package hms.capg.dao;

import java.util.List;

import hms.capg.bean.HotelBean;

public class UserDaoImpl implements UserDao {

	@Override
	public List<HotelBean> getHotelList(String city) {
		List<HotelBean> list = null;
		if (city == "delhi") {
			list.add(new HotelBean("Vivanta By Taj", "Aditya", 8000, 25, 4.3, "Click here to book Hotel Car Service"));
			list.add(new HotelBean("Marriott", "Saurabh", 8500, 30, 4.5, "Click here to book Zoomcars at 20% off"));

		} else if (city == "bangalore") {
			list.add(new HotelBean("Lalit International", "Sachin", 7500, 15, 4.3, "Click here to book a Ride"));
			list.add(new HotelBean("Leela Palace", "Abhishek", 8500, 35, 4.2,
					"Click here to book Ride For Pickup or Drop"));

		}

		return list;
	}

}
