package hms.capg.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import hms.capg.bean.UserBean;
import hms.capg.exception.EMSException;
@Repository 
@Transactional
public class LoginAuthenticationDaoImpl implements LoginAuthenticationDao {

	@Override
	public UserBean getUser(String userId, String userPassword) throws EMSException {
	UserBean user=null;
	if(userId=="Ajay"&&userPassword=="@123") {
		user.setContactNumber("9283848428");
		user.setDateOfBirth("02/02/1998");
		user.setGender('M');
		user.setFirstName("Ajay");
		user.setLastName("Sharma");
		user.setUserId(userId);
		user.setUserPassword(userPassword);
	}
		return user;
	}

}
