package hms.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hms.capg.bean.UserBean;
import hms.capg.dao.LoginAuthenticationDao;
import hms.capg.dao.LoginAuthenticationDaoImpl;
import hms.capg.exception.EMSException;
@Service
public class LoginAuthenticationImpl implements LoginAuthentication {
	@Autowired
	LoginAuthenticationDao loginAuthenticationDao;
	public LoginAuthenticationImpl() {
	loginAuthenticationDao=new LoginAuthenticationDaoImpl();
	}

	@Override
	public UserBean getUser(String userId, String userPassword) throws EMSException {
		return loginAuthenticationDao.getUser(userId, userPassword);
	}

}
