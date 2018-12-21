package hms.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hms.capg.bean.HotelBean;
import hms.capg.dao.UserDao;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserDao userDao;

	@Override
	public List<HotelBean> getHotelList(String city) {
		return userDao.getHotelList(city);
	}

}
