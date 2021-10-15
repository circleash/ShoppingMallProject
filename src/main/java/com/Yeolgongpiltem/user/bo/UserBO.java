package com.Yeolgongpiltem.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yeolgongpiltem.common.EncryptUtils;
import com.Yeolgongpiltem.user.dao.UserDAO;
import com.Yeolgongpiltem.user.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public int addUser(String loginId, String password, String userName, String userAddress, String userPhoneNumber, String email) {
		
		String encryptPassword = EncryptUtils.md5(password);
		//if(encryptPassword.equals("")) {
		//logger.error("[UserBO signUp) 암호화 실패");
		//return 0;
		//}
		
		return userDAO.insertUser(loginId, encryptPassword, userName, userAddress, userPhoneNumber, email);
		
	}
	public boolean isDuplication(String loginId) {
		int count = userDAO.selectCountByLoginId(loginId);
		if(count >= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public User getUser(String loginId, String password) {
		String encryptPassword = EncryptUtils.md5(password);
		return userDAO.selectUserByLoginIdPassword(loginId, encryptPassword);
	}

}
