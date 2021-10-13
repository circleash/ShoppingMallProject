package com.Yeolgongpiltem.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Yeolgongpiltem.user.bo.UserBO;

@Controller
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserBO userBO;
	
	@PostMapping("/sign_up")
	public Map <String, String> signup(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password
			, @RequestParam("userName") String userName
			, @RequestParam("userAddress") String userAddress
			, @RequestParam("userPhoneNumber") String userPhoneNumber
			, @RequestParam("email") String email) {
		int count = userBO.addUser(loginId, password, userName, userAddress, userPhoneNumber, email);
		Map <String, String> result = new HashMap<>();
		if (count == 1) {
			result.put("result", "success");
		} else {
			result.put("result", "fail");
		}
		return result;
		}
	}

