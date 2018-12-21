package hms.capg.service;


import hms.capg.bean.UserBean;
import hms.capg.exception.EMSException;

public interface LoginAuthentication {
	UserBean getUser(String userId, String userPassword) throws EMSException;
}
