package hms.capg.service;

import java.util.List;

import hms.capg.bean.HotelBean;

public interface UserService {
public List<HotelBean> getHotelList(String city);
}
