package com.Yeolgongpiltem.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Yeolgongpiltem.user.bo.UserBO;
import com.Yeolgongpiltem.user.model.User;

@RestController
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
	
	@GetMapping("is_id_duplication")
	@ResponseBody
	public Map<String, Boolean> isDuplication(
			@RequestParam("loginId") String loginId) {
		
			Map<String, Boolean> result = new HashMap<>();
			if (userBO.isDuplication(loginId)) {
				result.put("isDuplication", true);
			} else {
				result.put("isDuplication", false);
			}
			return result;
	}
	
	@PostMapping("/sign_in")
	public Map<String, String> signIn(
			@RequestParam("loginId") String loginId
			, @RequestParam("password") String password
			, HttpServletRequest request) {
		//User에서 찾아서 user에 담아 달라는 요청. BO에 있는지 없는지 물어보는것임
		User user = userBO.getUser(loginId, password);
		
		Map<String, String> result = new HashMap<>();
		//있냐 없냐는 null로 구분할 수 있다.
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", user.getId());
			session.setAttribute("loginId", user.getLoginId());
			session.setAttribute("userName", user.getuserName());
			
			result.put("result", "success");
		} else {
			result.put("result", "fail");
		}
		return result;
	}
}

