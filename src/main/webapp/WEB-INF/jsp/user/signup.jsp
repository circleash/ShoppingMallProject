<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>     
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="/static/css/style.css" type="text/css">
</head>
<body>
	<div id="wrap">
		<c:import url="/WEB-INF/jsp/include/header.jsp" />
		<section class="content d-flex justify-content-center align-items-center">
				<div class="login-box">
					<h1 class="text-center">회원가입</h1>
					<form id="signupForm">
						<div class="d-flex">
						<input type="text" id="loginIdInput" name="loginId" class="form-control" placeholder="아이디를 입력하세요">
						<button type="button" id="isDuplicateBtn" class="btn btn-info btn-default btn-sm ml-1">중복확인</button>
						</div>
						<div class="text-danger d-none" id="duplicateDiv"><small>중복된 id입니다.</small></div>
						<div class="text-success d-none" id="noneDuplicateDiv"><small>사용 가능한 id입니다.</small></div>
						<input type="password" id="passwordInput" name="password" class="form-control mt-3" placeholder="비밀번호를 입력하세요">
						<input type="password" id="passwordConfirmInput" name="passwordConfirm" class="form-control mt-3" placeholder="비밀번호 확인">
						<input type="text" id="nameInput" name="name" class="form-control mt-3" placeholder="이름">
						<input type="text" id="addressInput" name="address" class="form-control mt-3" placeholder="주소">
						<input type="text" id="phoneNumberInput" name="phoneNumber" class="form-control mt-3" placeholder="연락처(핸드폰번호)">
						<input type="text" id="emailInput" name="email" class="form-control mt-3" placeholder="이메일주소">
						<button type="submit" id="signupBtn" class="btn btn-success btn-block mt-3">가입하기</button>
					</form>
				</div>
			</section>
		<c:import url="/WEB-INF/jsp/include/footer.jsp" />
	</div>
</body>
</html>