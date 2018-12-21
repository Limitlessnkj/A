package hms.capg.dao;

import java.util.List;

import hms.capg.bean.HotelBean;

public interface UserDao {
	public List<HotelBean> getHotelList(String city);
}
