package hms.capg.dao;

import hms.capg.bean.UserBean;
import hms.capg.exception.EMSException;

public interface LoginAuthenticationDao {
	UserBean getUser(String userId, String userPassword) throws EMSException;
}
