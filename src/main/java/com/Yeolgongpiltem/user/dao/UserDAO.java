package com.Yeolgongpiltem.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	
	public int insertUser(@Param("loginId") String loginId
			, @Param("password") String password
			, @Param("userName") String userName
			, @Param("userAddress") String userAddress
			, @Param("userPhoneNumber") String userPhoneNumber
			, @Param("email") String email);

}
